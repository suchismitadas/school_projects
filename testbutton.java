import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class testbutton implements ActionListener
{
    static JButton button;
    public static void main(String[] args) 
    {
        testbutton g=new testbutton();
        g.go();
    }
   
    public void go()
    {
        ActionListener event;
        JFrame frame = new JFrame();
        button = new JButton ("click me");
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Component add = frame.getContentPane().add(button);
        frame.setSize(500,500);
        frame.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent event)
    {
        button.setText("I've been clicked.");
    }
}