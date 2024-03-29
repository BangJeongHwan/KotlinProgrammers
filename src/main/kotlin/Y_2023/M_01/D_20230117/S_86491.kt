package D_20230117

class S_86491 {
    companion object {
        fun solution(sizes: Array<IntArray>): Int {
//            println(sizes.map { it.sorted().last() }.sorted().last())
//            println(sizes.map { it.minOf { it } }.sorted().last())
            return sizes.map { it.sorted().last() }.sorted().last() * sizes.map { it.minOf { it } }.sorted().last()
        }

        fun solution1(sizes: Array<IntArray>): Int {
            return sizes.map { it.maxOrNull()!! }.maxOrNull()!! * sizes.map { it.minOrNull()!! }.maxOrNull()!!
        }
    }
}
/*
sizes	result
[[60, 50], [30, 70], [60, 30], [80, 40]]	4000
[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133
 */
fun main() {
    println(
        S_86491.solution1(
            arrayOf(
                intArrayOf(60, 50),
                intArrayOf(30, 70),
                intArrayOf(60, 30),
                intArrayOf(80, 40)
            )
        )
    )
    println(
        S_86491.solution1(
            arrayOf(
                intArrayOf(10, 7),
                intArrayOf(12, 3),
                intArrayOf(8, 15),
                intArrayOf(14, 7),
                intArrayOf(5, 15)
            )
        )
    )
    println(
        S_86491.solution1(
            arrayOf(
                intArrayOf(14, 4),
                intArrayOf(19, 6),
                intArrayOf(6, 16),
                intArrayOf(18, 7),
                intArrayOf(7, 11)
            )
        )
    )
}