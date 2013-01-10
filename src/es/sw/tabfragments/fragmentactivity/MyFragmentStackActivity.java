package es.sw.tabfragments.fragmentactivity;

import es.sw.tabfragments.fragments.ExampleOneFragment;
import es.ws.tabfragments.activity.R;
import android.os.Bundle;

/**
 * 
 * @author albertopenasamor
 *
 */
public class MyFragmentStackActivity extends BaseFragmentStackActivity {

    static final String TAG = "FragmentStackActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentstackctivity);

        launchNewFragment(new ExampleOneFragment());
    }
}