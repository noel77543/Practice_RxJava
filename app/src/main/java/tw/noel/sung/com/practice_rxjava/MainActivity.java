package tw.noel.sung.com.practice_rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import tw.noel.sung.com.practice_rxjava.connect.main.MainConnect;
import tw.noel.sung.com.practice_rxjava.model.ResponseTest1;
import tw.noel.sung.com.practice_rxjava.model.ResponseTest2;
import tw.noel.sung.com.practice_rxjava.model.ResponseTest3;

//創建下游Observer (監聽者)
public class MainActivity extends AppCompatActivity implements Observer<Object> {

    private MainConnect mainConnect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainConnect = new MainConnect();


        connectToGetTest1();
        connectToGetTest2();
        connectToGetTest3();
    }

    //-----------------

    @Override
    public void onSubscribe(Disposable d) {
        Log.e("onSubscribe", "subscribe");
    }

    //-----------------

    @Override
    public void onNext(Object data) {
        if (data instanceof ResponseTest1) {
            ResponseTest1 responseTest1 = (ResponseTest1) data;
            Log.e("ResponseTest1", responseTest1.getStartPage() + "");
        }  else if (data instanceof ResponseTest3) {
            ResponseTest3 responseTest3 = (ResponseTest3) data;
            Log.e("ResponseTest3", responseTest3.getLives().get(0).getSlvid() + "");
        }else  {
            List<ResponseTest2> responseTest2Data = (List<ResponseTest2>) data;
            Log.e("ResponseTest2", responseTest2Data.get(0).getName() + "");
        }
    }

    //-----------------

    @Override
    public void onError(Throwable e) {
        Log.e("onError", e.toString());
    }

    //-----------------

    @Override
    public void onComplete() {
        Log.e("onComplete", "complete");
    }

    //-----------------

    //TODO 建立連接 只有當建立連接才會開始發送事件
    private void connectToGetTest1() {

        mainConnect
                //創建上游
                .getTest1()
                //建立監聽
                .subscribe(this);
    }

    //-----------------

    private void connectToGetTest2() {
        mainConnect.getTest2().subscribe(this);
    }
    //-----------------

    private void connectToGetTest3() {
        mainConnect.getTest3().subscribe(this);
    }

}
