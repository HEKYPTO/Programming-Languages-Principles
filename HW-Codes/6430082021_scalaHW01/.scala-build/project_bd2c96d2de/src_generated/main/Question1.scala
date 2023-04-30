



object Question1 {
/*<script>*/object Question1 {
    def insertATPosition(x: Any, pos: Int, l:List[Any]) : List[Any] = {
        if (pos == 0) return x :: l
        return l.head :: insertATPosition(x, pos - 1, l.tail)
    }
    def main(args: Array[String]): Unit = {
        var l = List.range(1, 10)
        println(insertATPosition(77, 9, l))
    }
}/*</script>*/ /*<generated>*/
def args = Question1_sc.args$
  /*</generated>*/
}

object Question1_sc {
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
    Question1.hashCode() // hasCode to clear scalac warning about pure expression in statement position
  }
}

