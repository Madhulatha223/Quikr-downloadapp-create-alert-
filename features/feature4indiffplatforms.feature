Feature: Download the Quikr app in ios devices

  Scenario: User wants to download the app in ios devices
    Given the user is in the download Quikrapp page
    When the user clicks on ios button
    Then the system displays iphone app store

  Scenario Outline: User wants to download the app in android devices
    Given the user is in the download the Quikr_app page
    When the user clicks on android button and enters the "<emailid>"
    Then the user can download the android app

    Examples: 
      | emailid                        |
      | gogulamudimadhulatha@gmail.com |

  Scenario Outline: User wants to download the app in windows
    Given the user is in the download the QuikrApp page
    When the user clicks on windows button and enters "<outlookid>" and "<password>"
    Then the user can download the windows app

    Examples: 
      | outlookid                 | password  |
      | madhulathaaaa@outlook.com | Madhu@555 |
