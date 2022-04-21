package com.thinkincab.partner.ui.activity.add_card;

import com.thinkincab.partner.base.MvpView;

public interface AddCardIView extends MvpView {

    void onSuccess(Object card);

    void onError(Throwable e);
}
