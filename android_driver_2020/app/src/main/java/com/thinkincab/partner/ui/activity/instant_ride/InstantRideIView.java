package com.thinkincab.partner.ui.activity.instant_ride;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.EstimateFare;
import com.thinkincab.partner.data.network.model.TripResponse;

public interface InstantRideIView extends MvpView {

    void onSuccess(EstimateFare estimateFare);

    void onSuccess(TripResponse response);

    void onError(Throwable e);

}
