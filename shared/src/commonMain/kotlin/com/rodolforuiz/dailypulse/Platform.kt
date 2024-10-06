package com.rodolforuiz.dailypulse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform