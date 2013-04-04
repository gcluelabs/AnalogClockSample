package com.example.clocksample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class ClockSample extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Titleバーを消す
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.main);
	}
}
