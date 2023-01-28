package D_20221005

class S_12912 {
    companion object{
        fun solution(a: Int, b: Int): Long {
            var answer: Long = 0

            if(a==b) return a.toLong()
            if(a<b){
                for (i in a..b){
                    answer += i
                }
            }else{
                for(i in b..a){
                    answer += i
                }
            }

            return answer
        }
    }
}

fun main() {
    println(S_12912.solution(3,5))
}