package game;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * Created by Client on 5/22/2017.
 */
public class Menu extends MouseAdapter {

    private Main main;

    private Player player;

    private Random r = new Random();
    private String title = "2D Shooter";

    public Menu(Main main){

        this.main = main;

    }
    public void mouseReleased(MouseEvent e){
        int mx = e.getX();
        int my = e.getY();

        if(this.main.gameState == Main.STATE.Menu){
            //play button
            if(mouseOver(mx, my, 50, 450, 200, 64)){
                main.gameState = Main.STATE.Game;
            }

            //help Button
            if(mouseOver(mx, my, 50, 550, 200, 64)){
                main.gameState = Main.STATE.Help;
            }

            //quit button
            if(mouseOver(mx, my, 50, 650, 200, 64)){
                System.exit(1);
            }

        }else if(this.main.gameState == Main.STATE.GameMenu){
            //play button
            if(mouseOver(mx, my, Main.window.frame.getWidth() / 2 - 100, 450, 200, 64)){
                main.gameState = Main.STATE.Game;
            }

            //help Button
            if(mouseOver(mx, my, Main.window.frame.getWidth() / 2 - 100, 550, 200, 64)){
                main.gameState = Main.STATE.GHelp;
            }

            //quit button
            if(mouseOver(mx, my, Main.window.frame.getWidth() / 2 - 100, 650, 200, 64)){
                System.exit(1);
            }

        }
        else if(this.main.gameState == Main.STATE.GHelp) {
            //back button
            if(mouseOver(mx, my, Main.WIDTH / 2-100, 550, 200, 64)){
                main.gameState = Main.STATE.GameMenu;
                return;
            }
        }
        else if(this.main.gameState == Main.STATE.Help) {
            //back button
            if(mouseOver(mx, my, Main.WIDTH / 2-100, 550, 200, 64)){
                main.gameState = Main.STATE.Menu;
                return;
            }
        }

        else if(this.main.gameState == Main.STATE.End){
            //try again
            if(mouseOver(mx, my, Main.WIDTH/2 - 200, 350, 200, 64)){

                return;
            }
            //quit
            if(mouseOver(mx, my, Main.WIDTH / 2 + 10, 350, 200, 64)){
                System.exit(1);
                return;
            }
        }
    }

    private boolean mouseOver(int mx, int my, int x, int y, int width, int height){
        if(mx > x && mx < x + width){
            if(my > y && my < y + height){
                return true;
            }else return false;
        }else return false;
    }

    public void tick(){

    }

    public void render(Graphics g){


        if(main.gameState == Main.STATE.Menu){

            Font fnt = new Font("arial", 1, 70);
            Font fnt2 = new Font("arial", 1, 30);

            g.drawImage(null, -1801, -1350, null);
            g.setFont(fnt);
            g.setColor(Color.WHITE);
            int w2 = g.getFontMetrics().stringWidth(title) / 2;
            int h2 = g.getFontMetrics().getHeight();
            g.drawString(title, Main.WIDTH / 2 - w2, h2);
            g.setFont(fnt2);
            g.setColor(Color.WHITE);
            g.drawString("Play", 110, 490);
            g.drawRect(50, 450, 200, 64);

            g.drawString("Help", 110, 590);
            g.drawRect(50, 550, 200, 64);

            g.drawString("Quit", 110, 690);
            g.drawRect(50, 650, 200, 64);

        }else if(main.gameState == Main.STATE.GameMenu){

            Font fnt = new Font("arial", 1, 70);
            Font fnt2 = new Font("arial", 1, 30);

            g.drawImage(null, 0, 0, null);
            g.setFont(fnt);
            g.setColor(Color.WHITE);
            int w2 = g.getFontMetrics().stringWidth("Pause") / 2;
            int h2 = g.getFontMetrics().getHeight();
            g.drawString("Pause", Main.WIDTH / 2 - w2, Main.HEIGHT / 2 - h2);
            g.setFont(fnt2);
            g.setColor(Color.WHITE);
            g.drawString("Resume", Main.WIDTH / 2 - (g.getFontMetrics().stringWidth("Resume") / 2), 490);
            g.drawRect(Main.window.frame.getWidth() / 2 - 100, 450, 200, 64);

            g.drawString("Help", Main.WIDTH / 2 - (g.getFontMetrics().stringWidth("Help") / 2), 590);
            g.drawRect(Main.window.frame.getWidth() / 2 - 100, 550, 200, 64);

            g.drawString("Quit", Main.WIDTH / 2 - (g.getFontMetrics().stringWidth("Quit") / 2), 690);
            g.drawRect(Main.window.frame.getWidth() / 2 - 100, 650, 200, 64);

        }else if(main.gameState == Main.STATE.GHelp){

            Font fnt = new Font("arial", 1, 50);
            Font fnt2 = new Font("arial", 1, 30);
            Font fnt3 = new Font("arial", 1, 15);
            g.drawImage(null, 0, 0, null);
            g.setFont(fnt);
            g.setColor(Color.WHITE);
            g.drawString("Help", Main.WIDTH / 2 - (g.getFontMetrics().stringWidth("Help") / 2), 100);

            g.setFont(fnt3);

            int w = g.getFontMetrics().stringWidth("test") / 2;
            g.drawString("test", Main.WIDTH / 2 - w, 310);

            g.setFont(fnt2);
            g.drawRect(Main.WIDTH / 2-100, 550, 200, 64);
            g.drawString("Back", Main.WIDTH / 2 - (g.getFontMetrics().stringWidth("Back") / 2), 590);

        }else if(main.gameState == Main.STATE.Help){

            Font fnt = new Font("arial", 1, 50);
            Font fnt2 = new Font("arail", 1, 30);
            Font fnt3 = new Font("arail", 1, 15);
            g.drawImage(null, 0, 0, null);
            g.setFont(fnt);
            g.setColor(Color.WHITE);
            g.drawString("Help", Main.WIDTH / 2 - (g.getFontMetrics().stringWidth("Help") / 2), 100);

            g.setFont(fnt3);
            String s = "Use WASD keys on your keyboard to move your Player and Click your mouse to kill enemies!";
            int w = g.getFontMetrics().stringWidth(s) / 2;
            g.drawString(s, Main.WIDTH / 2 - w, 310);

            g.setFont(fnt2);
            g.drawRect(Main.WIDTH / 2-100, 550, 200, 64);
            g.drawString("Back", Main.WIDTH / 2 - (g.getFontMetrics().stringWidth("Back") / 2), 590);

        }else if(main.gameState == Main.STATE.End){
            g.drawImage(null, 0, 0, null);
            Font fnt = new Font("arial", 1, 50);
            Font fnt2 = new Font("arail", 1, 30);
            Font fnt3 = new Font("arail", 1, 18);

            g.setFont(fnt);
            g.setColor(Color.WHITE);
            g.drawString("Game Over", Main.WIDTH / 2 - (g.getFontMetrics().stringWidth("Game Over") / 2), 70);

            //g.setFont(fnt3);

            g.setFont(fnt2);
            g.drawRect(Main.WIDTH/2 - 200, 350, 200, 64);
            g.drawString("Try Again", Main.WIDTH / 2 - (g.getFontMetrics().stringWidth("Try Again"))-25, 390);

            g.setFont(fnt2);
            g.drawRect(Main.WIDTH / 2 + 10, 350, 200, 64);
            g.drawString("Quit", Main.WIDTH / 2 + (g.getFontMetrics().stringWidth("Quit")), 390);

        }

    }

}