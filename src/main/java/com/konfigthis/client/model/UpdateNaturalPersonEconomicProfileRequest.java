/*
 * Proovid Electronic Verification
 * Proovid API is a RESTful application that specializes in electronic verification (Proof of address and Proof of Identity) by employing an advanced risk-tiered approacch in combination with a smart Risk assessment system. <a href='docs/PROOVid_ELV.pdf' target='_blank'>More information</a> 
 *
 * The version of the OpenAPI document: v1
 * Contact: info@proovid.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.EMoneyRange;
import com.konfigthis.client.model.ESourceOfIncomeAnswers;
import com.konfigthis.client.model.ESourceOfWealthAnswers;
import com.konfigthis.client.model.EWealthRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * UpdateNaturalPersonEconomicProfileRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateNaturalPersonEconomicProfileRequest {
  public static final String SERIALIZED_NAME_MAIN_BUSINESS_ACTIVITIES = "mainBusinessActivities";
  @SerializedName(SERIALIZED_NAME_MAIN_BUSINESS_ACTIVITIES)
  private String mainBusinessActivities;

  public static final String SERIALIZED_NAME_SIZE_OF_ANNUAL_INCOME = "sizeOfAnnualIncome";
  @SerializedName(SERIALIZED_NAME_SIZE_OF_ANNUAL_INCOME)
  private EMoneyRange sizeOfAnnualIncome;

  public static final String SERIALIZED_NAME_SIZE_OF_ANNUAL_INCOME_MIN = "sizeOfAnnualIncomeMin";
  @SerializedName(SERIALIZED_NAME_SIZE_OF_ANNUAL_INCOME_MIN)
  private Double sizeOfAnnualIncomeMin;

  public static final String SERIALIZED_NAME_SIZE_OF_ANNUAL_INCOME_MAX = "sizeOfAnnualIncomeMax";
  @SerializedName(SERIALIZED_NAME_SIZE_OF_ANNUAL_INCOME_MAX)
  private Double sizeOfAnnualIncomeMax;

  public static final String SERIALIZED_NAME_MAIN_SOURCE_OF_INCOME = "mainSourceOfIncome";
  @SerializedName(SERIALIZED_NAME_MAIN_SOURCE_OF_INCOME)
  private ESourceOfIncomeAnswers mainSourceOfIncome;

  public static final String SERIALIZED_NAME_SIZE_OF_WEALTH = "sizeOfWealth";
  @SerializedName(SERIALIZED_NAME_SIZE_OF_WEALTH)
  private EWealthRange sizeOfWealth;

  public static final String SERIALIZED_NAME_SIZE_OF_WEALTH_MIN = "sizeOfWealthMin";
  @SerializedName(SERIALIZED_NAME_SIZE_OF_WEALTH_MIN)
  private Double sizeOfWealthMin;

  public static final String SERIALIZED_NAME_SIZE_OF_WEALTH_MAX = "sizeOfWealthMax";
  @SerializedName(SERIALIZED_NAME_SIZE_OF_WEALTH_MAX)
  private Double sizeOfWealthMax;

  public static final String SERIALIZED_NAME_IS_HNWI = "isHnwi";
  @SerializedName(SERIALIZED_NAME_IS_HNWI)
  private Boolean isHnwi;

  public static final String SERIALIZED_NAME_SOURCE_OF_WEALTH = "sourceOfWealth";
  @SerializedName(SERIALIZED_NAME_SOURCE_OF_WEALTH)
  private ESourceOfWealthAnswers sourceOfWealth;

  public static final String SERIALIZED_NAME_EXPECTED_ORIGIN_OF_OUTGOING_FUNDS = "expectedOriginOfOutgoingFunds";
  @SerializedName(SERIALIZED_NAME_EXPECTED_ORIGIN_OF_OUTGOING_FUNDS)
  private String expectedOriginOfOutgoingFunds;

  public static final String SERIALIZED_NAME_EXPECTED_ORIGIN_OF_INCOMING_FUNDS = "expectedOriginOfIncomingFunds";
  @SerializedName(SERIALIZED_NAME_EXPECTED_ORIGIN_OF_INCOMING_FUNDS)
  private String expectedOriginOfIncomingFunds;

  public static final String SERIALIZED_NAME_NATURE_OF_TRANSACTION = "natureOfTransaction";
  @SerializedName(SERIALIZED_NAME_NATURE_OF_TRANSACTION)
  private String natureOfTransaction;

  public static final String SERIALIZED_NAME_ANTICIPATED_ACCOUNT_TURN_OVER = "anticipatedAccountTurnOver";
  @SerializedName(SERIALIZED_NAME_ANTICIPATED_ACCOUNT_TURN_OVER)
  private EMoneyRange anticipatedAccountTurnOver;

  public static final String SERIALIZED_NAME_ANTICIPATED_ACCOUNT_TURN_OVER_MIN = "anticipatedAccountTurnOverMin";
  @SerializedName(SERIALIZED_NAME_ANTICIPATED_ACCOUNT_TURN_OVER_MIN)
  private Double anticipatedAccountTurnOverMin;

  public static final String SERIALIZED_NAME_ANTICIPATED_ACCOUNT_TURN_OVER_MAX = "anticipatedAccountTurnOverMax";
  @SerializedName(SERIALIZED_NAME_ANTICIPATED_ACCOUNT_TURN_OVER_MAX)
  private Double anticipatedAccountTurnOverMax;

  public static final String SERIALIZED_NAME_PURPOSE_OF_BUSINESS_RELATIONSHIP = "purposeOfBusinessRelationship";
  @SerializedName(SERIALIZED_NAME_PURPOSE_OF_BUSINESS_RELATIONSHIP)
  private String purposeOfBusinessRelationship;

  public UpdateNaturalPersonEconomicProfileRequest() {
  }

  public UpdateNaturalPersonEconomicProfileRequest mainBusinessActivities(String mainBusinessActivities) {
    
    
    
    
    this.mainBusinessActivities = mainBusinessActivities;
    return this;
  }

   /**
   * Get mainBusinessActivities
   * @return mainBusinessActivities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMainBusinessActivities() {
    return mainBusinessActivities;
  }


  public void setMainBusinessActivities(String mainBusinessActivities) {
    
    
    
    this.mainBusinessActivities = mainBusinessActivities;
  }


  public UpdateNaturalPersonEconomicProfileRequest sizeOfAnnualIncome(EMoneyRange sizeOfAnnualIncome) {
    
    
    
    
    this.sizeOfAnnualIncome = sizeOfAnnualIncome;
    return this;
  }

   /**
   * Get sizeOfAnnualIncome
   * @return sizeOfAnnualIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EMoneyRange getSizeOfAnnualIncome() {
    return sizeOfAnnualIncome;
  }


  public void setSizeOfAnnualIncome(EMoneyRange sizeOfAnnualIncome) {
    
    
    
    this.sizeOfAnnualIncome = sizeOfAnnualIncome;
  }


  public UpdateNaturalPersonEconomicProfileRequest sizeOfAnnualIncomeMin(Double sizeOfAnnualIncomeMin) {
    
    
    
    
    this.sizeOfAnnualIncomeMin = sizeOfAnnualIncomeMin;
    return this;
  }

   /**
   * Get sizeOfAnnualIncomeMin
   * @return sizeOfAnnualIncomeMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSizeOfAnnualIncomeMin() {
    return sizeOfAnnualIncomeMin;
  }


  public void setSizeOfAnnualIncomeMin(Double sizeOfAnnualIncomeMin) {
    
    
    
    this.sizeOfAnnualIncomeMin = sizeOfAnnualIncomeMin;
  }


  public UpdateNaturalPersonEconomicProfileRequest sizeOfAnnualIncomeMax(Double sizeOfAnnualIncomeMax) {
    
    
    
    
    this.sizeOfAnnualIncomeMax = sizeOfAnnualIncomeMax;
    return this;
  }

   /**
   * Get sizeOfAnnualIncomeMax
   * @return sizeOfAnnualIncomeMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSizeOfAnnualIncomeMax() {
    return sizeOfAnnualIncomeMax;
  }


  public void setSizeOfAnnualIncomeMax(Double sizeOfAnnualIncomeMax) {
    
    
    
    this.sizeOfAnnualIncomeMax = sizeOfAnnualIncomeMax;
  }


  public UpdateNaturalPersonEconomicProfileRequest mainSourceOfIncome(ESourceOfIncomeAnswers mainSourceOfIncome) {
    
    
    
    
    this.mainSourceOfIncome = mainSourceOfIncome;
    return this;
  }

   /**
   * Get mainSourceOfIncome
   * @return mainSourceOfIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ESourceOfIncomeAnswers getMainSourceOfIncome() {
    return mainSourceOfIncome;
  }


  public void setMainSourceOfIncome(ESourceOfIncomeAnswers mainSourceOfIncome) {
    
    
    
    this.mainSourceOfIncome = mainSourceOfIncome;
  }


  public UpdateNaturalPersonEconomicProfileRequest sizeOfWealth(EWealthRange sizeOfWealth) {
    
    
    
    
    this.sizeOfWealth = sizeOfWealth;
    return this;
  }

   /**
   * Get sizeOfWealth
   * @return sizeOfWealth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EWealthRange getSizeOfWealth() {
    return sizeOfWealth;
  }


  public void setSizeOfWealth(EWealthRange sizeOfWealth) {
    
    
    
    this.sizeOfWealth = sizeOfWealth;
  }


  public UpdateNaturalPersonEconomicProfileRequest sizeOfWealthMin(Double sizeOfWealthMin) {
    
    
    
    
    this.sizeOfWealthMin = sizeOfWealthMin;
    return this;
  }

   /**
   * Get sizeOfWealthMin
   * @return sizeOfWealthMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSizeOfWealthMin() {
    return sizeOfWealthMin;
  }


  public void setSizeOfWealthMin(Double sizeOfWealthMin) {
    
    
    
    this.sizeOfWealthMin = sizeOfWealthMin;
  }


  public UpdateNaturalPersonEconomicProfileRequest sizeOfWealthMax(Double sizeOfWealthMax) {
    
    
    
    
    this.sizeOfWealthMax = sizeOfWealthMax;
    return this;
  }

   /**
   * Get sizeOfWealthMax
   * @return sizeOfWealthMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSizeOfWealthMax() {
    return sizeOfWealthMax;
  }


  public void setSizeOfWealthMax(Double sizeOfWealthMax) {
    
    
    
    this.sizeOfWealthMax = sizeOfWealthMax;
  }


  public UpdateNaturalPersonEconomicProfileRequest isHnwi(Boolean isHnwi) {
    
    
    
    
    this.isHnwi = isHnwi;
    return this;
  }

   /**
   * Get isHnwi
   * @return isHnwi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsHnwi() {
    return isHnwi;
  }


  public void setIsHnwi(Boolean isHnwi) {
    
    
    
    this.isHnwi = isHnwi;
  }


  public UpdateNaturalPersonEconomicProfileRequest sourceOfWealth(ESourceOfWealthAnswers sourceOfWealth) {
    
    
    
    
    this.sourceOfWealth = sourceOfWealth;
    return this;
  }

   /**
   * Get sourceOfWealth
   * @return sourceOfWealth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ESourceOfWealthAnswers getSourceOfWealth() {
    return sourceOfWealth;
  }


  public void setSourceOfWealth(ESourceOfWealthAnswers sourceOfWealth) {
    
    
    
    this.sourceOfWealth = sourceOfWealth;
  }


  public UpdateNaturalPersonEconomicProfileRequest expectedOriginOfOutgoingFunds(String expectedOriginOfOutgoingFunds) {
    
    
    
    
    this.expectedOriginOfOutgoingFunds = expectedOriginOfOutgoingFunds;
    return this;
  }

   /**
   * Get expectedOriginOfOutgoingFunds
   * @return expectedOriginOfOutgoingFunds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpectedOriginOfOutgoingFunds() {
    return expectedOriginOfOutgoingFunds;
  }


  public void setExpectedOriginOfOutgoingFunds(String expectedOriginOfOutgoingFunds) {
    
    
    
    this.expectedOriginOfOutgoingFunds = expectedOriginOfOutgoingFunds;
  }


  public UpdateNaturalPersonEconomicProfileRequest expectedOriginOfIncomingFunds(String expectedOriginOfIncomingFunds) {
    
    
    
    
    this.expectedOriginOfIncomingFunds = expectedOriginOfIncomingFunds;
    return this;
  }

   /**
   * Get expectedOriginOfIncomingFunds
   * @return expectedOriginOfIncomingFunds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpectedOriginOfIncomingFunds() {
    return expectedOriginOfIncomingFunds;
  }


  public void setExpectedOriginOfIncomingFunds(String expectedOriginOfIncomingFunds) {
    
    
    
    this.expectedOriginOfIncomingFunds = expectedOriginOfIncomingFunds;
  }


  public UpdateNaturalPersonEconomicProfileRequest natureOfTransaction(String natureOfTransaction) {
    
    
    
    
    this.natureOfTransaction = natureOfTransaction;
    return this;
  }

   /**
   * Get natureOfTransaction
   * @return natureOfTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNatureOfTransaction() {
    return natureOfTransaction;
  }


  public void setNatureOfTransaction(String natureOfTransaction) {
    
    
    
    this.natureOfTransaction = natureOfTransaction;
  }


  public UpdateNaturalPersonEconomicProfileRequest anticipatedAccountTurnOver(EMoneyRange anticipatedAccountTurnOver) {
    
    
    
    
    this.anticipatedAccountTurnOver = anticipatedAccountTurnOver;
    return this;
  }

   /**
   * Get anticipatedAccountTurnOver
   * @return anticipatedAccountTurnOver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EMoneyRange getAnticipatedAccountTurnOver() {
    return anticipatedAccountTurnOver;
  }


  public void setAnticipatedAccountTurnOver(EMoneyRange anticipatedAccountTurnOver) {
    
    
    
    this.anticipatedAccountTurnOver = anticipatedAccountTurnOver;
  }


  public UpdateNaturalPersonEconomicProfileRequest anticipatedAccountTurnOverMin(Double anticipatedAccountTurnOverMin) {
    
    
    
    
    this.anticipatedAccountTurnOverMin = anticipatedAccountTurnOverMin;
    return this;
  }

   /**
   * Get anticipatedAccountTurnOverMin
   * @return anticipatedAccountTurnOverMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getAnticipatedAccountTurnOverMin() {
    return anticipatedAccountTurnOverMin;
  }


  public void setAnticipatedAccountTurnOverMin(Double anticipatedAccountTurnOverMin) {
    
    
    
    this.anticipatedAccountTurnOverMin = anticipatedAccountTurnOverMin;
  }


  public UpdateNaturalPersonEconomicProfileRequest anticipatedAccountTurnOverMax(Double anticipatedAccountTurnOverMax) {
    
    
    
    
    this.anticipatedAccountTurnOverMax = anticipatedAccountTurnOverMax;
    return this;
  }

   /**
   * Get anticipatedAccountTurnOverMax
   * @return anticipatedAccountTurnOverMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getAnticipatedAccountTurnOverMax() {
    return anticipatedAccountTurnOverMax;
  }


  public void setAnticipatedAccountTurnOverMax(Double anticipatedAccountTurnOverMax) {
    
    
    
    this.anticipatedAccountTurnOverMax = anticipatedAccountTurnOverMax;
  }


  public UpdateNaturalPersonEconomicProfileRequest purposeOfBusinessRelationship(String purposeOfBusinessRelationship) {
    
    
    
    
    this.purposeOfBusinessRelationship = purposeOfBusinessRelationship;
    return this;
  }

   /**
   * Get purposeOfBusinessRelationship
   * @return purposeOfBusinessRelationship
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPurposeOfBusinessRelationship() {
    return purposeOfBusinessRelationship;
  }


  public void setPurposeOfBusinessRelationship(String purposeOfBusinessRelationship) {
    
    
    
    this.purposeOfBusinessRelationship = purposeOfBusinessRelationship;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the UpdateNaturalPersonEconomicProfileRequest instance itself
   */
  public UpdateNaturalPersonEconomicProfileRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateNaturalPersonEconomicProfileRequest updateNaturalPersonEconomicProfileRequest = (UpdateNaturalPersonEconomicProfileRequest) o;
    return Objects.equals(this.mainBusinessActivities, updateNaturalPersonEconomicProfileRequest.mainBusinessActivities) &&
        Objects.equals(this.sizeOfAnnualIncome, updateNaturalPersonEconomicProfileRequest.sizeOfAnnualIncome) &&
        Objects.equals(this.sizeOfAnnualIncomeMin, updateNaturalPersonEconomicProfileRequest.sizeOfAnnualIncomeMin) &&
        Objects.equals(this.sizeOfAnnualIncomeMax, updateNaturalPersonEconomicProfileRequest.sizeOfAnnualIncomeMax) &&
        Objects.equals(this.mainSourceOfIncome, updateNaturalPersonEconomicProfileRequest.mainSourceOfIncome) &&
        Objects.equals(this.sizeOfWealth, updateNaturalPersonEconomicProfileRequest.sizeOfWealth) &&
        Objects.equals(this.sizeOfWealthMin, updateNaturalPersonEconomicProfileRequest.sizeOfWealthMin) &&
        Objects.equals(this.sizeOfWealthMax, updateNaturalPersonEconomicProfileRequest.sizeOfWealthMax) &&
        Objects.equals(this.isHnwi, updateNaturalPersonEconomicProfileRequest.isHnwi) &&
        Objects.equals(this.sourceOfWealth, updateNaturalPersonEconomicProfileRequest.sourceOfWealth) &&
        Objects.equals(this.expectedOriginOfOutgoingFunds, updateNaturalPersonEconomicProfileRequest.expectedOriginOfOutgoingFunds) &&
        Objects.equals(this.expectedOriginOfIncomingFunds, updateNaturalPersonEconomicProfileRequest.expectedOriginOfIncomingFunds) &&
        Objects.equals(this.natureOfTransaction, updateNaturalPersonEconomicProfileRequest.natureOfTransaction) &&
        Objects.equals(this.anticipatedAccountTurnOver, updateNaturalPersonEconomicProfileRequest.anticipatedAccountTurnOver) &&
        Objects.equals(this.anticipatedAccountTurnOverMin, updateNaturalPersonEconomicProfileRequest.anticipatedAccountTurnOverMin) &&
        Objects.equals(this.anticipatedAccountTurnOverMax, updateNaturalPersonEconomicProfileRequest.anticipatedAccountTurnOverMax) &&
        Objects.equals(this.purposeOfBusinessRelationship, updateNaturalPersonEconomicProfileRequest.purposeOfBusinessRelationship)&&
        Objects.equals(this.additionalProperties, updateNaturalPersonEconomicProfileRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainBusinessActivities, sizeOfAnnualIncome, sizeOfAnnualIncomeMin, sizeOfAnnualIncomeMax, mainSourceOfIncome, sizeOfWealth, sizeOfWealthMin, sizeOfWealthMax, isHnwi, sourceOfWealth, expectedOriginOfOutgoingFunds, expectedOriginOfIncomingFunds, natureOfTransaction, anticipatedAccountTurnOver, anticipatedAccountTurnOverMin, anticipatedAccountTurnOverMax, purposeOfBusinessRelationship, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateNaturalPersonEconomicProfileRequest {\n");
    sb.append("    mainBusinessActivities: ").append(toIndentedString(mainBusinessActivities)).append("\n");
    sb.append("    sizeOfAnnualIncome: ").append(toIndentedString(sizeOfAnnualIncome)).append("\n");
    sb.append("    sizeOfAnnualIncomeMin: ").append(toIndentedString(sizeOfAnnualIncomeMin)).append("\n");
    sb.append("    sizeOfAnnualIncomeMax: ").append(toIndentedString(sizeOfAnnualIncomeMax)).append("\n");
    sb.append("    mainSourceOfIncome: ").append(toIndentedString(mainSourceOfIncome)).append("\n");
    sb.append("    sizeOfWealth: ").append(toIndentedString(sizeOfWealth)).append("\n");
    sb.append("    sizeOfWealthMin: ").append(toIndentedString(sizeOfWealthMin)).append("\n");
    sb.append("    sizeOfWealthMax: ").append(toIndentedString(sizeOfWealthMax)).append("\n");
    sb.append("    isHnwi: ").append(toIndentedString(isHnwi)).append("\n");
    sb.append("    sourceOfWealth: ").append(toIndentedString(sourceOfWealth)).append("\n");
    sb.append("    expectedOriginOfOutgoingFunds: ").append(toIndentedString(expectedOriginOfOutgoingFunds)).append("\n");
    sb.append("    expectedOriginOfIncomingFunds: ").append(toIndentedString(expectedOriginOfIncomingFunds)).append("\n");
    sb.append("    natureOfTransaction: ").append(toIndentedString(natureOfTransaction)).append("\n");
    sb.append("    anticipatedAccountTurnOver: ").append(toIndentedString(anticipatedAccountTurnOver)).append("\n");
    sb.append("    anticipatedAccountTurnOverMin: ").append(toIndentedString(anticipatedAccountTurnOverMin)).append("\n");
    sb.append("    anticipatedAccountTurnOverMax: ").append(toIndentedString(anticipatedAccountTurnOverMax)).append("\n");
    sb.append("    purposeOfBusinessRelationship: ").append(toIndentedString(purposeOfBusinessRelationship)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("mainBusinessActivities");
    openapiFields.add("sizeOfAnnualIncome");
    openapiFields.add("sizeOfAnnualIncomeMin");
    openapiFields.add("sizeOfAnnualIncomeMax");
    openapiFields.add("mainSourceOfIncome");
    openapiFields.add("sizeOfWealth");
    openapiFields.add("sizeOfWealthMin");
    openapiFields.add("sizeOfWealthMax");
    openapiFields.add("isHnwi");
    openapiFields.add("sourceOfWealth");
    openapiFields.add("expectedOriginOfOutgoingFunds");
    openapiFields.add("expectedOriginOfIncomingFunds");
    openapiFields.add("natureOfTransaction");
    openapiFields.add("anticipatedAccountTurnOver");
    openapiFields.add("anticipatedAccountTurnOverMin");
    openapiFields.add("anticipatedAccountTurnOverMax");
    openapiFields.add("purposeOfBusinessRelationship");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateNaturalPersonEconomicProfileRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateNaturalPersonEconomicProfileRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateNaturalPersonEconomicProfileRequest is not found in the empty JSON string", UpdateNaturalPersonEconomicProfileRequest.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("mainBusinessActivities").isJsonNull() && (jsonObj.get("mainBusinessActivities") != null && !jsonObj.get("mainBusinessActivities").isJsonNull()) && !jsonObj.get("mainBusinessActivities").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mainBusinessActivities` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mainBusinessActivities").toString()));
      }
      if (!jsonObj.get("expectedOriginOfOutgoingFunds").isJsonNull() && (jsonObj.get("expectedOriginOfOutgoingFunds") != null && !jsonObj.get("expectedOriginOfOutgoingFunds").isJsonNull()) && !jsonObj.get("expectedOriginOfOutgoingFunds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expectedOriginOfOutgoingFunds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expectedOriginOfOutgoingFunds").toString()));
      }
      if (!jsonObj.get("expectedOriginOfIncomingFunds").isJsonNull() && (jsonObj.get("expectedOriginOfIncomingFunds") != null && !jsonObj.get("expectedOriginOfIncomingFunds").isJsonNull()) && !jsonObj.get("expectedOriginOfIncomingFunds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expectedOriginOfIncomingFunds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expectedOriginOfIncomingFunds").toString()));
      }
      if (!jsonObj.get("natureOfTransaction").isJsonNull() && (jsonObj.get("natureOfTransaction") != null && !jsonObj.get("natureOfTransaction").isJsonNull()) && !jsonObj.get("natureOfTransaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `natureOfTransaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("natureOfTransaction").toString()));
      }
      if (!jsonObj.get("purposeOfBusinessRelationship").isJsonNull() && (jsonObj.get("purposeOfBusinessRelationship") != null && !jsonObj.get("purposeOfBusinessRelationship").isJsonNull()) && !jsonObj.get("purposeOfBusinessRelationship").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purposeOfBusinessRelationship` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purposeOfBusinessRelationship").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateNaturalPersonEconomicProfileRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateNaturalPersonEconomicProfileRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateNaturalPersonEconomicProfileRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateNaturalPersonEconomicProfileRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateNaturalPersonEconomicProfileRequest>() {
           @Override
           public void write(JsonWriter out, UpdateNaturalPersonEconomicProfileRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateNaturalPersonEconomicProfileRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateNaturalPersonEconomicProfileRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateNaturalPersonEconomicProfileRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateNaturalPersonEconomicProfileRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateNaturalPersonEconomicProfileRequest
  */
  public static UpdateNaturalPersonEconomicProfileRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateNaturalPersonEconomicProfileRequest.class);
  }

 /**
  * Convert an instance of UpdateNaturalPersonEconomicProfileRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

