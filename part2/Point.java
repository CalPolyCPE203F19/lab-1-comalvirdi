public class Point
{
	private double xCord;
	private double yCord;

	public Point(double x, double y){
		this.xCord = x;
		this.yCord = y;

	}

	public double getX(){
		return xCord;
	}

	public double getY(){
		return yCord;
	}

	public double getRadius(){
		return Math.sqrt(Math.pow(xCord,2) + Math.pow(yCord,2));
	}

	public double getAngle(){
		return Math.atan(xCord/yCord);
	}

	public double rotate90(){
		double newX = yCord*(Math.sin(Math.PI/2));
		double newY = xCord*(Math.sin(Math.PI/2));

		return (newX);
	}

}
