import javax.swing.JOptionPane;

public class StringDeneme {
    public static void main(String[] args) { 
        //String str = new String();
        //str = "Hello";
        //System.out.println(str);

        char charArray[] = { 'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y' };

        byte byteArray[] = { (byte) 'n', (byte) 'e', (byte) 'w', (byte) ' ', (byte) 'y', (byte) 'e', (byte) 'a', (byte) 'r' };

        StringBuffer buffer;

        String s, s1, s2, s3, s4, s5, s6, s7, s8, output;

        s = new String("Hello");

        buffer = new StringBuffer("Welcome to Java programming");

        s1 = new String();
        s2 = new String(s);
        s3 = new String(charArray);
        s4 = new String(charArray, 6, 3);
        s5 = new String(byteArray, 4, 4);
        s6 = new String(byteArray);
        s7 = new String(buffer);
        s8 = new String(s);

        output = "s1 = " + s1 +
                "\ns2 = " + s2 +
                "\ns3 = " + s3 +
                "\ns4 = " + s4 +
                "\ns5 = " + s5 +
                "\ns6 = " + s6 +
                "\ns7 = " + s7 +
                "\ns8 = " + s8;

        Boolean check = s2.equals(s8);

        output += "\n" + check;

        if(s2 == s8) {
            output += "\n" + "TRUE";
        } else {
            output += "\n" + "FALSE";
        }

        JOptionPane.showMessageDialog(null, output, "Demonstrating String Class Constructors", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);





    }
}
