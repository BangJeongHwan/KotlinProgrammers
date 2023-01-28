package D_20230104

class S_12922 {
    companion object {
        fun solution(n: Int): String {
            var answer = ""
            for(i in 1..n/2){
                answer += "수박"
            }
            if(n%2 == 1) answer += "수"
            return answer
        }

        fun solution1(n: Int): String =
            String(CharArray(n) { i -> if (i % 2 == 0) '수' else '박' })

    }
}

fun main() {
    println(S_12922.solution1(3))
    println(S_12922.solution1(4))
//    println()
    println(S_12922.solution1(1))
}