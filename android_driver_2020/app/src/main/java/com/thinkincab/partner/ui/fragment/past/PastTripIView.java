package com.thinkincab.partner.ui.fragment.past;


import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.HistoryList;

import java.util.List;

public interface PastTripIView extends MvpView {

    void onSuccess(List<HistoryList> historyList);
    void onError(Throwable e);
}
