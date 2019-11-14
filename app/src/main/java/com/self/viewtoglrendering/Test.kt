package com.self.viewtoglrendering

val runnable = Runnable {
    println("runnable")
}
fun main(args: Array<String>) {
    test0 ({_,_->
        println("hello00")
//        return@test0
        println("hello01")
    },false)
//    test1 {
//        println("hello10")
//        return@test1
//        println("hello11")
//    }
//    test2({
//        println("hello")
//    }, runnable::run)
}
inline fun test0(l: (flag:Int,ddd:Boolean) -> Unit,result:Boolean) {
    println("hello00nei")
    return
}
inline fun test1(crossinline l: () -> Unit) {
    l.invoke()
    println("hello11nei")
    return
}
inline fun test2(l0: () -> Unit, noinline l1: () -> Unit): () -> Unit {
    l0.invoke()
    l1.invoke()
    println("test2")
    return l1
}