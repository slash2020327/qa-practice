package com.qaprosoft.carina.demo.gui.components.desktop;

public enum Timeouts {
    SHORT_TIMEOUT(5),
    LONG_TIMEOUT(10);

    private long duration;

    Timeouts(final long duration) {
        this.duration = duration;
    }

    public long getDuration() {
        return duration;
    }
}
