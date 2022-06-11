package org.selenide.pages;

public class BookFlightPageElements {

    public static final String LASTNAME_INPUT = "//input[@name='Passenger[0][lastname]']";
    public static final String FIRST_NAME_INPUT = "//input[@name='Passenger[0][firstname]']";
    public static final String DAY_OF_BIRTH_SELECT = "//span[@data-select2-id='35']";
    public static final String DAY_OF_BIRTH_OPTION = "//li[contains(text(), '06')]";
    public static final String MONTH_OF_BIRTH_SELECT = "//span[@data-select2-id='38']";
    public static final String MONTH_OF_BIRTH_OPTION = "//li[contains(text(), 'жовтня')]";
    public static final String YEAR_OF_BIRTH_SELECT = "//span[@data-select2-id='41']";
    public static final String YEAR_OF_BIRTH_OPTION = "//li[contains(text(), '1996')]";
    public static final String GENDER_SELECT = "//span[@data-select2-id='44']";
    public static final String GENDER_OPTION = "//li[contains(@data-select2-id,'female')]";
    public static final String DAY_ENDING_PASSPORT_SELECT = "//span[@data-select2-id='50']";
    public static final String DAY_ENDING_PASSPORT_OPTION = "//li[contains(text(), '12')]";
    public static final String MONTH_ENDING_PASSPORT_SELECT = "//span[@data-select2-id='53']";
    public static final String MONTH_ENDING_PASSPORT_OPTION = "//li[contains(text(), 'січня')]";
    public static final String YEAR_ENDING_PASSPORT_SELECT = "//span[@data-select2-id='56']";
    public static final String YEAR_ENDING_PASSPORT_OPTION = "//li[contains(text(), '2024')]";
    public static final String PASSPORT_ID_INPUT = "//input[@name='Passenger[0][passport_docnum]']";
    public static final String NOT_STARVE_BUTTON = "//button[@id='dontStarveModalCloseBtn']";
}
