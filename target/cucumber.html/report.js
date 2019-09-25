$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/demo.feature");
formatter.feature({
  "line": 1,
  "name": "login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User enters username and Password",
  "description": "",
  "id": "login-feature;user-enters-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the login page is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter lalitha as username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters password123 as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user will finds a testapp homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "testMe.the_login_page_is_opened()"
});
formatter.result({
  "duration": 7781698200,
  "status": "passed"
});
formatter.match({
  "location": "testMe.user_enter_lalitha_as_username()"
});
formatter.result({
  "duration": 165632600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 20
    }
  ],
  "location": "testMe.user_enters_password_as_password(int)"
});
formatter.result({
  "duration": 166812700,
  "status": "passed"
});
formatter.match({
  "location": "testMe.user_will_finds_a_testapp_homepage()"
});
formatter.result({
  "duration": 263520100,
  "status": "passed"
});
});