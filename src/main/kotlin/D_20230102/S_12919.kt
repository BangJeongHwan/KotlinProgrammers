package D_20230102

class S_12919 {
    companion object {
        fun solution(seoul: Array<String>): String = "김서방은 ${seoul.indexOf("Kim")}에 있다."
    }
}

fun main() {
    println(S_12919.solution(arrayOf("Jane", "Kim")))
}