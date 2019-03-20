
import java.awt.*;
import java.awt.event.*;
class MyOperatorButton extends Button implements ActionListener
{
MyCalculator cl;

MyOperatorButton(int x,int y, int width,int height,String cap, MyCalculator clc)
{
super(cap);
setBounds(x,y,width,height);
this.cl=clc;
this.cl.add(this);
addActionListener(this);
}
///////////////////////
  double factorial(double n)
  {
    double f=1;
    if(n==1 ||n==0)
      f=1;
      else        
      while(n!=0)
        {
          
        f=f*n;
        n--;
        }
        return f;
        
        
    }  
        
public void actionPerformed(ActionEvent ev)
{
String opText=((MyOperatorButton)ev.getSource()).getLabel();

cl.setClear=true;
    String c="";
    //cl.setClear=false;
    double a=0.0;
//double temp=Double.parseDouble(cl.displayLabel.getText());
    

if(opText.equals("1/x"))
  {  
  try
    {
     double temp=Double.parseDouble(cl.displayLabel.getText());  
     double tempd=1/(double)temp;
       cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));
    }
      
  catch(ArithmeticException excp)
                    {}
      
  return;
  }
    
        
if(opText.equals("sqrt"))
  {
  try
    {
      double temp=Double.parseDouble(cl.displayLabel.getText());  
     double tempd=Math.sqrt(temp);
    cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));}
          catch(ArithmeticException excp)
                  {}
  return;
  }
  if(opText.equals("cubert"))
  {
  try
    {
       double temp=Double.parseDouble(cl.displayLabel.getText()); 
     double tempd=Math.cbrt(temp);
    cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));}
          catch(ArithmeticException excp)
                  {}
    return;
  } 
   
  if(opText.equals("square"))
  {   
  try
    {
        double temp=Double.parseDouble(cl.displayLabel.getText());
    double tempd=Math.pow(temp,2);
    cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));}
          catch(ArithmeticException excp)
                  {}
    return;
  } 
    if(opText.equals("log"))
  {   
  try
    {
        double temp=Double.parseDouble(cl.displayLabel.getText());
    double tempd=Math.log(temp);
    cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));}
          catch(ArithmeticException excp)
                  {}
    return;
  } 
    
    if(opText.equals("cube"))
      {
      try{
        
       double temp=Double.parseDouble(cl.displayLabel.getText());
    double tempd=Math.pow(temp,3);
    cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));}
          catch(ArithmeticException excp)
                  {}
    return;
       
      }
    if(opText.equals("fact"))
      {
       
       try{
        
       double temp=Double.parseDouble(cl.displayLabel.getText());
        double tempd=factorial(temp);
        cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));}
          catch(ArithmeticException excp)
                  {}
    return;
       
      }
        
      
    
   
    double temp=Double.parseDouble(cl.displayLabel.getText());
     
if(!opText.equals("="))
  {
      
  cl.number=temp;
  cl.op=opText.charAt(0);
  c=Character.toString(cl.op); 
     
      
  return;
  }
    

      
        
     
// process = button pressed
switch(cl.op)
{
case '+': 
        a=temp+cl.number;break;
case '-':
       
  a=cl.number-temp;break;
case '*':
       
  a=temp*cl.number;break;
 case 'p':
       
   a=Math.pow(cl.number,temp);
   break; 
   case 'n':
   a=factorial(cl.number)/((factorial(cl.number-temp))*factorial(temp)) ;
   break; 
   case 'N':
   a=factorial(cl.number)/factorial(temp) ;
   break;   
case '%':
       
  try{a=cl.number%temp;}
  catch(ArithmeticException excp)
    { return;}
  break;
case '/':
       
  try{a=cl.number/temp;}
        catch(ArithmeticException excp)
                { return;}
  break;
}//switch
    
 
cl.displayLabel.setText(MyCalculator.getFormattedText(a));
//cl.number=temp;
}//actionPerformed
}//class

/****************************************/

