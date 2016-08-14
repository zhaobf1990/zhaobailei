package com.zhaobl.lianxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class zhidongpipei extends AppCompatActivity {
    private AutoCompleteTextView acTextView;
    private String[] res = {"beijing1","beijing2","beijing3","beijing4"};

    private MultiAutoCompleteTextView macTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhidongpipei);
    // 1 初始化控件
        // 2 需要一个适配器
        //  初始化数据也  这数据源去匹配文本输入的内容
        acTextView = (AutoCompleteTextView)findViewById(R.id.zidong);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,res);
        acTextView.setAdapter(adapter);

        // 步骤一样
        macTextView = (MultiAutoCompleteTextView)findViewById(R.id.zhidong1);
        macTextView.setAdapter(adapter);
        // 设置以逗号为分隔符为结束的符号
        macTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_zhidongpipei, menu);
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
