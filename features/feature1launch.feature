Feature: open the application
Scenario: User wants to open the application
Given the Chrome is opened
When the user enters website url and clicks on enter button
Then the user reaches the Quikr home page

Scenario: User wants to download the Quikr app
Given the user is in the home page
When the user clicks on the download the app link
Then the user reaches the Download Our Mobile app page