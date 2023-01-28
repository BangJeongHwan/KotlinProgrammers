package D_20230102

class S_12948 {
    companion object {
        fun solution(phone_number: String): String {
            var answer = ""
            val length = phone_number.length
            for (i in 1..length-4) {
                answer += "*"
            }
            return answer + phone_number.subSequence(length-4, length)
        }

        fun solution1(phone_number: String): String {
            return "".padStart(phone_number.length-4,'*') + phone_number.takeLast(4)
        }
    }
}

fun main() {
    println(S_12948.solution1("01033334444"))
    println(S_12948.solution1("027778888"))
    println(S_12948.solution1("8888"))
}