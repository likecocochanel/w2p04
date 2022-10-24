import java.util.*

internal object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`) // scanner declaration
        print("Please enter the name of your favorite city: ")
        val favoriteCity = sc.nextLine() // Accept the input of favorite City
        println(
            """
                
                
                Number of characters in the name of favorite city: ${favoriteCity.length}
                """.trimIndent()
        ) // print length
        println(
            """
                
                Name of the Vizianagaram city in upper case : ${favoriteCity.uppercase(Locale.getDefault())}
                """.trimIndent()
        ) // print name of the city in upper case
        println(
            """
                
                Name of the favorite city in lower case : ${favoriteCity.lowercase(Locale.getDefault())}
                """.trimIndent()
        )

// print name of the city in lower case
        println(
            """
                
                First character in the name of the favorite city: ${favoriteCity[0]}
                """.trimIndent()
        ) // print the first character
    }
}
