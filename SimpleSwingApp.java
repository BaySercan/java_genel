import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleSwingApp {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Simple Swing App");
        
        // Create a JLabel
        JLabel label = new JLabel("Hello, Swing!");
        
        // Add the label to the frame
        frame.getContentPane().add(label);
        
        // Set the size of the frame
        frame.setSize(300, 200);
        
        // Set the close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
