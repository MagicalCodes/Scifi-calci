import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

 class MyCalculator extends Frame
{

public boolean setClear=true;
double number, memValue;
char op;

String digitButtonText[] = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0","+/-","." };
String operatorButtonText[] = {"/", "-","sqrt","square","*", "%","cubert","pow", "1/x","log", "cube", "fact","+","=","nCR","NPR" };
String memoryButtonText[] = {"MC", "MR", "MS", "M+" };
String specialButtonText[] = {"Backspc", "C", "CE" }; 
String trigonoButtonText[]= {"Sin","Cos","Tan","Cosec","Sec","Cot"};    

MyDigitButton digitButton[]=new MyDigitButton[digitButtonText.length];
MyOperatorButton operatorButton[]=new MyOperatorButton[operatorButtonText.length];
MyMemoryButton memoryButton[]=new MyMemoryButton[memoryButtonText.length];
MySpecialButton specialButton[]=new MySpecialButton[specialButtonText.length];
MyTrigonoButton trigonoButton[]=new MyTrigonoButton[trigonoButtonText.length];   

Label displayLabel=new Label("0",Label.RIGHT);
Label displayLabel2=new Label("",Label.RIGHT);
Label displayLabel3=new Label("",Label.RIGHT);  
Label memLabel=new Label(" ",Label.CENTER);

final int FRAME_WIDTH=700,FRAME_HEIGHT=550;
final int HEIGHT=60, WIDTH=60, H_SPACE=10,V_SPACE=10;
final int TOPX=30, TOPY=50;
///////////////////////////
MyCalculator(String frameText)//constructor
{

super(frameText);
    
Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\yolo\\Desktop\\calci.png");
    setIconImage(icon); 
    setBackground(Color.BLACK); 

int tempX=TOPX, y=TOPY;
displayLabel.setBounds(tempX,y,560,HEIGHT);
 
displayLabel.setBackground(Color.GREEN);
displayLabel.setForeground(Color.BLACK);
 
displayLabel.setFont(new Font("Serif", Font.BOLD, 30));  

add(displayLabel);


memLabel.setBounds(TOPX,  TOPY+HEIGHT+ V_SPACE,WIDTH*2, HEIGHT);
memLabel.setBackground(new Color(50,50,50));
memLabel.setFont(new Font("Serif", Font.BOLD, 30));    
memLabel.setForeground(Color.WHITE);    
    
add(memLabel);

// set Co-ordinates for Memory Buttons
tempX=TOPX; 
y=TOPY+2*(HEIGHT+V_SPACE);
for(int i=0; i<memoryButton.length; i++)
{
memoryButton[i]=new MyMemoryButton(tempX,y,WIDTH,HEIGHT,memoryButtonText[i], this);
memoryButton[i].setForeground(Color.WHITE);
memoryButton[i].setBackground( new Color(50,50,50));      
y+=HEIGHT+V_SPACE;
}

//set Co-ordinates for Special Buttons
tempX=TOPX+2*(WIDTH+H_SPACE); y=TOPY+1*(HEIGHT+V_SPACE);
for(int i=0;i<specialButton.length;i++)
{
specialButton[i]=new MySpecialButton(tempX,y,WIDTH+70,HEIGHT,specialButtonText[i], this);
specialButton[i].setForeground(Color.WHITE);
specialButton[i].setBackground(new Color(50,50,50));      
tempX=tempX+2*WIDTH+25;
}

//set Co-ordinates for Digit Buttons
int digitX=TOPX+WIDTH+H_SPACE;
int digitY=TOPY+2*(HEIGHT+V_SPACE);
tempX=digitX;  y=digitY;
for(int i=0;i<digitButton.length;i++)
{
digitButton[i]=new MyDigitButton(tempX,y,WIDTH,HEIGHT,digitButtonText[i], this);
digitButton[i].setForeground(Color.WHITE);
digitButton[i].setBackground( new Color(50,50,50));      
tempX+=WIDTH+H_SPACE;
if((i+1)%3==0){tempX=digitX; y+=HEIGHT+V_SPACE;}
}

//set Co-ordinates for Operator Buttons
int opsX=digitX+2*(WIDTH+H_SPACE)+H_SPACE;
int opsY=digitY;
tempX=opsX;  y=opsY;
for(int i=0;i<operatorButton.length;i++)
{
tempX+=WIDTH+H_SPACE;
operatorButton[i]=new MyOperatorButton(tempX,y,WIDTH,HEIGHT,operatorButtonText[i], this);
operatorButton[i].setForeground(Color.WHITE); 
operatorButton[i].setBackground( new Color(50,50,50));     
if((i+1)%4==0){tempX=opsX; y+=HEIGHT+V_SPACE;}
}

//set Co-ordinates for Trigono Buttons 
int trisX=TOPX;;
int trisY=y=TOPY+6*(HEIGHT+V_SPACE);;
tempX=trisX;  y=trisY;
for(int i=0;i<trigonoButton.length;i++)
{
trigonoButton[i]=new MyTrigonoButton(tempX,y,WIDTH+25,HEIGHT,trigonoButtonText[i], this);
trigonoButton[i].setForeground(Color.WHITE);
trigonoButton[i].setBackground( new Color(50,50,50));
tempX+=WIDTH+H_SPACE+25;
}
  

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent ev)
{System.exit(0);}
});

setLayout(null);
setSize(FRAME_WIDTH,FRAME_HEIGHT);
setVisible(true);
}
//////////////////////////////////
static String getFormattedText(double temp)
{
String resText=""+temp;
if(resText.lastIndexOf(".0")>0)
  resText=resText.substring(0,resText.length()-2);
return resText;
}
}
////////////////////////////////////////
public class calci
{
public static void main(String []args)
{

new MyCalculator("PARDEEP CALCULATOR");
}
}


/*******************************************/






