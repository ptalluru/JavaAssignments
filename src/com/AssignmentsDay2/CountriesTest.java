import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CountriesTest {
	private Countries countries1,countries2,countries3,countries4;
	@Before
	public void setUp(){
		countries1 = new Countries("India", 86685000, 587346);
		countries2 = new Countries("Australia",9000000, 5876);
		countries3 = new Countries("America", 96445000, 5875);
		countries4 = new Countries("Japan", 800000, 56755);
	}

	@Test
		public void countryWithLargestArea() {

			Countries[] country={countries1, countries2, countries3, countries4};
			Countries countries=new Countries();
			String result= countries.largestAreaCountry(country).getCountryName();
			assertEquals("India", result);
	}
	@Test
	public void countryWithLargestPopulation() {

		Countries[] country={countries1, countries2, countries3, countries4};
		Countries countries=new Countries();
		String result= countries.largestPopulationCountry(country).getCountryName();
		assertEquals("America", result);
	}
	@Test
	public void countryWithLargestPopulationDensity() {

		Countries[] country={countries1, countries2, countries3, countries4};
		Countries countries=new Countries();
		String result= countries.largestPopulationDensityCountry(country).getCountryName();
		assertEquals("America",result);
	}
}









