package tw.noel.sung.com.practice_rxjava.connect.main;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

import tw.noel.sung.com.practice_rxjava.connect.ConnectInfo;
import tw.noel.sung.com.practice_rxjava.model.ResponseTest1;
import tw.noel.sung.com.practice_rxjava.model.ResponseTest2;
import tw.noel.sung.com.practice_rxjava.model.ResponseTest3;

public interface MainService {

    @GET(ConnectInfo._TEST_URL_1)
    Observable<ResponseTest1> getTest1();

    @GET(ConnectInfo._TEST_URL_2)
    Observable<List<ResponseTest2>> getTest2();

    @GET(ConnectInfo._TEST_URL_3)
    Observable<ResponseTest3> getTest3();
}
