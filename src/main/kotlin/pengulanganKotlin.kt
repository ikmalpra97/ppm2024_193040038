/*
pengulangan di dalam kotlin mirip seperti pengulangan di dalam java, menggunakan for, hanya saja terdapat
perbedaan di dalam atribut yang di tulis
 */

fun main(){
    val items = listOf("apple","banana","orange")
    for (item in items){ //menggunakan in untuk mengganti sama dengan atau titik dua
        println(item)
    }

    for (index in items.indices){ //indices digunakan untuk menghitung index array pada items
//        items[index] adalah array yang dimasukkan kedalam atribut atau isi dari println menggunakan kurung kurawal
//        setelah simbol dollar agar terbaca
        println("item at $index is ${items[index]}")
    }

    var index = 0
    while (index < items.size){ // looping menggunakan while
        println("item at $index is ${items[index]}")
        index++
    }

    for (x in 0..100){ //pengulangan for menggunakan range
        println(x)
    }

    val angka = 70
    val abjad = when (angka) { //pengulangan menggunakan do when serta menggunakan range
//        angka < 100 && angka >= 80 jika ditulis di dalam java maka akan seperti ini, namun di kotlin cukup
//        menambahkan ".." untuk menyatakan range
        in 80..100 -> "A"
        in 70..79 -> "AB"
        in 60..69 -> "B"
        in 50..59 -> "BC"
        in 40..49 -> "C"
        in 30..39 -> "D"
        else -> "E"
    }
    println(abjad)
}