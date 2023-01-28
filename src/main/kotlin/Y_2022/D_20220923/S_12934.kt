package D_20220923

import kotlin.math.pow
import kotlin.math.sqrt

class S_12934 {
    companion object{
        fun solution(n: Long): Long {
             if(Math.floor(sqrt(n.toDouble())) - sqrt(n.toDouble()) >= 0){
                return (sqrt(n.toDouble()).toInt()+1).toDouble().pow(2).toLong()
             }else{
                return -1
             }
        }

        fun solution1(n: Long): Long {
            val sqrt = sqrt(n.toDouble())
            if(sqrt % 1.0 == 0.0){
                return Math.pow(sqrt + 1, 2.0).toLong()
            }else{
                return -1
            }
        }
    }
}

fun main() {
    println(S_12934.solution(121))
    println(S_12934.solution(3))

    println("--------------")

    println(S_12934.solution1(121))
    println(S_12934.solution1(3))
}