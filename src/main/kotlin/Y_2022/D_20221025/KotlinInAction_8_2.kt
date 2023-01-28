package D_20221025

import java.lang.StringBuilder
import java.util.concurrent.locks.Lock

inline fun <T> synchronized(lock: Lock, action: () -> T) : T {
    lock.lock()
    try {
        return action()
    }
    finally {
        lock.unlock()
    }
}

class KotlinInAction_8_2 {
    companion object{
        fun twoAndThree(operation: (Int, Int) -> Int) {
            val result = operation(2, 3)
            println("The result is $result")
        }
        fun foo(callback: (()-> Unit)?){
            callback?.invoke()
        }
    }
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for(index in 0 until this.length){
        val element = get(index)
        if(predicate(element)) sb.append(element)
    }
    return sb.toString()
}

fun main() {
    KotlinInAction_8_2.twoAndThree { a, b -> a+b }
    KotlinInAction_8_2.twoAndThree { c, d -> c*d }
    KotlinInAction_8_2.foo { null }
    KotlinInAction_8_2.foo { println("test") }
}