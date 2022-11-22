@Bookhotel
Feature: Verifying Adactin Login Hotel details

  Scenario Outline: Verifying Adactin login with valid credentials, Entering Details and by selecting Hotel
    Given User is on the Adactin hotel page
    When User should perform login "<userName>","<password>"
    Then User should verify after login "Hello ajith001!"
    And User should select all the fields "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User should verify search msg after Search "Select Hotel"
    And User should select hotel Name
    Then User should verify success msg after selecting Hotel "Book A Hotel"
    And User should enter the personal and payment details "<firstName>", "<lastName>" and "<billingAddress>"
      | creditCardNo     | creditCardType   | expiryMonth | expiryYear | cvvNumber |
      | 1617181918181900 | American Express | January     |       2022 |       001 |
      | 9647181918181920 | VISA             | February    |       2022 |       565 |
      | 7657181918181940 | Master Card      | March       |       2022 |       161 |
      | 1637181918184900 | Other            | April       |       2022 |       456 |
    Then User should verify success msg after submitting the personal and payment details "Booking Confirmation"

    Examples: 
      | userName | password  | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom | firstName | lastName | billingAddress |
      | ajith001 | Ajith@123 | Sydney   | Hotel Creek | Standard | 1 - One       | 12/09/2022  | 13/09/2022   | 2 - Two       | 1 - One         | Ajith     | bala     | Adyar          |

  Scenario Outline: Verifying Adactin login with valid credentials, Entering Details and by selecting Hotel
    Given User is on the Adactin hotel page
    When User should perform login "<userName>","<password>"
    Then User should verify after login "Hello ajith001!"
    And User should select all the fields "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User should verify search msg after Search "Select Hotel"
    And User should select hotel Name
    Then User should verify success msg after selecting Hotel "Book A Hotel"
    And User should click Book Now without selecting any fields
    Then User should verify after Book Now is clicked error msg "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | userName | password  | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | ajith001 | Ajith@123 | Sydney   | Hotel Creek | Standard | 1 - One       | 12/09/2022  | 13/09/2022   | 2 - Two       | 1 - One         |
