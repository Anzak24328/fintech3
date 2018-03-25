case class Person(name: String, age: Int, phone: String)

val input : Map[Int, Tuple3[String, Int, String]] = Map(1 -> Tuple3("Томат", 2, "Чебупель"), 2-> Tuple3("Пельмень", 3, "Чебупель") )

def convert (map:Map[Int, Tuple3[String, Int, String]]):List[Person] = {
  var res: List[Person] = null
  map.foreach(p => {
    res = new Person(p._2._1,p._2._2,p._2._3) :: res
  })
  null
}

convert(input)
