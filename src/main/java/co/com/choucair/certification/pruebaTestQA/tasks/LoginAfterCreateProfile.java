package co.com.choucair.certification.pruebaTestQA.tasks;

import co.com.choucair.certification.pruebaTestQA.userinterface.LoginU_Test;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginAfterCreateProfile implements Task {
    private String strEmailAddr;
    private String strPassword;

    public LoginAfterCreateProfile(String strEmailAddr, String strPassword) {
        this.strEmailAddr = strEmailAddr;
        this.strPassword = strPassword;
    }

    public static LoginAfterCreateProfile the(String strEmailAddr, String strPassword) {
        return Tasks.instrumented(LoginAfterCreateProfile.class,strEmailAddr, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginU_Test.LOGIN_BUTTON),
                Enter.theValue("juju@test.com" ).into(LoginU_Test.INPUT_EMAIL_ADDRESS),
                Enter.theValue("ContraTest12").into(LoginU_Test.INPUT_PASSWORD),
                Click.on(LoginU_Test.SING_UP_BUTTON)
        );
    }
}
