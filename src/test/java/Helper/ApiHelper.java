package Helper;

import Utils.BaseLine_API;
import Utils.RestLogger;
import org.testng.annotations.Test;

public class ApiHelper extends BaseLine_API {

    public BaseLine_API baseHelper = new BaseLine_API();
    static final RestLogger rlog =  RestLogger.getLogger(ApiHelper.class);

    public ApiHelper(){

    }
   


    public void createUser(){
        String createUserUrl = Constants.baseURI+Constants.basePath+Constants.endPoint;
        rlog.info(createUserUrl);
        baseHelper.doPostRequest(createUserUrl);
    }



    public void getUsers(){
        String getUserUrl = Constants.baseURI+Constants.basePath+Constants.endPoint+Constants.param;
        baseHelper.doGetRequest(getUserUrl);
        rlog.info(getUserUrl);
    }


    public void getListOfUsers(){

        // Build the url using config.properties from a seperate class

    }

    public void updateUser(){

    }
}
