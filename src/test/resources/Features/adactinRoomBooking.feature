Feature: User should able to book a room in adactin.

Scenario Outline: User should able to provide the valid details.

Given User should launch the GC Browser and enter the Adactin Url "<Url>"

When User should able to enter the valid "<userName>" and "<passWord>"
And  User Should able to click the login button.
And  User Should able to provide "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>" ,"<checkOutDate>","<AdultsPerRoom>","<childrenPerRoom>"
And  User Should able to click the search button.
And  User Should able to view and select the radio button for requested hotel.
And  User Should able to click the continue button.
And  User Should able to enter "<address>"
And  User Should able to enter "<firstName>","<lastName>","<creditCardNumber>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>"
And  User should able to click the Book Now buttton.

Then User should able to Verify whether Room referal code is received or not.

Examples:

|	             Url	           | userName   |    passWord       |  location | hotels      | roomType | numberOfRooms | checkInDate | checkOutDate | AdultsPerRoom | childrenPerRoom | firstName  | lastName | creditCardNumber | creditCardType | expiryMonth | expiryYear | cvvNumber | address          |
|https://adactinhotelapp.com/  | Vikram1142 |  Vikram@1136      | Melbourne | Hotel Creek | Deluxe   |   2 - Two     |  05/4/2021   | 10/4/2021   |      1 - One  |   2 - Two       | Vikram     | A        | 1234567812345678 | Master Card    | September   | 2022       | 456       | 363/g1 Vengikkal |
| https://adactinhotelapp.com/ | Vikram1142 |  Vikram@1136      | Sydney    | Hotel Creek | Deluxe   |   2 - Two     |  05/4/2021   | 10/4/2021   |      1 - One  |   2 - Two       | Vikram     | A        | 1234567812345678 | Master Card    | September   | 2022       | 456       | 363/g1 Vengikkal |
		 
		 
		
		