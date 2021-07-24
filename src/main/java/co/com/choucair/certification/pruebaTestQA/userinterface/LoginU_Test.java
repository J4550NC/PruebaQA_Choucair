package co.com.choucair.certification.pruebaTestQA.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginU_Test {

    public static final Target LOGIN_BUTTON = Target.
            the("where do we login profile").
            located(By.xpath("//*[@class=\"unauthenticated-nav-bar__link\"]"));

    public static final Target INPUT_EMAIL_ADDRESS = Target.
            the("where do we write the email address to login").
            located(By.xpath("//*[@id=\"username\"]"));

    public static final Target INPUT_PASSWORD = Target.
            the("where do we write the password to login").
            located(By.xpath("//*[@id=\"password\"]"));

    public static final Target SING_UP_BUTTON = Target.
            the("where do we accept the information").
            located(By.xpath("//*[@id=\"kc-login\"]"));

    public static final Target RESEND_CONFIRMATION_EMAIL_BUTTON = Target.
            the("where do we see the final information").
            located(By.xpath("//a[contains(text(),'Resend Confirmation Email')]"));


}
