package net.ddns.softux.app.androidapp.mainusecase;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.ddns.softux.app.R;

public class MainFragment extends Fragment implements MainView {

    protected MainFragmentContainerListener containerListener;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getActivity() instanceof MainFragmentContainerListener) {
            containerListener = (MainFragmentContainerListener) getActivity();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        containerListener = null;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        return view;
    }

    public interface MainFragmentContainerListener {
    }
}
