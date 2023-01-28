package D_20220921

open class View {
    open fun click() = println("View clicked")
}

open class Button: View() { // Button은 View를 확장한다
    override fun click() = println("Button clicked")
}

class Button2: Button() { // Button은 View를 확장한다
    override fun click() = println("Button2 clicked")
}

fun main(args: Array<String>){
//    val view: View = Button2()
//    println(view.click())

//    val array = arrayOf(1,2,3)
//    val list = listOf("12", *array)
//    println(list)

//    val map = mapOf(1 to "one", 7 to "seven")
//    val (number, name) = 1 to "one"
//    println(number)
//    println(name)

    println("ddddd.aaaa-x".split(".","-"))
}