package D_20220923

import java.util.*

class S_12932 {
    companion object{
        fun solution(n: Long): IntArray {

            val nstr = n.toString().split("")
            var answer = IntArray(nstr.size-2)

            var index = 0
            for (i in nstr.size-2 downTo 1){
                answer[index++] = Integer.valueOf(nstr[i])
            }

            return answer
        }

        /**
         * reversed 배열을 뒤집은 후 새로운 객체에 할당하는 List 반환형 함수
         */
        fun solution1(n: Long): IntArray =  n.toString().reversed().map { it.toString().toInt() }.toIntArray()
    }
}

fun main() {
    /**
     * Arrays.toString 배열을 출력한다.
     */
    println(Arrays.toString(S_12932.solution(12345)))
    println(Arrays.toString(S_12932.solution1(12345)))
}