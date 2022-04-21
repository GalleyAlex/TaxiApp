package com.thinkincab.partner.ui.bottomsheetdialog.rating;

import com.thinkincab.partner.base.MvpPresenter;

import java.util.HashMap;

public interface RatingDialogIPresenter<V extends RatingDialogIView> extends MvpPresenter<V> {

    void rate(HashMap<String, Object> obj, Integer id);
}
