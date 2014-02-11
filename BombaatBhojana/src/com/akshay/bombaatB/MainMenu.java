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



public class MainMenu extends Activity implements OnClickListener{
	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Remove title bar
				this.requestWindowFeature(Window.FEATURE_NO_TITLE);
				
		//Remove notification bar
				this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
				
		setContentView(R.layout.main);
		
		

		
		
		
		View clickmeButton = findViewById(R.id.buttonMenu);
		clickmeButton.setOnClickListener(this);

		View clickmeButton1 = findViewById(R.id.buttonAbout);
		clickmeButton1.setOnClickListener(this);
		
		int langis=((HelloApplication)getApplication()).getGlobalLang();
		
		if(langis == 2)
		{ 
			
		TextView txtk = (TextView) findViewById(R.id.buttonMenu);  
        Typeface font = Typeface.createFromAsset(getAssets(), "bb1.ttf");  
        txtk.setTypeface(font);  
        txtk.setText("!");
        txtk.setTextSize (2, 50);
        
        
        TextView txtk2 = (TextView) findViewById(R.id.buttonAbout);  
        txtk2.setTypeface(font);  
        txtk2.setText("$");
        txtk2.setTextSize (2, 50);
		
		
        
		}
		
		/*
		 * TextView txtk = (TextView) findViewById(R.id.buttonKan);  
        Typeface font = Typeface.createFromAsset(getAssets(), "bb1.ttf");  
        txtk.setTypeface(font);  
        txtk.setText("@");
        txtk.setTextSize (2, 40);
        */
		

		
}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.buttonMenu:
			Intent i = new Intent(this, Menu.class);
			startActivity(i);
			break;
		case R.id.buttonAbout:
			Intent i1 = new Intent(this, Menu.class);
			startActivity(i1);
			break;
		}
		
	}
}