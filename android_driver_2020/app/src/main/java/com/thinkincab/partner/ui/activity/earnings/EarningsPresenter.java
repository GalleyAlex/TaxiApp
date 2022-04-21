package com.thinkincab.partner.ui.activity.earnings;

import com.thinkincab.partner.base.BasePresenter;
import com.thinkincab.partner.data.network.APIClient;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class EarningsPresenter<V extends EarningsIView> extends BasePresenter<V> implements EarningsIPresenter<V> {
    @Override
    public void getEarnings() {
        getCompositeDisposable().add(
                APIClient
                        .getAPIClient()
                        .getEarnings()
                        .subscribeOn(Schedulers.computation())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                trendsResponse -> getMvpView().onSuccess(trendsResponse),
                                throwable -> getMvpView().onError(throwable)
                        )
        );
    }
}
