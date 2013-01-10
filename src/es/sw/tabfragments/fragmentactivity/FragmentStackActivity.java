package es.sw.tabfragments.fragmentactivity;

import android.os.Bundle;
import es.sw.tabfragments.fragments.ExampleFragment;
import es.ws.tabfragments.activity.R;


public class FragmentStackActivity extends BaseFragmentStackActivity {

    static final String TAG = "FragmentStackActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentstackctivity);

        launchNewFragment(new ExampleFragment());
    }
}