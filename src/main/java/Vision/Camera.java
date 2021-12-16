package Vision;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.Thread.UncaughtExceptionHandler;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamDiscoveryEvent;
import com.github.sarxos.webcam.WebcamDiscoveryListener;
import com.github.sarxos.webcam.WebcamEvent;
import com.github.sarxos.webcam.WebcamListener;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamPicker;
import com.github.sarxos.webcam.WebcamResolution;


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

    /*
    Class to show a continuous feed from a webcam
     */
    public static void showFeed() throws IOException{

    }

}