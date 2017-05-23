package com.bawei.rxjavademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.bawei.rxjavademo.ss.Api;
import com.bawei.rxjavademo.ss.CustomObserver;
import com.bawei.rxjavademo.ss.HttpResult;
import com.bawei.rxjavademo.ss.RxHelper;
import com.bawei.rxjavademo.ss.bean.Joker;
import com.bawei.rxjavademo.ss.bean.ToastUtil;

import java.util.List;

import io.reactivex.Observable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Observable<HttpResult<List<Joker>>> observable = Api.getRetrofit().requestData("");
//        observable.observeOn(Schedulers.io())
//                .subscribeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<HttpResult<List<Joker>>>() {
//                    @Override
//                    public void accept(HttpResult<List<Joker>> listHttpResult) throws Exception {
//
//                    }
//                });

//        CustomDialog c = CustomDialog.getInstance(this,null);
//        c.show();


//        RxHelper.toSubscriber(observable, new CustomObserver<List<Joker>>(this) {
//            @Override
//            public void onSuccess(List<Joker> jokers) {
//                Log.d("TAG","jokers:"+jokers.get(1).getContent());
//            }
//        });


    }
    public void start(View view)
    {
       // Toast.makeText(this,"我是你",Toast.LENGTH_SHORT).show();
        ToastUtil.showShort(this,"我是你");
    }
}
