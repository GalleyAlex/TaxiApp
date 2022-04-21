package com.thinkincab.partner.ui.activity.summary;


import com.thinkincab.partner.base.MvpPresenter;

public interface SummaryIPresenter<V extends SummaryIView> extends MvpPresenter<V> {

    void getSummary(String data);
}
