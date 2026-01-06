

object Main:
  @main def run(): Unit =

    //defining a value
    val meaningOfLife: Int = 44 // means -> const int meaningOfLife = 42;

    // STATEMENT BELLOW WILL ERROR because value is immutable
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

