package D_20230108

class S_12918 {
    companion object {
        fun solution(s: String): Boolean = try {
            s.toInt()
            when(s.length){
                4 -> true
                6 -> true
                else -> false
            }
        } catch (e: Exception){
            false
        }

        fun solution1(s: String): Boolean =
            (s.length == 4 || s.length == 6) && s.toIntOrNull() != null
    }
}

fun main() {
    println(S_12918.solution1("a234"))
    println(S_12918.solution1("1234"))
    println(S_12918.solution1("12344"))
}