/*
 * Accounts
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kyriba.sample.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * Payment Reconciliation Options.
 */
@ApiModel(description = "Payment Reconciliation Options.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:35:10.236Z")
public class PaymentReconciliationOptionsModel {
  /**
   * Real Bank account used for Checks. Default &#x3D; CURRENT_ACCOUNT
   */
  @JsonAdapter(BankReportingPolicyEnum.Adapter.class)
  public enum BankReportingPolicyEnum {
    CURRENT_ACCOUNT("CURRENT_ACCOUNT"),
    
    SEPARATE_ACCOUNT("SEPARATE_ACCOUNT");

    private String value;

    BankReportingPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BankReportingPolicyEnum fromValue(String text) {
      for (BankReportingPolicyEnum b : BankReportingPolicyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BankReportingPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BankReportingPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BankReportingPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BankReportingPolicyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("bankReportingPolicy")
  private BankReportingPolicyEnum bankReportingPolicy = null;

  @SerializedName("separateReportingAccount")
  private ReferenceModel separateReportingAccount = null;

  public PaymentReconciliationOptionsModel bankReportingPolicy(BankReportingPolicyEnum bankReportingPolicy) {
    this.bankReportingPolicy = bankReportingPolicy;
    return this;
  }

   /**
   * Real Bank account used for Checks. Default &#x3D; CURRENT_ACCOUNT
   * @return bankReportingPolicy
  **/
  @ApiModelProperty(example = "CURRENT_ACCOUNT", value = "Real Bank account used for Checks. Default = CURRENT_ACCOUNT")
  public BankReportingPolicyEnum getBankReportingPolicy() {
    return bankReportingPolicy;
  }

  public void setBankReportingPolicy(BankReportingPolicyEnum bankReportingPolicy) {
    this.bankReportingPolicy = bankReportingPolicy;
  }

  public PaymentReconciliationOptionsModel separateReportingAccount(ReferenceModel separateReportingAccount) {
    this.separateReportingAccount = separateReportingAccount;
    return this;
  }

   /**
   * Separate bank account. Required if bankReportingPolicy &#x3D; SEPARATE_ACCOUNT
   * @return separateReportingAccount
  **/
  @ApiModelProperty(required = true, value = "Separate bank account. Required if bankReportingPolicy = SEPARATE_ACCOUNT")
  public ReferenceModel getSeparateReportingAccount() {
    return separateReportingAccount;
  }

  public void setSeparateReportingAccount(ReferenceModel separateReportingAccount) {
    this.separateReportingAccount = separateReportingAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentReconciliationOptionsModel paymentReconciliationOptionsModel = (PaymentReconciliationOptionsModel) o;
    return Objects.equals(this.bankReportingPolicy, paymentReconciliationOptionsModel.bankReportingPolicy) &&
        Objects.equals(this.separateReportingAccount, paymentReconciliationOptionsModel.separateReportingAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankReportingPolicy, separateReportingAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentReconciliationOptionsModel {\n");
    
    sb.append("    bankReportingPolicy: ").append(toIndentedString(bankReportingPolicy)).append("\n");
    sb.append("    separateReportingAccount: ").append(toIndentedString(separateReportingAccount)).append("\n");
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

