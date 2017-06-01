package entity;

public class Block {
	private double mass,coefficient,distance,time,force,answer,x;
	public Block(double m, double coef, double dist, double tim){
		mass=m;
		coefficient=coef;
		distance=dist;
		time=tim;
		force=mass*10*coefficient+(mass*distance)/(time*time);
	}
	public double getForce(){
		return force;
	}
	public void giveAnswer(double ans){
		answer=ans;
	}
	public boolean isTooFar(){
		return answer>force;
	}
	public boolean isTooShort(){
		return answer<force;
	}
	public double getX(){
		return x;
	}
	public void move(double xAdd){
		x+=xAdd;
	}
}