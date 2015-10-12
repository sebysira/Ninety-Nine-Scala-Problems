/**
 * Created by seby on 09/10/15.
 */
object P07_Flatten {
  def main(args: Array[String]) {
    val l = List(List(1, 1), 2, List(3, List(5, 8)))
    val res = flatten(l)
    println(res)

  }

  def flatten(l:List[Any]):List[Any] =  {

    l.flatMap(
    {
      case xs: List[_] => flatten(xs)
      case x => List(x)
    }
    )
  }

}
