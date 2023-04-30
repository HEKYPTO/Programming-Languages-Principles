



object Question9 {
/*<script>*/object Question9 {
    def turingStep(f:Char => Char, tape:List[Char], n:Int): List[Char] = {
        if (n == 0) return tape
        return f(tape.head) :: turingStep(f, tape.tail, if (n > tape.length) tape.length - 1 else n - 1)
    }

    def main(args: Array[String]): Unit = {
        var tape = List('C', 'H', 'A', 'R')
        var f1 = (c: Char) => c.toLower
        println(turingStep(f1,tape,2)) 
        println(turingStep(f1,tape,3)) 
        println(turingStep(f1,tape,0))
        println(turingStep(f1,tape,5))
    }
}/*</script>*/ /*<generated>*/
def args = Question9_sc.args$
  /*</generated>*/
}

object Question9_sc {
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
    Question9.hashCode() // hasCode to clear scalac warning about pure expression in statement position
  }
}

