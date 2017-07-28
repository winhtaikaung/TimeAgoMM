package com.yangon.library;

/**
 * Created by winhtaikaung on 28/7/17.
 */

public enum FontFormat {
    UNICODE,
    ZAWGYI,EN;

    String getFont() {
        switch (this) {
            case UNICODE:
                return "uni";
            case ZAWGYI:
                return "zg";
            case EN:
                return "en";
            default:
                return "uni";
        }
    }
}
