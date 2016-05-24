package com.potato.listdemo;

import android.content.SharedPreferences;
import com.vk.sdk.VKAccessTokenTracker;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKSdk;

/**
 * Created by potato on 5/19/16.
 */
public class Application extends android.app.Application {
    VKAccessTokenTracker vkAccessTokenTracker = new VKAccessTokenTracker() {
        @Override
        public void onVKAccessTokenChanged(VKAccessToken oldToken, VKAccessToken newToken) {
            if (newToken == null) {
                // VkAccessToken is invalid
            }
        }
    };
    @Override
    public void onCreate() {
        super.onCreate();
        vkAccessTokenTracker.startTracking();
        VKSdk.initialize(this);
    }
}