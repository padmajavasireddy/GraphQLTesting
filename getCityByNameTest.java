package graphqltestingTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import graphqltestingPages.getCityByNameQuery;


public class getCityByNameTest {
	getCityByNameQuery getcitybyname= new getCityByNameQuery();
}
	
@BeforeClass
public void executeQuery()
{
	
	getcitybyname.getCityByName("London");
}
	
@Test
public void validategetcitybynamestatus()
{
	
	int responsecode = getcitybyname.response.getStatusCode();
	Assert.assertEquals(responsecode, 200);
}
@Test
public void validatetemperature()
{
	
	int temperature = getcitybyname.response.temperature.actual;
	Assert.assertEquals(250, temperature);
		
}

@Test
public void validatewindspeed()
{
	double windspeed = getcitybname.response.wind.speed;
	Assert.assertEquals(2.5, windspeed);
}