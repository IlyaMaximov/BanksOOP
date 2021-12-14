package edu.phystech.client;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "clients")
@JsonIgnoreProperties(value = {"id", "bank_id", "verified"}, allowGetters = true)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long bankId;

    @Transient
    private List<Long> accountIds;
    private String firstName;
    private String secondName;
    private String address;
    private String passportData;
    private boolean verified;

    public Client() {
    }

    public Client(long bankId, String firstName, String secondName) {
        this.bankId = bankId;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Transient
    public List<Long> getAccountIds() {
        return accountIds;
    }

    @Transient
    public void setAccountIds(List<Long> accountIds) {
        this.accountIds = accountIds;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassportData() {
        return passportData;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public long getBankId() {
        return bankId;
    }

    public void setBankId(long bankId) {
        this.bankId = bankId;
    }
}
