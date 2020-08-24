# sgtcodingtest
by-mezaw



Submission Description:


Section A

1a. -Add sing() method inside Bird Class. 
    -Testig with Solution class and ensure when sing() method is called it prints "I am Singing". 
    -Added  JUNIT testcases for Animal and Bird Class to ensure base class, sub class inheritance and invoke method correctly.

1b. if we have a new animal that cannot walk, it wont fit into inheritance hierarchy. The first approach is not scalable/maintainable 
    To be able to improve maintainability of this model,  
	(1) change Animal class to abstract calss  and remove its behaviour walk()
	(2) introdue 3 new interfaces ( Walkable, Flyable, Singable), where concrete class Bird can extend Animal and implement respective behaviourial interface methods
	
	
2. Bird Class implemented only Walkable and Singable interface (Assumption, all tye of birds can walk and sign) and some type of birds cannot swim or fly
   Created concrete class Duck that extends Birds and implemented Swimmable and Flyable interface and overide sing method
   Created concrete class Chicken that extends Birds and overide sing method 
   
3. A Rooster is a male Chicken, added an ENUM  Gender with constant (FEMALE, MALE) in Animal class with getter/setter as all animals have Gender(Assume MALE, FEMALE).
   If chicken is Male,it is Rooster and it will sing Cock-a-doodle-doo (Assumption) 
   
4. Added neighbour object and initialze vlaue in default construtor to fullfill the requirement. 
 We can use a decorator pattern to produce different sing() depending on which animal does the Parrot live with.
 ParrotDecorator is the base decorator class and all other decorators extend this to produce different output for sing method.
 To add different behaviour for the same class during runtine we can use decorator pattern. 
 If we need to add new parrot living near phone or duck we need to add a new decorator rather than changing the Parrot class.
 Disadvantges: will be bombardment of multile classes to handle.
 
 

Section B.

AquaticAnimal extends Animal and implements Swimmable. Fish extends AquaticAnimal.

Fish has size and color property. Shark extends Fish, added eat() method as only sharks eat other fish and ClownFish extends Fish and can makeJokes.

Dolphin can direct extend AquaticAnimal as they are not fish and can swim as AquaticAnimal implements Swimmable, 
one way to re use code is to keep the common functionality in the Base class or 
implemnt common behaviour (Interface Swimmable) in base class itself as all aquatic animals can swim.

Section D

Create an Insects class which extends Animal, and Butterfly extends Insects and implements FlyIF.
Create an Catterpillar class which extends Insects, we can add an Metamorphosis (Adaptor Class) which has a trnaform method that transforms the catterpillar ro butterfly.

Section E 

Implemented factory pattern AnimalFactory which is object creational pattern then add the objects to the list and
 then count the naimals that can fly, sing, swim, walk (Not all ducks can fly)

BONUS.

We can consider this as localisation, we can have a map of languages and its translation and depending on native language we can print the corresponding sounf for EX Rooster sound in tamil is Kokorokooko. Test Class TestSecBonus

REST webservice get List of animals, similarly we can have specific api for counts. Sample code is written using SPRING. 
AnimalController is the Controller which returns the list of animals for GET request.
