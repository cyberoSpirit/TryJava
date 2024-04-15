package ReducingLatency;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;

public class ImageToGrayscale {

    public static void ReducingLatency() throws Exception {
        File inputFile = new File("ReducingLatency/beach.png"); // Input file
        File outputFile = new File("ReducingLatency/beach_grayscale.png"); // Output file

        try {
            BufferedImage image = ImageIO.read(inputFile);
            long startTime = System.currentTimeMillis();
            convertToGrayscaleConcurrently(image,2);
            
            long endTime = System.currentTimeMillis();
            ImageIO.write(image, "png", outputFile);

            System.out.println("The processing time is " + (endTime - startTime) + " milliseconds");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void convertToGrayscaleConcurrently(BufferedImage image, int numberOfThreads) throws InterruptedException {
        int heightPerThread = image.getHeight() / numberOfThreads;

        GraysclaeConverterThread[] threads = new GraysclaeConverterThread[numberOfThreads];

        int startY, endY;
        for (int i = 0; i < threads.length; i++) {
            startY = i * heightPerThread;
            endY = startY + heightPerThread;

            threads[i] = new GraysclaeConverterThread(image, startY, endY);
            threads[i].start();
        }

        for (GraysclaeConverterThread graysclaeConverterThread : threads) {
            graysclaeConverterThread.join();
        }
        
    }
}
