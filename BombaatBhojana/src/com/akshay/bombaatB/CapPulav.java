package com.akshay.bombaatB;

import android.app.Activity;

import android.os.Bundle;

import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


public class CapPulav extends Activity {
	/** Called when the activity is first created. */
	private float t;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		//Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.cappul);
		
		setQuants();
		
		setMethod();
		
	}
	
	public void setMethod()
	{
		TextView itm1= (TextView) findViewById(R.id.textMethod);
		String met="Finelly chop capsicum.\n " +
				"Pick an wash rice. Heat oil in a pan add capsicum," +
				" fry for 2-3 minutes, keep aside.\n" +
				" Heat ghee in a pan add onion, ginger, garlic fry for 2-3 minutes.\n " +
				"Add rice fry for 1 minutes.\n " +
				"Add garam masala, salt, red chilli powder, water, cook till just done.\n " +
				"Add capsicum, mix well. Serve hot.";
		 itm1.setText(met);
		 itm1.setTextSize(1, 30);
	
	}
	
	public void setQuants()
	{
		int serv=((HelloApplication)getApplication()).getGlobalServe();
		
		//item1
		TextView itm1= (TextView) findViewById(R.id.item1);
		t=0;
		t=(float) (t+(serv*0.5));
        itm1.setText(String.valueOf(t));
      //item2
      	itm1= (TextView) findViewById(R.id.item2);
      	t=0;
      	t=(float) (t+(serv*0.5));
        itm1.setText(String.valueOf(t));       
      //item3
      	itm1= (TextView) findViewById(R.id.item3);
      	t=0;
      	t=(float) (t+(serv*1));
        itm1.setText(String.valueOf(t));        
      //item4
      	itm1= (TextView) findViewById(R.id.item4);
      	t=0;
      	t=(float) (t+(serv*0.75));
        itm1.setText(String.valueOf(t));
        //item5
      	itm1= (TextView) findViewById(R.id.item5);
      	t=0;
      	t=(float) (t+(serv*0.5));
        itm1.setText(String.valueOf(t));
        //item6
      	itm1= (TextView) findViewById(R.id.item6);
      	t=0;
      	t=(float) (t+(serv*0.25));
        itm1.setText(String.valueOf(t));
        //item7
      	itm1= (TextView) findViewById(R.id.item7);
      	t=0;
      	t=(float) (t+(serv*1));
        itm1.setText(String.valueOf(t));
      //item8
      	itm1= (TextView) findViewById(R.id.item8);
      	t=0;
      	t=(float) (t+(serv*0.75));
        itm1.setText(String.valueOf(t));
      //item9
      	itm1= (TextView) findViewById(R.id.item9);
      	t=0;
      	t=(float) (t+(serv*1));
        itm1.setText(String.valueOf(t));
      //item10
      	itm1= (TextView) findViewById(R.id.item10);
      	t=0;
      	t=(float) (t+(serv*0.5));
        itm1.setText(String.valueOf(t));
      //item1
      	itm1= (TextView) findViewById(R.id.item11);
      	t=0;
      	t=(float) (t+(serv*0.5));
        itm1.setText(String.valueOf(t));
	}
}