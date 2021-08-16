Feature: Defect report

  Scenario: Create an alert
    Given the User is in the quikr Home page
    When the user enters all the data and clicks on alert button
    Then alert should be created

  Scenario: Create an alert without mobilenumber
    Given the User is in the quikr_Home page
    When the user enters all the data except mobile number and clicks on alert button
    Then it should create an alert

  Scenario: Create an alert without emailid
    Given the User is in the quikrhome page
    When the user enters all the data except Email-id and clicks on button
    Then an alert should be created

  Scenario: Create an alert for mobiles&tablets
    Given the User is in the Quikrhome page
    When the user enters all the data except No. of SIM cards and clicks on button
    Then it Should create alert
