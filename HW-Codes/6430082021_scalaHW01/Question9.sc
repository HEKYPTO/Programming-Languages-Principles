object Question9 {
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
}