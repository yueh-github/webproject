package com.caimao.entity;

import java.io.Serializable;
import java.util.Date;

public class AnalystEntity implements Serializable {
    private Integer id;

    private String icon;

    private Short clientId;

    private String analystName;

    private Short analystType;

    private String introduction;

    private Date created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Short getClientId() {
        return clientId;
    }

    public void setClientId(Short clientId) {
        this.clientId = clientId;
    }

    public String getAnalystName() {
        return analystName;
    }

    public void setAnalystName(String analystName) {
        this.analystName = analystName == null ? null : analystName.trim();
    }

    public Short getAnalystType() {
        return analystType;
    }

    public void setAnalystType(Short analystType) {
        this.analystType = analystType;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
