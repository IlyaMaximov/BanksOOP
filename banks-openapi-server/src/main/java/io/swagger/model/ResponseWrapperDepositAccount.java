package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseWrapperDepositAccount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-24T08:53:36.820Z[GMT]")


public class ResponseWrapperDepositAccount   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("bankId")
  private Long bankId = null;

  @JsonProperty("ownerId")
  private Long ownerId = null;

  @JsonProperty("currentAmount")
  private Long currentAmount = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    CREDIT("CREDIT"),
    
    DEBIT("DEBIT"),
    
    DEPOSIT("DEPOSIT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("balancePercentage")
  private Double balancePercentage = null;

  @JsonProperty("accumulatedAmount")
  private Long accumulatedAmount = null;

  @JsonProperty("upToDate")
  private LocalDate upToDate = null;

  public ResponseWrapperDepositAccount id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ResponseWrapperDepositAccount bankId(Long bankId) {
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

  public ResponseWrapperDepositAccount ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
   **/
  @Schema(description = "")
  
    public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public ResponseWrapperDepositAccount currentAmount(Long currentAmount) {
    this.currentAmount = currentAmount;
    return this;
  }

  /**
   * Get currentAmount
   * @return currentAmount
   **/
  @Schema(description = "")
  
    public Long getCurrentAmount() {
    return currentAmount;
  }

  public void setCurrentAmount(Long currentAmount) {
    this.currentAmount = currentAmount;
  }

  public ResponseWrapperDepositAccount type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ResponseWrapperDepositAccount balancePercentage(Double balancePercentage) {
    this.balancePercentage = balancePercentage;
    return this;
  }

  /**
   * Get balancePercentage
   * @return balancePercentage
   **/
  @Schema(description = "")
  
    public Double getBalancePercentage() {
    return balancePercentage;
  }

  public void setBalancePercentage(Double balancePercentage) {
    this.balancePercentage = balancePercentage;
  }

  public ResponseWrapperDepositAccount accumulatedAmount(Long accumulatedAmount) {
    this.accumulatedAmount = accumulatedAmount;
    return this;
  }

  /**
   * Get accumulatedAmount
   * @return accumulatedAmount
   **/
  @Schema(description = "")
  
    public Long getAccumulatedAmount() {
    return accumulatedAmount;
  }

  public void setAccumulatedAmount(Long accumulatedAmount) {
    this.accumulatedAmount = accumulatedAmount;
  }

  public ResponseWrapperDepositAccount upToDate(LocalDate upToDate) {
    this.upToDate = upToDate;
    return this;
  }

  /**
   * Get upToDate
   * @return upToDate
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getUpToDate() {
    return upToDate;
  }

  public void setUpToDate(LocalDate upToDate) {
    this.upToDate = upToDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapperDepositAccount responseWrapperDepositAccount = (ResponseWrapperDepositAccount) o;
    return Objects.equals(this.id, responseWrapperDepositAccount.id) &&
        Objects.equals(this.bankId, responseWrapperDepositAccount.bankId) &&
        Objects.equals(this.ownerId, responseWrapperDepositAccount.ownerId) &&
        Objects.equals(this.currentAmount, responseWrapperDepositAccount.currentAmount) &&
        Objects.equals(this.type, responseWrapperDepositAccount.type) &&
        Objects.equals(this.balancePercentage, responseWrapperDepositAccount.balancePercentage) &&
        Objects.equals(this.accumulatedAmount, responseWrapperDepositAccount.accumulatedAmount) &&
        Objects.equals(this.upToDate, responseWrapperDepositAccount.upToDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bankId, ownerId, currentAmount, type, balancePercentage, accumulatedAmount, upToDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperDepositAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    currentAmount: ").append(toIndentedString(currentAmount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    balancePercentage: ").append(toIndentedString(balancePercentage)).append("\n");
    sb.append("    accumulatedAmount: ").append(toIndentedString(accumulatedAmount)).append("\n");
    sb.append("    upToDate: ").append(toIndentedString(upToDate)).append("\n");
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
