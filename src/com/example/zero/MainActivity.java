package com.example.zero;

import android.app.Activity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private Button btn;
	
	private Button btn2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn = (Button) findViewById(R.id.button1);
		
		btn.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				if(event.getAction()==MotionEvent.ACTION_DOWN){
					Toast.makeText(MainActivity.this, "down", Toast.LENGTH_SHORT).show();
				}else if(event.getAction()==MotionEvent.ACTION_UP){
					Toast.makeText(MainActivity.this, "up", Toast.LENGTH_SHORT).show();
				}
				return false;
			}
		});
	
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
			}
		});
		
		btn2 =(Button) findViewById(R.id.button2);
		
		btn2.setOnDragListener(new OnDragListener() {
			
			@Override
			public boolean onDrag(View v, DragEvent event) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "drag", Toast.LENGTH_SHORT).show();
				return false;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/*public void click(View v){
		Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();
	}*/

}
