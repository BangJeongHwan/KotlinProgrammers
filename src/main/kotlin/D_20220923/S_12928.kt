package D_20220923

class S_12928{
    companion object {

        fun solution(n: Int): Int {
            var answer = 0
            for(i in 1..n) {
                if (n % i == 0) answer += i
            }
            return answer
        }

        /**
         * filter sum 사용
         */
        fun solution1(n: Int): Int {
            // 확장함수 사용
            return (1..n).filter { n % it == 0 }.sum()
        }

        /**
         * takeIf let 사용
         */
        fun solution2(n: Int): Int {
            var answer = 0
            for (i in 1..n) {
                (n % i).takeIf { it == 0 }?.let { answer += i }
            }
            return answer
        }
    }

}

fun main(args: Array<String>){
    println("solution")
//    println(S_12928.solution(5))
    println(S_12928.solution(12))   // 28
    println("solution1")
    println(S_12928.solution1(12))   //
     println("solution2")
    println(S_12928.solution2(12))   //
}