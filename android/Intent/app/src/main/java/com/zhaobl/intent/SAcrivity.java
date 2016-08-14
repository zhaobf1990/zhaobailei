package com.zhaobl.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by zhaobf on 2016-08-13.
 */
public class SAcrivity extends Activity {
    private Button bt;
    private String cont = "恭喜你中间了";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sactivity);
        // 第二个页面什么时候给第一个页面回传
        // 回传到第二个页面的实际上是一个Intent对象

        bt= (Button) findViewById(R.id.bt3);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("data",cont);
                setResult(2,data);
                finish();
            }
        });
    }
}
