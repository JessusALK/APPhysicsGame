

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main
{

    private int frames;
    private Thread thread;
    private boolean running = false;

    public Main(){

    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        running = true;

    }
    public synchronized void stop() {
        try {
            thread.join();
            running = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void init(){

    }
    public void run() {
        init();


        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        frames = 0;
        changeLevel();
        while (running) {

            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;




            while (delta >= 1) {
                tick();

                delta--;
                frames++;
            }

            if (running)

                render();






            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames);
                frames = 0;
            }
        }
        stop();
    }
    public void tick(){

    }

    public void render(){
        BufferStrategy bs = this.getBufferStrategy();

        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        super.paint(g);

        Graphics g2d = (Graphics2D) g;

        g.dispose();
        bs.show();

    }
    public static void main(String[] args){

    }
}