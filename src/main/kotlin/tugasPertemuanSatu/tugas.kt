//package tugasPertemuanSatu
//
//class persegiPanjang(val height: Double, val width: Double){
//    fun luas(): Double{
//        return height * width
//    }
//
//    fun keliling(): Double{
//        return (height + width) * 2
//    }
//}
//
//fun indeksNilaiMatkul(angka: Int?) {
//    if (angka != null) {
//        val abjad = when (angka) {
//            in 80..100 -> "A"
//            in 70..79 -> "AB"
//            in 60..69 -> "B"
//            in 50..59 -> "BC"
//            in 40..49 -> "C"
//            in 30..39 -> "D"
//            in 0..29 -> "E"
//            else -> "\nNilai di luar jangkauan"
//        }
//        print(abjad)
//    } else {
//            println("\nNilai harus diisi")
//        }
//    }
//
//
//fun main(){
//    val rectangle = persegiPanjang(2.0, 4.0) //mendefinisikan kelas tidak menggunakan kata new seperti pada java
//    val area = rectangle.luas()
//    println("luas persegi panjang adalah = $area")
//
//    val perimeter = rectangle.keliling()
//    println("keliling persegi panjang adalah = $perimeter")
//
//    indeksNilaiMatkul(77)
//    indeksNilaiMatkul(110)
//    indeksNilaiMatkul(null)
//    indeksNilaiMatkul(25)
//}