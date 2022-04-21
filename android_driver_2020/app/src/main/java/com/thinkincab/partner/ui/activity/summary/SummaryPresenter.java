package com.thinkincab.partner.ui.activity.summary;


import com.thinkincab.partner.base.BasePresenter;
import com.thinkincab.partner.data.network.APIClient;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SummaryPresenter<V extends SummaryIView> extends BasePresenter<V> implements SummaryIPresenter<V> {
    @Override
    public void getSummary(String data) {
        getCompositeDisposable().add(
                APIClient
                        .getAPIClient()
                        .getSummary(data)
                        .subscribeOn(Schedulers.computation())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                trendsResponse -> getMvpView().onSuccess(trendsResponse),
                                throwable -> getMvpView().onError(throwable)
                        )
        );
    }
}
