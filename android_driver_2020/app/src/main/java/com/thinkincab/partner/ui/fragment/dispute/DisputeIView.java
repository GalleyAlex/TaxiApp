package com.thinkincab.partner.ui.fragment.dispute;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.DisputeResponse;

import java.util.List;

public interface DisputeIView extends MvpView {

    void onSuccessDispute(List<DisputeResponse> responseList);

    void onSuccess(Object object);

    void onError(Throwable e);
}
