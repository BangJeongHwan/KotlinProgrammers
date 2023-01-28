package D_20220925

class Book(val title: String, val authors: List<String>)

fun main(){
    run { println(43) }
    // 5.4
    val books = listOf(
        Book("A_B", listOf("aaa")),
        Book("B_B", listOf("bbb")),
        Book("C_B", listOf("aaa","bbb"))
    )
    println(books.flatMap { it.authors }.toSet())

    val strings = listOf("abc","def")
    println(strings.flatMap { it.toList() })

    // 5.3
    val person6 = listOf(Person("Alice",27), Person("Bob", 31), Person("Carol", 31))
    println(person6.groupBy { it.age })


    // 5.2
    val canBeIn27_2 = {p: Person -> p.age>27}
    val person5 = listOf(Person("Alice",27), Person("Bob", 31))
    println(person5.find(canBeIn27_2))

    val canBeIn27_1 = {p: Person -> p.age>27}
    val person4 = listOf(Person("Alice",27), Person("Bob", 31))
    println(person4.count(canBeIn27_1))
    println(person4.filter(canBeIn27_1).size)


    var list2 = listOf(1,2,3,4)
    println(!list2.all { it == 3 }) // -> any를 사용하는게 낫다
    println(list2.any { it != 3 }) // -> 술어를 부정해야 함

    val canBeIn27 = {p: Person -> p.age>27}
    val person3 = listOf(Person("Alice",27), Person("Bob", 31))
    println(person3.all(canBeIn27))
    println(person3.any(canBeIn27))


    // 5.1
    // filter & map
    val person2 = listOf(Person("Alice",29), Person("Bob", 31))
    println(person2.filter { it.age>30 }.map(Person::name))

    // map
    val person1 = listOf(Person("Alice",29), Person("Bob", 31))
    println(person1.map { it.name })
    println(person1.map(Person::name))

    val list1 = listOf(1,2,3,4)
    println(list1.map { it * it })


    // filter
    val person = listOf(Person("Alice",29), Person("Bob", 31))
    println(person.filter { it.age>30 })

    val list = listOf(1,2,3,4)
    println(list.filter { it % 2 == 0 })
}