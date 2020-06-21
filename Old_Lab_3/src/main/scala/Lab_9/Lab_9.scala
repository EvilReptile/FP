package Lab9

import scala.collection.mutable.ListBuffer
import scala.util.Random

object Lab_9 {

  def firstFunctionalStile(number: Int, digit: Int) = (for (i <- 0 to number) yield i.toString.count(_ == digit.toString.charAt(0))).sum

  def secondFunctionalStile(list: List[Any], count: Int) = Random.shuffle(list).take(count)

  def firstImperativeStile(number: Int, digit: Int): Int = {
    var count = 0

    for (i <- 1 to number)
      count += i.toString.count(_ == digit.toString.charAt(0))

    count
  }

  def secondImperativeStyle(list: List[Any], count: Int): ListBuffer[Any] = {
    var result = ListBuffer[Any]()

    for (i <- 1 to count)
      result += list(Random.nextInt(list.length))

    result
  }
}
