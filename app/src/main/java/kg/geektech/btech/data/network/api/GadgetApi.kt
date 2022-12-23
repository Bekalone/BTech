package kg.geektech.btech.data.network.api

import kg.geektech.btech.data.network.model.GadgetDTO
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GadgetApi {

    @GET("products")
    suspend fun getProducts(
        @Query("Phone") phone: String = kg.geektech.btech.BuildConfig.PHONE,
        @Query("Name") name: String = kg.geektech.btech.BuildConfig.NAME,
        @Query("Surname") surName: String = kg.geektech.btech.BuildConfig.SURNAME,
        @Query("password") password: String = kg.geektech.btech.BuildConfig.PASSWORD,
    ): GadgetDTO

    @GET("products/{id}")
    suspend fun getDetailProduct(
        @Path("id") id: Int,
        @Query("Phone") phone: String = kg.geektech.btech.BuildConfig.PHONE,
        @Query("Name") name: String = kg.geektech.btech.BuildConfig.NAME,
        @Query("Surname") surName: String = kg.geektech.btech.BuildConfig.SURNAME,
        @Query("password") password: String = kg.geektech.btech.BuildConfig.PASSWORD,
    ): GadgetDTO
}