package edu.knoldus.com
import org.scalatest.funsuite.AnyFunSuite

class SquareNumberTest extends AnyFunSuite {

    val sqrtTest: SquareNumber= new SquareNumber()
    test("Testing the square of number  by List method "){
      assert(sqrtTest.squareList(List(1,2,3,4,5))==List(1,4,9,16,25))
      assert(sqrtTest.squareList(List(10,20,30,40,50))==List(100, 400, 900, 1600, 2500))
    }

  test("Testing the square of number  by using maps "){
    assert(sqrtTest.squareListByMaps(List(1,2,3,4,5))==List(1,4,9,16,25))
    assert(sqrtTest.squareListByMaps(List(10,20,30,40,50))==List(100, 400, 900, 1600, 2500))
  }
}
