$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("p.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Scenario:Test LogIn funcionality"
    }
  ],
  "line": 3,
  "name": "Test banking logIn for practice",
  "description": "",
  "id": "test-banking-login-for-practice",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Valid login",
  "description": "",
  "id": "test-banking-login-for-practice;valid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "i enter valid username \"damir1991\" and \"Kuchermmm777\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I see logo is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "damir1991",
      "offset": 24
    },
    {
      "val": "Kuchermmm777",
      "offset": 40
    }
  ],
  "location": "LogIn.i_enter_valid_username(String,String)"
});
formatter.result({
  "duration": 291806755,
  "error_message": "java.lang.NullPointerException\r\n\tat com.StepsDefenitions.Java.LogIn.i_enter_valid_username(LogIn.java:18)\r\n\tat ✽.And i enter valid username \"damir1991\" and \"Kuchermmm777\"(p.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LogIn.i_see_logo_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
});