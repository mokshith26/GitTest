package com.mokshith.gittest.retrofit

import com.mokshith.gittest.modelClasses.Categories
import com.mokshith.gittest.modelClasses.Category
import com.mokshith.gittest.modelClasses.NycSchoolsModel
import com.mokshith.gittest.modelClasses.Product
import com.mokshith.gittest.modelClasses.ProductsModel
import retrofit2.Response
import retrofit2.http.GET


interface WebServices {

//    @GET("categories.php")
//    suspend fun getMealsData(): Response<MealsCategoriesResponse>
//    @GET("/todos")
//    suspend fun getTodosList(): Response<List<RetrofitCourseModel>>

    @GET("products")
    suspend fun getProducts(): Response<List<Product>>

    @GET("categories.php")
    suspend fun getCategories(): Response<List<Category>>

    @GET("categories.php")
    suspend fun getCategories1(): Response<Categories>

    @GET("resource/s3k6-pzi2.json")
    suspend fun getNycSchools(): Response<List<NycSchoolsModel>>

    @GET("products")
    suspend fun getProducts1(): Response<ProductsModel>

}