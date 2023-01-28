package D_20221101

class KotlinInAction_9_3 {
    companion object {
        fun addAnswer(list: MutableList<Any>){
            list.add(42)
        }
        fun addAnswerList(list: List<Any>){
            println(list.toString())
        }
    }
}

fun main() {
    val strings = mutableListOf("abc", "def")
//    KotlinInAction_9_3.addAnswer(strings)

    KotlinInAction_9_3.addAnswerList(listOf("abc", "def"))

    val anyComparator = Comparator<Any> {
        e1, e2 -> e1.hashCode() - e2.hashCode()
    }
    val strings1: List<String> = listOf("다","가","나")
    println(strings1.sortedWith(anyComparator))

    val list: MutableList<Any?> = mutableListOf("12",2,'c')
    val unkown: MutableList<*> = list
//    unkown.add(1)

}