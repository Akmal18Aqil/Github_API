package com.akmal.api_github.data.retrofit

import com.akmal.api_github.data.response.DetailResponse
import com.akmal.api_github.data.response.ListResponse
import com.akmal.api_github.data.response.SearchResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("/users/{id}/{type}")
    fun getUsers(
        @Path("id") id: String,
        @Path("type") type: String
    ): Call<List<ListResponse>>

    @GET("/users/{id}")
    fun getDetail(
        @Path("id") id: String
    ): Call<DetailResponse>

    @GET("/search/users")
    fun searchUsers(
        @Query("q") query: String
    ): Call<SearchResponse>
}