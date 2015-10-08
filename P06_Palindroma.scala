/**
 * Find out whether a list is a palindrome.
 */
object P06_Palindroma {

  def main(args: Array[String]) {

    val l = List(1,2,3,2,1)
    val res = isPalindroma(l)
    println(res)

  }

  def isPalindroma[A](l:List[A]):Boolean = {

    val aux = l.reverse
    val len = l.length / 2

    aux == l

    /*  without using

    def auxpal(l1:List[A],l2:List[A]):Boolean = (l1,l2) match {

      case (Nil, Nil) => true
      case (_,Nil) => false
      case (Nil,_) => false
      case (x :: xs, y :: ys) => if(x == y) auxpal(xs,ys) else false
    }

    auxpal(l,aux)
    */
  }

}
