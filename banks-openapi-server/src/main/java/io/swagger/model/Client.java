package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Client
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-24T08:53:36.820Z[GMT]")


public class Client   {
  @JsonProperty("bankId")
  private Long bankId = null;

  @JsonProperty("accountIds")
  @Valid
  private List<Long> accountIds = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("secondName")
  private String secondName = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("passportData")
  private String passportData = null;

  public Client bankId(Long bankId) {
    this.bankId = bankId;
    return this;
  }

  /**
   * Get bankId
   * @return bankId
   **/
  @Schema(description = "")
  
    public Long getBankId() {
    return bankId;
  }

  public void setBankId(Long bankId) {
    this.bankId = bankId;
  }

  public Client accountIds(List<Long> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public Client addAccountIdsItem(Long accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<Long>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

  /**
   * Get accountIds
   * @return accountIds
   **/
  @Schema(description = "")
  
    public List<Long> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<Long> accountIds) {
    this.accountIds = accountIds;
  }

  public Client firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  @Schema(description = "")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Client secondName(String secondName) {
    this.secondName = secondName;
    return this;
  }

  /**
   * Get secondName
   * @return secondName
   **/
  @Schema(description = "")
  
    public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public Client address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(description = "")
  
    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Client passportData(String passportData) {
    this.passportData = passportData;
    return this;
  }

  /**
   * Get passportData
   * @return passportData
   **/
  @Schema(description = "")
  
    public String getPassportData() {
    return passportData;
  }

  public void setPassportData(String passportData) {
    this.passportData = passportData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.bankId, client.bankId) &&
        Objects.equals(this.accountIds, client.accountIds) &&
        Objects.equals(this.firstName, client.firstName) &&
        Objects.equals(this.secondName, client.secondName) &&
        Objects.equals(this.address, client.address) &&
        Objects.equals(this.passportData, client.passportData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankId, accountIds, firstName, secondName, address, passportData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    passportData: ").append(toIndentedString(passportData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
