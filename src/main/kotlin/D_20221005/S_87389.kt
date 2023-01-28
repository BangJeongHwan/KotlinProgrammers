package D_20221005

class S_87389 {
    companion object{
        fun solution(n: Int): Int {
            var x = 2;
            while(x!=n){
                if(n%x == 1){
                    return x
                }else{
                    x++
                }
            }
            return x
        }

        fun solution1(n: Int) = (1..n).first{ n%it == 1}
    }
}

fun main() {

    println(S_87389.solution(10))
    println(S_87389.solution(12))

    println(S_87389.solution1(10))
    println(S_87389.solution1(12))
}