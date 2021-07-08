$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality of adactin application",
  "description": "",
  "id": "login-functionality-of-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User enters valid username and password",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-enters-valid-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User launches url of adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters \"\u003cUsername\u003e\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"\u003cPassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User validate login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-enters-valid-username-and-password;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 13,
      "id": "login-functionality-of-adactin-application;user-enters-valid-username-and-password;;1"
    },
    {
      "cells": [
        "ramu",
        "2324535"
      ],
      "line": 14,
      "id": "login-functionality-of-adactin-application;user-enters-valid-username-and-password;;2"
    },
    {
      "cells": [
        "kabcd",
        "ggv44"
      ],
      "line": 15,
      "id": "login-functionality-of-adactin-application;user-enters-valid-username-and-password;;3"
    },
    {
      "cells": [
        "SowmiyaSri",
        "Sowmiya05"
      ],
      "line": 16,
      "id": "login-functionality-of-adactin-application;user-enters-valid-username-and-password;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 536636000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User enters valid username and password",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-enters-valid-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User launches url of adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters \"ramu\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"2324535\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User validate login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_launches_url_of_adactin_application()"
});
formatter.result({
  "duration": 3206186299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ramu",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_as_username(String)"
});
formatter.result({
  "duration": 636357600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2324535",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_as_password(String)"
});
formatter.result({
  "duration": 141970900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_Login_button()"
});
formatter.result({
  "duration": 434144199,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_validate_login_button()"
});
formatter.result({
  "duration": 49500,
  "status": "passed"
});
formatter.after({
  "duration": 623401,
  "status": "passed"
});
formatter.before({
  "duration": 341100,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User enters valid username and password",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-enters-valid-username-and-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User launches url of adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters \"kabcd\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"ggv44\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User validate login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_launches_url_of_adactin_application()"
});
formatter.result({
  "duration": 307025500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kabcd",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_as_username(String)"
});
formatter.result({
  "duration": 111487600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ggv44",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_as_password(String)"
});
formatter.result({
  "duration": 119143100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_Login_button()"
});
formatter.result({
  "duration": 598813201,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_validate_login_button()"
});
formatter.result({
  "duration": 87700,
  "status": "passed"
});
formatter.after({
  "duration": 228100,
  "status": "passed"
});
formatter.before({
  "duration": 9903800,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User enters valid username and password",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-enters-valid-username-and-password;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User launches url of adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters \"SowmiyaSri\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"Sowmiya05\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User validate login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_launches_url_of_adactin_application()"
});
formatter.result({
  "duration": 290420699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SowmiyaSri",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_as_username(String)"
});
formatter.result({
  "duration": 146532399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sowmiya05",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_as_password(String)"
});
formatter.result({
  "duration": 102090600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_Login_button()"
});
formatter.result({
  "duration": 754775499,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_validate_login_button()"
});
formatter.result({
  "duration": 29000,
  "status": "passed"
});
formatter.after({
  "duration": 225001,
  "status": "passed"
});
formatter.before({
  "duration": 153900,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "select the hotel and fill up the fields and search",
  "description": "",
  "id": "login-functionality-of-adactin-application;select-the-hotel-and-fill-up-the-fields-and-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User select location",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User select hotel",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User select room type",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User select no of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User clears  check in date",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User enters check in date",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User clears  check out date",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User enters check out date",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User select adults per room",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User select children per room",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User clicks search button",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchHotelStepDefinition.user_select_location()"
});
formatter.result({
  "duration": 821846299,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelStepDefinition.user_select_hotel()"
});
formatter.result({
  "duration": 203778400,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelStepDefinition.user_select_room_type()"
});
formatter.result({
  "duration": 133894800,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelStepDefinition.user_select_no_of_rooms()"
});
formatter.result({
  "duration": 226687801,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelStepDefinition.user_clears_check_in_date()"
});
formatter.result({
  "duration": 287396300,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelStepDefinition.user_enters_check_in_date()"
});
formatter.result({
  "duration": 382789400,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelStepDefinition.user_clears_check_out_date()"
});
formatter.result({
  "duration": 137364599,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelStepDefinition.user_enters_check_out_date()"
});
formatter.result({
  "duration": 113815499,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelStepDefinition.user_select_adults_per_room()"
});
formatter.result({
  "duration": 146192000,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelStepDefinition.user_select_children_per_room()"
});
formatter.result({
  "duration": 142003100,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelStepDefinition.user_clicks_search_button()"
});
formatter.result({
  "duration": 912300200,
  "status": "passed"
});
formatter.after({
  "duration": 122200,
  "status": "passed"
});
formatter.before({
  "duration": 365600,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "select hotel and continue",
  "description": "",
  "id": "login-functionality-of-adactin-application;select-hotel-and-continue",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "select radio button",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "click continue",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectHotelStepDefinition.select_radio_button()"
});
formatter.result({
  "duration": 172191800,
  "status": "passed"
});
formatter.match({
  "location": "SelectHotelStepDefinition.click_continue()"
});
formatter.result({
  "duration": 741220600,
  "status": "passed"
});
formatter.after({
  "duration": 111000,
  "status": "passed"
});
formatter.before({
  "duration": 157900,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "fill details and book hotel",
  "description": "",
  "id": "login-functionality-of-adactin-application;fill-details-and-book-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "User enters first name",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "User enters last name",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "User enters billig address",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "User enters credit card number",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "User select credit card type",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "User select cards expiry month",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "User select cards expiry year",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "User enters CVV number",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "user validate book now",
  "keyword": "Then "
});
formatter.match({
  "location": "BookHotelPageStepDefinition.user_enters_first_name()"
});
formatter.result({
  "duration": 262924199,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageStepDefinition.user_enters_last_name()"
});
formatter.result({
  "duration": 104006500,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageStepDefinition.user_enters_billig_address()"
});
formatter.result({
  "duration": 257226101,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageStepDefinition.user_enters_credit_card_number()"
});
formatter.result({
  "duration": 125792500,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageStepDefinition.user_select_credit_card_type()"
});
formatter.result({
  "duration": 156606600,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageStepDefinition.user_select_cards_expiry_month()"
});
formatter.result({
  "duration": 148145000,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageStepDefinition.user_select_cards_expiry_year()"
});
formatter.result({
  "duration": 146883999,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageStepDefinition.user_enters_CVV_number()"
});
formatter.result({
  "duration": 104258401,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageStepDefinition.user_validate_book_now()"
});
formatter.result({
  "duration": 91976700,
  "status": "passed"
});
formatter.after({
  "duration": 142301,
  "status": "passed"
});
});