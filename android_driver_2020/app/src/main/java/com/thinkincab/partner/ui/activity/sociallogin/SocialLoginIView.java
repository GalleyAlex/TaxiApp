package com.thinkincab.partner.ui.activity.sociallogin;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.Token;

public interface SocialLoginIView extends MvpView {

    void onSuccess(Token token);
    void onError(Throwable e);
}
