package graphqltestingPages;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getCityByNameQuery extends BaseClass{
	String name;
	String country;
	String body = "\r\n"
	     		+ "query\r\n"
	     		+ "{\r\n"
	     		+ "  getCityByName(name:\"London\")\r\n"
	     		+ "  {\r\n"
	     		+ "    name\r\n"
	     		+ "    country\r\n"
	     		+ "    id\r\n"
	     		+ "    coord{\r\n"
	     		+ "      lon\r\n"
	     		+ "      lat\r\n"
	     		+ "    }\r\n"
	     		+ "    weather\r\n"
	     		+ "    {\r\n"
	     		+ "      summary\r\n"
	     		+ "      {\r\n"
	     		+ "        title\r\n"
	     		+ "      }\r\n"
	     		+ "      temperature\r\n"
	     		+ "      {\r\n"
	     		+ "        actual\r\n"
	     		+ "        \r\n"
	     		+ "      }\r\n"
	     		+ "      wind\r\n"
	     		+ "      {\r\n"
	     		+ "        speed\r\n"
	     		+ "      }\r\n"
	     		+ "      clouds \r\n"
	     		+ "      {\r\n"
	     		+ "        all\r\n"
	     		+ "      }\r\n"
	     		+ "      timestamp\r\n"
	     		+ "      \r\n"
	     		+ "    }\r\n"
	     		+ "  }\r\n"
	     		+ "}";
	public Response response = null;
	
	public void getCityByName(String name)
	{
		response = null;
		reqSpecBuilder.setBody(body);
		RestAssured.given(reqSpecBuilder.build());
		response = requestSpecification.post();
	}
	
	public void getCityByName(String name , String country)
	{
		response = null;
		reqSpecBuilder.setBody(body);
		RestAssured.given(reqSpecBuilder.build());
		response = requestSpecification.post();
	}

}
