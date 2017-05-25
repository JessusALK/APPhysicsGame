
public class Player {
	private float x;
	private float y;
	public static boolean wState;
	public static boolean sState;
	public static boolean aState;
	public static boolean dState
	public static boolean spaceState;
	
	public Player(){
		
	}
	public float getX(){
		return x;
	}
	public float getY(){
		return y;
	}
	
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == VK_W)){
			setKeyState(wState, true);	
		}
		if(e.getKeyCode() == VK_S){
	        setKeyState(sState, true);	

		}
		if(e.getKeyCode() == VK_A){
			 setKeyState(aState, true);	

		}
		if(e.getKeyCode() == VK_D){
			 setKeyState(dState, true);	

		}
		if(e.getKeyCode() == VK_SPACE){
			 setKeyState(spaceState, true);	

		}
		
		
		
	}
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode() == VK_W)){
			 setKeyState(wState, false);	

		}
		if(e.getKeyCode() == VK_S){
			 setKeyState(sState, false);	

		}
		if(e.getKeyCode() == VK_A){
			 setKeyState(aState, false);	

		}
		if(e.getKeyCode() == VK_D){
			 setKeyState(dState, false);	

		}
		if(e.getKeyCode() == VK_SPACE){
			 setKeyState(spaceState, false);	

		}
	}
	
	public void setKeyState(boolean key, boolean state){
		key = state;
	}
	public boolean getKeyState(boolean key){
		return key; 0
	}
	public void move(){
		
	}
}
