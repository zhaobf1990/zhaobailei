package com.mysdkdemo.zhaobf.mysdklib2;

import org.json.JSONObject;

public interface TSealNetworkListener {
	public void onComplete(JSONObject json);
	public void onError(JSONObject json);
	public void onCancel();

}
