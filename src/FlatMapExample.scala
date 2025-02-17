object FlatMapExample extends App {
  // List of sentences
  val sentences = List(
    "Scala is powerful",
    "Functional programming is fun",
    "Big Data loves Spark"
  )

  // Splitting each sentence into words using flatMap
  val words = sentences.flatMap(sentence => sentence.split(" "))

  val newword = sentences.map{
    (s)=> s.length
  }

  val withoutFlatMap = sentences.map{
    (s) => s.split(" ").mkString
  }

  // Printing results
  println("Original Sentences: " + sentences)
  println("Extracted Words: " + words)
  println("Word count: " + newword)
  println("Without Flat map "+withoutFlatMap)
}
