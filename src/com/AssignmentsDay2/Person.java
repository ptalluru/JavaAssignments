import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class Person {
	private String name;
	private Date dob;
	private int date;
	private int month;
	private int year;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Person(String name, int date, int month, int year)
	{
		this.name=name;
		this.date=date;
		this.month=month;
		this.year=year;
	}
	
	public Person() {
	}
	public void display()
	{	
		LocalDate personDob = LocalDate.of(1995,07,04);
		LocalDate localdate = LocalDate.now();
		Period p =Period.between(personDob,localdate);
		String name = getName();
		String dateOfBirth = date+"/"+month+"/"+year;
		String age = p.getDays()+" Years "+p.getMonths()+" Months "+p.getYears()+" Days ";
		}
	public String olderOne(Person person,Person person1){
		LocalDate personDob = LocalDate.of(person.year,person.month,person.date);
		LocalDate personOneDob = LocalDate.of(person1.year,person1.month,person1.date);
		Period p =Period.between(personDob,personOneDob);
		if(p.getDays()>0 && p.getMonths()>0 && p.getYears()>0){
			return person.name+" is older than " +person1.name+" by "+p.getYears()+" years ,"+p.getMonths()+" months, and "+p.getDays()+"days";
		}
		else{
			return person1.name+" is older than " +person.name+" by "+p.getYears()+" years ,"+p.getMonths()+" months, and "+p.getDays()+"days";
		}
	}
}


				   
								