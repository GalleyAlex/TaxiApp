package com.thinkincab.partner.ui.fragment.status_flow;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.TimerResponse;

public interface StatusFlowIView extends MvpView {

    void onSuccess(Object object);

    void onWaitingTimeSuccess(TimerResponse object);

    void onError(Throwable e);
}
