package com.thinkincab.partner.ui.activity.past_detail;


import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.HistoryDetail;

public interface PastTripDetailIView extends MvpView {

    void onSuccess(HistoryDetail historyDetail);
    void onError(Throwable e);
}
