package com.baeldung.vo;

import java.util.List;

public class GATrackingVO {
    List<String> trackingCodes;
    String linkText;       

    public List<String> getTrackingCodes() {
        return trackingCodes;
    }

    public void setTrackingCodes(List<String> trackingCodes) {
        this.trackingCodes = trackingCodes;
    }

    public String getLinkText() {
        return linkText;
    }

    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }
}
