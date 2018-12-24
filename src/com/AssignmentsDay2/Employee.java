public class Employee {
	private static float pfRate;
	

	public static float getPfRate() {
		return pfRate;
	}

	public static void setPfRate(float pfRate) {
		Employee.pfRate = pfRate;
	}

	private int id;
	private String name;
	private float monthlyBasic;
	final int medical=1250;
	final int conveyance=800;
	
	public Employee(){}

	/*public Employee(float pfRate){
		Employee.pfRate=pfRate;
	}
	*/
	
	public Employee(int i, String string, int j) {
		this.id=i;
		this.name=string;
		this.monthlyBasic=j;
	}
	

	/*public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	

	public float getMonthlyBasic() {
		return monthlyBasic;
	}
	
	
	public void setMonthlyBasic(int monthlyBasic){
		this.monthlyBasic = monthlyBasic;
	}*/
	
	
	public float getAnnualBasic(){
		return monthlyBasic*12;
	}
	
	
	public float hraCalculation(){
		float hra=((monthlyBasic*50)/100)+ medical+conveyance;
		return hra;
		
	}
	
	
	public float getMonthlyGrossSalary(){
		return monthlyBasic +hraCalculation() + medical + conveyance;
	}
	
	
	public float getAnnualGrossSalary(){
		return getMonthlyGrossSalary()*12;
		
	}
	
	
	public float pf(){
		float pfCalculation=(monthlyBasic*10)/100;
		if(pfCalculation>=6500)
			return pfCalculation;
		else
			return 6500;
	}
	
	
	public float esic(){
		float esicCalculation =(float) ((monthlyBasic*4.75)/100);
		if(monthlyBasic<=5000)
			return 5000;
		else
			return esicCalculation;
	}
	
	
	public int proffessionalTax(){
		if(getMonthlyGrossSalary()<=10000)
			return 50;
		else
			return 100;
	}
	
	
	public float getMonthlyDeductions(){
		float monthlyDeductions=pf()+esic()+proffessionalTax();
		return monthlyDeductions;
	}
	
	
	public float getMonthlyTakeHome(){
		float takeHome=getMonthlyGrossSalary()-getMonthlyDeductions();
		return takeHome;
		
	}

	public float getAnnualTakeHome(){
		return getMonthlyTakeHome()*12;
	}

	public float setGetPf(){
		float pfCalculation=(monthlyBasic*Employee.getPfRate())/100;
		if(pfCalculation<=6500)
		 pfCalculation = 6500;
		return pfCalculation;	
	}
}
	
