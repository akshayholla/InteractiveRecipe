package com.akshay.bombaatB;

import android.app.Activity;

import android.os.Bundle;

import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


public class PannPakoda extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		//Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.panpakoda);
		
		setQuants();
		
		setMethod();
		
	}
	
	public void setMethod()
	{
		TextView itm1= (TextView) findViewById(R.id.txtMethod);
		String met="Mix the gram flour, chilli powder and salt with water to make a thick batter.\n" +
				"Heat the oil in a kadhai and when hot, dip each spinach leaf in the gram flour batter and drop a few leaves at a time into the hot oil. \n" +
				" Fry until golden brown, remove and drain on absorbent paper.\n" +
				" Repeat for the remaining spinach leaves. \n " +
				"Place the spinach pakodas on on a serving plate. \n" +
				" Spread with the meethi soonth and sprinkle the cumin powder and chilli powder on top. \n" +
				" Serve Immediately.";
		 itm1.setText(met);
		 itm1.setTextSize(1, 25);
	
	}
	
	public void setQuants()
	{
		int serv=((HelloApplication)getApplication()).getGlobalServe();
		
		int itm1 =serv * 10;
		float itm2 = (float) (serv * 0.2);
		float itm3 = (float) (serv * 0.2);
		float itm4 = serv * 1;
		float itm5 = (float) (serv * 0.2);
		float itm6 = (float) (serv * 0.1);
		
		TextView itm= (TextView) findViewById(R.id.txtIng);
		String quant="Fresh spinach leaves[no.] =>" + itm1 + 
				"\n\nBengal gram flour (besan)[cup] =>" + itm2 +
				"\n\nChilli powder =>" + itm3 +
				"\n\nTea Spoon" +
				"\n\nSalt to taste " +
				"\n\nOil for deep frying" +
				"\n\nFor Serving" +
				"\n\nMeethi soonth[Tbl spn] =>" + itm4 +
				"\n\nRoasted cumin seed (jeera) powder[Tsp] =>" + itm5 +
				"\n\nChilli powder[Tsp] =>" + itm6 ;
		 itm.setText(quant);
		 itm.setTextSize(1, 25);
		
	}
}