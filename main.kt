

fun main(args: Array<String>) {
    var listIntegers = listOf<Int>(1,10,34,58,43,59,9,234,43)

    var listString = mutableListOf<String>()

    for(item in listIntegers){
        listString.add(item.toString())
    }

    print(listString)
}
