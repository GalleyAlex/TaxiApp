package com.thinkincab.partner.ui.activity.setting;

import com.thinkincab.partner.base.MvpPresenter;

public interface SettingsIPresenter<V extends SettingsIView> extends MvpPresenter<V> {
    void changeLanguage(String languageID);
}
