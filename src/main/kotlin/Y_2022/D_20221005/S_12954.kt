package D_20221005

class S_12954 {
    companion object{
        // test case 13, 14 실패
        fun solution1(x: Int, n: Int): LongArray {
            var answer = LongArray(n)
            var start = x

            var count = 0
            while(count != n){
                answer.set(count,start.toLong())
                start += x
                count++
            }

            return answer
        }

        fun solution(x: Int, n: Int): LongArray {
            var answer = LongArray(n)
            var start = x.toLong()

            var count = 0
            while(count != n){
                answer.set(count,start)
                start += x
                count++
            }

            return answer
        }

        // it은 0부터 n-1까지 순차적으로 각 배열 요소에 대해 호출
        fun solution2(x: Int, n: Int): LongArray = LongArray(n) { x.toLong() * (it+1) }

    }
}

fun main() {
//    println(S_12954.solution(2,5).toList())
//    println(S_12954.solution(4,3).toList())
//    println(S_12954.solution(-4,2).toList())

    println(S_12954.solution2(-4,2).toList())
}