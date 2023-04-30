



object Question2 {
/*<script>*/object Question2 {
    def insertInOrder(x:Int, list:List[Int]): List[Int] = {
        if (list.isEmpty || list.head > x) return x :: list
        return list.head :: insertInOrder(x, list.tail) 
    }

    def main(args: Array[String]): Unit = {
        var l = List.range(1, 5).map((x: Int) => x * 2)
        println(l)
        println(insertInOrder(5, l))
        println(insertInOrder(0, l))
        println(insertInOrder(11, l))
        println(insertInOrder(4, l))
    }
}/*</script>*/ /*<generated>*/
def args = Question2_sc.args$
  /*</generated>*/
}

object Question2_sc {
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
    Question2.hashCode() // hasCode to clear scalac warning about pure expression in statement position
  }
}

