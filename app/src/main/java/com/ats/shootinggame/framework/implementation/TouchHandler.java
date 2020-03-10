package com.ats.shootinggame.framework.implementation;

import android.view.View;

import com.ats.shootinggame.framework.Input;

import java.util.List;

public interface TouchHandler extends View.OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();
}