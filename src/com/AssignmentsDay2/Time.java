public class Time {
	int hours;
	int minutes;
	public Time(int hours, int minutes) {
		this.hours=hours;
		this.minutes=minutes;
	}
	public Time() {
		
	}
	public static Time sum(Time time, Time time1) {
		Time result = new Time();
		result.hours=time.hours+time1.hours;
		if(result.hours>=24){
			System.out.println("addition of hours cannot be more than 24 hours in a day");
		}
			else{
		 result.hours = time.hours+time1.hours;
		}
		result.minutes=time.minutes+time1.minutes;
		if(result.minutes>60){
			
			result.hours++;
			result.minutes=result.minutes-60;
		}
		else{
			result.minutes=time.minutes+time1.minutes;
		}
		return result;
	}
	
	public void display(){
		System.out.println(hours+" hrs "+minutes+" min");
	}
	

}
