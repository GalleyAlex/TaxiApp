package com.thinkincab.partner.ui.fragment.incoming_request;

import com.thinkincab.partner.base.MvpView;

public interface IncomingRequestIView extends MvpView {

    void onSuccessAccept(Object responseBody);
    void onSuccessCancel(Object object);
    void onError(Throwable e);
}
