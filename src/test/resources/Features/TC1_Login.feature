@Login
Feature: Verifying Adactin Login Hotel details

  Scenario Outline: Verifying Adactin login with valid credentials
    Given User is on the Adactin hotel page
    When User should perform login "<userName>","<password>"
    Then User should verify after login "Hello ajith001!"

    Examples: 
      | userName | password  |
      | ajith001 | Ajith@123 |

  Scenario Outline: Verifying Adactin login with valid credentials with Enter
    Given User is on the Adactin hotel page
    When User should perform login "<userName>","<password>"with Enter key
    Then User should verify after login "Hello ajith001!"

    Examples: 
      | userName | password  |
      | ajith001 | Ajith@123 |

  Scenario Outline: Verifying Adactin login with Invalid credentials
    Given User is on the Adactin hotel page
    When User should perform login "<userName>","<password>"with Enter key
    Then User should verify after login with Invalid Credentials error msg "Invalid Login details or Your Password might have expired."

    Examples: 
      | userName | password |
      | ajith001 | Ajith@3  |
