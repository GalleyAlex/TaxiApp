package com.thinkincab.partner.ui.activity.wallet_detail;

import com.thinkincab.partner.base.MvpPresenter;
import com.thinkincab.partner.data.network.model.Transaction;

import java.util.ArrayList;

public interface WalletDetailIPresenter<V extends WalletDetailIView> extends MvpPresenter<V> {
    void setAdapter(ArrayList<Transaction> myList);
}
