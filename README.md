# A 2048 game in Java
## Problem
Using design templates, create a game similar to the one presented in the following link: https://www.pomu.ro/joc/train-2048.html

## Game Analysis
<pre>
The game 2048 is an interactive application based on moving colored squares containing numerical values corresponding to powers of 2. 
These squares are placed within a predefined grid and cannot exceed it. The objective of the game is to combine the squares on the screen by making successive moves in four predefined directions (up, down, left, right) ->
  ->until you reach the maximum value of 2048, at which point the player wins the game.

Rules of the game:
- If the player, through repeated moves, reaches a state where no further moves are possible (a "blackout" state), the game resets, and a new board is generated.
- The player can only use the keys W, A, S, D, and arrow keys to move the pieces on the board. 
    ->The "Enter" key can be used to start the game with two pieces on the board, or the "V" key can be used to reset the board with no pieces on it.
- All pieces move in the selected direction, and a new square with a value of 2 or 4 appears in an empty spot on the board.
- The combining rule is that the sum of the values on two squares (tiles) should be identical, and they must overlap when moved in one of the four directions, resulting in a new tile with their sum.
</pre>

## Presentation of Templates in game

### Singleton
This is a creational design pattern that allows us to ensure that a class has only one instance while providing a global point of access to that instance. The Score class is implemented using this pattern.
This class declares a static method called getInstance that returns the same instance of the same class.
![singleton_dp](https://github.com/AgacheAndrei/Proiect_IP_Agache_Andrei_Alexandru/assets/36128809/e0e36d6e-c2b2-4efa-94cf-c81df1491b88)
### Strategy
This is a behavioral design pattern that allows defining a family of algorithms, encapsulating each one into a separate class with interchangeable objects. The pattern suggests breaking down a class that performs a specific task in various ways and extracting the algorithms into separate classes called strategies. The three game states: normal, game-over, and blackout, have been implemented using this design pattern.
![strategy_dp](https://github.com/AgacheAndrei/Proiect_IP_Agache_Andrei_Alexandru/assets/36128809/38b90f8e-022d-41b6-bd60-03cec4ac8a83)
### Factory
The Factory is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to modify the type of objects that will be created. It's used for objects that generate instances of related classes (implementing the same interface or inheriting from the same abstract class). The construction of squares with different colors and values has been implemented using this design pattern.
![factory_db](https://github.com/AgacheAndrei/Proiect_IP_Agache_Andrei_Alexandru/assets/36128809/7fff7d1c-6d65-45e1-b3c0-4e3fa97eba24)
### Facade
The Facade is a structural design pattern that provides a simplified interface to a library, framework, or any complex set of classes. It encapsulates a complex subsystem behind a simple interface, hiding much of the complexity and making the subsystem easy to use. Besides providing a much simpler interface, there is another advantage to using this design pattern. It decouples a client's implementation from the complex subsystem. It greatly simplifies the usage of functions from classes like Graphics, Graphics2D, and JFrame.
![facede_dp](https://github.com/AgacheAndrei/Proiect_IP_Agache_Andrei_Alexandru/assets/36128809/963ba589-f555-4130-a86c-25f7d71f8d76)
### Command
The Command is a behavioral design pattern that transforms a request into an autonomous object containing all information about the request. This transformation allows passing requests as arguments to a method, delaying or queuing the execution of a request, and performing actions that cannot be undone. It is used in implementing actions triggered by user interactions, such as keyboard commands.
![comand_dp](https://github.com/AgacheAndrei/Proiect_IP_Agache_Andrei_Alexandru/assets/36128809/79ebbcb8-1b1e-4997-99f2-6c804a84222a)
### Package - All the classes in the project.
![pachet](https://github.com/AgacheAndrei/Proiect_IP_Agache_Andrei_Alexandru/assets/36128809/1de51b7a-fc72-441b-8eb7-df315fdbf528)

## Stability Index
<pre>
CA (Afferent Coupling): The number of classes outside the package that depend on classes within the package.
CE (Efferent Coupling): The number of classes inside the package that depend on classes outside the package.
I (Instability Index): I = CE / (CA + CE), I belongs to [0,1], 0 – totally stable, 1 – totally unstable.
Package Abstraction: A = Number of abstract classes / Number of classes
Distance: D = |A + I - 1| / √2

GAME: CA = 2; CE = 0; I = 0; => totally unstable; A = 2/14 = 0.142; D = 0.606
TILE: CA = 0; CE = 1; I = 0; => totally stable; A = 1/6 = 0.166; D = 0.593
BOARD: CA = 0; CE = 1; I = 1; => totally stable; A = 0; D = 0 
</pre>

## System Architecture
<pre>
I have chosen a distributed, object-oriented approach for handling the information in this game, and the system architecture is a high-level one, specifically a common "control modeling" pattern defined by:
  -Function Call and Return
  -Event-Driven Systems
In this architecture, we have:
  -Hierarchical decomposition
  -Single control flow
  -Subroutines aggregated into modules
  -Hierarchical reasoning
  -The correctness of a subroutine depends on the correctness of the called subroutines
  -The control flow is relatively straightforward to analyze, but exceptions from normal operation are challenging to handle. 
</pre>
