package si.fri.pp.liki;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ObsegActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_obseg);
	}

	public void izracunaj_obseg(View view) {
		EditText n = (EditText) findViewById(R.id.ET_n);
		EditText a = (EditText) findViewById(R.id.ET_a);
		if(n.getText().length() > 0 && a.getText().length() > 0){
			int int_n = Integer.parseInt(n.getText().toString());
			int int_a = Integer.parseInt(a.getText().toString());
			if(int_n > 3 && int_a > 0){
				int r = int_n * int_a;
				TextView rez = (TextView) findViewById(R.id.resitev);
				rez.setText("= " + Integer.toString(r));
			}else 
				Toast.makeText(getApplicationContext(), "Raje še enkrat preveri vpisane podatke.",
						Toast.LENGTH_SHORT).show();
			
		}
		
	}
	
	public void preveri_resitve(View view){
		EditText n1 = (EditText) findViewById(R.id.ET_steviloStranic1);
		EditText n2 = (EditText) findViewById(R.id.ET_steviloStranic2);
		EditText n3 = (EditText) findViewById(R.id.ET_steviloStranic3);
		
		if(n1.getText().length() > 0 && n2.getText().length() > 0 && n3.getText().length() > 0){
			int int_n1 = Integer.parseInt(n1.getText().toString());
			int int_n2 = Integer.parseInt(n2.getText().toString());
			int int_n3 = Integer.parseInt(n3.getText().toString());
			if(int_n1 == 4 && int_n2 == 7 && int_n3 == 5){
				Toast.makeText(getApplicationContext(), "Bravo, pravilno si ugotovil vse like.",
						Toast.LENGTH_SHORT).show();
			}
			else
				Toast.makeText(getApplicationContext(), "Raje še enkrat preveri vsako rešitev.",
						Toast.LENGTH_SHORT).show();
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.obseg, menu);
		return true;
	}

}
