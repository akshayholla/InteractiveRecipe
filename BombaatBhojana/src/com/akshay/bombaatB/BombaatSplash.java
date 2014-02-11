package com.akshay.bombaatB;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class BombaatSplash extends Activity {

    /** Called when the activity is first created. */
	protected boolean _active = true;
	protected int _splashTime = 4000; // time to display the splash screen in ms
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        TextView txtk = (TextView) findViewById(R.id.mainTitle);  
        Typeface font = Typeface.createFromAsset(getAssets(), "BAUHS93.TTF");
        txtk.setTypeface(font);  
        txtk.setText("Bombatt Bhojana");
        
        MediaPlayer mp = MediaPlayer.create(getBaseContext(),
                R.raw.bomaataudio);
        mp.start();

        
     // thread for displaying the SplashScreen
     		Thread splashTread = new Thread() {
				@Override
     			public void run() {
     				try {
     					int waited = 0;
     					while (_active && (waited < _splashTime)) {
     						sleep(100);
     						if (_active) {
     							waited += 100;
     						}
     					}
     				} catch (InterruptedException e) {
     					// do nothing
     				} finally {
     					//finish();
     					// startActivity(new
     					// Intent("com.akshay.splashScreen.mainScreen.mainScreen"));

     					Intent i = new Intent();
     					i.setClassName("com.akshay.bombaatB",
     							"com.akshay.bombaatB.LangSelect");
     					startActivity(i);

     				}
     			}
     		};
     		splashTread.start();
     	}

     	@Override
     	public boolean onTouchEvent(MotionEvent event) {
     		if (event.getAction() == MotionEvent.ACTION_DOWN) {
     			_active = false;
     			Intent i = new Intent();
					i.setClassName("com.akshay.bombaatB",
							"com.akshay.bombaatB.LangSelect");
					startActivity(i);

					
     			
     		}
     		return true;
     	}
     	
     
     }