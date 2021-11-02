package edu.knoldus.com

  class SquareNumber {
    def squareList(xs: List[Int]): List[Int] =
      xs match {
        case Nil => Nil
        case y :: ys => y*y :: squareList(ys)
      }

    def squareListByMaps(xs: List[Int]): List[Int] =
      xs map (x=>x*x)
  }

