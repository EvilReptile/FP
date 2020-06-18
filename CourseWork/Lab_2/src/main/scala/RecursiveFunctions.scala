package lab2
import scala.annotation.tailrec
import scala.collection.immutable.List


object RecursiveFunctions{

  def length[A](as: List[A]): Int = {
    @tailrec
    def loop(rem: List[A], agg: Int): Int = rem match {
      case x :: tail  => loop(tail, agg + 1)
      case Nil         => agg
    }

    loop(as, 0)
  }

  def reverse[A](list: List[A]): List[A] = {
    @tailrec
    def loop(rem: List[A], result: List[A]): List[A] = rem match {
      case x :: tail  =>  loop(tail, x :: result)
      case Nil         => result
    }
    loop(list, Nil)
  }

  def testReverse[A](list: List[A]): List[A] = reverse(list)

  def map[A, B](list: List[A])(f: A => B): List[B] = {
    @tailrec
    def loop(rem: List[A], result: List[B])(f: A => B): List[B] = rem match {
      case x :: tail => loop(tail, result :+ f(x))(f)
      case Nil       => result
    }
    loop(list, Nil)(f)
  }

  def testMap[A, B](list: List[A], f: A => B): List[B] = map(list)(f)

  def append[A](l: List[A], r: List[A]) : List[A] = {
    @tailrec
    def loop(rem: List[A], result: List[A]) : List[A] = rem match {
      case x :: tail => loop(tail, result :+ x)
      case Nil       => result
    }
    loop(r, l)
  }

  def testAppend[A](l: List[A], r: List[A]): List[A] = append(l, r)

  def flatMap[A, B](list: List[A])(f: A => List[B]): List[List[B]] = {
    @tailrec
    def loop(rem: List[A], result: List[List[B]])(f: A => List[B]): List[List[B]] = rem match {
      case x :: tail => loop(tail, result :+ f(x))(f)
      case Nil       => result
    }
    loop(list, Nil)(f)
  }

  def testFlatMap[A, B](list: List[A], f: A => List[B]): List[List[B]] = flatMap(list)(f)

}
