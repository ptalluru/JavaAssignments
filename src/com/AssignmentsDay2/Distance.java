public class Distance {

	float feet;
	float inches;
	
	public Distance() {
	}

	public Distance(float feet, float inches) {
		this.feet=feet;
		this.inches=inches;
	}
	
	public void display(){
		System.out.println(feet+" ft "+inches+" in");;
	}

	public static Distance sum(Distance distance, Distance distance1) {
		Distance result = new Distance();
		result.feet=distance.feet+distance1.feet;
		result.inches=distance.inches+distance1.inches;
		return result;
	}

}
