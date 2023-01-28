package D_20230109

class S_12940 {
    companion object {
        fun solution(n: Int, m: Int): IntArray = intArrayOf(gcd(n,m), lcm(n,m))

        fun lcm(n:Int, m:Int) = n * m / gcd(n, m)

        fun gcd(n:Int, m:Int):Int{
            return if(n < m){
                if(n == 0) m else gcd(n, m % n)
            }else{
                if(m == 0) n else gcd(m, n % m)
            }
        }
    }
}

fun main() {
    println(S_12940.solution(3, 12).contentToString())
    println(S_12940.solution(2, 5).contentToString())
}