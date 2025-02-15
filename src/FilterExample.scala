object FilterExample extends App {
  // List of orders (Order ID, Customer Name, Order Status)
  val orders = List(
    (101, "Alice", "Shipped"),
    (102, "Bob", "Processing"),
    (103, "Charlie", "Shipped"),
    (104, "David", "Cancelled")
  )

  // Filtering only shipped orders
  val shippedOrders = orders.filter { case (_, _, status) => status == "Shipped" }
  val processBob = orders.filter{
    case (i, str, str1) => i == 102 && str1 =="Processing"
  }

  // Printing results
  println("All Orders: " + orders)
  println("Shipped Orders: " + shippedOrders)
  println(s"Processing order: $processBob")
}
