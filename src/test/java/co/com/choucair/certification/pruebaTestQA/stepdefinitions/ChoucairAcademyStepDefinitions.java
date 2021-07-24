package co.com.choucair.certification.pruebaTestQA.stepdefinitions;

import co.com.choucair.certification.pruebaTestQA.model.AcademyChoucairData;
import co.com.choucair.certification.pruebaTestQA.questions.Answer;
import co.com.choucair.certification.pruebaTestQA.tasks.Login;
import co.com.choucair.certification.pruebaTestQA.tasks.LoginAfterCreateProfile;
import co.com.choucair.certification.pruebaTestQA.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Carlos needs a profile on uTest\\.com$")
    //@Given("^than Carlos needs a profile on uTest.com$")
    public void thanCarlosNeedsAProfileOnUTestCom(List<AcademyChoucairData> academyChoucairDataList) throws Exception{
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage(),
              Login.onThePage(academyChoucairDataList.get(0).getStrNameUser(),
                     academyChoucairDataList.get(0).getStrLastNaUser(),
                     academyChoucairDataList.get(0).getStrEmailAddr(),
                     academyChoucairDataList.get(0).getStrMonth(),
                     academyChoucairDataList.get(0).getStrDay(),
                     academyChoucairDataList.get(0).getStrYear(),
                     academyChoucairDataList.get(0).getStrLanguage(),
                     academyChoucairDataList.get(0).getStrPassword()
             )
        );
    }


    @When("^he is on the login page at uTest\\.com$")
    //@When("^he is on the homePage uTest.com$")
    public void heIsOnTheLoginPageAtUTestCom(List<AcademyChoucairData> academyChoucairDataList) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginAfterCreateProfile.the(academyChoucairDataList.get(0).getStrEmailAddr(),
                        academyChoucairDataList.get(0).getStrPassword()
                )
        );
    }

    @Then("^he finds the screen with a message:$")
    //@Then("^he finds the button  JOIN TODAY to go to create profile$")
    public void heFindsTheScreenWithAMessage(List<AcademyChoucairData> academyChoucairDataList) throws Exception {
        OnStage.theActorInTheSpotlight().
                should(GivenWhenThen.seeThat(Answer.
                        toThe(academyChoucairDataList.get(0).getStrConfirmation())
                )
                );
    }


}
