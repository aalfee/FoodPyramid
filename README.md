# Food Pyramid Project
## Overview
This project implements a simple food pyramid system with Java classes representing different food categories. The project includes classes such as Carbs, Dairy, FoodItem, FoodPyramid, Fruit, FoodPyramidException, Main, Meat, and Recommended.

# Classes
1. Carbs
- Represents the Carbs food category.
- Extends FoodPyramid.
- Includes methods for calculating recommended servings and checking expiration.
2. Dairy
- Represents the Dairy food category.
- Extends FoodPyramid.
- Includes methods for calculating recommended servings and checking expiration.
3. FoodItem
- Abstract class serving as the base class for food items.
- Includes basic properties like food name and count.
- Throws custom exception InvalidFoodItemException for invalid input.
4. FoodPyramid
- Abstract class representing the base for the food pyramid.
- Extends FoodItem and implements Recommended interface.
- Includes a method for obtaining a string representation of the class.
5. Fruit
- Represents the Fruit food category.
- Extends FoodPyramid.
- Includes methods for calculating recommended servings and checking expiration.
6. FoodPyramidException
- Custom exception class for handling exceptions related to the food pyramid.
7. Main
- Main class with a main method to demonstrate the usage of the implemented classes.
8. Meat
- Represents the Meat food category.
- Extends FoodPyramid.
- Includes methods for calculating recommended servings and checking expiration.
9. Recommended
- Interface defining constants and methods for recommended servings and expiration.

# Usage
The Main class provides examples of how to use the implemented food category classes. You can create instances of different food items, specify counts and servings, and observe the output.

# How to Run
To run the project, execute the Main class, which contains the main method. This will demonstrate the functionality of the implemented classes.

