/**
 * Duplicate the elements of a list.
 */
object P14_Duplicate {

  def main(args: Array[String]) {
    val l = List('a, 'b, 'c, 'c, 'd)
    val res = duplicate(l)
    println(res)

  }

  def duplicate[A](l:List[A]):List[A] = {

    if (l.isEmpty){
      Nil
    }
    else{
      l.flatMap(e => List.fill(2)(e) )
    }

  }

}
