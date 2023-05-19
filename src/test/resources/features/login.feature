Feature: Register File

  @smoke
  Scenario Outline: Check register with valid credential
    Given user has base url
    When user enter '<firstName>' and '<lastName>' and '<email>'
    And enter '<password>' and '<repeatPassword>'
    And click Register
    Then user will be registered successfully

    Examples:
      |firstName|lastName|email        |password|repeatPassword|
      |Santo    |Masrur  |Sam@gmail.com|123456  |123456        |