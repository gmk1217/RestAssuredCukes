package Helper;

import Utils.BaseLine_API;
import org.testng.annotations.Test;

public class ApiHelper extends BaseLine_API {

    public BaseLine_API baseHelper = new BaseLine_API();

    @Test
    public void createUser(){
        String createUserUrl = Constants.baseURI+Constants.basePath+Constants.endPoint;
        baseHelper.doPostRequest(createUserUrl);
        baseHelper.validateResponseCode(201);
    }

    @Test
    public void getUsers(){
        String getUserUrl = Constants.baseURI+Constants.basePath+Constants.endPoint+Constants.param;
        baseHelper.doGetRequest(getUserUrl);
        baseHelper.validateResponseCode(200);
    }

    @Test
    public void getListOfUsers(){

        // Build the url using config.properties from a seperate class

    }
    @Test
    public void updateUser(){

    }
}
