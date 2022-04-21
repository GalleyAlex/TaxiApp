package com.thinkincab.partner.ui.activity.notification_manager;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.NotificationManager;

import java.util.List;

public interface NotificationManagerIView extends MvpView {

    void onSuccess(List<NotificationManager> managers);

    void onError(Throwable e);

}