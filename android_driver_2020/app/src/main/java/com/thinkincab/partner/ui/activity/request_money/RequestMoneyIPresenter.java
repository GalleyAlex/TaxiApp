package com.thinkincab.partner.ui.activity.request_money;

import com.thinkincab.partner.base.MvpPresenter;

public interface RequestMoneyIPresenter<V extends RequestMoneyIView> extends MvpPresenter<V> {

    void getRequestedData();
    void requestMoney(Double requestedAmt);
    void removeRequestMoney(int id);

}
