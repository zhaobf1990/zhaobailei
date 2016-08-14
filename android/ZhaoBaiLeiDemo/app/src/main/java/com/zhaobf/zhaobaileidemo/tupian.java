//package com.zhaobf.zhaobaileidemo;
//
//import android.content.DialogInterface;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.graphics.drawable.BitmapDrawable;
//import android.media.Image;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.MotionEvent;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//
//public class tupian extends AppCompatActivity {
//        int[] images = new int[]{
//                R.drawable.lijiang,
//                R.drawable.qiao,
//                R.drawable.shuangta,
//                R.drawable.shui
//                R.drawable.xiangbi,
//        };
//    // 定义默认显示的图片
//    int currentImg  = 2;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tupian);
//
//        final Button plus = (Button)findViewById(R.id.plus);
//        final Buttom minus = (Button)findViewById(R.id.minus);
//        final ImageView image1 = (ImageView)findViewById(R.id.image1);
//        final ImageView image2 = (ImageView)findViewById(R.id.image2);
//        final Button next = (Button ) findViewById(R.id.next);
//        //定义查看下一张图片的监听器
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(currentImg>=4){
//                    currentImg = -1;
//                }
//                BitmapDrawable bitmapDrawable = (BitmapDrawable)image1.getDrawable();
//                //如果图片还未收回,先强制回收该图片
//                if(!bitmapDrawable.getBitmap().isRecycled()){
//                    bitmapDrawable.getBitmap().recycle();
//
//                }
//                // 改变ImageView 显示的图片
//                image1.setImageBitmap(BitmapFactory.decodeResource(getResources());
//            }
//        });
//        View.OnClickListener  lisstener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(v==plus){
//                    alpha +=20;
//                }
//                if(v ==minus){
//                    alpha -=20;
//                }
//                if(alpha >=255){
//                    alpha = 255;
//
//                }
//                if(alpha <= 0 ){
//                    alpha = 0;
//                }
//            }
//        };
//        // 为两个按钮添加监听器
//        plus.setOnClickListener(listener);
//        minus.setOnClickListener(listener);
//        image1.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                BitmapDrawable bitmapDrawable = (BitmapDrawable) image1.getDrawable();
//                //获取定义图片显示框的位图
//                Bitmap bitmap = bitmapDrawable.getBitmap();
//                //bitmap 图片实际大小与第一个ImageView 的缩放比例
//                double scale = bitmap.getWidth() /320.0 ;
//                // 获取需要显示的图片的开始点
//                int X = (int ) (event.getX()* scale);
//                int Y = (int ) (event.getY()* scale);
//                if(X + 120 >bitmap.getWidth()){
//                    X = bitmap.getWidth() -120;
//                }
//                if(Y + 120 > bitmap.getWidth()){
//                    y = bitmap.getWidth() - 120;
//                }
//                //显示图片的指定区域
//                image2.setImageBitmap(Bitmap.createBitmap(bitmap,x,y,120,120));
//                image2.setAlpha(alpha);
//                return false;
//            }
//        });
//
//
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_tupian, menu);
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
