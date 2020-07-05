package stepDefs;

import Helper.ApiHelper;
import Utils.BaseLine_API;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createUserSteps {
    public BaseLine_API baseHelper = new BaseLine_API();
    public ApiHelper apiHelper = new ApiHelper();

    @When("^i post in to the url$")
    public void i_post_in_to_the_url() {
        apiHelper.createUser();
    }

    @Then("^i should get success response (\\d+)$")
    public void i_should_get_success_response(int responseCode)  {
        baseHelper.validateResponseCode(responseCode);
    }


}
