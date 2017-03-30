package com.mylhyl.circledialog.params;

import android.support.v4.app.DialogFragment;

import java.io.Serializable;

/**
 * Created by hupei on 2017/3/30.
 */

public final class CircleParams implements Serializable {
    public DialogFragment dialogFragment;
    private DialogParams dialogParams;
    private TitleParams titleParams;
    private TextParams textParams;
    private ButtonParams negativeParams;
    private ButtonParams positiveParams;
    private ItemsParams itemsParams;

    public DialogParams getDialogParams() {
        return dialogParams;
    }

    public void setDialogParams(DialogParams dialogParams) {
        this.dialogParams = dialogParams;
    }

    public TitleParams getTitleParams() {
        return titleParams;
    }

    public void setTitleParams(TitleParams titleParams) {
        this.titleParams = titleParams;
    }

    public TextParams getTextParams() {
        return textParams;
    }

    public void setTextParams(TextParams textParams) {
        this.textParams = textParams;
    }

    public ButtonParams getNegativeParams() {
        return negativeParams;
    }

    public void setNegativeParams(ButtonParams buttonParams) {
        this.negativeParams = buttonParams;
    }

    public ButtonParams getPositiveParams() {
        return positiveParams;
    }

    public void setPositiveParams(ButtonParams positiveParams) {
        this.positiveParams = positiveParams;
    }

    public ItemsParams getItemsParams() {
        return itemsParams;
    }

    public void setItemsParams(ItemsParams itemsParams) {
        this.itemsParams = itemsParams;
    }

}