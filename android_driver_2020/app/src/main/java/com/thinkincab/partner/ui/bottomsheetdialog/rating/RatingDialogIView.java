package com.thinkincab.partner.ui.bottomsheetdialog.rating;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.Rating;

public interface RatingDialogIView extends MvpView {

    void onSuccess(Rating rating);
    void onError(Throwable e);
}
