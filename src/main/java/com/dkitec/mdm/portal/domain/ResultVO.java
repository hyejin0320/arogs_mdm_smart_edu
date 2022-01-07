package com.dkitec.mdm.portal.domain;

public class ResultVO {
    private Boolean valid;
    private String message;

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid==null?false:valid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
