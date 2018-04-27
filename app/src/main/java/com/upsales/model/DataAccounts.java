
package com.upsales.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class DataAccounts implements Serializable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("fax")
    @Expose
    private String fax;
    @SerializedName("notes")
    @Expose
    private Object notes;
    @SerializedName("regDate")
    @Expose
    private String regDate;
    @SerializedName("regBy")
    @Expose
    private RegBy regBy;
    @SerializedName("active")
    @Expose
    private Integer active;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("custom")
    @Expose
    private List<Custom> custom = null;
    @SerializedName("users")
    @Expose
    private List<User> users = null;
    @SerializedName("addresses")
    @Expose
    private List<Address> addresses = null;
    @SerializedName("projects")
    @Expose
    private List<Object> projects = null;
    @SerializedName("categories")
    @Expose
    private List<Object> categories = null;
    @SerializedName("connectedClients")
    @Expose
    private List<Object> connectedClients = null;
    @SerializedName("connectedToClients")
    @Expose
    private Object connectedToClients;
    @SerializedName("externalClientData")
    @Expose
    private List<Object> externalClientData = null;
    @SerializedName("adCampaign")
    @Expose
    private List<Object> adCampaign = null;
    @SerializedName("webpage")
    @Expose
    private String webpage;
    @SerializedName("parId")
    @Expose
    private Object parId;
    @SerializedName("dunsNo")
    @Expose
    private String dunsNo;
    @SerializedName("isExternal")
    @Expose
    private Integer isExternal;
    @SerializedName("scoreUpdateDate")
    @Expose
    private Object scoreUpdateDate;
    @SerializedName("importId")
    @Expose
    private Object importId;
    @SerializedName("mailAddress")
    @Expose
    private MailAddress mailAddress;
    @SerializedName("soliditet")
    @Expose
    private Soliditet soliditet;
    @SerializedName("parent")
    @Expose
    private Object parent;
    @SerializedName("modDate")
    @Expose
    private String modDate;
    @SerializedName("user")
    @Expose
    private Object user;
    @SerializedName("indexDate")
    @Expose
    private String indexDate;
    @SerializedName("userRemovable")
    @Expose
    private Boolean userRemovable;
    @SerializedName("userEditable")
    @Expose
    private Boolean userEditable;
    @SerializedName("hasActivity")
    @Expose
    private Object hasActivity;
    @SerializedName("hadActivity")
    @Expose
    private Object hadActivity;
    @SerializedName("hasAppointment")
    @Expose
    private Object hasAppointment;
    @SerializedName("hadAppointment")
    @Expose
    private Object hadAppointment;
    @SerializedName("hasOpportunity")
    @Expose
    private Object hasOpportunity;
    @SerializedName("hadOpportunity")
    @Expose
    private Object hadOpportunity;
    @SerializedName("hasOrder")
    @Expose
    private Object hasOrder;
    @SerializedName("hadOrder")
    @Expose
    private Object hadOrder;
    @SerializedName("hasMail")
    @Expose
    private Boolean hasMail;
    @SerializedName("hasForm")
    @Expose
    private Boolean hasForm;
    @SerializedName("hasVisit")
    @Expose
    private Boolean hasVisit;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Object getNotes() {
        return notes;
    }

    public void setNotes(Object notes) {
        this.notes = notes;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public RegBy getRegBy() {
        return regBy;
    }

    public void setRegBy(RegBy regBy) {
        this.regBy = regBy;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public List<Custom> getCustom() {
        return custom;
    }

    public void setCustom(List<Custom> custom) {
        this.custom = custom;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Object> getProjects() {
        return projects;
    }

    public void setProjects(List<Object> projects) {
        this.projects = projects;
    }

    public List<Object> getCategories() {
        return categories;
    }

    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }

    public List<Object> getConnectedClients() {
        return connectedClients;
    }

    public void setConnectedClients(List<Object> connectedClients) {
        this.connectedClients = connectedClients;
    }

    public Object getConnectedToClients() {
        return connectedToClients;
    }

    public void setConnectedToClients(Object connectedToClients) {
        this.connectedToClients = connectedToClients;
    }

    public List<Object> getExternalClientData() {
        return externalClientData;
    }

    public void setExternalClientData(List<Object> externalClientData) {
        this.externalClientData = externalClientData;
    }

    public List<Object> getAdCampaign() {
        return adCampaign;
    }

    public void setAdCampaign(List<Object> adCampaign) {
        this.adCampaign = adCampaign;
    }

    public String getWebpage() {
        return webpage;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }

    public Object getParId() {
        return parId;
    }

    public void setParId(Object parId) {
        this.parId = parId;
    }

    public String getDunsNo() {
        return dunsNo;
    }

    public void setDunsNo(String dunsNo) {
        this.dunsNo = dunsNo;
    }

    public Integer getIsExternal() {
        return isExternal;
    }

    public void setIsExternal(Integer isExternal) {
        this.isExternal = isExternal;
    }

    public Object getScoreUpdateDate() {
        return scoreUpdateDate;
    }

    public void setScoreUpdateDate(Object scoreUpdateDate) {
        this.scoreUpdateDate = scoreUpdateDate;
    }

    public Object getImportId() {
        return importId;
    }

    public void setImportId(Object importId) {
        this.importId = importId;
    }

    public MailAddress getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(MailAddress mailAddress) {
        this.mailAddress = mailAddress;
    }

    public Soliditet getSoliditet() {
        return soliditet;
    }

    public void setSoliditet(Soliditet soliditet) {
        this.soliditet = soliditet;
    }

    public Object getParent() {
        return parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    public String getModDate() {
        return modDate;
    }

    public void setModDate(String modDate) {
        this.modDate = modDate;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }

    public String getIndexDate() {
        return indexDate;
    }

    public void setIndexDate(String indexDate) {
        this.indexDate = indexDate;
    }

    public Boolean getUserRemovable() {
        return userRemovable;
    }

    public void setUserRemovable(Boolean userRemovable) {
        this.userRemovable = userRemovable;
    }

    public Boolean getUserEditable() {
        return userEditable;
    }

    public void setUserEditable(Boolean userEditable) {
        this.userEditable = userEditable;
    }

    public Object getHasActivity() {
        return hasActivity;
    }

    public void setHasActivity(Object hasActivity) {
        this.hasActivity = hasActivity;
    }

    public Object getHadActivity() {
        return hadActivity;
    }

    public void setHadActivity(Object hadActivity) {
        this.hadActivity = hadActivity;
    }

    public Object getHasAppointment() {
        return hasAppointment;
    }

    public void setHasAppointment(Object hasAppointment) {
        this.hasAppointment = hasAppointment;
    }

    public Object getHadAppointment() {
        return hadAppointment;
    }

    public void setHadAppointment(Object hadAppointment) {
        this.hadAppointment = hadAppointment;
    }

    public Object getHasOpportunity() {
        return hasOpportunity;
    }

    public void setHasOpportunity(Object hasOpportunity) {
        this.hasOpportunity = hasOpportunity;
    }

    public Object getHadOpportunity() {
        return hadOpportunity;
    }

    public void setHadOpportunity(Object hadOpportunity) {
        this.hadOpportunity = hadOpportunity;
    }

    public Object getHasOrder() {
        return hasOrder;
    }

    public void setHasOrder(Object hasOrder) {
        this.hasOrder = hasOrder;
    }

    public Object getHadOrder() {
        return hadOrder;
    }

    public void setHadOrder(Object hadOrder) {
        this.hadOrder = hadOrder;
    }

    public Boolean getHasMail() {
        return hasMail;
    }

    public void setHasMail(Boolean hasMail) {
        this.hasMail = hasMail;
    }

    public Boolean getHasForm() {
        return hasForm;
    }

    public void setHasForm(Boolean hasForm) {
        this.hasForm = hasForm;
    }

    public Boolean getHasVisit() {
        return hasVisit;
    }

    public void setHasVisit(Boolean hasVisit) {
        this.hasVisit = hasVisit;
    }

}
