import javax.swing.*;

public class BasicElements{

    public static void main(String arg[]) {
        JFrame myFrame = new JFrame();
        JButton myButton = new JButton();
        myButton.setSize(200,50);

        myFrame.setLayout(null);

        myFrame.add(myButton);

        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        myFrame.setSize(900, 600);

        System.out.println("basic java elements");
        
    }
}