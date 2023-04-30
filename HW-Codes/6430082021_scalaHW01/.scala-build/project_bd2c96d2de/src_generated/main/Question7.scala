



object Question7 {
/*<script>*/object Question7 {
    def myMap(f:Int=>Int)(list:List[Int]):List[Int] = {
        if (list.isEmpty) return Nil
        return f(list.head) :: myMap(f)(list.tail)
    }

    def main(args: Array[String]):Unit = {
        println(myMap((x: Int) => x * 2)(List(1, 2, 3, 4, 5, 6)))
    }
}/*</script>*/ /*<generated>*/
def args = Question7_sc.args$
  /*</generated>*/
}

object Question7_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }
  def main(args: Array[String]): Unit = {
    args$set(args)
    Question7.hashCode() // hasCode to clear scalac warning about pure expression in statement position
  }
}

