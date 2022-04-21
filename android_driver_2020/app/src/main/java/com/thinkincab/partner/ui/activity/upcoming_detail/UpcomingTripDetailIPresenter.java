package com.thinkincab.partner.ui.activity.upcoming_detail;


import com.thinkincab.partner.base.MvpPresenter;

public interface UpcomingTripDetailIPresenter<V extends UpcomingTripDetailIView> extends MvpPresenter<V> {

    void getUpcomingDetail(String request_id);

}
