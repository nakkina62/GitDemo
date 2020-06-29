package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		// execute only when PalceID is null
		//write a code that will give you place id
		
		stepDefinition SD = new stepDefinition();
		SD.add_Place_Payload("Srini", "English", "USA");
		SD.user_calls_with_http_request("AddPlaceAPI", "POST");
		SD.verify_place_Id_created_maps_to_using("Srini", "getPlaceAPI");
		
	}

}
