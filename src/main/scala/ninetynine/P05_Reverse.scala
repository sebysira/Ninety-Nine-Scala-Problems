/**
 * Reverse a list.
 */
object P05_Reverse {
  def main(args: Array[String]) {

    val l = List(1, 1, 2, 3, 5, 8)
    val res = reverse(l)
    val res2 = reverse2(l)
    println(res)
    println(res2)

  }

  def reverse[A](l:List[A]):List[A] = l match {
    case Nil => Nil
    case x :: xs => reverse(xs) :+ x

  }

  def reverse2[A](l:List[A]):List[A] = {
    def auxrev(lres:List[A],lcur:List[A]):List[A] = lcur match {

      case Nil => lres
      case x :: xs => auxrev(x :: lres, xs)
    }
    auxrev(Nil,l)
  }

}
