Feature: Send the Download Link

  Scenario: User wants to send the download link
    Given the User is in the Quikr downlad app page
    When the user enters mobile_no and clicks on send downloadlink
    Then the link will be send to the entered mobile number
