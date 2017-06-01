

import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;


/**
 * Created by Gustavo_Muratalla on 5/9/16.
 */
public class Window{

	private static final long serialVersionUID = 516290100757231509L;

	public final JFrame frame;

	public Window(String title, Main main){
		frame = new JFrame(title);

		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //full screen in window mode
		//  frame.setUndecorated(true); //Gets Rid of the Bar on top of the Window

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(main);
		frame.setVisible(true);
		Main.WIDTH = 1000;
		Main.HEIGHT = 800;
		frame.setPreferredSize(new Dimension(Main.WIDTH, Main.HEIGHT));
		frame.setSize(new Dimension(Main.WIDTH, Main.HEIGHT));
		if(currentEvent != "none"){
			
			if(currentEvent == "circuitP"){
				String answercircuitP = JOptionPane.showInput(frame, "Problem goes here", null)
			}
			else if(currentEvent == "jumpingkinematicP"){
				String answerjkP = JOptionPane.showInputDialog(frame, "Problem goes here", null)
				
			}
			else if(currentEvent == "blockP"){
				
			}
			else if(currentEvent == "pendulumP"){
				
			}

		}
		
		//GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(frame); //Take over the whole screen

		main.start();
	}
}