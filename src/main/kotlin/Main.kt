fun main() {
 val result = evenIndices(listOf("a","b","c","d","e","f","g","h","i","j"))
    println(result)
   val women = People(listOf(1.23,2.45,3.68,9.27))
  println(women.avg())
    println(women.add())
    val equal = Persona()
    println(equal)






}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun evenIndices(nums:List<String>):List<String>{
    val evens = mutableListOf<String>()
    for (e in nums.indices step 2)
        evens.add(nums[e])
    return evens
}


//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

class People(var height:List<Double>){
    fun avg():Double{
        return height.average()
    }
    fun add():Double{
        return height.sum()
    }
}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

 class Persona(var name:String,var age:Int,var height:Double,var weight:Double){
    var beings = listOf(
            Person("Joan",23,168.3,63.5),
            Person("Kairo",32,172.7,62.8),
            Person("Ian",35,185.2,70.3)
    )
    var sorts = beings.sortedByDescending { being -> being.age}
}

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
 class Person(var name:String,var age:Int,var height:Double,var weight:Double) {
    fun humans() {
        var beings = mutableListOf(
                Person("Joan", 23, 168.3, 63.5),
                Person("Kairo", 32, 172.7, 62.8),
                Person("Ian", 35, 185.2, 70.3)
        )
        var beings.add(
                listOf<Any>(
                        Person("Ann",31,142.3,54.2),
                        Person("Joy",24,125.6,48)

                )
        )


    }
}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

class Car (var register:String,var mileage:Int){
    fun avgMileage():Double {

        var vehicles = listOf(
                Car("KBN 132H", 2500),
                Car("KAS 298R", 3400),
                Car("KNA 212R", 2100)
        )

        val miles = vehicles.sortedByDescending { product -> product.mileage}
    }
}

