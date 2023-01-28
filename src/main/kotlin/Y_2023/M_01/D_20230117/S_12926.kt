package D_20230117

class S_12926 {
    companion object {
        fun solution(s: String, n: Int): String {
            return s.toCharArray().indices.map {
                if(s[it] in 'A'..'Z'){
                    checkUpperEnd(s[it], n)
                }else if(s[it] in 'a'..'z') {
                    checkLowerEnd(s[it], n)
                }else {
                    ' '
                }
            }.joinToString("")
        }

        private fun checkLowerEnd(char: Char, cnt: Int): Char{
            return if(char+cnt > 'z'){
                checkLowerEnd('a' ,char+cnt-'z'-1)
            }else {
                char+cnt
            }
        }

        private fun checkUpperEnd(char: Char, cnt: Int): Char{
            return if(char+cnt > 'Z'){
                checkUpperEnd('A' ,char+cnt-'Z'-1)
            }else {
                char+cnt
            }
        }

        fun solution1(s: String, n: Int): String {
            return s.map {
                when {
                    it.isLowerCase() -> 'a' + (it + n - 'a') % 26
                    it.isUpperCase() -> 'A' + (it + n - 'A') % 26
                    else -> ' '
                }
            }.joinToString("")
        }
    }
}

// 89 + 5 = 94 / 94-90 = 4

/*
s	n	result
"AB"	1	"BC"
"z"	1	"a"
"a B z"	4	"e F d"
 */
fun main() {
    println(S_12926.solution1("AB", 1))
    println(S_12926.solution1("z", 1))
    println(S_12926.solution1("a B z", 4))
    println(S_12926.solution1("P", 15))  // E
}