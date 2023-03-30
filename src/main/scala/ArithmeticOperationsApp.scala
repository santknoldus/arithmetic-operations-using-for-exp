package kup.knoldus.arithmeticOperations

object ArithmeticOperationsApp extends App {

  val arithmeticOperations = new ArithmeticOperations

  val list = List(Some(1), Some(2), Some(3), Some(4))

  private val additionResult = arithmeticOperations.arithmeticOperations(list, "Addition")
  private val multiplicationResult = arithmeticOperations.arithmeticOperations(list, "Multiplication")
  private val subtractionResult = arithmeticOperations.arithmeticOperations(list, "Subtraction")

  println(s"$additionResult\n$multiplicationResult\n$subtractionResult")

}
