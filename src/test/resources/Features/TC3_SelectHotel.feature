@selecthotel
Feature: Verifying Adactin Login Hotel details

  Scenario Outline: Verifying Adactin login with valid credentials, Entering Details and by selecting Hotel
    Given User is on the Adactin hotel page
    When User should perform login "<userName>","<password>"
    Then User should verify after login "Hello ajith001!"
    And User should select all the fields "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User should verify search msg after Search "Select Hotel"
    And User should select hotel Name
    Then User should verify success msg after selecting Hotel "Book A Hotel"

    Examples: 
      | userName | password  | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | ajith001 | Ajith@123 | Sydney   | Hotel Creek | Standard | 1 - One       | 12/09/2022  | 13/09/2022   | 2 - Two       | 1 - One         |

  Scenario Outline: Verifying Adactin login with valid credentials, Entering Details and without selecting Hotel
    Given User is on the Adactin hotel page
    When User should perform login "<userName>","<password>"
    Then User should verify after login "Hello ajith001!"
    And User should select all the fields "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User should verify search msg after Search "Select Hotel"
    And User should continue without selecting any Hotel Name
    Then User should verify without selecting any hotel name error msg "Please Select a Hotel"

    Examples: 
      | userName | password  | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | ajith001 | Ajith@123 | Sydney   | Hotel Creek | Standard | 1 - One       | 12/09/2022  | 13/09/2022   | 2 - Two       | 1 - One         |
