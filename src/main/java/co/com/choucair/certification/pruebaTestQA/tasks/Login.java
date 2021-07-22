package co.com.choucair.certification.pruebaTestQA.tasks;

import co.com.choucair.certification.pruebaTestQA.userinterface.UTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestLoginPage.LOGIN_BUTTON),
                Enter.theValue("Julianuno").into(UTestLoginPage.INPUT_FIRST_NAME),
                Enter.theValue("Alavarez").into(UTestLoginPage.INPUT_LAST_NAME),
                Enter.theValue("Julian1Alavarez@dontest.com").into(UTestLoginPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("October").from(UTestLoginPage.TB_BIRTH_MONTH),
                SelectFromOptions.byVisibleText("5").from(UTestLoginPage.TB_BIRTH_DAY),
                SelectFromOptions.byVisibleText("1990").from(UTestLoginPage.TB_BIRTH_YEAR),
                Enter.theValue("Spanish").into(UTestLoginPage.LABEL_LANGUAGE_SPOKEN),
                Click.on(UTestLoginPage.NEXT_LOCATION_BUTTON),
                Click.on(UTestLoginPage.NEXT_DEVICES_BUTTON),
                Click.on(UTestLoginPage.NEXT_LASTESTEP_BUTTON),
                Enter.theValue("rtTestB2415r").into(UTestLoginPage.INPUT_PASSWORD),
                Enter.theValue("rtTestB2415r").into(UTestLoginPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UTestLoginPage.ACCEPT_TERMS_OF_USE),
                Click.on(UTestLoginPage.ACCEPT_PRIVACY_AND_SECURITY),
                Click.on(UTestLoginPage.COMPLETE_SETUP_BUTTON)
                //Click.on(UTestLoginPage.TB_BIRTH_MONTH.)
        );
    }
}
