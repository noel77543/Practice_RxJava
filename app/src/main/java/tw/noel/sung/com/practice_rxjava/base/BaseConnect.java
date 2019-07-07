package tw.noel.sung.com.practice_rxjava.base;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import tw.noel.sung.com.practice_rxjava.connect.ConnectInfo;

public class BaseConnect {
    private final int TIME_OUT_SECOND = 20;
    protected static Retrofit retrofit;
    protected static OkHttpClient.Builder httpClientBuilder;

    public BaseConnect() {

        if (retrofit == null && httpClientBuilder == null) {

            httpClientBuilder = new OkHttpClient.Builder()
                    .connectTimeout(TIME_OUT_SECOND, TimeUnit.SECONDS)
                    .readTimeout(TIME_OUT_SECOND, TimeUnit.SECONDS)
                    .writeTimeout(TIME_OUT_SECOND, TimeUnit.SECONDS);

            retrofit = new Retrofit.Builder()
                    .baseUrl(ConnectInfo._DOMAIN)
                    //添加RxJava適配器
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    //添加轉換器
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClientBuilder.build())
                    .build();
        }

    }

    //-----------------------

    /***
     *  建立Retrofit Service
     * @param serviceClass
     * @param <S>
     * @return
     */
    protected <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }
}
