package GUI;


// Importing the GUI libraries
import javax.swing.*;

// Class containing the Main Window of the GUI
public class MainWindow {
    // Creating the class attributes
    JFrame mainFrame;
    JFrame imageFrame;
    JFrame outputFrame;

    // Class Constructor
    public MainWindow(){
        // Creating  the frames for the GUI
        mainFrame = new JFrame("EdgeWare");
        imageFrame = new JFrame();
        outputFrame = new JFrame();
    }

    public static void main(String args[]){
        // Creating the frame
        MainWindow Frames = new MainWindow();
        Frames.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Sizing the window
        int[] size = WindowFunctions.winSize();
        System.out.println("Dimensions: " + size[0] + " x " + size[1]);
        Frames.mainFrame.setSize(size[0], size[1]);

        // Adding a button
        JButton button = new JButton("Press");
        Frames.mainFrame.getContentPane().add(button); // Adds Button to content pane of frame

        // Making the frame show
        Frames.mainFrame.setVisible(true);
    }
}
