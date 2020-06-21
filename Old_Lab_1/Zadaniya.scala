println("Задание 4")
println(BigInt(2) pow(1024))
println

println("Задание 5")
import util.Random
import BigInt.probablePrime
val code: BigInt = probablePrime(100, Random)
println(code)
println

println("Задание 6")
val sumbols: String = code.toString(36)
println(sumbols)
println

println("Задание 7")
println(sumbols(0) + " " + sumbols(sumbols.length()-1))
println

println("Задание 8")
val list = List("a", "b", "c", "d", "e", "f", "g")

println
println("take function")
println(list.take(3))

println
println("drop function")
println(list.drop(3))

println
println("takeRight  function")
println(list.takeRight(3))

println
println("dropRight function")
println(list.dropRight(3))
println

println("Задание 9")
println("Сигнум числа 10")
println((10).signum)
println
println("Сигнум числа -50")
println((-50).signum)
println
println("Сигнум числа 0")
println((0).signum)
println

println("Задание 11")
for (i <- 10 to 0 by -1)
  println(i)
println

println("Задание 12")
def countdown(n: Int) = {
  for(i <- n to 0 by -1)
    println(i)
}
println("Вывод по запросы n = 7")
countdown(7)
println

println("Задание 13")
println("Поиск произведения слова 'test_word' через for")
var x: Long = 1
for(sumbol: Char <- "test_word"){
  x *= sumbol
}
println(x)
println

println("Задание 14")
println("Поиск произведения слова 'test_word' через встроенную функцию")
println("test_word".map(c => c.toLong).product)
println

println("Задание 15")
println("Поиск произведения слова 'test_word' через встроенную функцию в функции")
def product(s: String): Long ={
  s.map(c => c.toLong).product
}
println(product("test_word"))
println

println("Задание 16")
println("Поиск произведения слова 'test_word' через рекурсию")
def prod(s: String, l: Long): Long = {
  if(s.isEmpty){
    l
  }else{
    prod(s.tail , l * s.head.toLong)
  }
}
println(prod("test_word", 1))
println

println("Задание 17")
println("Вычисление функции Х^N по условию")
import scala.math
def calculate(x: Double, n: Int):Double ={
  if(n.signum > 0){
      if(n % 2 == 0){
        Math.pow(calculate(x, n/2), 2)
      }else{
        x * calculate(x, n - 1)
      }
  }else if(n.signum < 0){
    1 / calculate(x, n * -1)
  }else{
    1.0
  }
}
println("Получено значение при 1.5^2: " + calculate(1.5, 2))
println("Получено значение при 1.5^3: " + calculate(1.5, 3))
println("Получено значение при 1.5^(-2): " + calculate(1.5, -2))
println
