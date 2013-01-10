package es.sw.tabfragments.fragmentactivity;

import es.sw.tabfragments.activity.ExampleActivity;
import es.ws.tabfragments.activity.R;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

/**
 * 
 * @author albertopenasamor
 *
 */
public abstract class BaseFragmentStackActivity extends FragmentActivity {

    static final String TAG = "FragmentStackActivity";

    /**
     * Adds a fragment to the tab
     * @param fragment
     * @param addToBackStack
     * @param transition
     */
    private void addFragment(Fragment fragment, boolean addToBackStack, int transition) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.simple_fragment, fragment);
        ft.setTransition(transition);
        if (addToBackStack)
            ft.addToBackStack(null);
        ft.commit();
    }

	/**
	 * closes a fragment inside the tab
	 */
    protected void finishFragment() {
        FragmentManager manager = getSupportFragmentManager();
        if (manager.getBackStackEntryCount() > 0)
            getSupportFragmentManager().popBackStack();
    }
    
    @Override
    public void onBackPressed() {
    	super.onBackPressed();
        if (getSupportFragmentManager().getBackStackEntryCount() == 0)
            finish();
    }
    
    /**
     * closes a activity inside the tab 
     */
    protected void finishActivity(){
    	finish();
    }


    /**
     * Launch a new fragment for the tab
     * @param f
     */
    protected void launchNewFragment(Fragment f) {
        addFragment(f, true, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
    }
    
    
    /**
     * Launchs a new activity for the tab 
     * @param context
     * @param clazz
     */
    protected void launchNewActivity(Context context, Class<?> clazz) {
        Intent intent = new Intent(context, clazz);
        startActivity(intent);
    }
    
    /**
     * OnClick From fragment to launch new activity
     * @param v
     */
    public void startActivityFromFragment(View v){
    	switch (v.getId()) {
    		case R.id.new_activity_from_fragment_button:
    	        Intent intent = new Intent(this, ExampleActivity.class);
    	        startActivity(intent);
    			break;

		}
    }
}