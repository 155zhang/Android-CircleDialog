package com.mylhyl.circledialog.params;

import android.view.View;

import com.mylhyl.circledialog.res.values.CircleColor;
import com.mylhyl.circledialog.res.values.CircleDimen;

/**
 * Created by hupei on 2017/3/30.
 */

public abstract class ButtonParams extends TitleParams {
    public abstract void dismiss();

    public View.OnClickListener listener;
    public int topMargin;

    public ButtonParams() {
        textColor = CircleColor.button;
        textSize = CircleDimen.footerTextSize;
        height = CircleDimen.footerHeight;
    }
}