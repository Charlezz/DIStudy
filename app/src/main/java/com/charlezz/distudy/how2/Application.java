package com.charlezz.distudy.how2;

import javax.inject.Inject;

public class Application {

    @Inject
    Activity activity;

    public Activity getActivity(){
        return activity;
    }
}
