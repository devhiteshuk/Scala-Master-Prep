//import org.apache.spark.sql.SparkSession
//
//object CoalesceExample extends App {
//  // Create SparkSession
//  val spark = SparkSession.builder()
//    .appName("Coalesce Example")
//    .master("local[*]")
//    .getOrCreate()
//
//  // Sample Data (Customer Transactions)
//  import spark.implicits._
//  val transactions = Seq(
//    ("Alice", 200.0), ("Bob", 450.0), ("Charlie", 300.0),
//    ("David", 150.0), ("Eve", 500.0), ("Frank", 100.0)
//  ).toDF("Customer", "Amount")
//
//  // Initial partitions
//  println("Initial partitions: " + transactions.rdd.getNumPartitions)
//
//  // Reduce partitions using coalesce
//  val optimizedTransactions = transactions.coalesce(2) // Reducing to 2 partitions
//
//  // Final partitions
//  println("Optimized partitions: " + optimizedTransactions.rdd.getNumPartitions)
//
//  // Stop SparkSession
//  spark.stop()
//}
