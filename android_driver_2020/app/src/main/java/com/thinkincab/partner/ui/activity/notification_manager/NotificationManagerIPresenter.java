package com.thinkincab.partner.ui.activity.notification_manager;

import com.thinkincab.partner.base.MvpPresenter;

public interface NotificationManagerIPresenter<V extends NotificationManagerIView> extends MvpPresenter<V> {
    void getNotificationManager();
}
