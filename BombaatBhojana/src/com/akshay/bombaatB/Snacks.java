package com.akshay.bombaatB;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;



public class Snacks extends Activity implements OnClickListener{
	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Remove title bar
				this.requestWindowFeature(Window.FEATURE_NO_TITLE);
				
		//Remove notification bar
				this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
				
		setContentView(R.layout.snacks);
		

		int langis=((HelloApplication)getApplication()).getGlobalLang();
		
		if(langis == 2)
		{ 
			langset();
		}
		
		View clickmeButton = findViewById(R.id.buttonPaanPakoda);
		clickmeButton.setOnClickListener(this);
		
		
		
		
		TextView txtk1 = (TextView) findViewById(R.id.buttonPaanPakoda);  
		Typeface font = Typeface.createFromAsset(getAssets(), "TIMES.TTF"); 
        txtk1.setTypeface(font);  
        txtk1.setText("Paan Pakoda ! 35mins");
                
        	

		
	}
	
	public void langset()
	{
		
		/*
		TextView txtk = (TextView) findViewById(R.id.buttonMenu);  
        Typeface font = Typeface.createFromAsset(getAssets(), "bb1.ttf");  
        txtk.setTypeface(font);  
        txtk.setText("!");
        txtk.setTextSize (2, 50);
        
        TextView txtk1 = (TextView) findViewById(R.id.textTitle);  
        txtk1.setTypeface(font);  
        txtk1.setText("\" #");
        txtk1.setTextSize (2, 50);
        
        TextView txtk2 = (TextView) findViewById(R.id.buttonAbout);  
        txtk2.setTypeface(font);  
        txtk2.setText("$");
        txtk2.setTextSize (2, 50);
			*/
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonPaanPakoda:
			Intent i1 = new Intent(this, PannPakoda.class);
			startActivity(i1);
			break;
		}
		
	}
}