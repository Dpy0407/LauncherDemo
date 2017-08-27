package com.example.yang.fragment;
import android.support.v4.app.Fragment;

/**
 * Fragment抽象类
 *
 */

public abstract class LauncherBaseFragment extends Fragment{
    public abstract void  startAnimation();
    public abstract void  stopAnimation();
}