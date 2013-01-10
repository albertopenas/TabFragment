package es.sw.tabfragments.activity;

import es.sw.tabfragments.fragmentactivity.FragmentStackActivity;
import es.sw.tabfragments.fragmentactivity.MyFragmentStackActivity;
import es.ws.tabfragments.activity.R;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;

/**
 * 
 * @author albertopenasamor
 *
 */
public class TabsFragmentsActivity extends TabActivity {

    private static final String TAG = "TabsWithFragmentsActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabswithfragmentsactivity);

        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, MyFragmentStackActivity.class);
        spec = tabHost.newTabSpec("firsttab").setIndicator("First tab").setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, FragmentStackActivity.class);
        spec = tabHost.newTabSpec("secondtab").setIndicator("Second tab").setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, FragmentStackActivity.class);
        spec = tabHost.newTabSpec("thirdtab").setIndicator("Third tab").setContent(intent);
        tabHost.addTab(spec);

        // set default tab
        tabHost.setCurrentTabByTag("firsttab");
    }
}
