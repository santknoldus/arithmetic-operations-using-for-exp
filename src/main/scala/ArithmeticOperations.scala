package kup.knoldus.arithmeticOperations

import scala.util.{Failure, Success, Try}

class ArithmeticOperations {

  def arithmeticOperations(list: List[Option[Int]], operation: String): Int = {
    val numbers = for {
      maybeInt <- list
      number <- maybeInt
    } yield number

    Try {
      operation match {
        case "Addition" => numbers.sum
        case "Subtraction" => numbers.reduce(_ - _)
        case "Multiplication" => numbers.product
      }
    } match {
      case Failure(_) => 0
      case Success(result) => result
    }
  }
}
