

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

  // constructor arguments are NOT fields
  // aDog.name  <- NOT ALLOWED

}