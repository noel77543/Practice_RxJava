package tw.noel.sung.com.practice_rxjava.connect.main;

import java.util.List;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import tw.noel.sung.com.practice_rxjava.base.BaseConnect;
import tw.noel.sung.com.practice_rxjava.model.ResponseTest1;
import tw.noel.sung.com.practice_rxjava.model.ResponseTest2;
import tw.noel.sung.com.practice_rxjava.model.ResponseTest3;

public class MainConnect extends BaseConnect {

    public static final int TYPE_TEST_1 = 123;
    public static final int TYPE_TEST_2 = 124;
    public static final int TYPE_TEST_3 = 125;


    private MainService mainService;

    public MainConnect() {
        mainService = createService(MainService.class);
    }

    //-----------

    public Observable<ResponseTest1> getTest1() {
        return mainService.getTest1()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    //-----------

    public Observable<List<ResponseTest2>>  getTest2() {
        return mainService.getTest2()
                .subscribeOn(Schedulers.io())
                //建立在主執行續才能直接更新UI
                .observeOn(AndroidSchedulers.mainThread());
    }

    //-----------

    public Observable<ResponseTest3>  getTest3() {
        return mainService.getTest3()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
