import lab1._
import lab2._
import lab3._
import lab4._

import scala.collection.mutable

object Main {
  def main(args: Array[String]): Unit = {
    println("Запуск программы")
    println("В первой лабораторной работе запущено: " + lab1() + " методов")
    println("Во второй лабораторной работе запущено: " + lab2() + " методов")
    println("В третьей лабораторной работе запущено: " + lab3() + " методов")
    println("В четвертой лабораторной работе запущено: " + lab4() + " методов")
  }

  def lab1(): Int ={
    var result: Int = 0

    if(Animal.knownAnimal("Cat"))
      result += 1
    if(Functions.testCircle(2) == 2*2*Math.PI)
      result += 1
    if(Functions.testRectangleCurried(5, 2) == 10)
      result +=1
    if(Functions.testRectangleUc(2, 4) == 8)
      result +=1
    if(HigherOrder.testAnonymousNTimes(5, 5, 5) == 25)
      result += 1
    if(HigherOrder.testNTimes(HigherOrder.multiply, 5, 5, 5) == 125)
      result += 1
    if(PatternMatching.testIsEven(2))
      result += 1
    if(PatternMatching.testIsMaxAndMoritz("Max"))
      result += 1
    if(PatternMatching.testExtractMammalWeight((PatternMatching.Mammal("Cat", PatternMatching.Plants, 10)))== 10)
      result += 1
    if(PatternMatching.testIntToString(2).equals("it is two"))
      result +=1
    if(PatternMatching.testWinsA(PatternMatching.Scissor, PatternMatching.Rock) == PatternMatching.Lose)
      result +=1

    result
  }

  def lab2(): Int ={
    var result: Int = 0

    if(Compositions.testCompose((i:Int) => "Compose" * i)((i: String) => i * 2)((i:String) => i.dropRight(3))(2).equals("ComposeComposeComposeComp"))
      result += 1
    if(Compositions.testMapFlatMap((i:Int) => if (i > 0) Some(i) else None)((i:Int) => if (i > 10) Some(i) else None)((i:Int) => i * 2)(Some(11)) == Some(22))
      result += 1
    if( Compositions.testForComprehension((i:Int) => if (i > 0) Some(i) else None)((i:Int) => if (i > 10) Some(i) else None)((i:Int) => i * 2)(Some(9)) == None)
      result += 1
    if(!RecursiveData.testListIntEmpty(List()))
      result += 1
    if(RecursiveData.testListIntHead(List(56, 10, 9)) == 56)
      result += 1
    if(RecursiveData.ListNotIsEmpty(1, List(1, 2, 3)) == List(1, 2, 3))
      result += 1
    if(RecursiveFunctions.testReverse(List(1, 2)) == List(2, 1))
      result += 1
    if(RecursiveFunctions.testMap((List(1, -2, 3, -4, 5)), ((i:Int) => if(i < 0) i * -1 else i )) == List(1, 2, 3, 4, 5))
      result += 1
    if(RecursiveFunctions.testAppend(List(), List()).isEmpty)
      result += 1
    if(RecursiveFunctions.testFlatMap(List(1, -2, 3, -4, 5),((i:Int) => List(i))).size == 5)
      result += 1

    result
  }

  def lab3(): Int ={
    var result: Int = 0

    if(Strings.testUppercase("test").equals("TEST"))
      result += 1
    if(Strings.testTakeTwo("Test line").equals("T"))
      result += 1
    if(Sequence.testLastElement(Seq(1, 2, 3, 4, 5, 6)) == Some(6))
      result += 1
    if(Sequence.testZip(Seq(1, 3, 5), Seq(2, 4, 6)) == List((1, 2), (3, 4), (5, 6)))
      result += 1
    if(Sequence.testForAll(Seq(3, 6, 9, 12))((i: Int) => i % 3 == 0))
      result += 1
    if(Sequence.testPalindrom(Seq(1, 2, 3, 4, 3, 2, 1)))
      result += 1
    if( Maps.testNumberFrodos(Map("a" -> Maps.User("Adam", 1), "b" -> Maps.User("Kir", 20), "c" -> Maps.User("ill", 19))) == 1)
      result += 1
    if(Maps.testGroupUsers(Seq(Maps.User("Kir", 20), Maps.User("ill", 19))) == mutable.HashMap("ill" -> 19, "Kir" -> 20))
      result += 1
    if(Adts.testGetNth(List(1, 2, 3, 4, 5, 6), 3) == Some(4))
      result += 1
    if(Adts.testDouble(Option(20)) == Some(40))
      result += 1
    if(Adts.testSafeDivide(5, 0) == Left("Вы не можете делить на ноль."))
      result += 1

    result
  }

  def lab4(): Int ={
    var result: Int = 0

    if(Typeclasses.testReversableString("Hello").equals("olleH"))
      result += 1
    if(Typeclasses.testSmashInt(2, 3) == 5)
      result += 1
    if(Typeclasses.testSmashDouble(3.14, 3.14) == 6.28)
      result += 1
    if(Typeclasses.testSmashString("te", "st").equals("test"))
      result += 1
    if(Smash.SmashString.smash("Hello ", "world!").equals("Hello world!"))
      result += 1
    if(Smash.SmashInt.smash(10, 10) == 20)
      result += 1
    if(Reversable.ReversableString.reverse("test").equals("tset"))
      result += 1

    result
  }
}
