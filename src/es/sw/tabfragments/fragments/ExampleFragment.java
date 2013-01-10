/*
 * Copyright (c) 2012, Cutehacks AS
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name of Cutehacks AS nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package es.sw.tabfragments.fragments;

import es.sw.tabfragments.activity.ExampleActivity;
import es.ws.tabfragments.activity.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ExampleFragment extends BaseNavigationFragment implements OnClickListener{
	private Button finishFragmentButton = null;
	private Button newFragmentButton = null;
	private Button newActivity = null;
	private TextView tv = null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.examplefragment, container, false);
        bindView(fragmentView);
        fillFragment();
        initListener();
        return fragmentView;
    }

	private void initListener() {
		finishFragmentButton.setOnClickListener(this);
		newFragmentButton.setOnClickListener(this);
	}

	private void fillFragment() {
		 tv.setText("Fragment address: " + this.toString());		
	}

	private void bindView(View fragmentView) {
		tv = (TextView) fragmentView.findViewById(R.id.fragmentText);
		finishFragmentButton = (Button) fragmentView.findViewById(R.id.finishfragment_button);
		newFragmentButton = (Button) fragmentView.findViewById(R.id.newfragment_button);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.finishfragment_button:
				popFragment();
				break;
					
			case R.id.newfragment_button:
				pushFragment(new ExampleFragment(), true, FragmentTransaction.TRANSIT_FRAGMENT_OPEN, R.id.simple_fragment);
				break;

		}
	}
    
    
}