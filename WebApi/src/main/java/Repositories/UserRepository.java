package Repositories;

import Interfaces.IUserService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserRepository {
    //You need to change the IP if you testing environment is not local machine
    //or you may have different URL than we have here
    private static final String URL = "http://192.168.0.12:8080/api/";
    private IUserService apiService;

    public UserRepository()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(IUserService.class);
    }

    public IUserService getService()
    {
        return apiService;
    }
}
