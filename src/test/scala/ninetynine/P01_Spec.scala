import collection.mutable.Stack
import org.scalatest._
import ninetynine.lists._

class P01_Spec extends FlatSpec with Matchers {

  "P01_Last" should "find the last element of a List" in {
    P01_Last.last(List(1,2,3)) should be (3)
    P01_Last.last(List('a', 'b', 'c', 'd')) should be ('d')
    P01_Last.last(List("mario", "giorgio", "alessio")) should be ("alessio")
  }

}