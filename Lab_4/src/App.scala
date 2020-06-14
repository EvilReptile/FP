object App extends App {
  println(Typeclasses.testReversableString("Reverse"))
  println(Typeclasses.testSmashInt(2, 3))
  println(Typeclasses.testSmashDouble(2.5, 3.25))
  println(Typeclasses.testSmashString("Concatenate", "Test"))

}