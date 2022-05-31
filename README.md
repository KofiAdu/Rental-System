# Rental-System
An electronic system will be upgraded to the ski resort rental company. The system will use one superclass (Rental.java), which is inherited by all subclasses. 
The superclass specifies the price (per day) of the rented property as well as renting day (string is enough). There are four subclasses with different characteristics:
- Skis: length (cm), mark (string)
- Boots: size (int), stiffness (double)
- Ski poles: length(cm)
- Helmet: size (cm), color (string)

A program that lets you enter information about your rental properties. In this case, the rental is always made in a package (RentPackage.java) that includes all the items (ie. Composed from Skis, Boots, SkiPoles and Helmet).
Because of inheritance, you'll need to make data query to two different place: first in subclass product specific data and then query at super class, 
for price for day and renting day (common for all products). 
Once the data is entered into the program, it prints them and calculates the total cost for the package.
In the main program, it is enough to ask for the information of one package and finally print it out with the price.
