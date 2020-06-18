import lab2.RecursiveData
import org.scalatest.concurrent.Eventually
import org.scalatest.{FunSuite, Matchers}

class RecursiveDataTest extends FunSuite with Matchers with Eventually{

  test("test method isEmpty"){
    RecursiveData.isEmpty(List(1, 3, 10)) shouldBe true
  }

  test("test method testListIntEmpty"){
    RecursiveData.testListIntEmpty(List()) shouldBe false
  }

  test("test method isEmptyHead"){
    RecursiveData.isEmptyHead(List()) shouldBe -1
  }

  test("test method testListIntHead"){
    RecursiveData.testListIntHead(List(56, 10, 9)) shouldBe 56
  }

  test("test method ListNotIsEmpty"){
    RecursiveData.ListNotIsEmpty(1, Nil) should not be empty
  }

  test("test method ListNotIsEmpty()"){
    RecursiveData.ListNotIsEmpty(1, List(1, 2, 3)) shouldBe List(1, 2, 3)
  }

  test("test class Tree"){
    val a = new RecursiveData.Tree[Int](new RecursiveData.Tree[Int](null, null, 2), null, 1)
    a.LeftNode.leaf shouldBe 2
  }

}
