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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * NaturalPersonAmlVerificationHitResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NaturalPersonAmlVerificationHitResponse {
  public static final String SERIALIZED_NAME_DATA_SOURCE_NAME = "dataSourceName";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_NAME)
  private String dataSourceName;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_POLITICAL_POSITIONS = "politicalPositions";
  @SerializedName(SERIALIZED_NAME_POLITICAL_POSITIONS)
  private List<String> politicalPositions = null;

  public static final String SERIALIZED_NAME_RELATED_URLS = "relatedUrls";
  @SerializedName(SERIALIZED_NAME_RELATED_URLS)
  private List<String> relatedUrls = null;

  public static final String SERIALIZED_NAME_BIRTH_DATES = "birthDates";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATES)
  private List<String> birthDates = null;

  public static final String SERIALIZED_NAME_MATCH_TYPES = "matchTypes";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPES)
  private List<String> matchTypes = null;

  public static final String SERIALIZED_NAME_MATCH_STATUS = "matchStatus";
  @SerializedName(SERIALIZED_NAME_MATCH_STATUS)
  private String matchStatus;

  public NaturalPersonAmlVerificationHitResponse() {
  }

  public NaturalPersonAmlVerificationHitResponse dataSourceName(String dataSourceName) {
    
    
    
    
    this.dataSourceName = dataSourceName;
    return this;
  }

   /**
   * Get dataSourceName
   * @return dataSourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataSourceName() {
    return dataSourceName;
  }


  public void setDataSourceName(String dataSourceName) {
    
    
    
    this.dataSourceName = dataSourceName;
  }


  public NaturalPersonAmlVerificationHitResponse categories(List<String> categories) {
    
    
    
    
    this.categories = categories;
    return this;
  }

  public NaturalPersonAmlVerificationHitResponse addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCategories() {
    return categories;
  }


  public void setCategories(List<String> categories) {
    
    
    
    this.categories = categories;
  }


  public NaturalPersonAmlVerificationHitResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public NaturalPersonAmlVerificationHitResponse country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public NaturalPersonAmlVerificationHitResponse politicalPositions(List<String> politicalPositions) {
    
    
    
    
    this.politicalPositions = politicalPositions;
    return this;
  }

  public NaturalPersonAmlVerificationHitResponse addPoliticalPositionsItem(String politicalPositionsItem) {
    if (this.politicalPositions == null) {
      this.politicalPositions = new ArrayList<>();
    }
    this.politicalPositions.add(politicalPositionsItem);
    return this;
  }

   /**
   * Get politicalPositions
   * @return politicalPositions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPoliticalPositions() {
    return politicalPositions;
  }


  public void setPoliticalPositions(List<String> politicalPositions) {
    
    
    
    this.politicalPositions = politicalPositions;
  }


  public NaturalPersonAmlVerificationHitResponse relatedUrls(List<String> relatedUrls) {
    
    
    
    
    this.relatedUrls = relatedUrls;
    return this;
  }

  public NaturalPersonAmlVerificationHitResponse addRelatedUrlsItem(String relatedUrlsItem) {
    if (this.relatedUrls == null) {
      this.relatedUrls = new ArrayList<>();
    }
    this.relatedUrls.add(relatedUrlsItem);
    return this;
  }

   /**
   * Get relatedUrls
   * @return relatedUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRelatedUrls() {
    return relatedUrls;
  }


  public void setRelatedUrls(List<String> relatedUrls) {
    
    
    
    this.relatedUrls = relatedUrls;
  }


  public NaturalPersonAmlVerificationHitResponse birthDates(List<String> birthDates) {
    
    
    
    
    this.birthDates = birthDates;
    return this;
  }

  public NaturalPersonAmlVerificationHitResponse addBirthDatesItem(String birthDatesItem) {
    if (this.birthDates == null) {
      this.birthDates = new ArrayList<>();
    }
    this.birthDates.add(birthDatesItem);
    return this;
  }

   /**
   * Get birthDates
   * @return birthDates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBirthDates() {
    return birthDates;
  }


  public void setBirthDates(List<String> birthDates) {
    
    
    
    this.birthDates = birthDates;
  }


  public NaturalPersonAmlVerificationHitResponse matchTypes(List<String> matchTypes) {
    
    
    
    
    this.matchTypes = matchTypes;
    return this;
  }

  public NaturalPersonAmlVerificationHitResponse addMatchTypesItem(String matchTypesItem) {
    if (this.matchTypes == null) {
      this.matchTypes = new ArrayList<>();
    }
    this.matchTypes.add(matchTypesItem);
    return this;
  }

   /**
   * Get matchTypes
   * @return matchTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMatchTypes() {
    return matchTypes;
  }


  public void setMatchTypes(List<String> matchTypes) {
    
    
    
    this.matchTypes = matchTypes;
  }


  public NaturalPersonAmlVerificationHitResponse matchStatus(String matchStatus) {
    
    
    
    
    this.matchStatus = matchStatus;
    return this;
  }

   /**
   * Get matchStatus
   * @return matchStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMatchStatus() {
    return matchStatus;
  }


  public void setMatchStatus(String matchStatus) {
    
    
    
    this.matchStatus = matchStatus;
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
   * @return the NaturalPersonAmlVerificationHitResponse instance itself
   */
  public NaturalPersonAmlVerificationHitResponse putAdditionalProperty(String key, Object value) {
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
    NaturalPersonAmlVerificationHitResponse naturalPersonAmlVerificationHitResponse = (NaturalPersonAmlVerificationHitResponse) o;
    return Objects.equals(this.dataSourceName, naturalPersonAmlVerificationHitResponse.dataSourceName) &&
        Objects.equals(this.categories, naturalPersonAmlVerificationHitResponse.categories) &&
        Objects.equals(this.name, naturalPersonAmlVerificationHitResponse.name) &&
        Objects.equals(this.country, naturalPersonAmlVerificationHitResponse.country) &&
        Objects.equals(this.politicalPositions, naturalPersonAmlVerificationHitResponse.politicalPositions) &&
        Objects.equals(this.relatedUrls, naturalPersonAmlVerificationHitResponse.relatedUrls) &&
        Objects.equals(this.birthDates, naturalPersonAmlVerificationHitResponse.birthDates) &&
        Objects.equals(this.matchTypes, naturalPersonAmlVerificationHitResponse.matchTypes) &&
        Objects.equals(this.matchStatus, naturalPersonAmlVerificationHitResponse.matchStatus)&&
        Objects.equals(this.additionalProperties, naturalPersonAmlVerificationHitResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSourceName, categories, name, country, politicalPositions, relatedUrls, birthDates, matchTypes, matchStatus, additionalProperties);
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
    sb.append("class NaturalPersonAmlVerificationHitResponse {\n");
    sb.append("    dataSourceName: ").append(toIndentedString(dataSourceName)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    politicalPositions: ").append(toIndentedString(politicalPositions)).append("\n");
    sb.append("    relatedUrls: ").append(toIndentedString(relatedUrls)).append("\n");
    sb.append("    birthDates: ").append(toIndentedString(birthDates)).append("\n");
    sb.append("    matchTypes: ").append(toIndentedString(matchTypes)).append("\n");
    sb.append("    matchStatus: ").append(toIndentedString(matchStatus)).append("\n");
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
    openapiFields.add("dataSourceName");
    openapiFields.add("categories");
    openapiFields.add("name");
    openapiFields.add("country");
    openapiFields.add("politicalPositions");
    openapiFields.add("relatedUrls");
    openapiFields.add("birthDates");
    openapiFields.add("matchTypes");
    openapiFields.add("matchStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NaturalPersonAmlVerificationHitResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NaturalPersonAmlVerificationHitResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NaturalPersonAmlVerificationHitResponse is not found in the empty JSON string", NaturalPersonAmlVerificationHitResponse.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("dataSourceName").isJsonNull() && (jsonObj.get("dataSourceName") != null && !jsonObj.get("dataSourceName").isJsonNull()) && !jsonObj.get("dataSourceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataSourceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataSourceName").toString()));
      }
      // ensure the optional json data is an array if present (nullable)
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonNull() && !jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string or null but got `%s`", jsonObj.get("categories").toString()));
      }
      if (!jsonObj.get("name").isJsonNull() && (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("country").isJsonNull() && (jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      // ensure the optional json data is an array if present (nullable)
      if (jsonObj.get("politicalPositions") != null && !jsonObj.get("politicalPositions").isJsonNull() && !jsonObj.get("politicalPositions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `politicalPositions` to be an array in the JSON string or null but got `%s`", jsonObj.get("politicalPositions").toString()));
      }
      // ensure the optional json data is an array if present (nullable)
      if (jsonObj.get("relatedUrls") != null && !jsonObj.get("relatedUrls").isJsonNull() && !jsonObj.get("relatedUrls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `relatedUrls` to be an array in the JSON string or null but got `%s`", jsonObj.get("relatedUrls").toString()));
      }
      // ensure the optional json data is an array if present (nullable)
      if (jsonObj.get("birthDates") != null && !jsonObj.get("birthDates").isJsonNull() && !jsonObj.get("birthDates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `birthDates` to be an array in the JSON string or null but got `%s`", jsonObj.get("birthDates").toString()));
      }
      // ensure the optional json data is an array if present (nullable)
      if (jsonObj.get("matchTypes") != null && !jsonObj.get("matchTypes").isJsonNull() && !jsonObj.get("matchTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchTypes` to be an array in the JSON string or null but got `%s`", jsonObj.get("matchTypes").toString()));
      }
      if (!jsonObj.get("matchStatus").isJsonNull() && (jsonObj.get("matchStatus") != null && !jsonObj.get("matchStatus").isJsonNull()) && !jsonObj.get("matchStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NaturalPersonAmlVerificationHitResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NaturalPersonAmlVerificationHitResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NaturalPersonAmlVerificationHitResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NaturalPersonAmlVerificationHitResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<NaturalPersonAmlVerificationHitResponse>() {
           @Override
           public void write(JsonWriter out, NaturalPersonAmlVerificationHitResponse value) throws IOException {
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
           public NaturalPersonAmlVerificationHitResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NaturalPersonAmlVerificationHitResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NaturalPersonAmlVerificationHitResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NaturalPersonAmlVerificationHitResponse
  * @throws IOException if the JSON string is invalid with respect to NaturalPersonAmlVerificationHitResponse
  */
  public static NaturalPersonAmlVerificationHitResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NaturalPersonAmlVerificationHitResponse.class);
  }

 /**
  * Convert an instance of NaturalPersonAmlVerificationHitResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

