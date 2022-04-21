package com.thinkincab.partner.ui.activity.earnings;


import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.EarningsList;

public interface EarningsIView extends MvpView {

    void onSuccess(EarningsList earningsLists);

    void onError(Throwable e);
}
