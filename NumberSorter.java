//A short java program which gets 10 different user inputs of numbers from 1 to 100 and
//at the end shows numbers to user in descending order.

import javax.swing.*;
import java.awt.event.*;

public class NumberSorter {
    public static void main(String[] args) {
        int num1 = getUserInput();
        int num2 = getUserInput();
        int num3 = getUserInput();
        int num4 = getUserInput();
        int num5 = getUserInput();
        int num6 = getUserInput();
        int num7 = getUserInput();
        int num8 = getUserInput();
        int num9 = getUserInput();
        int num10 = getUserInput();

        // Sort the numbers in descending order
        String output = sortDescending(num1, num2, num3, num4, num5, num6, num7, num8, num9, num10);

        // Display the sorted numbers to the user
        JOptionPane.showMessageDialog(null, output);
    }

    // Helper method to get user input
    public static int getUserInput() {
        int number = 0;
        boolean isValidInput = false;

        // Create a new frame to be the parent of the input dialog
        JFrame frame = new JFrame();

        // Add a WindowListener to the frame to detect window closing
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Terminate the program
            }
        });


        while (!isValidInput) {
            String input = JOptionPane.showInputDialog("Enter a number between 1 and 100:");

            // Check if input is null (user clicked cancel or closed the dialog)
            if (input == null) {
                System.exit(0); // Terminate the program
            }
            
            try {
                number = Integer.parseInt(input);
                if (number >= 1 && number <= 100) {
                    isValidInput = true;
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a number between 1 and 100.");
                }
            } catch (NumberFormatException e) {
                // Display an error message and prompt again for input
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        }

        return number;
    }

    // Helper method to sort numbers in descending order
    // We should use "n * (n-1) / 2" formula to calculate how many if condition we should use for comparison
    // For "10" user inputs it is equal to "10 * (10-1) / 2 = 45" 
    public static String  sortDescending(
            int num1, int num2, int num3, int num4, int num5,
            int num6, int num7, int num8, int num9, int num10) {

        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 < num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num1 < num4) {
            int temp = num1;
            num1 = num4;
            num4 = temp;
        }
        if (num1 < num5) {
            int temp = num1;
            num1 = num5;
            num5 = temp;
        }
        if (num1 < num6) {
            int temp = num1;
            num1 = num6;
            num6 = temp;
        }
        if (num1 < num7) {
            int temp = num1;
            num1 = num7;
            num7 = temp;
        }
        if (num1 < num8) {
            int temp = num1;
            num1 = num8;
            num8 = temp;
        }
        if (num1 < num9) {
            int temp = num1;
            num1 = num9;
            num9 = temp;
        }
        if (num1 < num10) {
            int temp = num1;
            num1 = num10;
            num10 = temp;
        }
        if (num2 < num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num2 < num4) {
            int temp = num2;
            num2 = num4;
            num4 = temp;
        }
        if (num2 < num5) {
            int temp = num2;
            num2 = num5;
            num5 = temp;
        }
        if (num2 < num6) {
            int temp = num2;
            num2 = num6;
            num6 = temp;
        }
        if (num2 < num7) {
            int temp = num2;
            num2 = num7;
            num7 = temp;
        }
        if (num2 < num8) {
            int temp = num2;
            num2 = num8;
            num8 = temp;
        }
        if (num2 < num9) {
            int temp = num2;
            num2 = num9;
            num9 = temp;
        }
        if (num2 < num10) {
            int temp = num2;
            num2 = num10;
            num10 = temp;
        }
        if (num3 < num4) {
            int temp = num3;
            num3 = num4;
            num4 = temp;
        }
        if (num3 < num5) {
            int temp = num3;
            num3 = num5;
            num5 = temp;
        }
        if (num3 < num6) {
            int temp = num3;
            num3 = num6;
            num6 = temp;
        }
        if (num3 < num7) {
            int temp = num3;
            num3 = num7;
            num7 = temp;
        }
        if (num3 < num8) {
            int temp = num3;
            num3 = num8;
            num8 = temp;
        }
        if (num3 < num9) {
            int temp = num3;
            num3 = num9;
            num9 = temp;
        }
        if (num3 < num10) {
            int temp = num3;
            num3 = num10;
            num10 = temp;
        }
        if (num4 < num5) {
            int temp = num4;
            num4 = num5;
            num5 = temp;
        }
        if (num4 < num6) {
            int temp = num4;
            num4 = num6;
            num6 = temp;
        }
        if (num4 < num7) {
            int temp = num4;
            num4 = num7;
            num7 = temp;
        }
        if (num4 < num8) {
            int temp = num4;
            num4 = num8;
            num8 = temp;
        }
        if (num4 < num9) {
            int temp = num4;
            num4 = num9;
            num9 = temp;
        }
        if (num4 < num10) {
            int temp = num4;
            num4 = num10;
            num10 = temp;
        }
        if (num5 < num6) {
            int temp = num5;
            num5 = num6;
            num6 = temp;
        }
        if (num5 < num7) {
            int temp = num5;
            num5 = num7;
            num7 = temp;
        }
        if (num5 < num8) {
            int temp = num5;
            num5 = num8;
            num8 = temp;
        }
        if (num5 < num9) {
            int temp = num5;
            num5 = num9;
            num9 = temp;
        }
        if (num5 < num10) {
            int temp = num5;
            num5 = num10;
            num10 = temp;
        }
        if (num6 < num7) {
            int temp = num6;
            num6 = num7;
            num7 = temp;
        }
        if (num6 < num8) {
            int temp = num6;
            num6 = num8;
            num8 = temp;
        }
        if (num6 < num9) {
            int temp = num6;
            num6 = num9;
            num9 = temp;
        }
        if (num6 < num10) {
            int temp = num6;
            num6 = num10;
            num10 = temp;
        }
        if (num7 < num8) {
            int temp = num7;
            num7 = num8;
            num8 = temp;
        }
        if (num7 < num9) {
            int temp = num7;
            num7 = num9;
            num9 = temp;
        }
        if (num7 < num10) {
            int temp = num7;
            num7 = num10;
            num10 = temp;
        }
        if (num8 < num9) {
            int temp = num8;
            num8 = num9;
            num9 = temp;
        }
        if (num8 < num10) {
            int temp = num8;
            num8 = num10;
            num10 = temp;
        }
        if (num9 < num10) {
            int temp = num9;
            num9 = num10;
            num10 = temp;
        }

        String output = "Numbers in descending order: " +
                num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " +
                num5 + ", " + num6 + ", " + num7 + ", " + num8 + ", " +
                num9 + ", " + num10;

        return output;
    }
}
