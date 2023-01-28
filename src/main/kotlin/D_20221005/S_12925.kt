package D_20221005

class S_12925 {
    companion object {
        fun solution(s: String): Int = when (s.first()){
                '+' -> s.substringAfter(s.first()).toInt()
                '-' -> 0 - s.substringAfter(s.first()).toInt()
                else -> s.toInt()
        }

        fun solution1(s: String): Int {
            return s.toInt()
        }
    }
}

fun main() {
    println(S_12925.solution("-123"))
    println(S_12925.solution("+123"))
    println(S_12925.solution("123"))

    println(S_12925.solution1("-123"))
    println(S_12925.solution1("+123"))
    println(S_12925.solution1("123"))
}