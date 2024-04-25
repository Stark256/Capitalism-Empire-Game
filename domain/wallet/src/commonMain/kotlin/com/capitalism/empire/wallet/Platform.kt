package com.capitalism.empire.wallet

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform