package com.zhaobl.zhapapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    //定义字符串数组 作为提示的文本
    String [] books = new String []{
        "疯狂的java讲义",
                "疯狂的ajax讲义",
            "疯狂的3",
            "疯狂的4"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhao);
        //创建一个ArratAdapter 封装数组

        ArrayAdapter<String > aa = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,books);
        AutoCompleteTextView actv = (AutoCompleteTextView)
                findViewById(R.id.auto);
        //设置Adaoter
        actv.setAdapter(aa);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
