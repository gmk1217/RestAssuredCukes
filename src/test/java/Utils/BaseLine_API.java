package Utils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class BaseLine_API {

    public static Response response;
    private JsonPath jsonPath;
    private Map<String,String>queryParamter = new HashMap();

    // Constructor  will get call as soon as object of this class initiates.
    public BaseLine_API(){

    }

    public void extractAttributeValue(String attributeName){
        String res = response.toString();
        jsonPath.with(res).get(attributeName);
    }

    public void addQueryParams(String key, String value){
        this.queryParamter.put(key, value);
    }

    public void doGetRequest(String apiURL){
        response= given().contentType("application/json")
                .when()
                .get(apiURL);
    }

    public void doPostRequest(String apiURL){
        response= given()
                .header("Content-Type","application/json")
                .body(PayLoad.postUser())
                .when()
                .post(apiURL);
    }

    public void doPutRequest(String apiURL){
        response= given()
                .header("Content-Type","application/json")
                .when()
                .put(apiURL);
    }

    public void doDeleteRequest(String apiURL){
        response= given()
                .header("Content-Type","application/json")
                .when()
                .put(apiURL);
    }

    public void validateResponseCode(int statusCode){
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    public void validateResponseBodyContainsValue(String field){
      //  jsonPath = response.jsonPath();
        //Assert.assertNotNull(jsonPath.get(field));
    }

    public void validateResponseBodyDoesNotContainsValue(String field){
        ResponseBody body =response.getBody();
        String bodyAsString =body.asString();
        Assert.assertFalse(bodyAsString.contains(field));
    }

    //public String getPropertyKeyFromResponseBody(String propertyKey){
       // jsonPath = new jsonPath(response.asString());
        //return jsonPath.getString(propertyKey);
   // }

    public void getPropertyValueFromResponseBody(String propertyKey, String propertyValue){
        response.then().body(propertyKey, containsString(propertyValue));
    }


}
