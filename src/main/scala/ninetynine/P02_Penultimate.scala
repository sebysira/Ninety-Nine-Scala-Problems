/**
 * Find the last but one element of a list.
 */
package ninetynine.lists

object P02_Penultimate {

  def penultimate[A](l : List[A]):A = l match {

    case x :: _ :: Nil => x
    case _ :: xs => penultimate(xs)
    case _ => throw new NoSuchElementException
  }

}
