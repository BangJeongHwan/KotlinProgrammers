package D_20220925

sealed class Expr1 {
    class Num(val value: Int) : Expr1()
    class Sum(val left: Expr1, val right: Expr1) : Expr1()
}

fun eval(e: Expr1): Int =
    when (e) {
        is Expr1.Num -> e.value
        is Expr1.Sum -> eval(e.left) + eval(e.right)
    }
