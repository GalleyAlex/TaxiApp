package com.thinkincab.partner.ui.activity.password;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.ForgotResponse;
import com.thinkincab.partner.data.network.model.User;

public interface PasswordIView extends MvpView {

    void onSuccess(ForgotResponse forgotResponse);

    void onSuccess(User object);

    void onError(Throwable e);
}
