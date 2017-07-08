package ca.etsmtl.applets.etsmobile.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.ContentViewEvent;

import ca.etsmtl.applets.etsmobile.views.LoadingView;
import ca.etsmtl.applets.etsmobile2.R;

/**
 * Base fragment
 * 
 * @author Philippe
 */
public abstract class BaseFragment extends Fragment {



    protected LoadingView loadingView;

	//protected int layoutId = -1;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		Answers.getInstance().logContentView(new ContentViewEvent().putContentName(this.getClass().getSimpleName()));

        loadingView = (LoadingView) container.findViewById(R.id.loadingView);
		if (loadingView != null) {
			this.loadingView.setVisibility(View.GONE);
		}
		return container;
	}

	public abstract String getFragmentTitle();

}
