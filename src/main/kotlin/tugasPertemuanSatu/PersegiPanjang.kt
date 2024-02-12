package tugasPertemuanSatu

class persegiPanjang(val height: Double, val width: Double) { //menggunakan class karena ada beberapa fungsi yang harus ditulis
    fun luas(): Double{ //fungsi menghitung luas
        return height * width
    }

    fun keliling(): Double{ //fungsi menghitung keliling
        return (height + width) * 2
    }
}

fun main(){
    val lebar = 2.0
    val panjang = 4.0
    val rectangle = persegiPanjang(lebar, panjang) //inisialisasi class PersegiPanjang
    val area = rectangle.luas() //memanggil fungsi luas
    println("luas persegi panjang adalah = $area") //$area untuk memmpermudah pembacaan teks program

    val perimeter = rectangle.keliling() //memanggil fungsi keliling
    println("keliling persegi panjang adalah = $perimeter") //$perimeter untuk memmpermudah pembacaan teks program
}