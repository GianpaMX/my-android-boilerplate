package net.ddns.softux.app.androidapp.mainusecase;

/**
 * Created by juan on 30/06/16.
 */

public class MainPresenter {

    protected MainView view;

    public MainPresenter() {
    }

    public MainView getView() {
        return view;
    }

    public void setView(MainView view) {
        this.view = view;
    }
}
