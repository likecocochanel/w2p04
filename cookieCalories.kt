import java.util.*

object CookieCalorieCounter {
    @JvmStatic
    fun main(args: Array<String>) {
        val NUM_COOKIES_IN_BAG = 40.0
        val NUM_SERVINGS_IN_BAG = 10.0
        val NUM_CALORIES_PER_SERVING = 300.0
        val NUM_CALORIES_PER_COOKIE = NUM_CALORIES_PER_SERVING / (NUM_COOKIES_IN_BAG / NUM_SERVINGS_IN_BAG)
        val scanner = Scanner(System.`in`)
        print("Enter the number of cookies: ")
        val numCookies = scanner.nextInt()
        println("Total calories consumed: " + numCookies * NUM_CALORIES_PER_COOKIE)
    }
}
