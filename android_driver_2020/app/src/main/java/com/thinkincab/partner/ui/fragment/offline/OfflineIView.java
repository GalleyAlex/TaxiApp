package com.thinkincab.partner.ui.fragment.offline;

import com.thinkincab.partner.base.MvpView;

public interface OfflineIView extends MvpView {

    void onSuccess(Object object);
    void onError(Throwable e);
}
