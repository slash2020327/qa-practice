package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.utils.common.CommonUtils;

public enum Timeouts {
    SHORT_TIMEOUT(pause(2)),
    LONG_TIMEOUT(pause(15));

    String currency;

    Timeouts(long pause) {
    }

    public static long pause(long timeout) {
        CommonUtils.pause(timeout);
        return timeout;
    }
}
