package D_20221004

import D_20220925.Person
import java.io.File

data class Person1(val name: String, val age: Int)

// 5.5.2
fun alphabet5() = buildString {
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNOW I know the alphabet")
}

fun alphabet4() = StringBuilder().apply{
    for (letter in 'A'..'Z'){
        append(letter)
    }

    append("\nNOW I know the alphabet")
}.toString()

// 5.5.1
fun alphabet3(): String{
    return with(StringBuilder()){
        for (letter in 'A'..'Z'){
            append(letter)
        }
        append("\nNOW I know the alphabet")
        toString()
    }
}

fun alphabet2(): String{
    val stringBuilder = StringBuilder()
    return with(stringBuilder){
        for (letter in 'A'..'Z'){
            this.append(letter)
        }
        this.append("\nNOW I know the alphabet")
        this.toString()
    }
}

fun alphabet(): String{
    val result = StringBuilder()
    for (letter in 'A'..'Z'){
        result.append(letter)
    }
    result.append("\nNOW I know the alphabet")
    return result.toString()
}


fun main(){
    // 5.5.2
    println(alphabet4())

    println("------------------------------")
    // 5.5.1
    println(alphabet3())
    println(alphabet2())
    println(alphabet())

    println("------------------------------")

    // 5.3
    fun File.isInsideHiddenDirectory() =
        generateSequence(this) {it.parentFile}.any { it.isHidden }

    val file = File("/Users/bangjeonghwan/IdeaProjects/.hidden/a.txt")
    println(file.isInsideHiddenDirectory())

    println("================================")

    val naturalNumbers = generateSequence(0) {it+1}
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum()) // 모든 지연 연산은 sum의 결를 계산할 때 수행됨

    println("================================")

    val person = listOf(
        Person("Alice",29),
        Person("Bob", 31),
        Person("Charles", 31),
        Person("Dan", 21)
    )
    // map -> filter
    println(person.asSequence().map(Person::name).filter { it.length < 4 }.toList())
    // filter -> map
    println(person.asSequence().filter { it.name.length < 4 }.map(Person::name).toList())


    println("================================")

    println(listOf(1,2,3,4).asSequence()
        .map { it*it }.find { it>3 })

    println("================================")
    listOf(1,2,3,4).asSequence()
        .map { print("map($it)"); it*it }
        .filter { print("filter($it)"); it%2 == 0 }

    listOf(1,2,3,4).asSequence()
        .map { print("map($it)"); it*it }
        .filter { print("filter($it)"); it%2 == 0 }
        .toList()

    println("================================")
    val people = listOf(
        Person1("brett",12),
        Person1("A_bang", 14)
    )

    // 일반적인
    println(people.map(Person1::name).filter { it.startsWith("A") })

    // sequence 사용
    println(people.asSequence().map(Person1::name).filter { it.startsWith("A") }.toList())

}