package org.selenide.pages;

public class FlightPageElements {
    public static final String BEST_SEARCH_LIST = "//div[@class='best-card__unit js-best-unit']";
    public static final String BEST_TABS_LIST = "//div[@id='bestTabsList']/button";
    public static final String ALL_FLIGHT_BUTTON = "//button[@data-tab='best']";
    public static final String BEST_SEARCH_INPUT = "//input[@id='bestSearchInput']";
    public static final String SEARCH_DUBAI_RESULT = "//div[contains(@data-search-options,'Дубай')]";
    public static final String CHOOSE_FLIGHT = "//div[contains(text(),'Вибрати')]";
    public static final String CHOOSE_BASIC_FLIGHT_BUTTON = "//p[contains(text(), 'basic')]/../..//button";
    public static final String NEXT_STEP_BUTTON = "//button[@id='progressNextBtn']";
}
