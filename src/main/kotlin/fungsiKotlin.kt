

/*
data class sama seperti POJO (Plain Old Java Object) yang hanya menyimpan data
 */
data class Mahasiswa(
    val nrp: String,
    val nama: String,
    val ipk: Double?, //tanda tanya disini untuk mengizinkan sebuah variabel berisi null karena pada dasarnya kotlin memiliki default final

//    val ipk: Double? = null
//    diatas ini adalah contoh lain mendefinisikan variabel null, dengan menggunakan versi ini,
//    maka ketika data class memiliki atribut tidak perlu menuliskan null didalamnya

)

fun Int.toAbjad(): String{
    return when(this){
        in 80..100 -> "A"
        in 70..79 -> "AB"
        in 60..69 -> "B"
        in 50..59 -> "BC"
        in 40..49 -> "C"
        in 30..39 -> "D"
        else -> "E"
    }
}

fun main(){
    val angka: Int = 70
    println(angka.toAbjad())

    val mhs = Mahasiswa("001","Budi", null)
    println(mhs.nrp)
    println(mhs.nama)
    mhs.ipk?.let { //ini adalah cara kotlin untuk menghilangkan tampilan ketika sebuah nilai berisi null menggunakan let
        println(it) // it mirip seperti this
    }
    println(mhs.ipk)


    /*

    dibawah ini adalah contoh jika variabel pada data class diisi dengan nilai null dan bukan pada atribut data mahasiswa nya

        val mhs = Mahasiswa(nama = "Budi",nrp = "001")
        println(mhs.nrp)
        println(mhs.nama)
        mhs.ipk?.let {
            println(it)
        }
        println(mhs.ipk)
     */

}