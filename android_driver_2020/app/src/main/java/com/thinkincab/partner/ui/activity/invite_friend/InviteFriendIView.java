package com.thinkincab.partner.ui.activity.invite_friend;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.UserResponse;

public interface InviteFriendIView extends MvpView {

    void onSuccess(UserResponse response);
    void onError(Throwable e);

}
