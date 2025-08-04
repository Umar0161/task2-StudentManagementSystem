import javax.swing.*;
import java.awt.event.*;
import java .awt.*;
class loginS extends JFrame {
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3;
    loginS(String s1)
    {
        super(s1);
    }
    loginS()
    {}
    void setComponents()
    {
       Cursor c1=new Cursor(Cursor.HAND_CURSOR);
       Font f1 =new Font("Times New Roman",Font.BOLD,28);
       ImageIcon i1=new ImageIcon("D:\\java\\amazonlogo.png");
      
l1=new JLabel("Project by Umar khalid");
l1.setFont(f1);
l1.setForeground(Color.red);
l2=new JLabel("User Name");
l3=new JLabel("Password");
l4=new JLabel();
l5=new JLabel();
l5.setIcon(i1);
t1=new JTextField();
t2=new JPasswordField();
b1=new JButton("Login");
b1.setCursor(c1);
b2=new JButton("AutoFill");
b3=new JButton("Add");
setLayout(null);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
l1.setBounds(100, 50, 300, 30);
l2.setBounds(100, 200, 100, 30);
l3.setBounds(100, 350, 100, 30);
l4.setBounds(100, 550, 200, 30);
l5.setBounds(100, 50, 300, 30);
t1.setBounds(350, 200, 100, 30);
t2.setBounds(350, 350, 100, 30);
b1.setBounds(200, 450, 100, 30);
b2.setBounds(400, 450, 100, 30);
b3.setBounds(500, 550, 100, 30);
b1.addActionListener(new Log());
b2.addActionListener(new Clear());
b3.addActionListener(new Add());
l2.addMouseListener(new MouseL());

  }
  class MouseL implements MouseListener  {
  public void mouseClicked(MouseEvent e1)
  {
l2.setForeground(Color.green);
  }
  public void mousePressed(MouseEvent e1)
  {
  }
  public void mouseReleased(MouseEvent e1)
  {

  }
  public void mouseEntered(MouseEvent e1)
  {
    l2.setForeground(Color.BLUE);
  }
  public void mouseExited(MouseEvent e1)
  {
    l2.setForeground(Color.ORANGE);
  }
  
    
  } 
public static void main (String []args)
{
    loginS s1=new loginS("Welcome to Villain Era");
    s1.setVisible(true);
    s1.setSize(700,700);
    s1.setComponents();
s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
class Log implements ActionListener
{
    public void actionPerformed(ActionEvent e1)
    {
        String s1=t1.getText();
        String s2=t2.getText();
        if(s1.equals("umar")&& s2.equals("khalid"))
        {
            JOptionPane.showMessageDialog(null,"Login Successful");
            l4.setText("Login Successful");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Login UnSuccessful");
            l4.setText("Login Unseccessful");
        }
    }
}
class Clear implements ActionListener
{
  public void actionPerformed(ActionEvent e1)
  {
    t1.setText("umar"); 
    t2.setText("khalid");
  }

}   
class Add implements ActionListener{
    public void actionPerformed(ActionEvent e1)
    {
        try{
            int a =Integer.parseInt(t1.getText());
            int b =Integer.parseInt(t2.getText());
            int c = a+b;
            l4.setText("Addition is="+c);

        }
        catch(Exception e2)
        {
            l4.setText("pelese enter a number only");
        }
    }
}
}
    

