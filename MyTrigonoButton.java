
import java.awt.*;
import java.awt.event.*;
class MyTrigonoButton extends Button implements ActionListener
{
  MyCalculator cl;
  
  MyTrigonoButton(int x,int y, int width,int height,String cap, MyCalculator clc)
  {
    super(cap);
    setBounds(x,y,width,height);
    this.cl=clc;
    this.cl.add(this);
    addActionListener(this);
  }
  public void actionPerformed(ActionEvent ev)
  {
   String trText=((MyTrigonoButton)ev.getSource()).getLabel();

   cl.setClear=true;
   double temp=Double.parseDouble(cl.displayLabel.getText());
    
    
    if(trText.equals("Sec"))
  {  
  try
    {
     //double temp=Double.parseDouble(cl.displayLabel.getText());  
     double tempd=1/Math.cos(Math.toRadians(temp));
       cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));
    }
      
  catch(ArithmeticException excp)
                    {}
      
  return;
  }
     if(trText.equals("Cot"))
  {  
  try
    {
     //double temp=Double.parseDouble(cl.displayLabel.getText());  
     double tempd=1/Math.tan(Math.toRadians(temp));
       cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));
    }
      
  catch(ArithmeticException excp)
                    {}
      
  return;
  }
     if(trText.equals("Sin"))
  {  
  try
    {
     //double temp=Double.parseDouble(cl.displayLabel.getText());  
     double tempd=Math.sin(Math.toRadians(temp));
       cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));
    }
      
  catch(ArithmeticException excp)
                    {}
      
  return;
  }
     if(trText.equals("Cos"))
  {  
  try
    {
     //double temp=Double.parseDouble(cl.displayLabel.getText());  
     double tempd=Math.cos(Math.toRadians(temp));
       cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));
    }
      
  catch(ArithmeticException excp)
                    {}
      
  return;
  }
     if(trText.equals("Tan"))
  {  
  try
    {
     //double temp=Double.parseDouble(cl.displayLabel.getText());  
     double tempd=Math.tan(Math.toRadians(temp));
       cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));
    }
      
  catch(ArithmeticException excp)
                    {}
      
  return;
  }
     if(trText.equals("Cosec"))
  {  
  try
    {
     //double temp=Double.parseDouble(cl.displayLabel.getText());  
     double tempd=1/Math.sin(Math.toRadians(temp));
       cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));
    }
      
  catch(ArithmeticException excp)
                    {}
      
  return;
  }
    
    
    
   }
}
    


