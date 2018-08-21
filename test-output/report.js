$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail login.",
  "description": "",
  "id": "gmail-login.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Gmail login test.",
  "description": "",
  "id": "gmail-login.;gmail-login-test.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am a existing Gmail user",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I will see Gmail Inbox screen",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.i_am_a_existing_Gmail_user()"
});
formatter.result({
  "duration": 12685989810,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_enter_username_and_password()"
});
formatter.result({
  "duration": 31993,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_login_button()"
});
formatter.result({
  "duration": 67869,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_will_see_Gmail_Inbox_screen()"
});
formatter.result({
  "duration": 55659,
  "status": "passed"
});
});