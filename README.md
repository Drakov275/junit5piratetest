# junit5piratetest

* testPirateName():

Creates a new pirate with the name "Blackbeard" (Pirate pirate = new Pirate("Blackbeard");
Then checks if method getName() returns expected value "Blackbeard" with asserEquals.
-------------------------
* testPirateTreasure():

Creates a new pirate with the name "Captain Kidd" (Pirate pirate = new Pirate("Captain Kidd");
Adss to the pirate's treasure hold a 1000 units of treasure with the method addTreasure(1000)
Checks if method getTreasure() returns expected value of a 1000 units with assertEquals
-------------------------
* testPiratePlunder():

Creates a new pirate with the name "Calico Jack" (Pirate pirate = new Pirate("Calico Jack");
Adss to his treasure hold 500 units of treasrue with method addTreasure(500)
Using the method plunder(200) to rob the treasure hold it takes away 200 units
Then checks if method getTreasure() returns expected value of 300 with assertEquals
------------------------
* testPirateParrot():

Creates a new pirate with the name "Long John Silver" (Pirate pirate = new Pirate("Long John Silver");
Sets a pirate parrot named "Polly" with the method setParrot()
Then checks if getParrot() returns expected value of "Polly" with assertEquals
