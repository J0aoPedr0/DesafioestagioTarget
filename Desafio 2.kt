/*
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
 ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.


IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código

*/

fun verificarFibonacci(numero: Int): Boolean {
    var n1 = 0
    var n2 = 1

    while (n2 < numero) {
        val soma = n1 + n2
        n1 = n2
        n2 = soma

        if (soma == numero) {
            return true
        }
    }
    return false
}
fun main() {
    val numero = 8

    if (verificarFibonacci(numero)) {
        println("O $numero pertence a sequência de Fibonacci")
    } else {
        println("O $numero não pertence a sequência de Fibonacci")
    }
}