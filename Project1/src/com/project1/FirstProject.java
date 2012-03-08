package com.project1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstProject extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		Button btn1 = (Button) findViewById(R.id.turngreenbtn);
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Bundle b = new Bundle();
				b.putString("USNAME", "Geomel");
				
				Intent i = new Intent(FirstProject.this,GreenActivity.class);
				i.putExtras(b);
				startActivity(i);
				
			}
		});
		
	}
	
	
	

}
