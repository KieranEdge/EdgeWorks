package GUI;


// Importing the GUI libraries
import javax.swing.*;

// Class containing the Main Window of the GUI
public class MainWindow {

    // Class Constructor
    public MainWindow(){
        // Creating  the frames for the GUI
        JFrame mainFrame = new JFrame();
        JFrame imageFrame = new JFrame();
        JFrame outputFrame = new JFrame();
    }

    public static void main(String args[]){
        // Creating the frame
        JFrame frame = new JFrame("Edgeware");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Sizing the window
        int[] size = WindowFunctions.winSize();
        System.out.println("Dimensions: " + size[0] + " x " + size[1]);
        frame.setSize(size[0], size[1]);

        // Adding a button
        JButton button = new JButton("Press");
        frame.getContentPane().add(button); // Adds Button to content pane of frame

        // Making the frame show
        frame.setVisible(true);
    }
}
