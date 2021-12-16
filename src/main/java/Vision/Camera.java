package Vision;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.github.sarxos.webcam.Webcam;


/**
 *
 The purpose of this class is to access and control the internal webcam of a computer
 *
 * @version
1.00 16 Dec 2021
 * @author
Kieran Edge
 */

public class Camera{

    /*
    The method below accesses the default webcam and captures a single image and saves it
     */
    public static void captureSingle() throws IOException{
        // get default webcam and open it
        Webcam webcam = Webcam.getDefault();
        webcam.open();

        // get image
        BufferedImage image = webcam.getImage();
        System.out.println(image);

        // save image to PNG file
        ImageIO.write(image, "PNG", new File("target\\Images\\test.png"));
    }


}