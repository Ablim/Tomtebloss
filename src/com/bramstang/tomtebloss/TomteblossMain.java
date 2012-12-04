package com.bramstang.tomtebloss;

import android.app.Activity;
import android.content.ClipData.Item;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class TomteblossMain extends Activity {
	
	private boolean isOn = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tomtebloss_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_tomtebloss_main, menu);
		
		
//		final menu settingsButton = (Button) findViewById(R.id.spark_button);
//        button.setOnClickListener(new View.OnClickListener()  {
//            public void onClick(View v) {
//                // Perform action on click
//            }
//        });
		
		final ImageButton sparkButton = (ImageButton) findViewById(R.id.spark_button);
		sparkButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (isOn) {
					sparkButton.setImageResource(R.drawable.candle_off);
					isOn = !isOn;
				} else {
					sparkButton.setImageResource(R.drawable.candle_on);
					isOn = !isOn;
				}
			}
		});
		return true;
	}
}
