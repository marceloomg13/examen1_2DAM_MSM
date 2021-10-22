fun main(args: Array<String>) {
    tablaDeMultiplicar()
}
fun tablaDeMultiplicar() {
    var edad:Int=0
    var mes:Int=0
    try {
        println("Introduce tu edad")
        edad= readLine().toString().toInt()
        println("")
        println("Introduce tu mes de nacimiento")
        mes= readLine().toString().toInt()
        /*val str = readLine().toString()
        val sCadena = str.substring(str.indexOf("(") + 1, str.indexOf(")"))
        val s: List<String> = sCadena.split(",")
        edad=s[0].toInt()
        mes=s[1].toInt()
        print(edad)
        print(mes)*/
    }catch (e:Exception){
        println("No has introducido correctamente los valores especificados")
    }
    println("*********************************************")
    println("PROGRAMA DE GENERACIÓN DE TABLAS: <MARCELO>")
    println("---------------------------------------------")
    if ((edad >= 6) and (edad <= 8)) {
        println("Edad: " + edad + ". " + "El alumno esta dentro del rango[6-8]")
        if (mes % 2 == 0) {
            println("Mes: " + mes + ". El mes es par, corresponden las tablas siguientes: {1,3,5}")
        }   else {
            println("Mes: " + mes + ". El mes es impar, corresponden las tablas siguientes: {2,4}")
        }
    }
    if ((edad > 8) and (edad <= 10)) {
        println("Edad: " + edad + ". " + "El alumno esta dentro del rango[8-10]")
        if (mes % 2 == 0) {
            println("Mes: " + mes + ". El mes es par, corresponden las tablas siguientes: {7,9}")
        } else {
            println("Mes: " + mes + ". El mes es impar, corresponden las tablas siguientes: {6,8,10}")
        }
    }
    if ((edad > 10) and (edad <= 12)) {
        println("Edad: " + edad + ". " + "El alumno esta dentro del rango[10-12]")
        if (mes % 2 == 0) {
            println("Mes: " + mes + ". El mes es par, corresponden las tablas siguientes: {11,12,13}")
        } else {
            println("Mes: " + mes + ". El mes es impar, corresponden las tablas siguientes: {14,15,16}")
        }
    }
    println("---------------------------------------------")
    if ((edad >= 6) and (edad <= 8)) {
        if ((mes % 2 != 0)) {
            println("")
            println("TABLA DEL 2")
            println("*************")
            for (i in 1..10) {
                println("2 * " + i + " = " + 2 * i)
            }
            println("")
            println("TABLA DEL 4")
            println("*************")
            for (i in 1..10) {
                println("4 * " + i + " = " + 4 * i)
            }
        } else {
            println("")
            println("TABLA DEL 1")
            println("*************")
            for (i in 1..10) {
                println("1 * " + i + " = " + 1 * i)
            }
            println("")
            println("TABLA DEL 3")
            println("*************")
            for (i in 1..10) {
                println("3 * " + i + " = " + 3 * i)
            }
            println("")
            println("TABLA DEL 5")
            println("*************")
            for (i in 1..10) {
                println("5 * " + i + " = " + 5 * i)
            }
        }
    }
    if ((edad > 8) and (edad <= 10)) {
        if ((mes % 2 == 0)) {
            println("")
            println("TABLA DEL 7")
            println("*************")
            for (i in 1..10) {
                println("7 * " + i + " = " + 7 * i)
            }
            println("")
            println("TABLA DEL 9")
            println("*************")
            for (i in 1..10) {
                println("9 * " + i + " = " + 9 * i)
            }
        } else {
            println("")
            println("TABLA DEL 6")
            println("*************")
            for (i in 1..10) {
                println("6 * " + i + " = " + 6 * i)
            }
            println("")
            println("TABLA DEL 8")
            println("*************")
            for (i in 1..10) {
                println("8 * " + i + " = " + 8 * i)
            }
            println("")
            println("TABLA DEL 10")
            println("*************")
            for (i in 1..10) {
                println("10 * " + i + " = " + 10 * i)
            }
        }

    }
    if ((edad > 10) and (edad <= 12)) {
        if ((mes % 2 == 0)) {
            println("")
            println("TABLA DEL 11")
            println("*************")
            for (i in 1..10) {
                println("11 * " + i + " = " + 11 * i)
            }
            println("")
            println("TABLA DEL 12")
            println("*************")
            for (i in 1..10) {
                println("12 * " + i + " = " + 12 * i)
            }
            println("")
            println("TABLA DEL 13")
            println("*************")
            for (i in 1..10) {
                println("13 * " + i + " = " + 13 * i)
            }
        } else {
            println("")
            println("TABLA DEL 14")
            println("*************")
            for (i in 1..10) {
                println("14 * " + i + " = " + 14 * i)
            }
            println("")
            println("TABLA DEL 15")
            println("*************")
            for (i in 1..10) {
                println("15 * " + i + " = " + 15 * i)
            }
            println("")
            println("TABLA DEL 16")
            println("*************")
            for (i in 1..10) {
                println("16 * " + i + " = " + 16 * i)
            }
        }
    }
}