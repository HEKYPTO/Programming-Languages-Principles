object Question1 {
    def insertATPosition(x: Any, pos: Int, l:List[Any]) : List[Any] = {
        if (pos == 0) return x :: l
        return l.head :: insertATPosition(x, pos - 1, l.tail)
    }
    def main(args: Array[String]): Unit = {
        var l = List.range(1, 10)
        println(insertATPosition(77, 9, l))
    }
}