package D_20230103

class S_12910 {
    companion object {
        fun solution(arr: IntArray, divisor: Int): IntArray =
            if (arr.filter { it%divisor == 0 }.toIntArray().isEmpty()) {
                intArrayOf(-1)
            } else {
                arr.filter { it%divisor == 0 }.sorted().toIntArray()
            }
    }
}

fun main() {
    println(S_12910.solution(intArrayOf(5, 9, 7, 10), 5).toList())
    println(S_12910.solution(intArrayOf(52, 36, 1, 3), 1).toList())
    println(S_12910.solution(intArrayOf(3,2,6), 10).toList())
}