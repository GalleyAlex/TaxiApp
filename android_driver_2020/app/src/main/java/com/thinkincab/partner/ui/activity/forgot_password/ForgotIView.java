package com.thinkincab.partner.ui.activity.forgot_password;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.ForgotResponse;

public interface ForgotIView extends MvpView {

    void onSuccess(ForgotResponse forgotResponse);
    void onError(Throwable e);
}
