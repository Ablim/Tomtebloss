package com.bramstang.tomtebloss;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class TomteblossMain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tomtebloss_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_tomtebloss_main, menu);
		
		Button button = (Button) findViewById(R.id.spark_button);
        button.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                // Perform action on click
            }
        });
		return true;
	}
}
