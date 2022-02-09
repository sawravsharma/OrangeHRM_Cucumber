$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SauravSharma/IdeaProjects/Cucumber_Project/src/main/java/featurefiles/TagScenario.feature");
formatter.feature({
  "name": "Checking Login functionality of the Orange HRM",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Checking Login functionality with the valid login credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user is on the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "TagScenario.user_is_on_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password in respective textfields",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "ad",
        "admin"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TagScenario.user_enters_username_and_password_in_respective_textfields(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the demo OrangeHRM Login button",
  "keyword": "When "
});
formatter.match({
  "location": "TagScenario.user_clicks_on_the_demo_OrangeHRM_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the demo OrangeHRM Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "TagScenario.user_is_on_the_demo_OrangeHRM_Homepage()"
});
formatter.result({
  "status": "passed"
});
});