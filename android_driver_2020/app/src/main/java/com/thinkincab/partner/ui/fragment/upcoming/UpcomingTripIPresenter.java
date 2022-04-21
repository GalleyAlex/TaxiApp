package com.thinkincab.partner.ui.fragment.upcoming;


import com.thinkincab.partner.base.MvpPresenter;

public interface UpcomingTripIPresenter<V extends UpcomingTripIView> extends MvpPresenter<V> {

    void getUpcoming();

}
