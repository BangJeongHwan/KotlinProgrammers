package D_20220925

/**
 * constructor 사용
 */
class User constructor(_nickname: String){
    val nickname: String

    init {
        nickname = _nickname
    }
}

/**
 * constructor 생략
 */
class User1(_nickname: String){
    val nickname = _nickname
}

class User2(val nickname: String)