package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseWrapperBank
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-24T10:52:51.878Z[GMT]")


public class ResponseWrapperBank   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("debitPercentage")
  private Double debitPercentage = null;

  @JsonProperty("creditCommission")
  private Double creditCommission = null;

  @JsonProperty("unverifiedTransactionAmountLimit")
  private Long unverifiedTransactionAmountLimit = null;

  public ResponseWrapperBank id(Long id) {
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

  public ResponseWrapperBank debitPercentage(Double debitPercentage) {
    this.debitPercentage = debitPercentage;
    return this;
  }

  /**
   * Get debitPercentage
   * @return debitPercentage
   **/
  @Schema(description = "")
  
    public Double getDebitPercentage() {
    return debitPercentage;
  }

  public void setDebitPercentage(Double debitPercentage) {
    this.debitPercentage = debitPercentage;
  }

  public ResponseWrapperBank creditCommission(Double creditCommission) {
    this.creditCommission = creditCommission;
    return this;
  }

  /**
   * Get creditCommission
   * @return creditCommission
   **/
  @Schema(description = "")
  
    public Double getCreditCommission() {
    return creditCommission;
  }

  public void setCreditCommission(Double creditCommission) {
    this.creditCommission = creditCommission;
  }

  public ResponseWrapperBank unverifiedTransactionAmountLimit(Long unverifiedTransactionAmountLimit) {
    this.unverifiedTransactionAmountLimit = unverifiedTransactionAmountLimit;
    return this;
  }

  /**
   * Get unverifiedTransactionAmountLimit
   * @return unverifiedTransactionAmountLimit
   **/
  @Schema(description = "")
  
    public Long getUnverifiedTransactionAmountLimit() {
    return unverifiedTransactionAmountLimit;
  }

  public void setUnverifiedTransactionAmountLimit(Long unverifiedTransactionAmountLimit) {
    this.unverifiedTransactionAmountLimit = unverifiedTransactionAmountLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapperBank responseWrapperBank = (ResponseWrapperBank) o;
    return Objects.equals(this.id, responseWrapperBank.id) &&
        Objects.equals(this.debitPercentage, responseWrapperBank.debitPercentage) &&
        Objects.equals(this.creditCommission, responseWrapperBank.creditCommission) &&
        Objects.equals(this.unverifiedTransactionAmountLimit, responseWrapperBank.unverifiedTransactionAmountLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, debitPercentage, creditCommission, unverifiedTransactionAmountLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperBank {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    debitPercentage: ").append(toIndentedString(debitPercentage)).append("\n");
    sb.append("    creditCommission: ").append(toIndentedString(creditCommission)).append("\n");
    sb.append("    unverifiedTransactionAmountLimit: ").append(toIndentedString(unverifiedTransactionAmountLimit)).append("\n");
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
