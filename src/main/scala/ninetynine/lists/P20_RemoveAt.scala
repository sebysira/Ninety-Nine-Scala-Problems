package ninetynine.lists
/**
 * Remove the Kth element from a list.
 */
object P20_RemoveAt {

  def removeAt[A](n:Int,l:List[A]):(List[A],A) = l.splitAt(n) match {

    case (_ , Nil)  => throw new NoSuchElementException
    case (Nil, _) if (n<0) => throw new NoSuchElementException
    case (pre, e :: post) => (pre ::: post,e)



  }

}
