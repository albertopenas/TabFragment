package es.sw.tabfragments.fragments;

import es.ws.tabfragments.activity.R;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ExampleOneFragment extends BaseNavigationFragment implements OnClickListener{
	private TextView tv;
	private Button finishFragment;
	private Button nextFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.exampleonefragment, container, false);
        bindView(fragmentView);
        fillFragment();
        initListener();
        return fragmentView;
    }

	private void initListener() {
		finishFragment.setOnClickListener(this);
		nextFragment.setOnClickListener(this);
	}

	private void fillFragment() {
        tv.setText("Fragment address: " + this.toString());
	}

	private void bindView(View view) {
        tv = (TextView) view.findViewById(R.id.fragmentText);
		finishFragment = (Button) view.findViewById(R.id.finishfragment_button);
		nextFragment = (Button) view.findViewById(R.id.one_fragment_button);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.finishfragment_button:
				popFragment();
				break;
				
			case R.id.one_fragment_button:
				pushFragment(new ExampleFragment(), true, FragmentTransaction.TRANSIT_FRAGMENT_OPEN, R.id.simple_fragment);
				break;

		}
	}
    
    
}