/**
 * Find the number of elements of a list.
 */
object P04_Length {

  def main(args: Array[String]) {

    val l = List(1, 1, 2, 3, 5, 8)
    val res =length(l)
    val res2 = length2(l)
    println(res)
    println(res2)
  }

  def length[A](l:List[A]):Int = l match {

    case Nil => 0
    case _ :: xs => 1 + length(xs)

  }

  def length2[A](l:List[A]):Int = {
    def auxlen(n:Int,l:List[A]):Int = l match {

      case Nil => n
      case _ :: xs => auxlen(n+1,xs)
    }
    auxlen(0,l)
  }


}
