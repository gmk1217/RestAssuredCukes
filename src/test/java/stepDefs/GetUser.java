package stepDefs;

import Helper.ApiHelper;
import Utils.BaseLine_API;
import cucumber.api.java.en.When;

public class GetUser {

    public BaseLine_API baseHelper = new BaseLine_API();
    public ApiHelper apiHelper = new ApiHelper();

    @When("^i use get method for the API to get user information$")
    public void i_use_get_method_for_the_API_to_get_user_information() throws Throwable {
        apiHelper.getUsers();
    }
}
