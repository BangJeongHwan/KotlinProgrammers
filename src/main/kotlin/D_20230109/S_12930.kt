package D_20230109

class S_12930 {
    companion object {
        fun solution(s: String): String {
            return s.split(" ").joinToString(" ") {
                it.indices.map { str -> if (str % 2 == 0) it[str].uppercaseChar() else it[str] }.joinToString("")
            }
        }
    }
}

fun main() {
    println(S_12930.solution(" try  hello   world"))
}