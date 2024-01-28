class Coche(var color: String, var marca: String,
            var modelo: String, var numCaballos: Int,
            var numPuertas: Int, val matricula: String){

    init {
        require(marca.isNotBlank() && modelo.isNotBlank()) { "Marca y modelo no pueden ser blancos ni nulos." }
        require(numCaballos in 70..700) { "Número de caballos debe estar entre 70 y 700." }
        require(numPuertas in 3..5) { "Número de puertas debe estar entre 3 y 5." }
        require(matricula.length == 7) { "La matrícula debe tener exactamente 7 caracteres." }
        require(color != null) { "Color no puede ser nulo." }
    }

    var colorActual: String = color
        set(value) {
            require(value != null) { "Color no puede ser nulo." }
            field = value
        }

    override fun toString(): String {
        return "Coche(color='$color', marca='$marca', modelo='$modelo', numCaballos=$numCaballos, numPuertas=$numPuertas, matricula='$matricula')"
    }
}





fun main() {
    // Crear varios coches
    val c1 = Coche("Rojo", "Toyota", "Corolla", 150, 4, "ABC1234")
    val c2 = Coche("Azul", "Honda", "Civic", 100, 5, "XYZ5678")
    val c3 = Coche("Verde", "Ford", "Focus", 120, 3, "DEF4321")

    println("Información inicial:")
    println(c1)
    println(c2)
    println(c3)

    c1.numCaballos = 200
    c2.numPuertas = 4
    c3.colorActual = "Amarillo"
    c1.marca = "Chevrolet"
    c2.modelo = "Accord"

    println("\nInformación después de las modificaciones:")
    println(c1)
    println(c2)
    println(c3)
}
