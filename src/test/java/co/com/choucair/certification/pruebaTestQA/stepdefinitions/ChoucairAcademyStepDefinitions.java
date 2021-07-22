package co.com.choucair.certification.pruebaTestQA.stepdefinitions;

import co.com.choucair.certification.pruebaTestQA.tasks.Login;
import co.com.choucair.certification.pruebaTestQA.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Carlos needs a profile on uTest\\.com$")
    //@Given("^than Carlos needs a profile on uTest.com$")
    public void thanCarlosNeedsAProfileOnUTestCom() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage(),
                (Login.onThePage()));
    }


    @When("^he is on the homePage uTest\\.com$")
    //@When("^he is on the homePage uTest.com$")
    public void heIsOnTheHomePageUTestCom() {

    }

    @Then("^he finds the button  \"([^\"]*)\" to go to create profile$")
    //@Then("^he finds the button  JOIN TODAY to go to create profile$")
    public void heFindsTheButtonToGoToCreateProfile(String arg1) {

    }


}
