package com.dkitec.mdm.homepage.common.domain;

public class NoticeVO {
    private int noticeNo;
    private String noticeSj;
    private String noticeCn;
    private String creatDt;
    private String crtrId;
    private int rdcnt;
    private String recent;

    public String getNoticeSj() {
        return noticeSj;
    }

    public void setNoticeSj(String noticeSj) {
        this.noticeSj = noticeSj;
    }

    public int getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(int noticeNo) {
        this.noticeNo = noticeNo;
    }

    public String getNoticeCn() {
        return noticeCn;
    }

    public void setNoticeCn(String noticeCn) {
        this.noticeCn = noticeCn;
    }

    public String getCreatDt() {
        return creatDt;
    }

    public void setCreatDt(String creatDt) {
        this.creatDt = creatDt;
    }

    public String getCrtrId() {
        return crtrId;
    }

    public void setCrtrId(String crtrId) {
        this.crtrId = crtrId;
    }

    public int getRdcnt() {
        return rdcnt;
    }

    public void setRdcnt(int rdcnt) {
        this.rdcnt = rdcnt;
    }

    public String getRecent() {
        return recent;
    }

    public void setRecent(String recent) {
        this.recent = recent;
    }
}
