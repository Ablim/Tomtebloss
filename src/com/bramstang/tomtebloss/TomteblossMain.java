package com.bramstang.tomtebloss;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

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
		return true;
	}

}
