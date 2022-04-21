package com.thinkincab.partner.ui.activity.help;


import com.thinkincab.partner.base.MvpPresenter;

public interface HelpIPresenter<V extends HelpIView> extends MvpPresenter<V> {

    void getHelp();
}
