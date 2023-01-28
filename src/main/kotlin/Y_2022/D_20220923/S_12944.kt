package D_20220923

import D_20220918.solution1

class S_12944 {
    companion object {

        fun solution(arr: IntArray): Double = arr.sum().toDouble()/arr.size

        /**
         * average() 평균값..
         */
        fun solution1(arr: IntArray): Double = arr.average()

    }
}

fun main() {
    println(S_12944.solution(intArrayOf(1,2,3,4)))
    println(S_12944.solution1(intArrayOf(1,2,3,4)))
}