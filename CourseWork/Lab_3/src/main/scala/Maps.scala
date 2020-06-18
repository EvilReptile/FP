package lab3

object Maps {

  case class User(name: String, age: Int)

  def testGroupUsers(users: Seq[User]): Map[String, Int] = {
    var groups = users.groupBy(_.name)
    groups.map(x => (x._1, x._2.foldLeft(0)(_ + _.age) / x._2.length))
  }

  def testNumberFrodos(map: Map[String, User]): Int = {
    var count = 0
    map.keys.foreach { key =>
      if (map(key).name.contains("Adam")) count += 1
    }
    count
  }

  def testUnderaged(map: Map[String, User]): Map[String, User] = {
    map.keys.foreach { key =>
      if (map(key).age < 35) map.-(key)
    }
    map
  }
}
