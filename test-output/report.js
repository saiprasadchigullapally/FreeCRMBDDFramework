$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/myselenium/freecrmBDDframework/src/main/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Free CRM Login test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.User_is_alredy_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_login_buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "User is able to create new contact",
  "description": "",
  "id": "free-crm-login-feature;user-is-able-to-create-new-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User is already on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User mouse over contacts link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User click on contacts link",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User enters firstname and lastname",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User click on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "verify new contact added or not",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactStepDefination.user_is_already_on_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});