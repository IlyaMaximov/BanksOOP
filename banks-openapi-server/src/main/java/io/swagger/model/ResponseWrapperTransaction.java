package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseWrapperTransaction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-24T08:53:36.820Z[GMT]")


public class ResponseWrapperTransaction   {
  @JsonProperty("creatorClientId")
  private Long creatorClientId = null;

  @JsonProperty("sourceAccountId")
  private Long sourceAccountId = null;

  @JsonProperty("targetAccountId")
  private Long targetAccountId = null;

  @JsonProperty("amount")
  private Long amount = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NEW("NEW"),
    
    PROCESSED("PROCESSED"),
    
    TO_CANCEL("TO_CANCEL"),
    
    CANCELLED("CANCELLED"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  /**
   * Gets or Sets currency
   */
  public enum CurrencyEnum {
    RUB("RUB"),
    
    USD("USD"),
    
    EUR("EUR");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CurrencyEnum fromValue(String text) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("currency")
  private CurrencyEnum currency = null;

  @JsonProperty("completionTimestamp")
  private OffsetDateTime completionTimestamp = null;

  @JsonProperty("message")
  private String message = null;

  public ResponseWrapperTransaction creatorClientId(Long creatorClientId) {
    this.creatorClientId = creatorClientId;
    return this;
  }

  /**
   * Get creatorClientId
   * @return creatorClientId
   **/
  @Schema(description = "")
  
    public Long getCreatorClientId() {
    return creatorClientId;
  }

  public void setCreatorClientId(Long creatorClientId) {
    this.creatorClientId = creatorClientId;
  }

  public ResponseWrapperTransaction sourceAccountId(Long sourceAccountId) {
    this.sourceAccountId = sourceAccountId;
    return this;
  }

  /**
   * Get sourceAccountId
   * @return sourceAccountId
   **/
  @Schema(description = "")
  
    public Long getSourceAccountId() {
    return sourceAccountId;
  }

  public void setSourceAccountId(Long sourceAccountId) {
    this.sourceAccountId = sourceAccountId;
  }

  public ResponseWrapperTransaction targetAccountId(Long targetAccountId) {
    this.targetAccountId = targetAccountId;
    return this;
  }

  /**
   * Get targetAccountId
   * @return targetAccountId
   **/
  @Schema(description = "")
  
    public Long getTargetAccountId() {
    return targetAccountId;
  }

  public void setTargetAccountId(Long targetAccountId) {
    this.targetAccountId = targetAccountId;
  }

  public ResponseWrapperTransaction amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(description = "")
  
    public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public ResponseWrapperTransaction status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ResponseWrapperTransaction currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   **/
  @Schema(description = "")
  
    public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public ResponseWrapperTransaction completionTimestamp(OffsetDateTime completionTimestamp) {
    this.completionTimestamp = completionTimestamp;
    return this;
  }

  /**
   * Get completionTimestamp
   * @return completionTimestamp
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getCompletionTimestamp() {
    return completionTimestamp;
  }

  public void setCompletionTimestamp(OffsetDateTime completionTimestamp) {
    this.completionTimestamp = completionTimestamp;
  }

  public ResponseWrapperTransaction message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(description = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapperTransaction responseWrapperTransaction = (ResponseWrapperTransaction) o;
    return Objects.equals(this.creatorClientId, responseWrapperTransaction.creatorClientId) &&
        Objects.equals(this.sourceAccountId, responseWrapperTransaction.sourceAccountId) &&
        Objects.equals(this.targetAccountId, responseWrapperTransaction.targetAccountId) &&
        Objects.equals(this.amount, responseWrapperTransaction.amount) &&
        Objects.equals(this.status, responseWrapperTransaction.status) &&
        Objects.equals(this.currency, responseWrapperTransaction.currency) &&
        Objects.equals(this.completionTimestamp, responseWrapperTransaction.completionTimestamp) &&
        Objects.equals(this.message, responseWrapperTransaction.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorClientId, sourceAccountId, targetAccountId, amount, status, currency, completionTimestamp, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperTransaction {\n");
    
    sb.append("    creatorClientId: ").append(toIndentedString(creatorClientId)).append("\n");
    sb.append("    sourceAccountId: ").append(toIndentedString(sourceAccountId)).append("\n");
    sb.append("    targetAccountId: ").append(toIndentedString(targetAccountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    completionTimestamp: ").append(toIndentedString(completionTimestamp)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
