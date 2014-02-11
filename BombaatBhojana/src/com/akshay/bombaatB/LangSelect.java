package com.akshay.bombaatB;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class LangSelect extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		//Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.lang);
		
		TextView txtk = (TextView) findViewById(R.id.buttonKan);  
        Typeface font = Typeface.createFromAsset(getAssets(), "bb1.ttf");  
        txtk.setTypeface(font);  
        txtk.setText("@");
        txtk.setTextSize (2, 40);

		View clickmeButton = findViewById(R.id.buttonEng);
		clickmeButton.setOnClickListener(this);

		View clickmeButton1 = findViewById(R.id.buttonKan);
		clickmeButton1.setOnClickListener(this);

		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.buttonEng:
			finish();
			((HelloApplication)getApplication()).setGlobalLang(1);
			Intent i = new Intent(this, MainMenu.class);
			startActivity(i);
			break;
		case R.id.buttonKan:
			finish();
			((HelloApplication)getApplication()).setGlobalLang(2);
			Intent i1 = new Intent(this, MainMenu.class);
			startActivity(i1);
			break;
		}

	}
}