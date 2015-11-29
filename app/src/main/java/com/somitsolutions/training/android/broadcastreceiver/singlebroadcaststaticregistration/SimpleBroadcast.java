package com.somitsolutions.training.android.broadcastreceiver.singlebroadcaststaticregistration;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SimpleBroadcast extends Activity {

	private static final String CUSTOM_INTENT = "com.somitsolutions.training.android.broadcastreceiver.show_toast";
		
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent i = new Intent();

				i.setAction(CUSTOM_INTENT);

				sendBroadcast(i, android.Manifest.permission.VIBRATE);
			}
		});
	}
}