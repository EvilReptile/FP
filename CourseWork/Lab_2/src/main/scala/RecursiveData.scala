package lab2

import scala.collection.immutable.List

object RecursiveData {

  def isEmpty(list: List[Int]) : Boolean = list match {
    case x :: tail   => true
    case Nil         => false
  }

  def testListIntEmpty(list: List[Int]): Boolean = isEmpty(list)

  def isEmptyHead(list: List[Int]) : Int = list match {
    case x :: tail   => x
    case Nil         => -1
  }

  def testListIntHead(list: List[Int]): Int = isEmptyHead(list)

  def ListNotIsEmpty[A](head: A, list: List[A]) : List[A] = list match {
    case Nil          => head :: list
    case x :: tail    => list
  }

  class Tree[A](val LeftNode: Tree[A], val RightNode: Tree[A], val leaf: A)
}
