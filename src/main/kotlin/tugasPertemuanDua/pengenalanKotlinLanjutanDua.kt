package tugasPertemuanDua

import java.util.Date

data class Event(val title: String) {
    var date = Date()
    var time = ""
    var attendees = mutableListOf<String>()

    fun create(){
        attendees.forEach{
            print(it)
        }
        print(this)
    }
}

fun main(){

    /*
     Pada umumnya ketika kita membuat sebuah program yang perlu memanggil kelas atau fungsi, di deklarasi seperti
     di bawah ini dengan memanggil nama variabel yang berisi sebuah fungsi atau kelas, lalu mengakses isi dari fungsi
     atau kelas tersebut menggunakan titik, namun di kotlin terdapat fungsi "with" untuk menyederhanakan proses ini,
     sehingga kita hanya memanggil isi dari kelas atau fungsi di dalam nya
     */

    val meeting = Event("Management Meeting")

    /*
    contoh di bawah ini tidak menggunakan with
     */
//    meeting.date = Date(2024, 1,1)
//    meeting.time = "09:00"
//    meeting.attendees.add("Budi")
//    meeting.create()

    /*
    contoh di bawah ini menggunakan with
     */
    with(meeting){
        date = Date(2024, 1,1)
        time = "09:00"
        attendees.add("Budi")
        create()
    }

    /*
    berikutnya menggunakan apply, konsep nya sama seperti with yang menyederhanakan sintaks, namun apply memiliki
    tahapan return atau nilai kembali ke fungsi atau kelas yang di deklarasi, contohnya seperti di bawah ini
     */
    meeting.apply {
        date = Date(2024, 1,1)
        time = "09:00"
        attendees.add("Budi")
    }.create() //create ini di deklarasi diluar apply karena membuat data yang sudah di return ke kelas/fungsi meeting
}