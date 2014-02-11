package com.akshay.bombaatB;

import android.app.Application;

public class HelloApplication extends Application{
	private int globalLang=1;
	private int globalServe=1;
	 
    public int getGlobalLang() {
            return globalLang;
    }
 
    public int getGlobalServe() {
    	        return globalServe;
    }

    public void setGlobalLang(int globalLang) {
    		
            this.globalLang = globalLang;
    }
    
    public void setGlobalServe(int globalServe) {
    	if(globalServe >=1)
        this.globalServe = globalServe;
    }
    
    @Override
    public void onCreate() {
            //reinitialize variable
    }
	

}
