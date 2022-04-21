package com.thinkincab.partner.ui.activity.setting;

import com.thinkincab.partner.base.MvpView;

public interface SettingsIView extends MvpView {

    void onSuccess(Object o);

    void onError(Throwable e);

}
