/**
 * Find the last element of a list.
 */
package ninetynine.lists

object P01_Last {
  def last[A](l : List[A]) : A = l match {
    case x :: Nil => x
    case _ :: xs => last(xs)
    case _ =>throw new NoSuchElementException
  }

}
