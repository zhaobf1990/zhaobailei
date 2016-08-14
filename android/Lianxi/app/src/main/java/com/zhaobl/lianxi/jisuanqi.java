package com.zhaobl.lianxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class jisuanqi extends AppCompatActivity implements View.OnClickListener {
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
        setContentView(R.layout.activity_jisuanqi);
        bt1 = (Button) findViewById(R.id.tv1);
        bt2 = (Button) findViewById(R.id.tv2);
        bt3 = (Button) findViewById(R.id.tv3);
        bt4 = (Button) findViewById(R.id.tv4);
        bt5 = (Button) findViewById(R.id.tv5);
        bt6 = (Button) findViewById(R.id.tv6);
        bt7 = (Button) findViewById(R.id.tv7);
        bt8 = (Button) findViewById(R.id.tv8);
        bt9 = (Button) findViewById(R.id.tv9);
        bt0 = (Button) findViewById(R.id.tv0);
        btjia = (Button) findViewById(R.id.tvjia);
        btjian = (Button) findViewById(R.id.tvjian);
        btcheng = (Button) findViewById(R.id.tvxin);
        btchu = (Button) findViewById(R.id.tvchu);
        btdengyu = (Button) findViewById(R.id.tvdeng);
        btxiaoshudian = (Button) findViewById(R.id.tvdian);
        btqingchu = (Button) findViewById(R.id.tvc);
        btdel = (Button) findViewById(R.id.tvdel);
        tvxian1 = (TextView) findViewById(R.id.et1);
        //设置点控事件
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt0.setOnClickListener(this);
        btjia.setOnClickListener(this);
        btjian.setOnClickListener(this);
        btcheng.setOnClickListener(this);
        btchu.setOnClickListener(this);
        btdengyu.setOnClickListener(this);
        btxiaoshudian.setOnClickListener(this);
        btqingchu.setOnClickListener(this);
        btdel.setOnClickListener(this);
        tvxian1.setOnClickListener(this);
        boolean cle; // 清空


    }

    public void onClick(View v) {
        String str = tvxian1.getText().toString();
        switch (v.getId()) {

            case R.id.tv1:
            case R.id.tv2:
            case R.id.tv3:
            case R.id.tv4:
            case R.id.tv5:
            case R.id.tv6:
            case R.id.tv7:
            case R.id.tv8:
            case R.id.tv9:
            case R.id.tv0:
            case R.id.tvdian:
                tvxian1.setText(str + ((Button) v).getText());
                break;
            case R.id.tvjia:
            case R.id.tvjian:
            case R.id.tvxin:
            case R.id.tvchu:
                tvxian1.setText(str + " " + ((Button) v).getText() + " ");

                break;
            case R.id.tvdel:
                if (str != null && !str.equals("")) {
                    tvxian1.setText(str.substring(0, str.length() - 1));
                }
                break;
            case R.id.tvc:
                tvxian1.setText("");
                break;
            case R.id.tvdeng:
                getResult();
                break;


        }
    }

    private void getResult() {
        String res = tvxian1.getText().toString();
        if (res == null || res.equals("")) {   //
            return;
        }
        if (!res.contains("")) { // 当前内容有没有空格
            return;
        }
        double result = 0;
        String s1 = res.substring(0, res.indexOf(" ")); // 运算符前面的字符窜
        String op = res.substring(res.indexOf(" ") + 1, res.indexOf(" ") + 2);//截取的运算符
        String s2 = res.substring(res.indexOf(" ") + 3);// 运算符后面的数字
        if (!s1.equals("") && !s2.equals("")) {
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            if (op.equals("+")) {
                result = d1 + d2;

            } else if (op.equals("-")) {
                result = d1 - d2;

            } else if (op.equals("*")) {
                result = d1 * d2;
            } else if (op.equals("/")) {
                if (d2 == 0) {
                    result = 0;
                } else {
                    result = d1 / d2;
                }
            }
            if (!s1.contains(".") && s2.contains(".")) {
                int r = (int) result;
                tvxian1.setText(r + "");
            } else {
                tvxian1.setText(result + "");
            }

        } else if (!s1.equals("") && s2.equals("")) {
            tvxian1.setText(res);
        } else if (s1.equals("") && !s2.equals("")) {
            double d2 = Double.parseDouble(s2);
            if (op.equals("+")) {
                result = 0 + d2;

            } else if (op.equals("-")) {
                result = 0 - d2;

            } else if (op.equals("*")) {
                result = 0;
            } else if (op.equals("/")) {

                result = 0;

            }
            if (s2.contains(".")) {
                int r = (int) result;
                tvxian1.setText(r + "");
            } else {
                tvxian1.setText(result + "");

            }


        } else {
            tvxian1.setText("");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jisuanqi, menu);
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
