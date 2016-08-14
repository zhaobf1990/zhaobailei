//package com.zhaobf.zhaobaileidemo;
//
//import android.os.SystemClock;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Chronometer;
//
//public class jishiqi extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.shizhong);
////        获取计时器组件
////        final Chronometer ch = (Chronometer) findViewById(R.id.text);
////        获取开始按钮
////        Button start = (Button) findViewById(R.id.start);
////        start.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                //设置开始计时时间
////                ch.setBase(SystemClock.elapsedRealtime()
////                );
////                //启动计时器
////                ch.start();
////            }
////        });
////        ch.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
////            @Override
////            public void onChronometerTick(Chronometer ch) {
////                //如果从开始计时到现在超过20s
////                if(SystemClock.elapsedRealtime()-ch.getBase()>20*1000){
////                    ch.stop();
////
////                }
////            }
//        });
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_jishiqi, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//}
