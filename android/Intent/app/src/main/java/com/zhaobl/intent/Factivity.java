package com.zhaobl.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by zhaobf on 2016-08-13.
 */
public class Factivity extends Activity {
    private Button btt1;
    private Button btt2;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factivity);
        // 通过页面中间的跳转
        //startActivity的方式来实现跳转
        tv = (TextView)findViewById(R.id.tv);
        btt1 = (Button)findViewById(R.id.bt1);
        btt2 = (Button)findViewById(R.id.bt2);
        //注册点击事件
        btt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Factivity.this ,SAcrivity.class);
                startActivity(intent);

            }
        });
        btt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Factivity.this,SAcrivity.class);

                startActivityForResult(intent2,1);
                 // 第一个是Intent 参数
                // 第二个参数是请求的一个标识
            }
        });

    }
    // 通过IPstarActovotyForresult跳转,接受返回数据的方法
    // requestCode 请求的标识


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1&&resultCode==2){
            String cont = data.getStringExtra("data");
            tv.setText(cont);
        }
    }
}
