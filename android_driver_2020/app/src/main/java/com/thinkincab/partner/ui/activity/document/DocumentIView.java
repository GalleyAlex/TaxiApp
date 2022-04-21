package com.thinkincab.partner.ui.activity.document;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.DriverDocumentResponse;

public interface DocumentIView extends MvpView {

    void onSuccess(DriverDocumentResponse response);

    void onDocumentSuccess(DriverDocumentResponse response);

    void onError(Throwable e);

    void onSuccessLogout(Object object);

}
