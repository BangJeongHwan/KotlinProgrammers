package D_20221005

import java.lang.StringBuilder

class S_12933 {
    companion object {
        fun solution(n: Long): Long {
            var num = n
            var numList = mutableListOf<Long>()

            var i = 0
            while(num > 0){
                numList.add(num%10)
                num /= 10
            }
            val reversedList = numList.sorted().reversed().toList()

            var result = StringBuilder()

            for(i in 0..reversedList.size-1){
                result.append(reversedList[i])
            }

            return result.toString().toLong()
        }

        // Long -> String -> CharArray -> sortedArrayDescending -> String -> Long
        fun solution1(n: Long): Long = String(n.toString().toCharArray().sortedArrayDescending()).toLong()

    }
}

fun main() {
    println(S_12933.solution(118372))
    println(S_12933.solution1(118372))
}