fun main() {
    var arr = arrayOf("one","two","three")
    for ((i,e)in arr.withIndex()){
        println("$i" +" $e")
    }
}