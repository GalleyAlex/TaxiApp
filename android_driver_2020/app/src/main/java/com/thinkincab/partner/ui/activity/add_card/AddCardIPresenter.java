package com.thinkincab.partner.ui.activity.add_card;

import com.thinkincab.partner.base.MvpPresenter;

public interface AddCardIPresenter<V extends AddCardIView> extends MvpPresenter<V> {

    void addCard(String stripeToken);
}
