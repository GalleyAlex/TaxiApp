package com.thinkincab.partner.ui.fragment.past;


import com.thinkincab.partner.base.MvpPresenter;

public interface PastTripIPresenter<V extends PastTripIView> extends MvpPresenter<V> {

    void getHistory();

}
