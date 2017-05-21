
public class Player {
	private double x;
	private double y;
	public Player(){
		x=00;
		y=00;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public void move(double xAdd){
		x+=xAdd;
	}
}
