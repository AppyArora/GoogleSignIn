import java.util.List;


public class CollectionInjection {

	List<PointClass> point;
	List<String> abc;


	public List<String> getAbc() {
		return abc;
	}

	public void setAbc(List<String> abc) {
		this.abc = abc;
	}

	public List<PointClass> getPoint() {
		return point;
	}

	public void setPoint(List<PointClass> point) {
		this.point = point;
	}


	void show()
	{

		for(PointClass points:point)
		{System.out.println(abc.get(0));
			System.out.println("x::"+points.getX());
			System.out.println("y::"+points.getY());


		}
	}


}
