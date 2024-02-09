

/*
 Kotlin tidak menggunakan titik dua, dan juga tidak memerlukan tipe variabel jika variabel sudah memiliki
 nilai baik itu String, Float, Boolean, ataupun integer
 */

fun main() {
    val a: Int = 1 //Val adalah tipe variabel konstanta seperti FINAL jika di Java
    val b = 3
    var c = sum(a, b) //var adalah tipe variabel yang bisa dimanipulasi isi nya
    val d: Int

    println("a + b = $c")
    d = sum(a, 2)
    println("a + b = $d")
}

fun sum(a: Int, b:Int): Int { //function di dalam kotlin hanya ada satu tipe yaitu fun
    return a + b
}
