package D_20220918

/**
 * int -> String
 */
fun solution(n: Int): Int {
    var answer = 0
    val array = n.toString().split("")
    for(i in 1..array.size-2)
        answer = answer.plus(Integer.parseInt(array[i]))
    return answer
}

/**
 * 나머지 몫
 */
fun solution1(n: Int): Int {
    var input = n
    var answer = 0

    while(input!=0){
        answer += input%10
        input = input/10
    }

    return answer
}

fun main(args: Array<String>){
//    println(solution(123))
//    println(solution1(123))
}