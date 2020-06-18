package lab3

object Sequence {

  def testLastElement[A](seq: Seq[A]): Option[A] = Some(seq.last)

  def testZip[A](a: Seq[A], b: Seq[A]): Seq[(A, A)] =  a.zip(b)

  def testForAll[A](seq: Seq[A])(cond: A => Boolean): Boolean = seq.forall(cond)

  def testPalindrom[A](seq: Seq[A]): Boolean = seq.reverse == seq

}
