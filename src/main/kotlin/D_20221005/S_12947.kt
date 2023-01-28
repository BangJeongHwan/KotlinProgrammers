package D_20221005

class S_12947 {
    companion object{
        fun solution(x: Int): Boolean {
            var answer = true
            var xInt = x
            var sum = 0
            while(xInt/10 > 0){
                sum += xInt%10
                xInt = xInt/10
            }
            sum += xInt%10

            if(x%sum != 0){
                answer = false
            }

            return answer
        }

        fun solution1(x: Int): Boolean {
            var num = x
            var sum = 0

            while(num > 0) {
                sum += num%10
                num /= 10
            }

            return (x%sum == 0)
        }

        fun solution2(x: Int): Boolean {
            var sum = x.toString().map { it.toString().toInt() }.sum()
            return (x%sum == 0)
        }

        fun solution3(x: Int): Boolean {
            val sum = x.toString().fold(0) { total , acc -> total + acc.toString().toInt()}
            return (x%sum == 0)
        }
    }

}

fun main() {
    println(S_12947.solution1(10))
    println(S_12947.solution1(11))
    println(S_12947.solution1(12))
    println(S_12947.solution1(13))


    println(S_12947.solution2(10))
    println(S_12947.solution2(11))
    println(S_12947.solution2(12))
    println(S_12947.solution2(13))
}