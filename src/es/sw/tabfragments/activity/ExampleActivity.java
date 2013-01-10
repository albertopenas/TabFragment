package es.sw.tabfragments.activity;

import es.ws.tabfragments.activity.R;
import android.app.Activity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;

/**
 * 
 * @author albertopenasamor
 *
 */
public class ExampleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exampleactivity);
    }

    public void proccessButtons(View view){
    	switch (view.getId()) {
			case R.id.finish_button:
				finish();
				break;
			case R.id.newactivity_button:
				Intent intent = new Intent(this, ExampleActivity.class);
				startActivity(intent);
				break;

		}
    }
    
}