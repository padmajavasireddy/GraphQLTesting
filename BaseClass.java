package graphqltestingPages;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	String baseURL = "https://graphql-weather-api.herokuapp.com" ;
    RequestSpecBuilder reqSpecBuilder = new RequestSpecBuilder();
    RequestSpecification requestSpecification;
	
    public  void createRequestSpecification() {
        reqSpecBuilder.setBaseUri(baseURL);
		reqSpecBuilder.setContentType("application/json; charset=UTF-8");
	}


}
