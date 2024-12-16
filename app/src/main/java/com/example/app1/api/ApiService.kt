package com.example.app1.api

import com.example.app1.model.LoginRequest
import com.example.app1.model.LoginResponse
import com.example.app1.model.RegisterRequest
import com.example.app1.model.RegisterResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("register.php")
    fun register(@Body request: RegisterRequest): Call<RegisterResponse>

    @POST("login.php")
    fun login(@Body request: LoginRequest): Call<LoginResponse>
}