package com.thinkincab.partner.ui.activity.upcoming_detail;


import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.HistoryDetail;

public interface UpcomingTripDetailIView extends MvpView {

    void onSuccess(HistoryDetail historyDetail);
    void onError(Throwable e);
}
