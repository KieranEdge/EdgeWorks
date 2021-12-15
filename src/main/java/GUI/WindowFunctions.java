package GUI;
import java.awt.Toolkit;
import java.awt.Dimension;

// Class containing window functions
public class WindowFunctions {
    // Method for getting window size
    public static int[] winSize(){
        // Getting screen size
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

        // Storing as an array
        int width = (int)size.getWidth();
        int height = (int)size.getHeight();
        int[] dims = {width, height};

        // Returning the dimensions as an array
        return dims;
    }
}
