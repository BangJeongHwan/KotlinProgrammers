package D_20220925

import D_20220921.Button

data class Person (val name: String, val age: Int)

fun findTheOldest(people: List<Person>){
    var maxAge = 0
    var theOldest: Person? = null

    for(person in people){
        if(person.age > maxAge){
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun printMessageWithPrefix(messages: Collection<String>, prefix: String){
    messages.forEach { // 각 원소에서 대해 수행할 작업을 람다로 받는다.
        println("$prefix $it")
    }
}

fun printProblemCount(response: Collection<String>){
    var clientErrors = 0
    var serverErrors = 0
    response.forEach {
        if(it.startsWith("4")){
            clientErrors++
        }else if(it.startsWith("5")){
            serverErrors++
        }
    }
    println("$clientErrors client error, $serverErrors server error")
}

fun tryToButtonClick(button: Button3): Int{
    var clicks = 0
    button.click(clicks++)
    return clicks
}


class Button3 {
    fun click(clickCount: Int) = println("Button3 click count : $clickCount")
}


var clicks = 0
fun tryToButtonClick1(button: Button3): Int{
    button.click(clicks++)
    return clicks
}

fun main() {
    // 1.5
    val createPerson = ::Person
    val p = createPerson("brett", 31)
    println(p)

    // 1.4
    println(tryToButtonClick1(Button3()))
    println(tryToButtonClick(Button3()))

    val errors1 = listOf("200 Ok", "4xx eeee", "5xx bad")
    printProblemCount(errors1)

    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessageWithPrefix(errors, "Error: ")

    // 1.3
    val sum = { x: Int, y: Int -> x+y }
    println(sum(1,2))

    run { println(43) }

    val people1 = listOf(Person("Alice",29), Person("Bob", 31))
    people1.maxBy ({ p: Person -> p.age })

    people1.maxBy () { p: Person -> p.age }

    val people2 = listOf(Person("이몽룡",29), Person("성춘향", 31))
    val names = people2.joinToString(separator = " ", transform = {p: Person -> p.name})
    println(names)
    val names1 = people2.joinToString(separator = " ") {p: Person -> p.name}
    println(names1)

    val sum1 = {x: Int, y: Int ->
        println("Computing the sum of $x + $y")
        x+y
    }
    println(sum1(1,2))


    // 1.2
    val people = listOf(Person("Alice",29), Person("Bob", 31))

    // 직접 검색
//    println(findTheOldest(people))

    // 람다 사용
//    println(people.maxBy { it.age })

    // 멤버 참조
//    println(people.maxBy(Person::age))

}
