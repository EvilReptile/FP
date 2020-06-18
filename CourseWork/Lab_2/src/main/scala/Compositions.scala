package lab2

object Compositions{

  def testCompose[A, B, C, D](f: A => B)
                             (g: B => C)
                             (h: C => D): A => D = h compose g compose f

  def testMapFlatMap[A, B, C, D](f: A => Option[B])
                                (g: B => Option[C])
                                (h: C => D): Option[A] => Option[D] = _.flatMap(f).flatMap(g).map(h)

  def testForComprehension[A, B, C, D](f: A => Option[B])
                                      (g: B => Option[C])
                                      (h: C => D): Option[A] => Option[D] = for { first <- _
                                                                                  second <- f(first)
                                                                                  third <- g(second) } yield h(third)

}
