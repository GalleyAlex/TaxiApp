package com.thinkincab.partner.ui.activity.help;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.Help;

public interface HelpIView extends MvpView {

    void onSuccess(Help object);

    void onError(Throwable e);
}
