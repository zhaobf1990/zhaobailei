package com.zhaobl.ceshi;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class jsj extends AppCompatActivity {
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private Button bt6;
    private Button bt7;
    private Button bt8;
    private Button bt9;
    private Button bt0;
    private Button btjia;//+
    private Button btjian;//-
    private Button btcheng;//*
    private Button btchu;//  /
    private Button btdengyu; // =
    private Button btxiaoshudian; //小数点
    private Button btqingchu;//清楚
    private Button btdel; //删除
    private TextView tvxian1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsj);

        bt1 = (Button)findViewById(R.id.tv1);
        bt2 = (Button)fileList(R.id.tv2);
        bt3 = (Button)fileList(R.id.tv3);
        bt4 = (Button)fileList(R.id.tv4);
        bt5 = (Button)fileList(R.id.tv5);
        bt6 = (Button)fileList(R.id.tv6);
        bt7 = (Button)fileList(R.id.tv7);
        bt8 = (Button)fileList(R.id.tv8);
        bt9 = (Button)fileList(R.id.tv9);
        bt0 = (Button)fileList(R.id.tv0);
        btjia = (Button)fileList(R.id.tvjia);
        btjian = (Button)fileList(R.id.tvjian);
        btcheng = (Button)fileList(R.id.tvxin);
        btchu = (Button)fileList(R.id.tvchu);
        btdengyu = (Button)fileList(R.id.tvdeng);
        btxiaoshudian= (Button)fileList(R.id.tvdian);
        btqingchu = (Button)fileList(R.id.tvc);
        btdel = (Button)fileList(R.id.tvdel);
        tvxian1 = (TextView) fileList(R.id.et1);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
