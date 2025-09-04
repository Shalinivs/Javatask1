package JavaTask3;

public class Circle {


		private int Radius;

		public Circle()
		{
		this.Radius = 1;
		}
		public Circle(int Radius)
		{
		this.Radius=Radius;
		}

		public void calculateCircumference()
		{
		double pi=3.142;
		int r=3;
		double circumference=2*pi*r;
		System.out.println(circumference);
		}

		public static void main(String[] args) {

		Circle circle= new Circle();
		circle.calculateCircumference();

		
	}

}
