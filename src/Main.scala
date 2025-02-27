object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

    //topicsExample()

    //stringExmaple()

    closureExample()
    val dog = new Dog()
    dog.makeSound()

    val str: String = 42  // Implicitly converted
    println(str.length)  // Output: 2
  }

  private def topicsExample(): Unit = {
    val myNumber = List(1,2,3,4,6,7,9,10)
    val doubleIt = myNumber.map(_ * 2)
    println(doubleIt)

    val fruits = List("Mango","Orange","Pineapple","Banana")
    println(fruits)

    //second example
    val purchase = List(("AA", 1000),("BBB", 600), ("CCC", 800))

    val discountPurchase = purchase.map{
      case (name, amount)=> (name, amount*0.5)
    }

    println("Original purchase "+purchase)
    println(f"Discounted purchase $discountPurchase")

    logParser()
  }

  private implicit def intToString(x: Int): String = x.toString

  private def logParser(): Unit = {
    // Sample log entries
    val logs = List(
      "2025-02-14 10:30:15, ERROR, Database connection failed",
      "2025-02-14 10:35:20, INFO, User login successful",
      "2025-02-14 10:40:45, WARN, High memory usage detected"
    )

    // Transform logs into structured format using map
    val structuredLogs = logs.map { log =>
      val parts = log.split(", ").map(_.trim) // Split by ", " and trim spaces
      Map("timestamp" -> parts(0), "level" -> parts(1), "message" -> parts(2))
    }

    // Print transformed logs
    structuredLogs.foreach(println)
  }


  private def curryFunctions(): Unit = {
    def add(x:Int, y:Int) = x+y

    println("Fist type of carry syntax: ==> "+add(20,20))

    def add2(x:Int) = (y:Int) => x+y
    println("Second second ")
  }

  private def stringExmaple(): Unit = {
    val str1: String = "HelloHitesh"
    val str2: String = "Scala Dev"
    println(str1)

    println(str1.length)
    println(str1.concat(str2))
    println(str1+str2)

    val num1 = 75
    val num2 = 11.25

    val result = printf("(%d -- %f --- %s)",num1,num2, str1)
    println(result)
    println("(%d -- %f --- %s)".format(num1,num2,str1))

    arryExample()
  }

  private def arryExample(): Unit = {
    val marksArray : Array[Int] = new Array[Int](4)
    val newMarksArray = new Array[Int](4)

    marksArray(0)=1;
    marksArray(1)=12;
    marksArray(2)=11;
    marksArray(3)=10;
    //First way
    for( x <- newMarksArray){
      print(x)
    }
    //Second way
    for( i <- marksArray.indices){
      println(i)
    }

    val myArray = Array(1,2,3,4,5)
    val alpabet = Array("Aa","Bb","Cc","Dd")

    val mergeArray = Array.concat(marksArray,newMarksArray)
    for(m <- mergeArray.indices){
      println(myArray(m))
    }
  }

  class Animal {
    def makeSound(): Unit = {
      println("Animal make sound")
    }
  }

  class Dog extends Animal {
    override def makeSound(): Unit = println("Bark")
  }

  private def closureExample(): Unit = {
    var factor = 10
    factor =3
    val multiply = (x: Int) => x * factor
    println(multiply(5))  // Output: 50
  }
}