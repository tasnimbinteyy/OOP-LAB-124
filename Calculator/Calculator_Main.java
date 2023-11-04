package calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class Calculator_Main extends Calculator implements ActionListener 
{
    double n1 = 0,n2 = 0,result = 0; 
    int calculation;
   
    public static void main(String[] args) 
    {
        new Calculator_Main();           
    }
     
    Calculator_Main()
    {
        add_action_event();
    }
    
    void add_action_event()
    {
        On_R_Button.addActionListener(this);
        Off_R_Button.addActionListener(this);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b_Add.addActionListener(this);
        b_Div.addActionListener(this);
        b_Sub.addActionListener(this);
        b_Mul.addActionListener(this);
        b_Square.addActionListener(this);
        b_S_Root.addActionListener(this);
        b_Reciprocal.addActionListener(this);
        b_Dot.addActionListener(this);
        b_Ans.addActionListener(this);
        b_Percent.addActionListener(this);
        b_C.addActionListener(this);
        b_PI.addActionListener(this);
        b_Del.addActionListener(this);
        sin.addActionListener(this);
        cos.addActionListener(this);
        sec.addActionListener(this);
        cosec.addActionListener(this);
        tan.addActionListener(this);
        cot.addActionListener(this);
        b_Equal.addActionListener(this);
        ln.addActionListener(this);
        log.addActionListener(this);
        b_exp.addActionListener(this);
        b_abs.addActionListener(this);
        b_Factorial.addActionListener(this);
        b_Root_Cube.addActionListener(this);
        b_cube.addActionListener(this);         
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       Object button = e.getSource();
     
       if(button == On_R_Button)
       {
           enable();
       }
       else if (button == Off_R_Button)
       {
           disable();
       }
       else if (button == b_C)
       {
           label.setText("");
           textField.setText("");
       }
       else if (button == b_Del)
       {
           int length,number;
           length = textField.getText().length();
           number = length-1;
           if(length>0)
           {           
               StringBuilder back = new StringBuilder(textField.getText());
               back.deleteCharAt(number);
               textField.setText(back.toString());           
           }          
       }
       
       else if(button == b0)
       {
            if(textField.getText().contains("0"))
               return;
            else
               textField.setText(textField.getText() + "0");            
       }
       else if(button == b1)
           textField.setText(textField.getText() + "1");
       else if(button == b2)
           textField.setText(textField.getText() + "2");
       else if(button == b3)
           textField.setText(textField.getText() + "3");
       else if(button == b4)
           textField.setText(textField.getText() + "4");
       else if(button == b5)
           textField.setText(textField.getText() + "5");
       else if(button == b6)
           textField.setText(textField.getText() + "6");
       else if(button == b7)
           textField.setText(textField.getText() + "7");
       else if(button== b8)
           textField.setText(textField.getText() + "8");
       else if(button == b9)
           textField.setText(textField.getText() + "9");
       else if(button == b_Dot)
       {
            if(textField.getText().contains("."))
            return;
            else
            textField.setText(textField.getText() + ".");
       }   
       else if(button == b_Add || button == b_Sub || button== b_Mul || button == b_Div)
       {  
           n1 = Double.parseDouble(textField.getText());
           if(button == b_Add)
           {
               label.setText(n1 + "+");
               calculation = 1;
               textField.setText("");          
           } 
        else if(button == b_Sub)
        {     
            
           calculation = 2;
           textField.setText("");
           label.setText(n1 + "-" );
            
          
        } 
        else if(button == b_Mul)
        {         
           calculation = 3;
           textField.setText("");
           label.setText(n1 + "X" );
        } 
        else if(button == b_Div)
        {            
           calculation = 4;
           textField.setText("");
           label.setText(n1 + "/" );
        } 
        }         
        else if(button == b_Equal)
        {         
           n2 = Double.parseDouble(textField.getText());
            
           switch(calculation)
           {
                case 1:
                    result = n1+n2;
                    break;
                case 2:
                    result = n1-n2;
                    break;
                case 3:
                    result = n1*n2;
                    break;
                case 4:
                    result = n1/n2;
                    break;                
           }
           
           textField.setText(String.valueOf(result));
           n1 = result;  
        }
        else if(button == b_Square)
        {
            n1 = Double.parseDouble(textField.getText());
            double square = Math.pow(n1, 2);
            String str = Double.toString(square);
            if(str.endsWith(".0"))
                textField.setText(str.replace(".0", ""));
            else
                textField.setText(str);
        }
        
        else if(button == b_cube)
        {
            n1 = Double.parseDouble(textField.getText());
            double cube = n1 * n1 * n1;
            String str = Double.toString(cube);
            if(str.endsWith(".0"))
                textField.setText(str.replace(".0", ""));
            else
                textField.setText(str);
        }
        else if(button == b_S_Root)
        {
            n1 = Double.parseDouble(textField.getText());
            double s_root = Math.sqrt(n1);
            String str = Double.toString(s_root);
            textField.setText(str);
        }
        else if(button == b_Root_Cube)
        {
            n1 = Double.parseDouble(textField.getText());
            double s_root = Math.cbrt(n1);
            String str = Double.toString(s_root);
            textField.setText(str);
        }
        else if(button == b_Reciprocal)
        {
            n1 = Double.parseDouble(textField.getText());
            double reciprocal = 1/n1;
            String str = Double.toString(reciprocal);
            if(str.endsWith(".0"))
                textField.setText(str.replace(".0", ""));
            else
                textField.setText(str);
        }
        else if(button == sin || button == cos || button == tan || button == cot || button == sec || button == cosec)
        {           
            double num = Math.toRadians(Double.parseDouble(textField.getText()));
            if(button == sin)
        {
            result = Math.sin(num);
        }
        else if(button == cos )
        {     
            result = Math.cos(num);            
        }
        else if(button == tan )
        {          
            result = Math.tan(num);                        
        } 
        else if(button == cot )
        {
            result = 1/Math.tan(num);           
        } 
        else if(button == sec )
        {
            result = 1/Math.cos(num);             
        }       
        else if(button == cosec )
        {
            result = 1/Math.sin(num);            
        }
            String str = Double.toString(result);
            textField.setText(str);
        }
        else if(button == log )
        {
            n1 = Double.parseDouble(textField.getText());
             
            result = Math.log10(n1);
            String str = Double.toString(result);
            textField.setText(str);             
        }
         
        else if(button == ln )
        {
            n1 = Double.parseDouble(textField.getText());
            
            result = Math.log(n1);
            String str = Double.toString(result);
            textField.setText(str);             
        }
        
        else if(button == b_Factorial )
        {
            n1 = Double.parseDouble(textField.getText());
            for(int i=1;i<=n1;i++)
	    {
	        result=result*i;
 	    }
            String str = Double.toString(result);
            textField.setText(str);            
        }       
        else if(button == b_exp )
        {
            n1 = Double.parseDouble(textField.getText());
            result = Math.exp(n1);
            String str = Double.toString(result);
            textField.setText(str);            
        }
        else if(button == b_Percent)
        {
            n1 = Double.parseDouble(textField.getText());
            result = n1/100;
            String str = Double.toString(result);
            textField.setText(str);
        }        
        else if(button == b_PI)
        {
            n1 = Double.parseDouble(textField.getText());
            double Pi = 3.1416;
            result = n1*Pi;
            String str = Double.toString(result);
            textField.setText(str);
        } 
        else if(button == b_abs)    
        {
             n1 = Double.parseDouble(textField.getText());
             
             result = Math.abs(n1);
             String str = Double.toString(result);
             textField.setText(str);
             
            
        }
    }
    
    void enable()
    {
        On_R_Button.setEnabled(false);
        Off_R_Button.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
       
        b0.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        
        b_Mul.setEnabled(true);
        b_Div.setEnabled(true);
        b_Add.setEnabled(true);
        b_Sub.setEnabled(true);
        b_Equal.setEnabled(true);
        b_Dot.setEnabled(true);
        b_Del.setEnabled(true); 
        b_C.setEnabled(true);
        b_Ans.setEnabled(true);
        b_Square.setEnabled(true);
        b_S_Root.setEnabled(true);
        b_Percent.setEnabled(true);
        b_Reciprocal.setEnabled(true);
        b_PI.setEnabled(true);
        
        sin.setEnabled(true);
        cos.setEnabled(true);
        tan.setEnabled(true);
        cot.setEnabled(true);
        sec.setEnabled(true);
        cosec.setEnabled(true);
        b_Factorial.setEnabled(true);
        b_exp.setEnabled(true);
        log.setEnabled(true);
        ln.setEnabled(true);
        b_abs.setEnabled(true);
        b_cube.setEnabled(true);
        b_Root_Cube.setEnabled(true);
    }
    
    void disable()
    {
        On_R_Button.setEnabled(true);
        Off_R_Button.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
       
        b0.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        
        b_Mul.setEnabled(false);
        b_Div.setEnabled(false);
        b_Add.setEnabled(false);
        b_Sub.setEnabled(false);
        b_Equal.setEnabled(false);
        b_Dot.setEnabled(false);
        b_Del.setEnabled(false); 
        b_C.setEnabled(false);
        b_Ans.setEnabled(false);
        b_Square.setEnabled(false);
        b_S_Root.setEnabled(false);
        b_Percent.setEnabled(false);
        b_Reciprocal.setEnabled(false);
        b_PI.setEnabled(false);
        
        sin.setEnabled(false);
        cos.setEnabled(false);
        tan.setEnabled(false);
        cot.setEnabled(false);
        sec.setEnabled(false);
        cosec.setEnabled(false);
        b_exp.setEnabled(false);
        log.setEnabled(false);
        ln.setEnabled(false);
        b_abs.setEnabled(false);
        b_Factorial.setEnabled(false);
        b_cube.setEnabled(false);
        b_Root_Cube.setEnabled(false);
    }         
}