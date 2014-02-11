package com.akshay.bombaatB;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;




public class MainDish extends Activity implements OnClickListener{
	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maindish);
		
		int langis=((HelloApplication)getApplication()).getGlobalLang();
		
		if(langis == 2)
		{ 
			langset();
		}
		
		View clickmeButton = findViewById(R.id.buttonCapPulav);
		clickmeButton.setOnClickListener(this);
		
		
		
		
		TextView txtk1 = (TextView) findViewById(R.id.buttonCapPulav);  
		Typeface font = Typeface.createFromAsset(getAssets(), "TIMES.TTF"); 
        txtk1.setTypeface(font);  
        txtk1.setText("Capsicum Pulav ! 45mins");
                
        	

		
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
		case R.id.buttonCapPulav:
			Intent i1 = new Intent(this, CapPulav.class);
			startActivity(i1);
			break;
		}
		
	}
}