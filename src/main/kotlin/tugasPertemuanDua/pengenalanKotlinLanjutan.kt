package tugasPertemuanDua

fun eksekusi(aksi: () -> Unit){ //function aksi dijadikan sebagai parameter function eksekusi
    println("eksekusi")
    aksi()
}

fun eksekusiDua(aksiDua: () -> Unit, error: (String) -> Unit){ //function eksekusi dengan parameter baru selain function aksi
    println("eksekusi")
    aksiDua()
    error("error") //isi parameter error
}

fun eksekusiTiga(aksiTiga: () -> Unit, error: (String, String) -> Unit){ //function eksekusi dengan parameter baru selain function aksi
    println("eksekusi")
    aksiTiga()
    error("error","terjadi") //isi parameter error
}

fun eksekusiEmpat(aksiEmpat: () -> Unit, error: (String, String) -> Unit){ //function eksekusi dengan parameter baru selain function aksi
    println("eksekusi")
    aksiEmpat()
    error("error","terjadi") //isi parameter error
}

fun eksekusiLima(aksiLima: () -> Unit, error: (String, String, String) -> Unit) { //function eksekusi dengan parameter baru selain function aksi
    println("eksekusi")
    aksiLima()
    error("error", "terjadi", "ya") //isi parameter error
}

fun eksekusiEnam(aksiEnam: (String) -> Unit, error: (String, String, String) -> Unit) { //function eksekusi dengan parameter baru selain function aksi
    println("eksekusi")
    aksiEnam("aksi")
    error("error", "terjadi", "ya") //isi parameter error
}

fun main(){
    eksekusi({
        println("aksi\n") //higher order function, function yang memakai function lain untuk dijadikan sebagai parameter
    })

    val aksi = {
        println("aksi\n") //jika function bisa dijadikan parameter, maka function juga bisa dijadikan variabel
    }

    eksekusi(aksi)

    val aksiDua = {
        println("aksi\n")
    }
    eksekusiDua(aksiDua, {
        println(it) //jika parameter hanya satu, maka bisa menggunakan variabel it
    })

    val aksiTiga = {
        println("aksi\n")
    }
    eksekusiTiga(aksiTiga, { param1, param2 -> //jika parameter lebih dari satu, maka harus didefinisikan dengan eksplisit
        println(param1)
        println(param2)
    })

    val aksiEmpat = {
        println("aksi\n")
    }
    eksekusiEmpat(aksiEmpat, { param1, _ -> //jika ada parameter yang tidak digunakan, maka bisa menggunakan underscore
        println(param1)
    })

    val aksiLima = {
        println("aksi\n")
    }
    eksekusiLima(aksiLima, { param1, _ , _ ->   /*  Jika paramater diisi underscore, maka jika di print pun
                                                    tidak akan memunculkan hasil nilai dari parameter yang dipanggil
                                                */
        println(param1)
    })

    val aksiEnam: (String) -> Unit = {  /*   function aksi bisa diisi dengan parameter di dalam function eksekusi
                                                    dan bisa dilakukan definisi memakai it untuk melihat hasil nilai
                                                    parameter yang ada pada function eksekusi
                                                */
        println(it+"\n")
    }

    eksekusiEnam(aksiEnam, { param1, param2 , param3 ->     /*  Jika paramater diisi underscore, maka jika di print pun
                                                                tidak akan memunculkan hasil nilai dari parameter
                                                                yang dipanggil
                                                            */
        println(param1)
        println(param2)
        println(param3)
    })

    //hal ini akan memudahkan kita membaca parameter mana yang dipanggil dalam function
    val aksiTujuh: (String) -> Unit = { param1 -> //bisa juga mendefinisikan paramater secara eksplisit
        println(param1+"\n")
    }

    eksekusiEnam(aksiTujuh, { param1, param2 , param3 -> /* Jika paramater diisi underscore, maka jika di print pun
                                                            tidak akan memunculkan hasil nilai dari parameter
                                                            yang dipanggil
                                                         */
        println(param1)
        println(param2)
        println(param3)
    })
}