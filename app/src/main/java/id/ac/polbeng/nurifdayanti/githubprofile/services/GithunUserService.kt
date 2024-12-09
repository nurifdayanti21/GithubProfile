package id.ac.polbeng.nurifdayanti.githubprofile.services
import id.ac.polbeng.nurifdayanti.githubprofile.models.GithubUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
interface GithubUserService {
    @GET("users/{login}")
    fun loginUser(
        @Path("login") userLogin: String
    ): Call<GithubUser>
}
