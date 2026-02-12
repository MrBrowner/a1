package `in`.das.a1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform