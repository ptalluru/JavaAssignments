import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class EmployeeTest {
	private Employee employee;
	private Employee employee1;

	@Before
	public void setUp(){
		employee =  new Employee(101,"Ajay",5000);
		employee1 = new Employee(100,"Prasanth",500000);	
		Employee.setPfRate(10);
	}
	
	@Test
	public void annualBasic() {
		float annualBasic=employee.getAnnualBasic();
		float annualBasic1=employee1.getAnnualBasic();
		assertEquals(60000,annualBasic,00);
		assertEquals(6000000,annualBasic1,00);
		
	}
	@Test
	public void hra() {
		float hra = employee.hraCalculation();
		float hra1 = employee1.hraCalculation();
		assertEquals(4550, hra,00);
		assertEquals(252050, hra1,00);
	}
	@Test
	public void monthlyGross() {
		float monthlyGross=employee.getMonthlyGrossSalary();
		float monthlyGross1=employee1.getMonthlyGrossSalary();
		assertEquals(11600,monthlyGross,00);
		assertEquals(754100,monthlyGross1,00);
	}
	@Test
	public void annualGross() {
		float annualGross=employee.getAnnualGrossSalary();	
		float annualGross1=employee1.getAnnualGrossSalary();	
		assertEquals(139200,annualGross,00);
		assertEquals(9049200,annualGross1,00);
	}
	@Test
	public void pfCalculations() {
		float pfCalculations=employee.pf();	
		float pfCalculations1=employee1.pf();	
		assertEquals(6500,pfCalculations,00);
		assertEquals(50000,pfCalculations1,00);
	}
	@Test
	public void esicCalculations() {
		float esicCalculations=employee.esic();
		float esicCalculations1=employee1.esic();
		assertEquals(5000,esicCalculations,00);
		assertEquals(23750,esicCalculations1,00);
	}
	@Test
	public void tax () {
		float tax =employee.proffessionalTax();	
		float tax1 =employee1.proffessionalTax();	
		assertEquals(100,tax,00);
		assertEquals(100,tax1,00);
	}
	@Test
	public void monthlyDeductions() {
		float monthlyDeductions=employee.getMonthlyDeductions();
		float monthlyDeductions1=employee1.getMonthlyDeductions();
		assertEquals(11600,monthlyDeductions,00);
		assertEquals(73850,monthlyDeductions1,00);
	}
	@Test
	public void monthlyTakeHome() {
		float monthlyTakeHome =employee.getMonthlyTakeHome();
		float monthlyTakeHome1 =employee1.getMonthlyTakeHome();
		assertEquals(0,monthlyTakeHome,00);
		assertEquals(680250,monthlyTakeHome1,00);
	}
	@Test
	public void annualTakeHome() {
		float annualTakeHome=employee.getAnnualTakeHome();
		float annualTakeHome1=employee1.getAnnualTakeHome();
		assertEquals(0,annualTakeHome,00);
		assertEquals(8163000,annualTakeHome1,00);
	}
	
	@Test
	public void setGetPfTest() {
		float setGetPfTest=employee1.setGetPf();
		assertEquals(50000,setGetPfTest,00);
	}
}
