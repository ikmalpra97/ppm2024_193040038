/*
Pengkondisian dalam kotlin tidak jauh berbeda dengan java, hanya saja terdapat perbedaan ketika kita meringkas
pengkondisian dengan metode ternary code. di kotlin tidak ada ternary code
 */

fun main(){
    val a = 10
    val b = 90
    val c = max(a, b)
    val d = if(a > b) a else b //mirip dengan ternary code namun lebih mudah dipahami
    val e = doWhenMax(a)
    println(c)
    println(d)
    println(e)
}

fun simpleIfMax(a: Int, b: Int) = if (a > b) a else b

fun max(a: Int, b: Int): Int { //normal pengkondisian menggunakan if
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun doWhenMax(a: Int): String{ //pengulangan dowhen pada kotlin mirip seperti switch case break pada java
    return when (a){
        90 -> {
            "A"
        }
        80 -> {
            "B"
        }
        else ->{
            "C"
        }
    }
}