package resources;

import java.util.ArrayList;
import java.util.List;

import POJO_Serialization.AddPlace;
import POJO_Serialization.Location;

public class TestDataBuild {
	
	public AddPlace AddPlacePayload(String name, String address, String language)
	{
		
		
		AddPlace ap = new AddPlace();
		ap.setAccuracy(50);
		ap.setAddress(address);
		ap.setLanguage(language);
		ap.setName(name);
		ap.setPhone_number("(+91) 983 893 3937");
		ap.setWebsite("http://google.com");
		
		List<String> Type = new ArrayList <String>();
		Type.add("shoe park");
		Type.add("shop");
		ap.setTypes(Type);
		
		Location loc = new Location();
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		ap.setLocation(loc);
		
		return ap;
		
	}

	
	public String deletepayload(String place_id)
	{
		
		return "{\r\n    \"place_id\": \""+place_id+"\"\r\n}";
	}
}
