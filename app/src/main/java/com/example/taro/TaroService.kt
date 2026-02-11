import com.example.taro.Taro
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface TarotApiService  {
    @GET("cards/random")
    suspend fun getRandomCards(@Query("n") count: Int = 1): Taro

}

var retrofit = Retrofit.Builder()
    .baseUrl("https://tarotapi.dev/api/v1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val tarotApiService: TarotApiService by lazy {
    retrofit.create(TarotApiService::class.java)
}