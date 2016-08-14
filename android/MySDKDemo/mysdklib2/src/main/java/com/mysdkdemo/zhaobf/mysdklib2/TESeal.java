package com.mysdkdemo.zhaobf.mysdklib2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Created by zhaobf on 2015/8/9.
 */
public class TESeal {
    private static TESeal mTESeal;
    private TSealNetworkListener mListener;

    public static TESeal createInstance() {
        if (mTESeal == null) {
            mTESeal = new TESeal();
//            mTESeal.mAppid = appid;
//            mTESeal.mParentCtx = ctx;
        }
        return mTESeal;
    }

    public static TESeal getInstance() {
        return mTESeal;
    }

    public void login(Context owner, TSealNetworkListener listener) {
        mListener = listener;
        Intent intent = new Intent(owner, LoginActivity.class);
        ((Activity) owner).startActivityForResult(intent,1);
    }
}
