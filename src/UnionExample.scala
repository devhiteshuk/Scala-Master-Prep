object UnionExample extends App {
  // List of existing customers
  private val existingCustomers = List("Alice", "Bob", "Charlie")

  // List of new customers (some may already exist)
  private val newCustomers = List("David", "Alice", "Eve")

  // Combining both lists using union
  private val allCustomers = existingCustomers.union(newCustomers)

  // Printing results
  println("Existing Customers: " + existingCustomers)
  println("New Customers: " + newCustomers)
  println("All Customers (with duplicates): " + allCustomers)

  private val uniqueCustomers = existingCustomers.union(newCustomers).distinct
  println("Unique Customers: " + uniqueCustomers)

}
