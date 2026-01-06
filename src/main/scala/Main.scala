

object Main:
  @main def run(): Unit =

    //defining a value
    val meaningOfLife: Int = 44 // means -> const int meaningOfLife = 42;

    // STATEMENT BELLOW WILL ERROR because value is immutable and is already defined above
    // val meaningOfLife = 44

    val aBoolean =  false  // defining boolean type is optional as the compiler can define it

    // Int, Boolean, Char, Double, Float, String are all Standard data type  structures

    // String and String operations
    val aString = "I love Scala"
    val aComposedString = "I" + " love " + "Scala"
    val anInterpolatedString = s"The meaning of life is $meaningOfLife"

    // Expressions = structures that can be reduced to a value
    val anExpression = 2+3

    // if expression in other languages: meaningOfLife > 43 ? 56 : 999
    val ifExpression = if (meaningOfLife > 43) 56 else 999

    // chained expression can be a composed expression, this is still 1 expression
    val chainedExpression = {
      if (meaningOfLife > 43 ) 56
      else if (meaningOfLife < 0 ) -2
      else if (meaningOfLife > 999) 78
      else 0


    // code blocks
    val aCodeBlock = {
      // definitions
      val aLOcalVal = 67

      // value of block is the value of the last expression
      aLOcalVal +3
    }


    // define a function
    def myFunction(x: Int, y: String): String = {
      y + " " + x
      }

    // recursive functions
    def factorial(n: Int): Int =
      if (n <= 1)1
      else n * factorial( n-1 )

      /*
      factorial(5) = 5 * factorial(4)
      factorial(4) = 4 * factorial(3)
      factorial(1) = 1
       */

    // In Scala loops and iteration are not used, recursion uis used

    // The Unit Type = no meaningful value == "void " in other languages
    // type of SIDE EFFECTS, return unit
    println("I love Scala") // System.out.println, print
    def myUnitReturn(): Unit = {
      println("Do not return from unit")
    }
      val theUnit = ()
    }

