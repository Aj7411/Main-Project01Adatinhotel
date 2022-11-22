@searchhotel
Feature: Verifying Adactin Login Hotel details

  Scenario Outline: Verifying Adactin login with valid credentials and Entering Details
    Given User is on the Adactin hotel page
    When User should perform login "<userName>","<password>"
    Then User should verify after login "Hello ajith001!"
    And User should select all the fields "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User should verify search msg after Search "Select Hotel"

    Examples: 
      | userName | password  | Location  | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | ajith001 | Ajith@123 | Melbourne | Hotel Creek | Standard | 1 - One       | 21/09/2022  | 25/09/2022   | 2 - Two       | 1 - One         |

  Scenario Outline: Verifying Adactin login with valid credentials and Entering only mandatory details
    Given User is on the Adactin hotel page
    When User should perform login "<userName>","<password>"
    Then User should verify after login "Hello ajith001!"
    And User should select all the mandatory fields "<Location>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>" and "<AdultsperRoom>"
    Then User should verify search msg after Search "Select Hotel"

    Examples: 
      | userName | password  | Location  | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom |
      | ajith001 | Ajith@123 | Melbourne | 1 - One       | 21/09/2022  | 25/09/2022   | 2 - Two       |

  Scenario Outline: Verifying Adactin login with valid credentials and Entering Details with greater check in date
    Given User is on the Adactin hotel page
    When User should perform login "<userName>","<password>"
    Then User should verify after login "Hello ajith001!"
    And User should select all the mandatory fields "<Location>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>" and "<AdultsperRoom>"
    Then User should verify after selecting search button with date error msg "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName | password  | Location  | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom |
      | ajith001 | Ajith@123 | Melbourne | 1 - One       | 25/09/2022  | 20/09/2022   | 2 - Two       |

  Scenario Outline: Verifying Adactin login with valid credentials and Entering with out filling details
    Given User is on the Adactin hotel page
    When User should perform login "<userName>","<password>"
    Then User should verify after login "Hello ajith001!"
    And User should click search button without entering any fields
    Then User should verify after selecting search button with location error msg "Please Select a Location"

    Examples: 
      | userName | password  |
      | ajith001 | Ajith@123 |
