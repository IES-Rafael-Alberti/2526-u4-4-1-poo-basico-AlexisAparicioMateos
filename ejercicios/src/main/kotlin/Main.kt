fun main() {

    val cuenta = CuentaBancaria("Alexis A.")

    try {
        cuenta.ingresar(100.0)
        cuenta.retirar(50.0)
        cuenta.retirar(100.0)

    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
