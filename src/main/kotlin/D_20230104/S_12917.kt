package D_20230104

class S_12917 {
    companion object {
        fun solution(s: String): String =
            String(s.toCharArray().sortedArrayDescending())
    }
}

fun main() {
    println(S_12917.solution("Zbcdefg"))
}