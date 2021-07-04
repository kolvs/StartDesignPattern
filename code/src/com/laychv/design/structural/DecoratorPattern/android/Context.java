package com.laychv.design.structural.DecoratorPattern.android;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public abstract class Context {
    public abstract void startActivity(String intent);

    public abstract void startActivity(String intent, @Nullable String bundle);

    public abstract void startService();

    public abstract boolean stopService(String intent);

    public abstract void bindService(String intent);

    public abstract void unbindService(@NotNull String conn);

}
