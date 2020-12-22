package com.cvdevelopers.scafold2.api

import okhttp3.Interceptor
import okhttp3.Response
import java.util.*
import java.util.prefs.Preferences

object HeaderInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(
            chain.request().newBuilder()
                .header("x-rapidapi-key", "41ed4a81f2msh1d9320b27ca5df0p1ed629jsn2bd595c10a6e")
                .header("x-rapidapi-host", "tasty.p.rapidapi.com")
                .build()
        )
    }
}