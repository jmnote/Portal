package org.openpaas.paasta.portal.api.model;

/**
 * Web Ide 모델
 *
 * @author nawkm
 * @version 1.0
 * @since 2016.8.30 최초작성
 */
public class ConfigInfo {
    private String name;
    private String value;
    private String createdAt;
    private String updatedAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
