package co.com.choucair.certification.pruebaTestQA.tasks;

import co.com.choucair.certification.pruebaTestQA.userinterface.UTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Login implements Task {
    private String strNameUser;
    private String strLastNaUser;
    private String strEmailAddr;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strLanguage;
    private String strPassword;

    public Login(String strNameUser, String strLastNaUser, String strEmailAddr, String strMonth, String strDay, String strYear, String strLanguage, String strPassword) {
        this.strNameUser = strNameUser;
        this.strLastNaUser = strLastNaUser;
        this.strEmailAddr = strEmailAddr;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strLanguage = strLanguage;
        this.strPassword = strPassword;
    }

    public static Login onThePage(String strNameUser, String strLastNaUser, String strEmailAddr, String strMonth, String strDay, String strYear, String strLanguage, String strPassword) {

        return Tasks.instrumented(Login.class,strNameUser,strLastNaUser,strEmailAddr,strMonth,strDay,strYear,strLanguage,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestLoginPage.JOIN_BUTTON),
                Enter.theValue(strNameUser ).into(UTestLoginPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastNaUser).into(UTestLoginPage.INPUT_LAST_NAME),
                Enter.theValue(strEmailAddr).into(UTestLoginPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(UTestLoginPage.TB_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(UTestLoginPage.TB_BIRTH_DAY),
                SelectFromOptions.byVisibleText(strYear).from(UTestLoginPage.TB_BIRTH_YEAR),
                Enter.theValue(strLanguage).into(UTestLoginPage.LABEL_LANGUAGE_SPOKEN),
                Click.on(UTestLoginPage.NEXT_LOCATION_BUTTON),
                //Enter.keyValues("Bogot", Keys.ARROW_DOWN , Keys.TAB ).into(UTestLoginPage.CITY_SELECTION),
                //Enter.theValue("111111").into(UTestLoginPage.ZIP_CODE),
                Click.on(UTestLoginPage.NEXT_DEVICES_BUTTON),
                Click.on(UTestLoginPage.NEXT_LASTESTEP_BUTTON),
                Enter.theValue(strPassword).into(UTestLoginPage.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(UTestLoginPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UTestLoginPage.ACCEPT_TERMS_OF_USE),
                Click.on(UTestLoginPage.ACCEPT_PRIVACY_AND_SECURITY),
                Click.on(UTestLoginPage.COMPLETE_SETUP_BUTTON)
                //Click.on(UTestLoginPage.TB_BIRTH_MONTH.)
        );
    }
}
