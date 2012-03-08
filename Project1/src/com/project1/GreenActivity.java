package com.project1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.greenlayout);
		Button greenbtn = (Button) findViewById(R.id.turnredbtn);
		greenbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i2 = new Intent(getApplicationContext(),FirstProject.class);
				startActivity(i2);
				
			}
		});
		
	}
	

}
