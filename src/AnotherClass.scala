//sealed class Color
//case class Pink(name: String) extends Color
//case class Red(name: String) extends Color
///**
// * Sealed class example
// */
//sealed trait Animal
//case class Dog(name: String) extends Animal
//case class Cat(name: String) extends Animal
//
//def identifyColor(color: Color): String = color match {
//  case Pink(name)=> s"Color is $color"
//  case Red(name) => s"Color is $name"
//}
///**
// * @param animal
// * @return
// */
//def identify(animal: Animal): String = animal match {
//  case Dog(name) => s"Dog: $name"
//  case Cat(name) => s"Cat: $name"
//}