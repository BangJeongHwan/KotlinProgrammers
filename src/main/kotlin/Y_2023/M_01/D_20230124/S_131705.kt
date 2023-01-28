package D_20230124

class S_131705 {
    companion object {
        private var matchingCnt = 0

        fun solution(number: IntArray): Int {
            matchingCnt = 0
            for(i in number.indices){
                dfs(number, i, mutableListOf(i), 1)
            }
            return matchingCnt
        }

        private fun dfs(number: IntArray, index: Int, list: MutableList<Int>, cnt: Int){
            if(cnt == 3){
                checkZeroNumber(number, list)
                return
            }

            for(j in index+1 until number.size){
                list.add(j)
                dfs(number, j, list, cnt+1)
                list.remove(j)
            }
        }

        private fun checkZeroNumber(number: IntArray, list: List<Int>){
            if(list.sumOf { number[it] } == 0) matchingCnt++
        }

        fun solution2(number: IntArray): Int {
            var result = 0
            for((i, n) in number.withIndex()){
                for((j, m) in number.withIndex()){
                    for((k, l) in number.withIndex()){
                        if((i < j) && (j < k)) {
                            if(n + m + l == 0) result++
                        }
                    }
                }
            }
            return result
        }
    }
}

fun main() {
    println(S_131705.solution2(intArrayOf(-2, 3, 0, 2, -5))) // 0,2,3 / 1,3,4
//    println(S_131705.solution(intArrayOf(-3, -2, -1, 0, 1, 2, 3)))
//    println(S_131705.solution(intArrayOf(-1, 1, -1, 1)))
}