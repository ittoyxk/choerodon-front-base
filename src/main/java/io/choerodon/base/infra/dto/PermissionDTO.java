package io.choerodon.base.infra.dto;


import java.util.Objects;
import javax.persistence.*;

import io.choerodon.mybatis.entity.BaseDTO;

/**
 * @author wuguokai
 * @author superlee
 */
@Table(name = "iam_permission")
public class PermissionDTO extends BaseDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String path;
    private String serviceCode;
    private String method;
    private String resourceLevel;
    private String description;
    private String action;
    private String controller;
    @Column(name = "is_within")
    private Boolean within;
    @Column(name = "is_public_access")
    private Boolean publicAccess;
    @Column(name = "is_login_access")
    private Boolean loginAccess;
    private String permissionType;

    @Transient
    private Boolean required;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getResourceLevel() {
        return resourceLevel;
    }

    public void setResourceLevel(String resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public Boolean getWithin() {
        return within;
    }

    public void setWithin(Boolean within) {
        this.within = within;
    }

    public Boolean getPublicAccess() {
        return publicAccess;
    }

    public void setPublicAccess(Boolean publicAccess) {
        this.publicAccess = publicAccess;
    }

    public Boolean getLoginAccess() {
        return loginAccess;
    }

    public void setLoginAccess(Boolean loginAccess) {
        this.loginAccess = loginAccess;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    @Override
    public String toString() {
        return "PermissionDTO{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", path='" + path + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                ", method='" + method + '\'' +
                ", resourceLevel='" + resourceLevel + '\'' +
                ", description='" + description + '\'' +
                ", action='" + action + '\'' +
                ", controller='" + controller + '\'' +
                ", within=" + within +
                ", publicAccess=" + publicAccess +
                ", required" + required +
                ", loginAccess=" + loginAccess +
                ", permissionType=" + permissionType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PermissionDTO that = (PermissionDTO) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(path, that.path) &&
                Objects.equals(serviceCode, that.serviceCode) &&
                Objects.equals(method, that.method) &&
                Objects.equals(resourceLevel, that.resourceLevel) &&
                Objects.equals(description, that.description) &&
                Objects.equals(action, that.action) &&
                Objects.equals(controller, that.controller) &&
                Objects.equals(within, that.within) &&
                Objects.equals(publicAccess, that.publicAccess) &&
                Objects.equals(loginAccess, that.loginAccess) &&
                Objects.equals(required, that.required) &&
                Objects.equals(permissionType, that.permissionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, path, serviceCode, method, resourceLevel, description, action, controller, within, publicAccess, loginAccess);
    }
}
