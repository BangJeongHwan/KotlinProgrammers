package D_20221005

/*
1-1. 입력된 수가 짝수라면 2로 나눕니다.
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.

단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환

 */
class S_12943 {
    companion object{
        fun solution(num: Int): Int {

            var input = num
            var maxCount = 0
            while(input!=1){
                if(input==1){
                    return 0
                }else if(maxCount==500){
                    return -1
                }else if(input%2==0){   // 짝수
                    input /= 2
                }else if(input%2==1){   // 홀수
                    input = input*3+1
                }
                maxCount++
            }

            return maxCount
        }
    }
}

fun main() {
    println(S_12943.solution(6))
}