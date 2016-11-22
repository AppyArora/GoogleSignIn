package CodingToInterface;

public class DrawInterfaceImplementation implements DrawInterface{

	int x,y;
	
	
	
	
	
	public int getX() {
		return x;
	}





	public void setX(int x) {
		this.x = x;
	}





	public int getY() {
		return y;
	}





	public void setY(int y) {
		this.y = y;
	}





	@Override
	public void draw() {

		System.out.println("cordinates for line are {" + getX()  + " , " + getY()  + "}");
	}

}
