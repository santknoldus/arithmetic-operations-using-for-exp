package kup.knoldus.arithmeticOperations

import org.scalatest.funsuite.AnyFunSuite

class ArithmeticOperationsTest extends AnyFunSuite {

  val arithmeticOperations = new ArithmeticOperations

  test("should return sum of all element in list of option") {
    val list = List(Some(1), Some(2), Some(3), Some(4))
    val result = arithmeticOperations.arithmeticOperations(list, "Addition")
    val expectedResult = 10
    assert(result === expectedResult)
  }

  test("should return product of all element in List of option") {
    val list = List(Some(1), Some(2), Some(3), Some(4))
    val result = arithmeticOperations.arithmeticOperations(list, "Multiplication")
    val expectedResult = 24
    assert(result === expectedResult)
  }

  test("should return subtraction of all element in List of option") {
    val list = List(Some(1), Some(2), Some(3), Some(4))
    val result = arithmeticOperations.arithmeticOperations(list, "Subtraction")
    val expectedResult = -8
    assert(result === expectedResult)
  }

  test("should fail and return 0") {
    val list = List()
    assert(arithmeticOperations.arithmeticOperations(list, "Addition") === 0)
  }
}
