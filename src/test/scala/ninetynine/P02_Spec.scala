import org.scalatest._
import ninetynine.lists._

/**
 * Created by seby on 12/10/15.
 */

class P02_Spec extends FlatSpec with Matchers{
  "P02_Last" should "Find the last but one element of a list" in {
    P02_Penultimate.penultimate(List(1,2,3)) should be (2)
    P02_Penultimate.penultimate(List('a', 'b', 'c', 'd')) should be ('c')
    P02_Penultimate.penultimate(List("mario", "giorgio", "alessio")) should be ("giorgio")
    an [NoSuchElementException] should be thrownBy P02_Penultimate.penultimate(Nil)
  }

}
