package com.thinkincab.partner.ui.fragment.upcoming;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.HistoryList;

import java.util.List;

public interface UpcomingTripIView extends MvpView {

    void onSuccess(List<HistoryList> historyList);
    void onError(Throwable e);
}
