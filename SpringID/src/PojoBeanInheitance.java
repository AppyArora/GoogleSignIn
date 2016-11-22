public class PojoBeanInheitance {
	
	int x,y,z;

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

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	void method()
	{
		System.out.println("value of x :"+x);
		System.out.println("value of y :"+ y);
		System.out.println("value of z : "+z);
		
		
	}

	@Override
	public String toString() {
		return "PojoBeanInheitance [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
	
	
	
}
