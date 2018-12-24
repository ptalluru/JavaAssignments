public class Countries {
	private String countryName;
	private long population;
	private double area;
	
	public Countries(String countryName, long population, double area) {
		super();
		this.countryName = countryName;
		this.population = population;
		this.area = area;
	}
	public Countries() {
		
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Countries largestAreaCountry(Countries[] country){
		for(int index=0; index<country.length-1; index++){
			Countries countries= new Countries();
			if(country[index].getArea()>country[index+1].getArea()){
				countries=country[index];
				country[index]=country[index+1];
				country[index+1]=countries;
			}
		}
		return country[country.length-1];
	}
	public Countries largestPopulationCountry(Countries[] country){
		for(int index=0; index<country.length-1; index++){
			Countries countries= new Countries();
			if(country[index].getPopulation()>country[index+1].getPopulation()){
				countries=country[index];
				country[index]=country[index+1];
				country[index+1]=countries;
			}
		}
		return country[country.length-1];

	}
	public Countries largestPopulationDensityCountry(Countries[] country){
		for(int index=0; index<country.length-1; index++){
			Countries countries= new Countries();
			if(country[index].getPopulation()/country[index].getArea()>country[index+1].getPopulation()/country[index+1].getArea()){
				countries=country[index];
				country[index]=country[index+1];
				country[index+1]=countries;
			}
		}
		return country[country.length-1];
	}
}
