class CuentaBancaria(val titular: String) {

    private var saldo: Double = 0.0

    fun ingresar(cantidad: Double) {
        if (cantidad <= 0) {
            throw IllegalArgumentException("La cantidad a ingresar debe ser mayor que 0")
        }
        saldo += cantidad
        println("Ingreso realizado. Saldo actual: $saldo")
    }

    fun retirar(cantidad: Double) {
        if (cantidad <= 0) {
            throw IllegalArgumentException("La cantidad a retirar debe ser mayor que 0")
        }
        if (cantidad > saldo) {
            throw IllegalStateException("No hay saldo suficiente. Saldo actual: $saldo")
        }
        saldo -= cantidad
        println("Retiro realizado. Saldo actual: $saldo")
    }
}
