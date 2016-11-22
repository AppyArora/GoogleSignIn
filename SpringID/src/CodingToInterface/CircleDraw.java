package CodingToInterface;

import org.springframework.beans.factory.annotation.Required;

public class CircleDraw  implements DrawInterface
{
	private int center;
	
	
	
	public int getCenter() {
		return center;
	}


	@Required
	public void setCenter(int center) {
		this.center = center;
	}



	
	@Override
	public void draw() {
	System.out.println("center is:{"+ getCenter() + "," + getCenter() + "}");
		
	}

}
