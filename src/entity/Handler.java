package entity;


import java.awt.image.BufferedImage;

import java.util.concurrent.CopyOnWriteArrayList;

public class Handler {
	
    public static List<GameObject> object = new CopyOnWriteArrayList<GameObject>();
    public static List<Tile> tile = new CopyOnWriteArrayList<Tile>();
    
    
    
    public void LoadImageLevel(BufferedImage image) {
        int w = image.getWidth();
        int h = image.getHeight();

        //System.out.println("Width: " + w + "Height: "+ h);

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = image.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;

                if (red == 0 && green == 255 && blue == 0)

                if (red == 0 && green == 0 && blue == 255)

                if (red == 255 && green == 255 && blue == 255)

                if(red == 255 && green == 255 && blue == 0)

                if(red == 255 && green == 0 && blue == 0)

             
            }
        }

    }


}
