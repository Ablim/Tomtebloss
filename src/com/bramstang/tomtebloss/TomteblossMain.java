package com.bramstang.tomtebloss;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageButton;

public class TomteblossMain extends Activity {

	private Timer timer;
	private ImageButton sparkButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_tomtebloss_main);
		sparkButton = (ImageButton) findViewById(R.id.spark_button);
		sparkButton.setImageResource(R.drawable.spark1);
	}

	@Override
	protected void onStop() {
		super.onStop();
		timer.cancel();
		timer.purge();
	}

	@Override
	protected void onStart() {
		super.onStart();
		timer = new Timer();
		timer.schedule(new ImageTask(), 150, 150);
		
//		MediaPlayer player = MediaPlayer.create(this, R.raw.spark);
//		player.start();
	}

	private class ImageTask extends TimerTask {

		private int index;
		private int maxIndex;
		private AtomicBoolean lock;

		public ImageTask() {
			index = 1;
			maxIndex = 85;
			lock = new AtomicBoolean();
		}

		@Override
		public void run() {
			if (!lock.get()) {
				runOnUiThread(new Runnable() {
					public void run() {
						lock.set(true);
						Resources r = getResources();
//						sparkButton.setImageResource(getResources().getIdentifier("spark" + index++, "drawable", "com.bramstang.tomtebloss"));
						sparkButton.setImageDrawable(r.getDrawable(r.getIdentifier("spark" + index++, "drawable", "com.bramstang.tomtebloss")));
						
						if (index > maxIndex) {
							index = 1;
						}
						lock.set(false);
					}
				});
			} 
		}
	}
}
