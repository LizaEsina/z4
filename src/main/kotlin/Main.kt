// Создать приложение, с помощью которого пользователь, введя два числа и символ операции, узнает результат.
// Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание.
// Числа могут быть вещественными.
// Числа и знак операции разделяются между собой одним пробелом.
//  Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ
fun main() {
    println("Результат вычисления: " + z4(readln()))
}
fun z4(string: String): Float {
    var num1Str = ""
    var num2Str = ""
    var op = ' '
    var isNum1 = true

    for (char in string.replace(" ", "")) {
        if (char.isDigit() || char == '.') {
            if (isNum1) {
                num1Str += char
            } else {
                num2Str += char
            }
        } else if (char in setOf('+', '-', '*', '/')) {
            op = char
            isNum1 = false
        }
    }

    val num1 = num1Str.toFloat()
    val num2 = num2Str.toFloat()

    return when (op) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2
        else -> 0.0f
    }
}