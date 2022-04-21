package com.thinkincab.partner.ui.activity.wallet_detail;

import com.thinkincab.partner.base.BasePresenter;
import com.thinkincab.partner.data.network.model.Transaction;

import java.util.ArrayList;

public class WalletDetailPresenter<V extends WalletDetailIView> extends BasePresenter<V> implements WalletDetailIPresenter<V> {
    @Override
    public void setAdapter(ArrayList<Transaction> myList) {
        getMvpView().setAdapter(myList);
    }
}
