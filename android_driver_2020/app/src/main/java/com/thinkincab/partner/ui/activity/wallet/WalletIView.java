package com.thinkincab.partner.ui.activity.wallet;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.WalletMoneyAddedResponse;
import com.thinkincab.partner.data.network.model.WalletResponse;

public interface WalletIView extends MvpView {

    void onSuccess(WalletResponse response);

    void onSuccess(WalletMoneyAddedResponse response);

    void onError(Throwable e);
}
