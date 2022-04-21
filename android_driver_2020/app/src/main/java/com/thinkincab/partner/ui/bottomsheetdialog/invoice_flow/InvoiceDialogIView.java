package com.thinkincab.partner.ui.bottomsheetdialog.invoice_flow;

import com.thinkincab.partner.base.MvpView;

public interface InvoiceDialogIView extends MvpView {

    void onSuccess(Object object);
    void onError(Throwable e);
}
