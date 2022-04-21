package com.thinkincab.partner.ui.activity.earnings;


import com.thinkincab.partner.base.MvpPresenter;

public interface EarningsIPresenter<V extends EarningsIView> extends MvpPresenter<V> {

    void getEarnings();
}
