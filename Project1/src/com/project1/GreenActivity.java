package com.project1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class GreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.greenlayout);
		
		
		Bundle b  = getIntent().getExtras();
		String usname = b.getString("USNAME");
		Toast.makeText(getApplicationContext(), usname, 10).show();
		
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
