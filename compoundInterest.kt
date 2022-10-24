import java.util.*

internal object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter the amount of principal: ")
        val p = sc.nextInt()
        print("Enter the annual interest rate: ")
        val r = sc.nextInt() / 100.0
        print("Enter the number of times per year that the interest is compounded: ")
        val n = sc.nextInt()
        print("Enter the number of years the account will be left to earn interest: ")
        val t = sc.nextInt()
        val a = p * Math.pow(1 + r / n, (n * t).toDouble())
        print("the amount of money in the account after the specified number of years: $a")
    }
}

// print name of the city in lower case
        println(
            """
                
                First character in the name of the favorite city: ${favoriteCity[0]}
                """.trimIndent()
        ) // print the first character
    }
}
