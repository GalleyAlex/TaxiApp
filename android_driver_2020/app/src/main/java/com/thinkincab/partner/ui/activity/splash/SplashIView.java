package com.thinkincab.partner.ui.activity.splash;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.CheckVersion;

public interface SplashIView extends MvpView {

    void verifyAppInstalled();

    void onSuccess(Object user);

    void onSuccess(CheckVersion user);

    void onError(Throwable e);

    void onCheckVersionError(Throwable e);
}
