object FlatMapExample extends App {
  // List of sentences
  val sentences = List(
    "Scala is powerful",
    "Functional programming is fun",
    "Big Data loves Spark"
  )

  // Splitting each sentence into words using flatMap
  val words = sentences.flatMap(sentence => sentence.split(" "))

  // Printing results
  println("Original Sentences: " + sentences)
  println("Extracted Words: " + words)
}
