package com.bramstang.tomtebloss;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;

public class TomteblossMain extends Activity {
	
//	private boolean isOn = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tomtebloss_main);
		
		final ImageButton sparkButton = (ImageButton) findViewById(R.id.spark_button);
		
		
		while (true) {
			int i = 1;
			for (i = 1; i < 16; i++) {
				try {
					sparkButton.setImageResource(R.drawable.class.getField("spark" + i).getInt(0));
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
//		sparkButton.setOnClickListener(new View.OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				if (isOn) {
//					sparkButton.setImageResource(R.drawable.spark1);
//					isOn = !isOn;
//				} else {
//					sparkButton.setImageResource(R.drawable.spark2);
//					isOn = !isOn;
//				}
//			}
//		});
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.activity_tomtebloss_main, menu);
//		return true;
//	}
}
