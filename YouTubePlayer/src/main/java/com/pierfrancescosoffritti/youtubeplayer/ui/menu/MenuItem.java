package com.pierfrancescosoffritti.youtubeplayer.ui.menu;

import android.support.annotation.DrawableRes;
import android.view.View;

public class MenuItem {

    private final String text;
    @DrawableRes private final int icon;
    private final View.OnClickListener onClickListener;

    public MenuItem(String text, @DrawableRes final int icon, View.OnClickListener onClickListener) {
        this.text = text;
        this.icon = icon;
        this.onClickListener = onClickListener;
    }

    public String getText() {
        return text;
    }

    public @DrawableRes int getIcon() {
        return icon;
    }

    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        return icon == menuItem.icon && text.equals(menuItem.text);
    }

    @Override
    public int hashCode() {
        int result = text.hashCode();
        result = 31 * result + icon;
        return result;
    }
}