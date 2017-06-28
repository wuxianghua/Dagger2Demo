package com.example.stone.dagger2demo;

import dagger.Component;

/**
 * Created by stone on 2017/6/28.
 */
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
