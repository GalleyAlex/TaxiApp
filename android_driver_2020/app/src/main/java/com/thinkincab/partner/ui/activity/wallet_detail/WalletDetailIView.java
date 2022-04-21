package com.thinkincab.partner.ui.activity.wallet_detail;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.Transaction;

import java.util.ArrayList;

public interface WalletDetailIView extends MvpView {
    void setAdapter(ArrayList<Transaction> myList);
}
