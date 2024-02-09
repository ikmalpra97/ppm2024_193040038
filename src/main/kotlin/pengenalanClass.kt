
/*
pada class pada dasarnya default dengan status FINAL, berbeda dengan java yang status default nya adalah open.
maka jika ingin melakukan inheritance contohnya harus menambahkan status open sebelum class agar dapat terbaca
 */

open class shape { //dalam kotlin kita bisa melakukan inheritance dengan menambahkan open sebelum class

    fun print() {

    }
}

/*
pada kotlin, parameter yang terdapat dalam class (variabel yang terdapat dalam isi class)
tidak perlu memerlukan setter and getter atau mendefinisikan konstruktor ber-paramater, karena sifat nya
ketika kita definisikan di dalam parameter class, parameter tersebut sudah difenisikan sebagai konstruktor dan juga
atribut yang bisa dipakai tanpa setter and getter atau membuat konstruktor terpisah
 */

class Rectangle(val height: Double, val width:Double):shape() { //parameter yang langsung didefinisikan tidak memerlukan konstruktor berparameter

    fun calcArea(): Double{
        return height * width
    }

    fun calcPerimeter(): Double{
        return (height + width) * 2
    }
}

fun main(){
    val rectangle = Rectangle(10.0, 20.0) //mendefinisikan kelas tidak menggunakan kata new seperti pada java
    val area = rectangle.calcArea()
    println(area)

    val perimeter = rectangle.calcPerimeter()
    println(perimeter)
}