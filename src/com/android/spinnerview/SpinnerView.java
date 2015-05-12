package com.android.spinnerview;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class SpinnerView extends Activity {
	String[] tutorial = {
            "Android",
            "PHP",
            "HTML",
            "Java",
            "C++",
            "Laravel",
            "CodeIgniter",
            "CSS",
            "YII",
            "Angular",
            "Node js"
    };
 
    Spinner s1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spinner);
		
		 s1 = (Spinner) findViewById(R.id.spinner1);
		 
	        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	            android.R.layout.simple_spinner_dropdown_item, tutorial);
	 
	        s1.setAdapter(adapter);
	        s1.setOnItemSelectedListener(new OnItemSelectedListener()
	        {
	            public void onItemSelected(AdapterView<?> arg0, 
	            View arg1, int arg2, long arg3) 
	            {
	                int index = s1.getSelectedItemPosition();
	                Toast.makeText(getBaseContext(), 
	                    "You have selected item : " + tutorial[index], 
	                    Toast.LENGTH_SHORT).show();                
	            }
	 
	            public void onNothingSelected(AdapterView<?> arg0) {}
	        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.spinner_view, menu);
		return true;
	}

}
