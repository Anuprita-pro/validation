//validation for mob no

String pno = jTextField6.getText();//get string phno
        int length = pno.length();
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length < 10){
                jTextField6.setEditable(true);
                }
            else {
                jTextField6.setEditable(false);
            }
            }
        else{
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                    jTextField6.setEditable(true);
                }
             else{
                jTextField6.setEditable(false);
                }
            }
            
            
            OR
            if((evt.getKeyCode()>=96 && evt.getKeyCode()<=105) || (evt.getKeyCode()>=48 && evt.getKeyCode()<=57))
        {
            
        }
        else
        {
           jTextField4.setText("");
        }
        String a=jTextField4.getText();
      if(a.length()>10)
      {
          JOptionPane.showMessageDialog(null, "Phone number extended above 10 digits");
          
           jTextField4.setText("");
      }
        
//validation for emailid
String email;
        if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$",jTextField4.getText()))){
             JOptionPane.showMessageDialog(null,"please enter valid email id","Error",JOptionPane.ERROR_MESSAGE);
             }
        else{
            JOptionPane.showMessageDialog(null,"Great!!!email is valid","Error",JOptionPane.INFORMATION_MESSAGE);
        }


//validaiton for password
