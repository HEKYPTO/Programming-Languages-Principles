



object Question6 {
/*<script>*/object Question6 {

    def myFilter(f:Int=>Boolean)(list:List[Int]): List[Int] = {
        if (list.isEmpty) return Nil
        else if (f(list.head)) return list.head :: myFilter(f)(list.tail)
        return myFilter(f)(list.tail)
    }

    def main(args:Array[String]): Unit = {
        println(myFilter((x: Int) => x % 2 == 0)(List(1, 2, 3, 4, 5, 6)))
    }
}/*</script>*/ /*<generated>*/
def args = Question6_sc.args$
  /*</generated>*/
}

object Question6_sc {
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
    Question6.hashCode() // hasCode to clear scalac warning about pure expression in statement position
  }
}

