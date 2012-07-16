/**
 * Created with IntelliJ IDEA.
 * User: pabiswas
 * Date: 16/7/12
 * Time: 7:24 PM
 * To change this template use File | Settings | File Templates.
 */

package demo

fun String.hello()
{
    println("Hello $this")
}

fun sum(a: Int, b: Int) = println(a + b)

fun max(a: Int, b: Int) = if (a > b) a else b

fun main(args: Array<String>)
{
    println("Hello Kotlin !!")
    "World".hello()
    args filter { it.length() > 0} forEach{ println("hello $it") }

    sum(5, 6)

    var x = max(10,11)

    println(max(10,12))
}