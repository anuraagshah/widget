package edu.niu.cs.anuraag.widget_demo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemSelectedListener
{	
	Spinner classSpin;

	protected void onCreate(Bundle savedInstanceState) 
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		classSpin = (Spinner)findViewById(R.id.spinner1);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.classes, android.R.layout.simple_spinner_item);
		classSpin.setAdapter(adapter);
		classSpin.setOnItemSelectedListener(this);
	
	}

	public void onRadioButtonClicked(View v)
	{
		boolean checked = ((RadioButton)v).isChecked();
		
		switch(v.getId())
		{
		case R.id.radio0:
			if(checked)
				Toast.makeText(this, "Yes! Okay!", Toast.LENGTH_SHORT).show();
			break;
		case R.id.radio1:
			if(checked)
				Toast.makeText(this, "No! Okay!", Toast.LENGTH_SHORT).show();
			break;
			
		case R.id.radio2:
			if(checked)
				Toast.makeText(this, "MayBE! Okay!", Toast.LENGTH_SHORT).show();
			break;
		
		}
	}
	
	public void onCloudyClick(View v)
	{
		boolean checked = ((CheckBox)v).isChecked();
		if(checked)
		{
			Toast.makeText(this, "Cloudy", Toast.LENGTH_SHORT).show();
		}
		else
		{
			Toast.makeText(this, "No longer Cloudy", Toast.LENGTH_SHORT).show();
		}
		
	}
	
	
	public void onWindyClick(View v)
	{
		boolean checked = ((CheckBox)v).isChecked();
		if(checked)
		{
			Toast.makeText(this, "Windy", Toast.LENGTH_SHORT).show();
		}
		else
		{
			Toast.makeText(this, "No longer Windy", Toast.LENGTH_SHORT).show();
		}
	}
	
	
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View v, int pos,long id) 
	{
		Toast.makeText(this, "The item is selected: " +parent.getItemAtPosition(pos) + "and the id is: " + id, Toast.LENGTH_SHORT).show();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) 
	{
		// TODO Auto-generated method stub
		
	}

}
