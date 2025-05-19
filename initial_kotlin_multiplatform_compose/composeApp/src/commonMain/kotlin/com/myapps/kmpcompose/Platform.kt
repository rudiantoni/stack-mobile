package com.myapps.kmpcompose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform