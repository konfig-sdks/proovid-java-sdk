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
import com.konfigthis.client.model.EScore;
import com.konfigthis.client.model.ESourceOfIncomeAnswers;
import com.konfigthis.client.model.ESourceOfWealthAnswers;
import com.konfigthis.client.model.EWealthRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * NaturalPersonEconomicProfileResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NaturalPersonEconomicProfileResponse {
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

  public static final String SERIALIZED_NAME_INDUSTRY_NAME_OF_HIGHEST_RISK = "industryNameOfHighestRisk";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_NAME_OF_HIGHEST_RISK)
  private String industryNameOfHighestRisk;

  public static final String SERIALIZED_NAME_INDUSTRY_RISK_OF_HIGHEST_RISK = "industryRiskOfHighestRisk";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_RISK_OF_HIGHEST_RISK)
  private EScore industryRiskOfHighestRisk;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE = "lastUpdatedDate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE)
  private OffsetDateTime lastUpdatedDate;

  public NaturalPersonEconomicProfileResponse() {
  }

  public NaturalPersonEconomicProfileResponse mainBusinessActivities(String mainBusinessActivities) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse sizeOfAnnualIncome(EMoneyRange sizeOfAnnualIncome) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse sizeOfAnnualIncomeMin(Double sizeOfAnnualIncomeMin) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse sizeOfAnnualIncomeMax(Double sizeOfAnnualIncomeMax) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse mainSourceOfIncome(ESourceOfIncomeAnswers mainSourceOfIncome) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse sizeOfWealth(EWealthRange sizeOfWealth) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse sizeOfWealthMin(Double sizeOfWealthMin) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse sizeOfWealthMax(Double sizeOfWealthMax) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse isHnwi(Boolean isHnwi) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse sourceOfWealth(ESourceOfWealthAnswers sourceOfWealth) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse expectedOriginOfOutgoingFunds(String expectedOriginOfOutgoingFunds) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse expectedOriginOfIncomingFunds(String expectedOriginOfIncomingFunds) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse natureOfTransaction(String natureOfTransaction) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse anticipatedAccountTurnOver(EMoneyRange anticipatedAccountTurnOver) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse anticipatedAccountTurnOverMin(Double anticipatedAccountTurnOverMin) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse anticipatedAccountTurnOverMax(Double anticipatedAccountTurnOverMax) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse purposeOfBusinessRelationship(String purposeOfBusinessRelationship) {
    
    
    
    
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


  public NaturalPersonEconomicProfileResponse industryNameOfHighestRisk(String industryNameOfHighestRisk) {
    
    
    
    
    this.industryNameOfHighestRisk = industryNameOfHighestRisk;
    return this;
  }

   /**
   * Get industryNameOfHighestRisk
   * @return industryNameOfHighestRisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIndustryNameOfHighestRisk() {
    return industryNameOfHighestRisk;
  }


  public void setIndustryNameOfHighestRisk(String industryNameOfHighestRisk) {
    
    
    
    this.industryNameOfHighestRisk = industryNameOfHighestRisk;
  }


  public NaturalPersonEconomicProfileResponse industryRiskOfHighestRisk(EScore industryRiskOfHighestRisk) {
    
    
    
    
    this.industryRiskOfHighestRisk = industryRiskOfHighestRisk;
    return this;
  }

   /**
   * Get industryRiskOfHighestRisk
   * @return industryRiskOfHighestRisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EScore getIndustryRiskOfHighestRisk() {
    return industryRiskOfHighestRisk;
  }


  public void setIndustryRiskOfHighestRisk(EScore industryRiskOfHighestRisk) {
    
    
    
    this.industryRiskOfHighestRisk = industryRiskOfHighestRisk;
  }


  public NaturalPersonEconomicProfileResponse creationDate(OffsetDateTime creationDate) {
    
    
    
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    
    
    
    this.creationDate = creationDate;
  }


  public NaturalPersonEconomicProfileResponse lastUpdatedDate(OffsetDateTime lastUpdatedDate) {
    
    
    
    
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * Get lastUpdatedDate
   * @return lastUpdatedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastUpdatedDate() {
    return lastUpdatedDate;
  }


  public void setLastUpdatedDate(OffsetDateTime lastUpdatedDate) {
    
    
    
    this.lastUpdatedDate = lastUpdatedDate;
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
   * @return the NaturalPersonEconomicProfileResponse instance itself
   */
  public NaturalPersonEconomicProfileResponse putAdditionalProperty(String key, Object value) {
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
    NaturalPersonEconomicProfileResponse naturalPersonEconomicProfileResponse = (NaturalPersonEconomicProfileResponse) o;
    return Objects.equals(this.mainBusinessActivities, naturalPersonEconomicProfileResponse.mainBusinessActivities) &&
        Objects.equals(this.sizeOfAnnualIncome, naturalPersonEconomicProfileResponse.sizeOfAnnualIncome) &&
        Objects.equals(this.sizeOfAnnualIncomeMin, naturalPersonEconomicProfileResponse.sizeOfAnnualIncomeMin) &&
        Objects.equals(this.sizeOfAnnualIncomeMax, naturalPersonEconomicProfileResponse.sizeOfAnnualIncomeMax) &&
        Objects.equals(this.mainSourceOfIncome, naturalPersonEconomicProfileResponse.mainSourceOfIncome) &&
        Objects.equals(this.sizeOfWealth, naturalPersonEconomicProfileResponse.sizeOfWealth) &&
        Objects.equals(this.sizeOfWealthMin, naturalPersonEconomicProfileResponse.sizeOfWealthMin) &&
        Objects.equals(this.sizeOfWealthMax, naturalPersonEconomicProfileResponse.sizeOfWealthMax) &&
        Objects.equals(this.isHnwi, naturalPersonEconomicProfileResponse.isHnwi) &&
        Objects.equals(this.sourceOfWealth, naturalPersonEconomicProfileResponse.sourceOfWealth) &&
        Objects.equals(this.expectedOriginOfOutgoingFunds, naturalPersonEconomicProfileResponse.expectedOriginOfOutgoingFunds) &&
        Objects.equals(this.expectedOriginOfIncomingFunds, naturalPersonEconomicProfileResponse.expectedOriginOfIncomingFunds) &&
        Objects.equals(this.natureOfTransaction, naturalPersonEconomicProfileResponse.natureOfTransaction) &&
        Objects.equals(this.anticipatedAccountTurnOver, naturalPersonEconomicProfileResponse.anticipatedAccountTurnOver) &&
        Objects.equals(this.anticipatedAccountTurnOverMin, naturalPersonEconomicProfileResponse.anticipatedAccountTurnOverMin) &&
        Objects.equals(this.anticipatedAccountTurnOverMax, naturalPersonEconomicProfileResponse.anticipatedAccountTurnOverMax) &&
        Objects.equals(this.purposeOfBusinessRelationship, naturalPersonEconomicProfileResponse.purposeOfBusinessRelationship) &&
        Objects.equals(this.industryNameOfHighestRisk, naturalPersonEconomicProfileResponse.industryNameOfHighestRisk) &&
        Objects.equals(this.industryRiskOfHighestRisk, naturalPersonEconomicProfileResponse.industryRiskOfHighestRisk) &&
        Objects.equals(this.creationDate, naturalPersonEconomicProfileResponse.creationDate) &&
        Objects.equals(this.lastUpdatedDate, naturalPersonEconomicProfileResponse.lastUpdatedDate)&&
        Objects.equals(this.additionalProperties, naturalPersonEconomicProfileResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainBusinessActivities, sizeOfAnnualIncome, sizeOfAnnualIncomeMin, sizeOfAnnualIncomeMax, mainSourceOfIncome, sizeOfWealth, sizeOfWealthMin, sizeOfWealthMax, isHnwi, sourceOfWealth, expectedOriginOfOutgoingFunds, expectedOriginOfIncomingFunds, natureOfTransaction, anticipatedAccountTurnOver, anticipatedAccountTurnOverMin, anticipatedAccountTurnOverMax, purposeOfBusinessRelationship, industryNameOfHighestRisk, industryRiskOfHighestRisk, creationDate, lastUpdatedDate, additionalProperties);
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
    sb.append("class NaturalPersonEconomicProfileResponse {\n");
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
    sb.append("    industryNameOfHighestRisk: ").append(toIndentedString(industryNameOfHighestRisk)).append("\n");
    sb.append("    industryRiskOfHighestRisk: ").append(toIndentedString(industryRiskOfHighestRisk)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
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
    openapiFields.add("industryNameOfHighestRisk");
    openapiFields.add("industryRiskOfHighestRisk");
    openapiFields.add("creationDate");
    openapiFields.add("lastUpdatedDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NaturalPersonEconomicProfileResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NaturalPersonEconomicProfileResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NaturalPersonEconomicProfileResponse is not found in the empty JSON string", NaturalPersonEconomicProfileResponse.openapiRequiredFields.toString()));
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
      if (!jsonObj.get("industryNameOfHighestRisk").isJsonNull() && (jsonObj.get("industryNameOfHighestRisk") != null && !jsonObj.get("industryNameOfHighestRisk").isJsonNull()) && !jsonObj.get("industryNameOfHighestRisk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `industryNameOfHighestRisk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("industryNameOfHighestRisk").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NaturalPersonEconomicProfileResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NaturalPersonEconomicProfileResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NaturalPersonEconomicProfileResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NaturalPersonEconomicProfileResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<NaturalPersonEconomicProfileResponse>() {
           @Override
           public void write(JsonWriter out, NaturalPersonEconomicProfileResponse value) throws IOException {
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
           public NaturalPersonEconomicProfileResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NaturalPersonEconomicProfileResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NaturalPersonEconomicProfileResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NaturalPersonEconomicProfileResponse
  * @throws IOException if the JSON string is invalid with respect to NaturalPersonEconomicProfileResponse
  */
  public static NaturalPersonEconomicProfileResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NaturalPersonEconomicProfileResponse.class);
  }

 /**
  * Convert an instance of NaturalPersonEconomicProfileResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

