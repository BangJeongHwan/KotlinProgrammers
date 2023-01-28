package D_20230103

class S_12935 {
    companion object {
        fun solution(arr: IntArray): IntArray =
            if(arr.size == 1) {
                intArrayOf(-1)
            } else {
                val list = arr.toMutableList()
                list.remove(arr.sortedArrayDescending().takeLast(1).first())
                list.toIntArray()
            }

        fun solution1(arr: IntArray): IntArray =
            if(arr.size == 1) {
                intArrayOf(-1)
            } else {
                arr.filter { it != arr.min() }.toIntArray()
            }
    }
}

fun main() {
    println(S_12935.solution1(intArrayOf(4,3,2,1)).toList())
    println(S_12935.solution1(intArrayOf(3,4,2,1)).toList())
    println(S_12935.solution1(intArrayOf(10)).toList())
}