package com.dkitec.mdm.homepage.common.domain;

public class QnaVO {
    private int questNo; //번호
    private String questSj; //제목
    private String questCn; //본문
    private String questDt; //등록일
    private String password; //비밀번호
    private String qstnerName; //작성자
    private String qstnerEmail; //이메일
    private String qstnerMoblphon; //전화번호
    private String recent; //최신글
    private String rspnsCn; //답변
    private String respondId; //답변 작성자
    private String rspnsDt; //답변 등록일
    private String unRspns; //답변 등록 여부
    private String srchCondition; //검색 카테고리
    private String srchData; //검색 키워드
    private String sidx; //정렬 컬럼
    private String sord; //정렬 방향
    private int isSealed; //잠금 여부
    private int currentPage; //현재 페이지

    public int getQuestNo() {
        return questNo;
    }

    public void setQuestNo(int questNo) {
        this.questNo = questNo;
    }

    public String getQuestSj() {
        return questSj;
    }

    public void setQuestSj(String questSj) {
        this.questSj = questSj;
    }

    public String getQuestCn() {
        return questCn;
    }

    public void setQuestCn(String questCn) {
        this.questCn = questCn;
    }

    public String getQuestDt() {
        return questDt;
    }

    public void setQuestDt(String questDt) {
        this.questDt = questDt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQstnerName() {
        return qstnerName;
    }

    public void setQstnerName(String qstnerName) {
        this.qstnerName = qstnerName;
    }

    public String getQstnerEmail() {
        return qstnerEmail;
    }

    public void setQstnerEmail(String qstnerEmail) {
        this.qstnerEmail = qstnerEmail;
    }

    public String getQstnerMoblphon() {
        return qstnerMoblphon;
    }

    public void setQstnerMoblphon(String qstnerMoblphon) {
        this.qstnerMoblphon = qstnerMoblphon;
    }

    public String getRecent() {
        return recent;
    }

    public void setRecent(String recent) {
        this.recent = recent;
    }

    public String getRspnsCn() {
        return rspnsCn;
    }

    public void setRspnsCn(String rspnsCn) {
        this.rspnsCn = rspnsCn;
    }

    public String getRespondId() {
        return respondId;
    }

    public void setRespondId(String respondId) {
        this.respondId = respondId;
    }

    public String getRspnsDt() {
        return rspnsDt;
    }

    public void setRspnsDt(String rspnsDt) {
        this.rspnsDt = rspnsDt;
    }

    public String getUnRspns() {
        return unRspns;
    }

    public void setUnRspns(String unRspns) {
        this.unRspns = unRspns;
    }

    public String getSrchCondition() {
        return srchCondition;
    }

    public void setSrchCondition(String srchCondition) {
        this.srchCondition = srchCondition;
    }

    public String getSrchData() {
        return srchData;
    }

    public void setSrchData(String srchData) {
        this.srchData = srchData;
    }

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }

    public int getIsSealed() {
        return isSealed;
    }

    public void setIsSealed(int isSealed) {
        this.isSealed = isSealed;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
