package com.thinkincab.partner.ui.activity.card;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.Card;

import java.util.List;

public interface CardIView extends MvpView {

    void onSuccess(Object card);

    void onSuccess(List<Card> cards);

    void onError(Throwable e);

    void onSuccessChangeCard(Object card);
}
