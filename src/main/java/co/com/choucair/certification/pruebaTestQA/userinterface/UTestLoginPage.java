package co.com.choucair.certification.pruebaTestQA.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLoginPage  {
    public static final Target JOIN_BUTTON = Target.
            the("button that shows us the form to login").
            located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    public static final Target INPUT_FIRST_NAME = Target.
            the("where do we write the first name of user").
            located(By.xpath("//*[@id=\"firstName\"]"));

    public static final Target INPUT_LAST_NAME = Target.
            the("where do we write the last name of user").
            located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.
            the("where do we write the last name of user").
            located(By.xpath("//input[@id='email']"));

    public static final Target TB_BIRTH_MONTH = Target.
            the("where do we select birth month of user").
            located(By.id("birthMonth"));

    public static final Target TB_BIRTH_DAY = Target.
            the("where do we select birth day of user").
            located(By.id("birthDay"));

    public static final Target TB_BIRTH_YEAR = Target.
            the("where do we select birth year of user").
            located(By.id("birthYear"));

    public static final Target LABEL_LANGUAGE_SPOKEN = Target.
            the("where do we select birth year of user").
            located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));

    public static final Target NEXT_LOCATION_BUTTON = Target.
            the("where do we accept data already entered").
            located(By.xpath("//*[@class=\"btn btn-blue\"]/span"));

    public static final Target CITY_SELECTION = Target.
            the("where do we choose the city").
            located(By.xpath("//*[@id=\"city\"]"));

    public static final Target ZIP_CODE = Target.
            the("where do we write the ZIP code").
            located(By.xpath("//*[@id=\"zip\"]"));

    public static final Target NEXT_DEVICES_BUTTON = Target.
            the("where do we accept data already entered").
            located(By.xpath("//*[@class=\"btn btn-blue pull-right\"]/span"));

    public static final Target NEXT_LASTESTEP_BUTTON = Target.
            the("where do we accept data already entered").
            located(By.xpath("//*[@class=\"btn btn-blue pull-right\"]/span"));

    public static final Target INPUT_PASSWORD = Target.
            the("where do we input a password").
            located(By.xpath("//*[@id=\"password\"]"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.
            the("where do we input a password").
            located(By.xpath("//*[@id=\"confirmPassword\"]"));

    public static final Target ACCEPT_TERMS_OF_USE = Target.
            the("CheckBox to accept terms of use").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target ACCEPT_PRIVACY_AND_SECURITY = Target.
            the("CheckBox to accept policy privacy and security").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target COMPLETE_SETUP_BUTTON = Target.
            the("final step to create a profile").
            located(By.xpath("//*[@class=\"btn btn-blue\"]/span"));











}
