package ReducingLatency;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class GraysclaeConverterThread extends Thread {
    private BufferedImage image;
    private int startY;
    private int endY;
    private int width;

    public GraysclaeConverterThread(BufferedImage image, int startY, int endY) {
        this.image = image;
        this.startY = startY;
        this.endY = endY;
        this.width = this.image.getWidth();
    }

    @Override
    public void run() {
        for (int y = this.startY; y < this.endY; y++) {
            for (int x = 0; x < this.width; x++) {
                int rgb = image.getRGB(x, y);
                Color color = new Color(rgb, true);
    
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                
                // Compute the average of red, green, and blue (simple grayscale)
                int gray = (red + green + blue) / 3;
                
                // Create new grayscale color
                Color grayColor = new Color(gray, gray, gray, color.getAlpha());
                image.setRGB(x, y, grayColor.getRGB());
            }
        }
    }
}
