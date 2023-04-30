object Question2 {
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
}