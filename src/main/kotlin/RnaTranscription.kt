fun transcribeToRna(dna: String): String = dna.toList().joinToString("") {

    when (it) {
        'G' -> "C"
        'C' -> "G"
        'T' -> "A"
        'A' -> "U"
        else -> ""
    }
}
