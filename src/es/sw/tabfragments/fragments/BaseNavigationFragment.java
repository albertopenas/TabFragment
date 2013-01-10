package es.sw.tabfragments.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * 
 * @author albertopenasamor
 *
 */
public abstract class BaseNavigationFragment extends Fragment{

	/**
	 * pops a fragment from the stack
	 */
    protected void popFragment() {
        FragmentManager manager = getFragmentManager();
        if (manager.getBackStackEntryCount() > 0)
            getFragmentManager().popBackStack();
    }
    
    /**
     * pushes a fragment
     * @param f
     * @param addToBackStack flag add to back stack
     * @param transition fragment transition
     * @param fragmentLayout, linearlayout where the fragment is placed
     */
    protected void pushFragment(Fragment f, boolean addToBackStack, int transition, int fragmentLayout){
    	//FragmentManager manager = getFragmentManager();
    	//if (f != null)
    		FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(fragmentLayout, f);
        ft.setTransition(transition);
        if (addToBackStack)
            ft.addToBackStack(null);
        ft.commit();
    }
}
