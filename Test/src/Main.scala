object Main {
  def main(args: Array[String]): Unit = {
    println(firstFunctional(7))
    println(firstImperative(7))
    println(secondFunction(List[Int](1, 2, 3, 4, 5, 6)))
    println(secondImperative(Array[Int](1, 2, 3, 4, 5, 6)))
  }

  def firstFunctional(number: Int): Int = {
    if((1 to number - 1).toList.filter(number % _ == 0).sum == number) number else firstFunctional(number - 1)
  }

  def secondFunction[T](list: List[T]): (List[T], List[T]) ={
    list.partition( list.indexOf(_) % 2 == 0)
  }

  def firstImperative(number: Int): Int = {
    for(i <- number to 2 by -1){
      var sum = 0
      for(j <- 1 to (i - 1)){
        if(i % j == 0)
          sum += j
      }
      if(sum == i)
        return i
    }
    -1
  }

  def secondImperative[T](list: Array[T]): (List[T], List[T]) = {
    var list1: List[T] = Nil
    var list2: List[T] = Nil

    for(i <- 0 to list.size - 1){
      if(i % 2 == 0){
        list1 :+= list(i)
      }else{
        list2 :+= list(i)
      }
    }

    (list1, list2)
  }
}
