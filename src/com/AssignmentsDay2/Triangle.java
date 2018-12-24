public class Triangle {
	private float side1,side2,side3;
	private int angle1,angle2,angle3;
	
	
	
	public Triangle(float side1, float side2, float side3, int angle1,
			int angle2, int angle3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.angle1 = angle1;
		this.angle2 = angle2;
		this.angle3 = angle3;
	}
	public Triangle() {
	}
	public boolean isRight(){
		if((angle1==90)&&(angle2<90)&&(angle3<90)&&((angle1+angle2+angle3)==180)){
			return true;
		}
		else
			return false;
		
	}
	public boolean isScalene(){
		if(((side1!=side2)&&(side2!=side3)&&(side3!=side1))&&((angle1!=angle2)&&(angle2!=angle3)&&(angle3!=angle1))&&(angle1+angle2+angle3==180)){
			return true;
		}
		else
			return false;
	}
	public boolean isIscoceles(){
		if(((side1==side2)||(side2==side3)||(side3==side1))&&((angle1==angle2)||(angle2==angle3)||(angle2==angle3)&&((angle1+angle2+angle3)==180))){
			return true;
		}
		else
			return false;
	}
	public boolean isEquilateral(){
		if(((side1==side2)&&(side2==side3))&&((angle1==angle2)&&(angle2==angle3)&&((angle1+angle2+angle3)==180))){
			return true;
		}
		else
		return false;
	}
}
