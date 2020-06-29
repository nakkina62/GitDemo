Feature: Validating Place APIs 

@AddPlace @Regression
Scenario Outline: Verify if Place is successfully added using AddPlace API
Given Add Place Payload "<name>" "<address>" "<language>"
When user calls "AddPlaceAPI" with "Post" http request
Then the API call gets successful with status code 200
And "status" in response body is "OK"
And "scope" in response body is "APP"
And verify place-Id created maps to "<name>" using "getPlaceAPI"


Examples:
|name      | |address|  |language|
|GreatClips| |Tottenham||English |
#|Joe Eden  | |Longlake ||French  |

@DeletePlace @Regression
Scenario: Verify if Delete Place functionality is workind
Given DeletePlace Payload
When user calls "deletePlaceAPI" with "Post" http request
Then the API call gets successful with status code 200
And "status" in response body is "OK"


