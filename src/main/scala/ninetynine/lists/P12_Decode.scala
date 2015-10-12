/**
 * Decode a run-length encoded list.
 */
object P12_Decode {

  def main(args: Array[String]) {
    val l = List(('a, 4), ('b, 1), ('c, 2), ('a, 2), ('d, 1), ('e, 4))
    val res = decode(l)
    println(res)

  }

  def decode[A](l:List[(A,Int)]):List[A] = {

    if (l.isEmpty)
      Nil
    else {
      l.flatMap(e => List.fill(e._2)(e._1))
    }
  }
}
