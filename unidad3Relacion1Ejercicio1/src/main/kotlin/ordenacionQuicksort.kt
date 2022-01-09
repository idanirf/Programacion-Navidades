fun main(args: Array<String>) {
    println("Imprimir vector")
    val vectorEnteros = intArrayOf(2, 4, 89, 23, 12)
    val ordenadoQuicksort = quickSort(vectorEnteros, 0, vectorEnteros.size - 1)
    print("El vector ordenado por QUICKSORT es: $ordenadoQuicksort")
}

fun quickSort(vectorEnteros: IntArray, posicionIzquierda: Int, posicionDerecha: Int): IntArray? {
    val pivote = vectorEnteros[posicionIzquierda]
    var i = posicionIzquierda
    var j = posicionDerecha
    var aux: Int
    while (i < j) {
        while (vectorEnteros[i] <= pivote && i < j)
            i++
        while (vectorEnteros[j] > pivote)
            j--
        if (i < j) {
            aux = vectorEnteros[i]
            vectorEnteros[i] = vectorEnteros[j]
            vectorEnteros[j] = aux
        }
    }
    vectorEnteros[posicionIzquierda] = vectorEnteros[j]
    vectorEnteros[j] = pivote
    if (posicionIzquierda < j - 1) quickSort(vectorEnteros, posicionIzquierda, j - 1)
    if (j + 1 < posicionDerecha) quickSort(vectorEnteros, j + 1, posicionDerecha)
    return vectorEnteros
}
