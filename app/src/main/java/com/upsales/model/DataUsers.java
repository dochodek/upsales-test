
package com.upsales.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class DataUsers implements Serializable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("administrator")
    @Expose
    private Integer administrator;
    @SerializedName("role")
    @Expose
    private Object role;
    @SerializedName("teamLeader")
    @Expose
    private Integer teamLeader;
    @SerializedName("active")
    @Expose
    private Integer active;
    @SerializedName("ghost")
    @Expose
    private Integer ghost;
    @SerializedName("free")
    @Expose
    private Integer free;
    @SerializedName("userTitle")
    @Expose
    private Object userTitle;
    @SerializedName("userAddress")
    @Expose
    private Object userAddress;
    @SerializedName("userZipCode")
    @Expose
    private Object userZipCode;
    @SerializedName("userState")
    @Expose
    private Object userState;
    @SerializedName("userPhone")
    @Expose
    private Object userPhone;
    @SerializedName("userCellPhone")
    @Expose
    private Object userCellPhone;
    @SerializedName("export")
    @Expose
    private Integer export;
    @SerializedName("custom")
    @Expose
    private List<Object> custom = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Integer administrator) {
        this.administrator = administrator;
    }

    public Object getRole() {
        return role;
    }

    public void setRole(Object role) {
        this.role = role;
    }

    public Integer getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(Integer teamLeader) {
        this.teamLeader = teamLeader;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getGhost() {
        return ghost;
    }

    public void setGhost(Integer ghost) {
        this.ghost = ghost;
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public Object getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(Object userTitle) {
        this.userTitle = userTitle;
    }

    public Object getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(Object userAddress) {
        this.userAddress = userAddress;
    }

    public Object getUserZipCode() {
        return userZipCode;
    }

    public void setUserZipCode(Object userZipCode) {
        this.userZipCode = userZipCode;
    }

    public Object getUserState() {
        return userState;
    }

    public void setUserState(Object userState) {
        this.userState = userState;
    }

    public Object getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Object userPhone) {
        this.userPhone = userPhone;
    }

    public Object getUserCellPhone() {
        return userCellPhone;
    }

    public void setUserCellPhone(Object userCellPhone) {
        this.userCellPhone = userCellPhone;
    }

    public Integer getExport() {
        return export;
    }

    public void setExport(Integer export) {
        this.export = export;
    }

    public List<Object> getCustom() {
        return custom;
    }

    public void setCustom(List<Object> custom) {
        this.custom = custom;
    }

}
