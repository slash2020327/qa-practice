package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.utils.common.CommonUtils;

public enum Timeouts {
    SHORT_TIMEOUT(5),
    LONG_TIMEOUT(10);

    public long duration;

    Timeouts(long duration) {
        this.duration = duration;
    }
    Timeouts() {
    }
}
