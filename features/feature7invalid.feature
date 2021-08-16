Feature: Invalid inputs

  Scenario Outline: error message should display when user enters the wrong inputs in mobile field
    Given the User is in the quikr downlad app page
    When the user enters invalid "<mobile_no>" and clicks on send downloadlink
    Then user should get an error message

    Examples: 
      | mobile_no |
      |    810656 |

  Scenario Outline: An Error message should display when user enters the wrong email-id in downloading app for android
    Given the user is in the download the Quikr_App page
    When the user clicks on android button and enters the invalid "<emailid>"
    Then it should display an erro message

    Examples: 
      | emailid                       |
      | gogulamudimadhulatha@gmail.co |

  Scenario Outline: An Error message should display when user enters the wrong password in downloading app for windows
    Given the user is in the download the quikrapp page
    When the user clicks on windows button and enters "<outlookid>" and invalid "<password>"
    Then an error message should be displayed

    Examples: 
      | outlookid                 | password |
      | madhulathaaaa@outlook.com | Madhu@55 |
