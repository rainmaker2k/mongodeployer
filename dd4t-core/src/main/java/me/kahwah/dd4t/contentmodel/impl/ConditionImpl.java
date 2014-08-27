package me.kahwah.dd4t.contentmodel.impl;

import me.kahwah.dd4t.contentmodel.Condition;

/**
 * Created by rainmaker2k on 13-07-14.
 */
public class ConditionImpl implements Condition {

    private boolean negate;

    @Override
    public void setNegate(boolean negate) {
        this.negate = negate;
    }

    @Override
    public boolean getNegate() {
        return negate;
    }
}
