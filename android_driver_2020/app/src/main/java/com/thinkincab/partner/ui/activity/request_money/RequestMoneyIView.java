package com.thinkincab.partner.ui.activity.request_money;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.RequestDataResponse;

public interface RequestMoneyIView extends MvpView {

    void onSuccess(RequestDataResponse response);
    void onSuccess(Object response);
    void onError(Throwable e);

}
