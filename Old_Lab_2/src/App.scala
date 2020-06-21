import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

object App {
  def main(args: Array[String]): Unit = {
    print("Array(")
    for (i: Int <- arrayFilling(10))
      print(i + " ")
    println(")")

    print("Array(")
    for (i: Int <- arrayChanger(arrayFilling(10)))
      print(i + " ")
    println(")")

    print("Array(")
    for (i: Int <- arrayChangerUsingYield(arrayFilling(10)))
      print(i + " ")
    println(")")

    print("Array(")
    for (i: Int <- arrayFilter(Array(-1, 2, 3, 4, 0, 10, -2)))
      print(i + " ")
    println(")")

    print("Array(")
    for (i: Int <- arrayReversSort(Array(-1, 2, 3, 4, 0, 10, -2)))
      print(i + " ")
    println(")")

    print("ArrayBuffer(")
    for (i: Int <- arrayBufReversSort(ArrayBuffer(-1, 2, 3, 4, 0, 10, -2)))
      print(i + " ")
    println(")")

    print("Array(")
    for (i: Int <- outputArray(Array(-1, -2, 3, 4, 0, 10, -2)))
      print(i + " ")
    println(")")

  }

  def arrayFilling(number: Int): Array[Int] = (0 to number - 1).toArray

  def arrayChanger(array: Array[Int]): Array[Int] = (array grouped 2 flatMap (_.reverse)).toArray

  def arrayChangerUsingYield(array: Array[Int]): Array[Int] =
    for {
      twoElemArr <- (array grouped 2).toArray
      output <- twoElemArr.reverse
    } yield output

  def arrayFilter(array: Array[Int]): Array[Int]  = array.filter( _ > 0) ++ array.filter( _ <= 0)

  def arrayMean(array: Array[Double]): Double = array.sum / array.length

  def arrayReversSort(array: Array[Int]): Array[Int] = array.sorted.reverse

  def arrayBufReversSort(array: ArrayBuffer[Int]): ArrayBuffer[Int] = array.sorted.reverse

  def outputArray(array: Array[Int]) = {array.filter( x => array.count(_ == x) < 2)}
}
