

class OOP_Practice {
  // CLASS AND INSTANCE
  class Animal {
    // define fields
    val age = 0
    //define methods
    def eat() = println("I'm eating")
  }
  val anAnimal = new Animal

  // INHERITANCE
  class Dog(name: String) extends  Animal // contractor definition
  val aDog = new Dog("Dolly")

  // constructor arguments are NOT fields: need to put a val before the contractor argument
  // aDog.name <- Not Allowed

  //subtype polymorphism
  val aDeclaredAnimal: Animal = new Dog("Misty")
  aDeclaredAnimal.eat() // the most derived method will be called at runtime

  //abstract class
  abstract  class WalkingAnimal {
    protected val hasLegs = true // by default public, can be restricted with private or protected
    def walk(): Unit
  }

  //"interface" = ultimate abstract type
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait  Philosopher {
    def ?!(thought: String): Unit // valid method name
  }

  // single calss inheritance and multi-trait "mixing"
  class Crocodile extends  Animal with Carnivore with Philosopher {
    override  def eat(animal: Animal): Unit = println("I am eating you, animal")

    override def ?!(thought: String): Unit = println(s"I was thinking: $thought")
  }

  val aCroc = new Crocodile
  aCroc.eat(aDog)
  aCroc eat aDog // infix notation = object method argument // both statements are the same
  // ^ Only available for methods with ONE argument

  aCroc ?! "What if we could fly"

  // operators in Scala are actually methods
  val basicMath = 1 + 2 // the plus is a method belong to the int type
  val anotherBasicMAth = 1.+(2) // both statements are the same

  // anonymous classes
  val dino = new Carnivore {
    override def eat(animal: Animal): Unit = println("I am a dino, I eat everything")
  }

  /*
  class Carnivore_Anonymous extends Carnivore {
    override def eat(animal: Animal): Unit = println("I am a dino, I eat everything")
  }
  val dino = new Carnivore_Anonymous
   */

  //singleton object
  object MySingleton { // the only instance of MySingleton typle
    val myspecialVal = 12345
    def mySpecialMethod() = 4567
    def apply(x: Int) = x + 1
  }

  MySingleton.mySpecialMethod()
  MySingleton.apply(85)
  MySingleton(85) // same as above

  object Animal { // companion - companion object
    // companions can access each others private fields/methods
    // singleton Animal and instances of Animal are different things
    val canLiveEternal = false
  }

  val animalsCanLiverForever = Animal.canLiveEternal // "static" fields/ methods

  /*
  case classes = lightweight data structures with some boilerplate
  - sensible equals and hash code
  - serialization
  - companion with apply
  - pattern matching
   */
  case class Person(name: String, age: Int)
  // may be constructed without "new"
  val bob = Person("Bob", 55) // person.apply("Bob", 54)

  // exceptions




}