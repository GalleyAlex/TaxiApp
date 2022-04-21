package com.thinkincab.partner.ui.bottomsheetdialog.cancel;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.CancelResponse;

import java.util.List;

public interface CancelDialogIView extends MvpView {

    void onSuccessCancel(Object object);
    void onError(Throwable e);
    void onSuccess(List<CancelResponse> response);
    void onReasonError(Throwable e);
}
