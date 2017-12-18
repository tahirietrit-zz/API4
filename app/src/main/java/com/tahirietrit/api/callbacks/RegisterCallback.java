package com.tahirietrit.api.callbacks;

import com.tahirietrit.api.model.User;

/**
 * Created by macb on 15/12/17.
 */

public interface RegisterCallback {
    void onRegisterResponse(User user, boolean sucess);
}
