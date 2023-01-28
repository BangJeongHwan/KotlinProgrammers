package D_20230124

class S_12915 {
    companion object {
        fun solution(strings: Array<String>, n: Int): Array<String> {
            val message = strings.sortedArrayWith { a1, a2 ->
                a1.zip(a2).let {
                    if(a1[n] - a2[n] == 0) a1.compareTo(a2)
                    else a1[n] - a2[n]
                }
            }
            return message.toList().toTypedArray()
        }

        fun solution1(strings: Array<String>, n: Int): Array<String> {
            return strings.sortedWith(compareBy( {it[n]}, {it} ) ).toTypedArray()
        }

        fun solution2(strings: Array<String>, n: Int): Array<String> {
            return strings.also {
                it.sortedBy { it[n] }
                it.sort()
            }
        }
    }
}

fun main() {
    println(S_12915.solution1(arrayOf("sun", "bed", "car"),1).contentToString()) // [car, bed, sun]
    println(S_12915.solution2(arrayOf("abce", "abcd", "cdx"),2).contentToString()) // [abcd, abce, cdx]
}