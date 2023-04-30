object Question6 {

    def myFilter(f:Int=>Boolean)(list:List[Int]): List[Int] = {
        if (list.isEmpty) return Nil
        else if (f(list.head)) return list.head :: myFilter(f)(list.tail)
        return myFilter(f)(list.tail)
    }

    def main(args:Array[String]): Unit = {
        println(myFilter((x: Int) => x % 2 == 0)(List(1, 2, 3, 4, 5, 6)))
    }
}