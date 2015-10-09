/**
 * Created by seby on 09/10/15.
 */
object P09_Pack {

  def main(args: Array[String]) {

    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val res = pack(l)
    println(res)
  }

  def pack[A](l:List[A]):List[Any] = {

    if (l.isEmpty)
      List(List())
    else{
      val (p,np) = l.span( _ == l.head)
      if (np.isEmpty)
        List(p)
      else
        p :: pack(np)
    }

  }

}
