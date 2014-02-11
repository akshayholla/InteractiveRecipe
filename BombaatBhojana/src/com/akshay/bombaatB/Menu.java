package com.akshay.bombaatB;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;




public class Menu extends Activity implements OnClickListener{
	/** Called when the activity is first created. */
	private int temp=0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
		int langis=((HelloApplication)getApplication()).getGlobalLang();
		
		if(langis == 2)
		{ 
			langset();
		}
		
		View clickmeButton = findViewById(R.id.buttonInc);
		clickmeButton.setOnClickListener(this);

		View clickmeButton1 = findViewById(R.id.buttonDec);
		clickmeButton1.setOnClickListener(this);
		
		View clickmeButton2 = findViewById(R.id.buttonMainDish);
		clickmeButton2.setOnClickListener(this);

		View clickmeButton3 = findViewById(R.id.buttonSnacks);
		clickmeButton3.setOnClickListener(this);
		
		View clickmeButton4 = findViewById(R.id.buttonSideDish);
		clickmeButton4.setOnClickListener(this);

		View clickmeButton5 = findViewById(R.id.buttonDesserts);
		clickmeButton5.setOnClickListener(this);
				
		
		
		
		TextView txtk1 = (TextView) findViewById(R.id.titleServe);  
		Typeface font = Typeface.createFromAsset(getAssets(), "TIMES.TTF"); 
        txtk1.setTypeface(font);  
        txtk1.setText("Servings");
        
        TextView txtk2 = (TextView) findViewById(R.id.buttonInc);  
        txtk2.setTypeface(font);  
        txtk2.setText("up");
        
        TextView txtk3 = (TextView) findViewById(R.id.buttonDec);  
        txtk3.setTypeface(font);  
        txtk3.setText("down");
		

		
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
		case R.id.buttonInc:
			temp=((HelloApplication)getApplication()).getGlobalServe();
			((HelloApplication)getApplication()).setGlobalServe(++temp);
			TextView txtk2 = (TextView) findViewById(R.id.textSer);  
	        txtk2.setText(String.valueOf(((HelloApplication)getApplication()).getGlobalServe()));
			break;
		case R.id.buttonDec:
			temp=((HelloApplication)getApplication()).getGlobalServe();
			((HelloApplication)getApplication()).setGlobalServe(--temp);
			TextView txtk3 = (TextView) findViewById(R.id.textSer); 
	        txtk3.setText(String.valueOf(((HelloApplication)getApplication()).getGlobalServe()));
			break;
		case R.id.buttonMainDish:
			Intent i = new Intent(this, MainDish.class);
			startActivity(i);
			break;
			
		case R.id.buttonSnacks:
			Intent i1 = new Intent(this, Snacks.class);
			startActivity(i1);
			break;
		case R.id.buttonSideDish:
			Intent i2 = new Intent(this, MainMenu.class);
			startActivity(i2);
			break;
		case R.id.buttonDesserts:
			Intent i3 = new Intent(this, MainMenu.class);
			startActivity(i3);
			break;
		}
		
	}
}