package com.thinkincab.partner.ui.activity.reset_password;

import com.thinkincab.partner.base.MvpView;

public interface ResetIView extends MvpView{

    void onSuccess(Object object);
    void onError(Throwable e);
}
