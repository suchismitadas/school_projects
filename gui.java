import java.awt.Component;
import javax.swing.*;

class gui
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        JButton button = new JButton ("click me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Component add = frame.getContentPane().add(button);
        frame.setSize(500,500);
        frame.setVisible(true);
        
    }
}