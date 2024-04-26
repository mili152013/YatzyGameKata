Yatzy Game

Welcome to the Yatzy game project, a Java-based implementation of the classic dice game using Test-Driven Development (TDD) with JUnit 5. This project adheres strictly to the principles of TDD to ensure a robust and error-resistant application.

About Yatzy
Yatzy is a dice game where players roll five dice to score in various categories. The goal is to make certain combinations to maximize your score. Each player gets three rolls per turn, may reroll any number of dice on each roll, and must choose a scoring category post the rolls. Each category can only be used once per game, and the strategy lies in deciding when to score in each category.

Prerequisites
To run and develop the Yatzy game project, you will need:

Java Development Kit (JDK) 17 or later
Gradle (for dependency management and running the project)
Setup
To get started with this project, clone the repository and navigate to the cloned directory:


git clone https://github.com/mili152013/YatzyGameKata.git


To build the project and run all tests, execute: .\gradlew build

Running the Game
To run the game from the command line, use: .\gradlew run

Development
This project uses JUnit 5 for testing. Test-driven development is central to the workflow, with all game logic validated through comprehensive unit tests before implementation.

Running Tests
To run tests separately, use: .\gradlew test
