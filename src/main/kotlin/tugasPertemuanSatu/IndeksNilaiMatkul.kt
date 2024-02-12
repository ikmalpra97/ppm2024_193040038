package tugasPertemuanSatu

fun indeksNilaiMatkul(angka: Int?) { //fungsi indeksnilaimatkul karena ada pengkondisian if di dalam nya, Int? agar nilai bisa diisi null
    if (angka != null) { //pengkondisian dimana angka tidak boleh null
        val abjad = when (angka) {
            in 80..100 -> "A"
            in 70..79 -> "AB"
            in 60..69 -> "B"
            in 50..59 -> "BC"
            in 40..49 -> "C"
            in 30..39 -> "D"
            in 0..29 -> "E"
            else -> "\nNilai di luar jangkauan"
        }
        print(abjad) //print abjad jika angka yang di isi berada di dalam loop tersebut
    } else {
        println("\nNilai harus diisi") //ketika nilai null maka mengeluarkan teks berisi berikut.
    }
}

fun main(){
    //karena teks sudah dibuat di dalam fun indeksNilaiMatkul, maka hanya memasukan nama fun beserta angka yang ingin di periksa
    indeksNilaiMatkul(77)
    indeksNilaiMatkul(110)
    indeksNilaiMatkul(null)
    indeksNilaiMatkul(25)

}