case class Person(name: String, age: Int, phone: String)

def convert (map:Map[Int, Tuple3[String, Int, String]]):List[Person] = {
  var res: List[Person] = List(Person(map.head._2._1, map.head._2._2, map.head._2._3))
  map.drop(1).foreach(p => {
    res = Person(p._2._1, p._2._2, p._2._3) :: res
  })
  return res
}

convert(Map(0 -> Tuple3("Андрей", 30, "+79998527412"), 3 -> Tuple3("Анна", 20, "+78005553535"),1-> Tuple3("Елена", 40, "+78951022050")))
