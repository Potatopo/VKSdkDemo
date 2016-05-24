package com.potato.listdemo;

import android.support.v7.widget.LinearLayoutManager;
import com.vk.sdk.api.*;
import com.vk.sdk.api.model.VKApiUserFull;
import com.vk.sdk.api.model.VKUsersArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by potato on 5/24/16.
 */
public class VKSDKHelper {

    public List<User> getUserList() {
        final List<User> users = new ArrayList<User>();
        VKRequest request = VKApi.friends().get(VKParameters.from(VKApiConst.FIELDS,
                "first_name,last_name,city,country,online"));
        request.executeWithListener(new VKRequest.VKRequestListener() {
            @Override
            public void onComplete(VKResponse response) {
                super.onComplete(response);

                VKUsersArray usersArray = (VKUsersArray) response.parsedModel;
                users.clear();
                for (VKApiUserFull userFull : usersArray) {
                    users.add(new User(userFull.toString(), userFull.city.toString(),
                            userFull.country.toString(), userFull.online));
                }
            }
        });
        return users;
    }
}
