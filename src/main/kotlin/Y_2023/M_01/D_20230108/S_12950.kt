package D_20230108

class S_12950 {
    companion object {
        fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
            var result = Array(arr1.size) { intArrayOf() }
            for (i in arr1.indices) {
                val array = IntArray(arr1[0].size)
                for (j in arr1[0].indices){
                    val sum = arr1[i][j] + arr2[i][j]
                    array[j] = sum
                }
                result[i] = array
            }
            return result
        }

        fun solution1(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> =
            Array(arr1.size) {
                row ->
                IntArray(arr1[0].size) {
                    col ->
                    arr1[row][col] + arr2[row][col]
                }
            }
    }
}

fun main() {
    println(
        S_12950.solution1(
            arrayOf(
                intArrayOf(1,2),intArrayOf(2,3)
            ),
            arrayOf(
                intArrayOf(3,4),intArrayOf(5,6)
            ),
        ).forEach { println(it.contentToString()) }
    )
}