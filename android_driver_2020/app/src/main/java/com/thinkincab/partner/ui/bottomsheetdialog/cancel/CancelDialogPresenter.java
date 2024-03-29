package com.thinkincab.partner.ui.bottomsheetdialog.cancel;

import com.thinkincab.partner.base.BasePresenter;
import com.thinkincab.partner.data.network.APIClient;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class CancelDialogPresenter<V extends CancelDialogIView> extends BasePresenter<V> implements CancelDialogIPresenter<V> {


    @Override
    public void cancelRequest(HashMap<String, Object> obj) {
        getCompositeDisposable().add(
                APIClient
                        .getAPIClient()
                        .cancelRequest(obj)
                        .subscribeOn(Schedulers.computation())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                trendsResponse -> getMvpView().onSuccessCancel(trendsResponse),
                                throwable -> getMvpView().onError(throwable)
                        )
        );
    }

    @Override
    public void getReasons() {
        getCompositeDisposable().add(APIClient
                .getAPIClient()
                .getCancelReasons()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(getMvpView()::onSuccess, getMvpView()::onReasonError));
    }
}
