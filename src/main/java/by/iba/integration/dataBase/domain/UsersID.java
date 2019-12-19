package by.iba.integration.dataBase.domain;

import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users", schema = "c4cintegration", catalog = "")
public class UsersID {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private String id;
    private String sapID;
    private String telegramID;
    private String fullName;
    private String organization;

    public UsersID(String telegramID, String fullName, String organization) {
        this.telegramID = telegramID;
        this.fullName = fullName;
        this.organization = organization;
    }

    public UsersID() {
    }

    public UsersID(String sapID, String telegramID) {
        this.sapID = sapID;
        this.telegramID = telegramID;
    }

    public UsersID(String id, String telegramID, String fullName, String organization) {
        this.id = id;
        this.telegramID = telegramID;
        this.fullName = fullName;
        this.organization = organization;
    }

    public UsersID(String id, String sapID, String telegramID, String fullName, String organization) {
        this.id = id;
        this.sapID = sapID;
        this.telegramID = telegramID;
        this.fullName = fullName;
        this.organization = organization;
    }

    @Basic
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sapid")
    public String getSapID() {
        return sapID;
    }

    public void setSapID(String sapID) {
        this.sapID = sapID;
    }

    @Basic
    @Column(name = "telegramid")
    public String getTelegramID() {
        return telegramID;
    }

    public void setTelegramID(String telegramID) {
        this.telegramID = telegramID;
    }

    @Basic
    @Column(name = "full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "organization")
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }







}
