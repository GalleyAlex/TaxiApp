package com.thinkincab.partner.ui.activity.summary;


import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.Summary;

public interface SummaryIView extends MvpView {

    void onSuccess(Summary object);

    void onError(Throwable e);
}
