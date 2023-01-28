package D_20230128

class S_147355 {
    companion object {
        fun solution(t: String, p: String): Int {
            var list = mutableListOf<Long>()
            for(i in 0..t.length-p.length){
                val subStr = t.substring(i, i+p.length)
                list.add(subStr.toLong())
            }
            return list.count { it <= p.toLong() }
        }

        fun solution1(t: String, p: String): Int {
            return (0..t.length-p.length)
                .map { t.substring(it until it+p.length) }
                .count { it <= p }
        }
    }
}

fun main() {
    println(S_147355.solution1("3141592","271")) // 2
    println(S_147355.solution1("500220839878","7"))  // 8
    println(S_147355.solution1("10203","15"))  // 3
}