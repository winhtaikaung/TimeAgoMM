package com.yangon.library;

/**
 * Created by winhtaikaung on 28/7/17.
 */

public enum TimeAgoFormat {
    DDMYYYY_HHMMSS;

    String getFormat() {
        switch (this) {
            case DDMYYYY_HHMMSS:
                return "dd-M-yyyy hh:mm:ss";
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }


}
