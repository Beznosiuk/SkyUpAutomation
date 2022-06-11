package org.selenide.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.junit.ScreenShooter;
import com.codeborne.selenide.junit.TextReport;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.selenide.pages.FlightPageElements.*;
import static org.selenide.pages.HomePageElements.*;
import static org.selenide.pages.BookFlightPageElements.*;
import static org.selenide.pages.CheckoutPageElements.*;


public class SkyUpTest {

    private final String HOME_PAGE_URL = "https://skyup.aero/uk/";
    private final String BOOK_ROUTE_URL = "https://skyup.aero/uk/best";

    @Rule
    public TextReport report = new TextReport();

    @Rule
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests().succeededTests();

    @Before
    public void setupAllureReports() {
        Configuration.reportsFolder = "test-result/reports";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @Test
    public void userCanSignIn() {
        open(HOME_PAGE_URL);
        $(By.xpath(CLOSE_SUPPORT_WINDOW_BUTTON)).should(exist).click();
        $(By.xpath(HEADER_LOGIN_BUTTON)).should(exist).click();
        $(By.xpath(SIGN_IN_BUTTON)).should(exist).click();
        $(By.xpath(LOGIN_EMAIL_INPUT)).should(exist).setValue("besnosyuk261326@gmail.com");
        $(By.xpath(LOGIN_PASSWORD_INPUT)).should(exist).setValue("Werand0225");
        $(By.xpath(LOGIN_BUTTON)).should(exist).click();
    }

    @Test
    public void menuHasAllRequiredItems() {
        open(HOME_PAGE_URL);
        $(By.xpath(CLOSE_SUPPORT_WINDOW_BUTTON)).should(exist).click();
        $(By.xpath(CLOSE_SUPPORT_WINDOW_BUTTON)).click();
        $(By.xpath(HEADER_MENU_BUTTON)).should(exist).click();
        $(By.xpath(MY_BOOKINGS_LINK)).shouldBe(visible);
        $(By.xpath(PASSENGERS_BUTTON)).shouldBe(visible);
        $(By.xpath(ROUTES_LINK)).shouldBe(visible);
        $(By.xpath(ALL_FLIGHTS_LINK)).shouldBe(visible);
        $(By.xpath(CAREER_LINK)).shouldBe(visible);
        $(By.xpath(PROJECTS_BUTTON)).shouldBe(visible);
        $(By.xpath(CONTACTS_LINK)).shouldBe(visible);
    }

    @Test
    public void bestSearchListHasMoreThanOneItem() {
        open(BOOK_ROUTE_URL);
        $$(By.xpath(BEST_TABS_LIST)).shouldHave(size(3));
        $(By.xpath(ALL_FLIGHT_BUTTON)).shouldHave(enabled);
        $$(By.xpath(BEST_SEARCH_LIST)).shouldHave(sizeGreaterThan(1));
    }

    @Test
    public void supportUkraineBlockIsPresent() {
        open(HOME_PAGE_URL);
        $(By.xpath(STAND_FOR_UKRAINE_HEADER)).shouldHave(exactText("#StandForUkraine"));
        $(By.xpath(SUPPORT_UKRAINE_LINK)).shouldHave(exactText("Підтримати"));
    }

    @Test
    public void bookTicketToDubai() {
        open(BOOK_ROUTE_URL);
        WebDriverRunner.getWebDriver().manage().deleteAllCookies();
        $(By.xpath(BEST_SEARCH_INPUT)).should(exist).setValue("Дубай");
        $(By.xpath(SEARCH_DUBAI_RESULT)).should(exist).click();
        $(By.xpath(CHOOSE_FLIGHT)).should(exist).click();
        $(By.xpath(CHOOSE_BASIC_FLIGHT_BUTTON)).should(exist).click();
        $(By.xpath(NEXT_STEP_BUTTON)).should(exist).click();
        $(By.xpath(LASTNAME_INPUT)).should(exist).setValue("Beznosiuk");
        $(By.xpath(FIRST_NAME_INPUT)).should(exist).setValue("Iryna");
        $(By.xpath(DAY_OF_BIRTH_SELECT)).should(exist).click();
        $(By.xpath(DAY_OF_BIRTH_OPTION)).should(exist).click();
        $(By.xpath(MONTH_OF_BIRTH_SELECT)).should(exist).click();
        $(By.xpath(MONTH_OF_BIRTH_OPTION)).should(exist).click();
        $(By.xpath(YEAR_OF_BIRTH_SELECT)).should(exist).click();
        $(By.xpath(YEAR_OF_BIRTH_OPTION)).should(exist).click();
        $(By.xpath(GENDER_SELECT)).should(exist).click();
        $(By.xpath(GENDER_OPTION)).should(exist).click();
        $(By.xpath(DAY_ENDING_PASSPORT_SELECT)).should(exist).click();
        $(By.xpath(DAY_ENDING_PASSPORT_OPTION)).should(exist).click();
        $(By.xpath(MONTH_ENDING_PASSPORT_SELECT)).should(exist).click();
        $(By.xpath(MONTH_ENDING_PASSPORT_OPTION)).should(exist).click();
        $(By.xpath(YEAR_ENDING_PASSPORT_SELECT)).should(exist).click();
        $(By.xpath(YEAR_ENDING_PASSPORT_OPTION)).should(exist).click();
        $(By.xpath(PASSPORT_ID_INPUT)).should(exist).setValue("HJ987654");
        $(By.xpath(NEXT_STEP_BUTTON)).should(exist).click();
        $(By.xpath(NOT_STARVE_BUTTON)).should(exist).click();
        $(By.xpath(TOTAL_PAY_BUTTON)).should(exist);
    }
}
