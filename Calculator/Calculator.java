package calculator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public  class Calculator 
{
    JFrame Cal = new JFrame();
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
   
   
    ImageIcon Icon = new  ImageIcon(getClass().getResource("calculator.png"));
    
            
    JRadioButton On_R_Button = new JRadioButton("On");
    JRadioButton Off_R_Button = new JRadioButton("Off");
    ButtonGroup button_group = new ButtonGroup();
        
    Button b0= new Button("0");
    Button b1= new Button("1");
    Button b2= new Button("2");
    Button b3= new Button("3");
    Button b4= new Button("4");
    Button b5= new Button("5");
    Button b6= new Button("6");
    Button b7= new Button("7");
    Button b8= new Button("8");
    Button b9= new Button("9");
         
    Button b_Mul = new Button("\u00D7");
    Button b_Div = new Button("\u00F7");
    Button b_Add = new Button("+");
    Button b_Sub = new Button("\u02D7");
       
    Button b_Equal = new Button("=");
    Button b_Dot = new Button(".");
    Button b_Del = new Button("DEL");
    Button b_C = new Button("C");
    Button b_Ans = new Button("Ans");
         
    Button b_Square = new Button("x\u00B2");
    Button b_S_Root = new Button("√x");
	
    Button b_Percent = new Button("%");
    Button  b_Reciprocal = new Button("1/x");
    Button b_PI = new Button("\u03c0");
         
    Button sin= new Button("sin");
    Button cos= new Button("cos");
    Button tan= new Button("tan");
    Button cot= new Button("cot");
    Button sec= new Button("sec");
    Button cosec= new Button("cosec");
        
    Button ln= new Button("ln");
    Button log= new Button("log");
    Button b_exp= new Button("Exp");
    Button b_abs= new Button("abs");
    Button b_Factorial= new Button("x!");
    Button b_cube= new Button("x\u00B3");
    JButton b_Root_Cube= new JButton();
        
    Calculator()
    {
        add_elements();
        button();
    }
    
    void add_elements()
    {
        Cal.setVisible(true);
        Cal.setSize(580, 575);
        Cal.setTitle("Calculator");
        Cal.getContentPane().setBackground(Color.DARK_GRAY);
        Cal.getContentPane().setLayout(null);
        Cal.setIconImage(Icon.getImage());
        
        label.setBounds(450, 0, 368, 100);
        label.setFont(new Font("Arial",Font.ITALIC,20));
        label.setForeground(Color.WHITE);
        label.setBackground(Color.yellow);
        Cal.add(label);
        
        textField.setBounds(10, 80,537, 60);
        textField.setFont(new Font("Callibri",Font.BOLD,18));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        Cal.add(textField);
        
        On_R_Button.setBounds(364, 160, 85, 40);
        On_R_Button.setSelected(false);
        On_R_Button.setFont(new Font("Callibri",Font.BOLD,18));
        On_R_Button.setBackground(Color.PINK);
        On_R_Button.setForeground(Color.WHITE);
        Cal.add(On_R_Button );
        
        Off_R_Button.setBounds(464, 160, 85, 40);
        Off_R_Button.setSelected(false);
        Off_R_Button.setFont(new Font("Callibri",Font.BOLD,18));
        Off_R_Button.setBackground(Color.PINK);
        Off_R_Button.setForeground(Color.WHITE);
        Cal.add(Off_R_Button );
        
        button_group.add(On_R_Button);
        button_group.add(Off_R_Button);
    }
    
    public void button()
    {
        b_C.setBounds(10, 160, 60, 40);
        b_C.setFont(new Font("Callibri",Font.BOLD,18));
        b_C.setFocusable(false);
        b_C.setBackground(Color.PINK);
        b_C.setForeground(Color.WHITE);
        Cal.add(b_C);
         
        b_Del.setBounds(90, 160, 60, 40);
        b_Del.setFont(new Font("Callibri",Font.BOLD,18));
        b_Del.setFocusable(false);
        b_Del.setBackground(Color.PINK);
        b_Del.setForeground(Color.WHITE);
        Cal.add( b_Del);
         
        b_Square.setBounds(10, 210, 60, 40);
        b_Square.setFont(new Font("Callibri",Font.BOLD,20));
        b_Square.setFocusable(false);
        b_Square.setBackground(Color.PINK);
        b_Square.setForeground(Color.WHITE);
        Cal.add(b_Square);
         
        b_cube.setBounds(90, 210, 60, 40);
        b_cube.setFont(new Font("Callibri",Font.BOLD,20));
        b_cube.setFocusable(false);
        b_cube.setBackground(Color.PINK);
        b_cube.setForeground(Color.WHITE);
        Cal.add(b_cube);
        
        b_S_Root.setBounds(170, 210, 60, 40);
        b_S_Root.setFont(new Font("Callibri",Font.BOLD,20));
        b_S_Root.setFocusable(false);
        b_S_Root.setBackground(Color.PINK);
        b_S_Root.setForeground(Color.WHITE);
        Cal.add(b_S_Root);
        
         
        b_Root_Cube.setBounds(250, 210, 60, 40);
        b_Root_Cube.setFont(new Font("Callibri",Font.BOLD,18));
        b_Root_Cube.setFocusable(false);
        b_Root_Cube.setBackground(Color.PINK);
        b_Root_Cube.setForeground(Color.WHITE);
        b_Root_Cube.setText("∛x");
        Cal.add( b_Root_Cube);
          
        b_Reciprocal.setBounds(330, 210, 60, 40);
        b_Reciprocal.setFont(new Font("Callibri",Font.BOLD,18));
        b_Reciprocal.setFocusable(false);
        b_Reciprocal.setBackground(Color.PINK);
        b_Reciprocal.setForeground(Color.WHITE);
        Cal.add(b_Reciprocal);
         
        b_abs.setBounds(410, 210, 60, 40);
        b_abs.setFont(new Font("Callibri",Font.BOLD,18));
        b_abs.setFocusable(false);
        b_abs.setBackground(Color.PINK);
        b_abs.setForeground(Color.WHITE);
        Cal.add(b_abs);
         
        b_Equal.setBounds(490, 210, 60, 40);
        b_Equal.setFont(new Font("Callibri",Font.BOLD,18));
        b_Equal.setFocusable(false);
        b_Equal.setBackground(Color.PINK);
        b_Equal.setForeground(Color.WHITE);
        Cal.add(b_Equal);
        
        b7.setBounds(10, 270, 60, 40);
        b7.setFont(new Font("Callibri",Font.BOLD,20));
        b7.setFocusable(false);
        b7.setBackground(Color.PINK);
        b7.setForeground(Color.WHITE);
        Cal.add(b7);
                        
        b8.setBounds(90, 270, 60, 40);
        b8.setFont(new Font("Callibri",Font.BOLD,20));
        b8.setFocusable(false);
        b8.setBackground(Color.PINK);
        b8.setForeground(Color.WHITE);
        Cal.add(b8);
                        
        b9.setBounds(170, 270, 60, 40);
        b9.setFont(new Font("Callibri",Font.BOLD,20));
        b9.setFocusable(false);
        b9.setBackground(Color.PINK);
        b9.setForeground(Color.WHITE);
        Cal.add(b9);
         
        sin.setBounds(250, 270, 60, 40);
        sin.setFont(new Font("Callibri",Font.BOLD,18));
        sin.setFocusable(false);
        sin.setBackground(Color.PINK);
        sin.setForeground(Color.WHITE);
        Cal.add(sin);
          
        cos.setBounds(330, 270, 60, 40);
        cos.setFont(new Font("Callibri",Font.BOLD,18));
        cos.setFocusable(false);
        cos.setBackground(Color.PINK);
        cos.setForeground(Color.WHITE);
        Cal.add(cos);
       
        b_exp.setBounds(410, 270, 60, 40);
        b_exp.setFont(new Font("Callibri",Font.BOLD,18));
        b_exp.setFocusable(false);
        b_exp.setBackground(Color.PINK);
        b_exp.setForeground(Color.WHITE);
        Cal.add(b_exp);
         
        b_Add.setBounds(490, 270, 60, 40);
        b_Add.setFont(new Font("Callibri",Font.BOLD,22));
        b_Add.setFocusable(false);
        b_Add.setBackground(Color.PINK);
        b_Add.setForeground(Color.WHITE);
        Cal.add(b_Add);
           
        
         
        
        
        b4.setBounds(10, 330, 60, 40);
        b4.setFont(new Font("Callibri",Font.BOLD,20));
        b4.setFocusable(false);
        b4.setBackground(Color.PINK);
        b4.setForeground(Color.WHITE);
        Cal.add(b4);
                        
        b5.setBounds(90, 330, 60, 40);
        b5.setFont(new Font("Callibri",Font.BOLD,20));
        b5.setFocusable(false);
        b5.setBackground(Color.PINK);
        b5.setForeground(Color.WHITE);
        Cal.add(b5);
                        
        b6.setBounds(170, 330, 60, 40);
        b6.setFont(new Font("Callibri",Font.BOLD,20));
        b6.setFocusable(false);
        b6.setBackground(Color.PINK);
        b6.setForeground(Color.WHITE);
        Cal.add(b6);
         
        cosec.setBounds(250, 330, 60, 40);
        cosec.setFont(new Font("Callibri",Font.BOLD,18));
        cosec.setFocusable(false);
        cosec.setBackground(Color.PINK);
        cosec.setForeground(Color.WHITE);
        Cal.add(cosec);
          
        sec.setBounds(330, 330, 60, 40);
        sec.setFont(new Font("Callibri",Font.BOLD,18));
        sec.setFocusable(false);
        sec.setBackground(Color.PINK);
        sec.setForeground(Color.WHITE);
        Cal.add(sec);
        
        log.setBounds(410, 330, 60, 40);
        log.setFont(new Font("Callibri",Font.BOLD,20));
        log.setFocusable(false);
        log.setBackground(Color.PINK);
        log.setForeground(Color.WHITE);
        Cal.add(log);
        
        b_Sub.setBounds(490, 330, 60, 40);
        b_Sub.setFont(new Font("Callibri",Font.BOLD,22));
        b_Sub.setFocusable(false);
        b_Sub.setBackground(Color.PINK);
        b_Sub.setForeground(Color.WHITE);
        Cal.add(b_Sub);
         
       
        b1.setBounds(10, 390, 60, 40);
        b1.setFont(new Font("Callibri",Font.BOLD,20));
        b1.setFocusable(false);
        b1.setBackground(Color.PINK);
        b1.setForeground(Color.WHITE);
        Cal.add(b1);
                        
        b2.setBounds(90, 390, 60, 40);
        b2.setFont(new Font("Callibri",Font.BOLD,20));
        b2.setFocusable(false);
        b2.setBackground(Color.PINK);
        b2.setForeground(Color.WHITE);
        Cal.add(b2);
                        
        b3.setBounds(170, 390, 60, 40);
        b3.setFont(new Font("Callibri",Font.BOLD,20));
        b3.setFocusable(false);
        b3.setBackground(Color.PINK);
        b3.setForeground(Color.WHITE);
        Cal.add(b3);
          
        tan.setBounds(250, 390, 60, 40);
        tan.setFont(new Font("Callibri",Font.BOLD,18));
        tan.setFocusable(false);
        tan.setBackground(Color.PINK);
        tan.setForeground(Color.WHITE);
        Cal.add(tan);
          
        cot.setBounds(330, 390, 60, 40);
        cot.setFont(new Font("Callibri",Font.BOLD,18));
        cot.setFocusable(false);
        cot.setBackground(Color.PINK);
        cot.setForeground(Color.WHITE);
        Cal.add(cot);
        
        ln.setBounds(410, 390, 60, 40);
        ln.setFont(new Font("Callibri",Font.BOLD,20));
        ln.setFocusable(false);
        ln.setBackground(Color.PINK);
        ln.setForeground(Color.WHITE);
        Cal.add(ln);
         
        b_Mul.setBounds(490, 390, 60, 40);
        b_Mul.setFont(new Font("Callibri",Font.BOLD,22));
        b_Mul.setFocusable(false);
        b_Mul.setBackground(Color.PINK);
        b_Mul.setForeground(Color.WHITE);
        Cal.add(b_Mul);
       
        
        
        b0.setBounds(10, 450, 140, 40);
        b0.setFont(new Font("Callibri",Font.BOLD,20));
        b0.setFocusable(false);
        b0.setBackground(Color.PINK);
        b0.setForeground(Color.WHITE);
        Cal.add(b0);
                        
        b_Percent.setBounds(170, 450, 60, 40);
        b_Percent.setFont(new Font("Callibri",Font.BOLD,20));
        b_Percent.setFocusable(false);
        b_Percent.setBackground(Color.PINK);
        b_Percent.setForeground(Color.WHITE);
        Cal.add(b_Percent);
                        
        b_Dot.setBounds(250, 450, 60, 40);
        b_Dot.setFont(new Font("Callibri",Font.BOLD,20));
        b_Dot.setFocusable(false);
        b_Dot.setBackground(Color.PINK);
        b_Dot.setForeground(Color.WHITE);
        Cal.add(b_Dot);
          
        b_PI.setBounds(330, 450, 60, 40);
        b_PI.setFont(new Font("Callibri",Font.BOLD,20));
        b_PI.setFocusable(false);
        b_PI.setBackground(Color.PINK);
        b_PI.setForeground(Color.WHITE);
        Cal.add( b_PI);
          
        b_Factorial.setBounds(410, 450, 60, 40);
        b_Factorial.setFont(new Font("Callibri",Font.BOLD,20));
        b_Factorial.setFocusable(false);
        b_Factorial.setBackground(Color.PINK);
        b_Factorial.setForeground(Color.WHITE);
        Cal.add(b_Factorial); 
        
        b_Div.setBounds(490, 450, 60, 40);
        b_Div.setFont(new Font("Callibri",Font.BOLD,22));
        b_Div.setFocusable(false);
        b_Div.setBackground(Color.PINK);
        b_Div.setForeground(Color.WHITE);
        Cal.add(b_Div);
         
                 
    }
}