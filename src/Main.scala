
object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

    topicsExample()
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

}