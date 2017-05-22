/**
 * Created by trent on 22/05/17.
 */

package my.hello.world


class T {
    var p: Int = 1
        get() = field?: this.p
        set(value) {
            this.p = value
        }
}

//Function syntax
fun sum(a: Int, b: Int): Int {
    return a + b;
}

//Single line expression
fun sum2(a: Int, b: Int): Int = a + b

//void return type is "Unit"
//also shows an template string
fun sum3(a: Int, b: Int): Unit = println("The sum of $a and $b is ${a + b}")

//Unit can be ommitted
fun sum4(a: Int, b: Int) = println("The sum of $a and $b is ${a + b}")

//vals - immutable
fun vals(): Unit {
    //explicit
    val x1: Int = 1
    //inferred type
    val x2 = 2
//    x2 = 3//not possible. Vals are read only
    //deferred assignment
    val x3: Int
    x3 = 5
    println("vals()")
    println(x1)
    println(x2)
    println(x3)
}

//vars - mutable
fun vars(): Unit {
    //explicit
    var x1: Int = 1
    //inferred type
    var x2 = 2
    x2 = 3//not possible. Vals are read only
    //deferred assignment
    var x3: Int
    x3 = 5
    println("vars()")
    println(x1)
    println(x2)
    println(x3)
}

fun vars2(){
    println("vars2")
    //? means the value must be initialised
    var simple: Int?
//    println(simple) //error because the value hasn't yet been initialised
    simple = 2

    println(simple)

    val simpl2: Int = 55

    println(simpl2)

}

fun main(args: Array<String>){
    //Print from the kotlin standard library
    //See here: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.io/println.html
    println("Hello, World!")
    //..or using the familiar Java API call
    System.out.println("Hello, World! (for the second time)")

    println("The sum of 2 and 3 is: " + sum(2,3))
    println("The sum2 of 2 and 3 is: " + sum2(2,3))

    sum3(3,4)

    vals()
    vars()
    vars2()
}