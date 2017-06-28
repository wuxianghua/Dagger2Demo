package com.example.stone.dagger2demo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by stone on 2017/6/27.
 */

@Module
public class MainModule {
    @Provides
    public Cloth getCloth() {
        Cloth cloth = new Cloth("红色");
        cloth.setColor("红色");
        return cloth;
    }
}
