$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Customerdata.feature");
formatter.feature({
  "name": "Add customer details",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User click on add customer page",
  "keyword": "And "
});
formatter.match({
  "location": "Customer.user_click_on_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enter all valid details",
  "keyword": "When "
});
formatter.match({
  "location": "Customer.user_enter_all_valid_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Customer.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be displayed customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "Customer.user_should_be_displayed_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
});