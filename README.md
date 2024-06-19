# ZOOtopia Zoo Management Application

## Overview
Welcome to ZOOtopia! This application is designed to manage a zoo, allowing admins to manage attractions, animals, events, discounts, and visitor information. Visitors can explore the zoo, buy memberships, purchase tickets, visit animals and attractions, and leave feedback. The application demonstrates the use of Object-Oriented Programming (OOP) principles such as interfaces, inheritance, abstract classes, and polymorphism.

## Application Flow
The application features a command-line interface with options for both admins and visitors:

1. **Admin Functionalities**:
    - Enter as Admin
    - Manage Attractions/Events
    - Schedule Events
    - Manage Animals
    - Set Discounts
    - Set Special Deals
    - View Visitor Stats
    - View Feedback

2. **Visitor Functionalities**:
    - Register
    - Log In
    - Explore the Zoo
    - Buy Membership
    - Buy Tickets
    - View Discounts
    - Apply Discounts
    - Visit Animal
    - Visit Attractions/Events
    - Provide Feedback

## Features
### Admin Functionalities
1. **Manage Attractions/Events**:
    - View, add, modify, or remove attractions.
    - Attractions have unique IDs and descriptions.
    - Premium members access attractions for free; basic members must purchase tickets.

2. **Schedule Events**:
    - Open/close attractions and set entry ticket prices.
    - Maintain a count of ticketed visitors.

3. **Manage Animals**:
    - Add, update, or remove animals.
    - Animals can be mammals, amphibians, or reptiles.
    - At least two kinds of animals per category.

4. **Set Discounts**:
    - Add/remove discounts for different visitor categories and attractions.
    - Minors (<18) receive a 10% discount.
    - Seniors (>60) receive a 20% discount.

5. **Set Special Deals**:
    - Offer discounts on combined attractions.
    - Buy more than 2 attractions: 15% discount.
    - Buy more than 3 attractions: 30% discount.

6. **View Visitor Stats**:
    - Access statistics on visitors, revenue, and popular attractions.

7. **View Feedback**:
    - See feedback left by visitors.

### Visitor Functionalities
1. **Register**:
    - Provide name, age, phone number, balance, email, and password.

2. **Log In**:
    - Log in using email and password.

3. **Explore the Zoo**:
    - Browse through attractions and animals.

4. **Buy Membership**:
    - Purchase Basic or Premium memberships.

5. **Buy Tickets**:
    - Basic users purchase tickets for attractions.
    - Apply discounts and special deals.

6. **View Discounts**:
    - See available discounts and select appropriate discount codes.

7. **Visit Animal**:
    - Choose to feed the animal (animal makes a noise) or read about the animal.

8. **Visit Attractions/Events**:
    - Access attractions based on membership level and purchased tickets.

9. **Provide Feedback**:
    - Leave feedback about the zoo experience.

## Assumptions

1. I have hard-coded the 6 minimum animals that were needed.
2. The name for each animal is different, I have assumed that.
3. The number of visitors determines the popularity of the attraction.
4. When the user enters the number of tickets, like if he enters 3 tickets, then I will apply the best special deal he has, even if there exists a case where his money remains less to buy all the 3 tickets.
5. If a user has a basic membership, then If he is going to buy a premium membership, then I am charging him 50 rupees (not 30).
6. If a user has a ticket for an attraction and then again buys an attraction, then the visitor will have 2 tickets for the same attraction, meaning he can visit that attraction 2 times.
7. The id of attraction starts from 0.
8. All the attractions are closed initially whenever the user adds a new attraction.
9. The phone number entered should be 10 digits, and in email also it should contain both @ and . and at least 2 letters after.
10. If a user has a premium membership, then he cannot buy a basic membership again.
11. If the user enters the wrong discount code, then he will not get the student/senior citizen discount, and if he enters the right code then he will get a discount on both membership and buy tickets.

## Installation

To run this application, you must install Maven on your system. Follow the instructions below to set up and run the application:

### Clone the Repository

1. **git clone**: https://github.com/Akshat22052/Zoo-Management-System.git
2. **Navigate to the Project Directory**: cd 2022052_AkshatKarnwal
3. **Build the Project**: mvn clean mvn compile mvn package
4. **Run the Application**: "java -jar target/AP_ass-2-1.0-SNAPSHOT.jar” (If any error is coming in this, it means the name of the jar file is changed, so to run instead of AP_ass-2-1.0-SNAPSHOT write the new jar file name.)



