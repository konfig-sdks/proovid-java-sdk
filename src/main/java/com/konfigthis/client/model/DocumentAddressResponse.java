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
 * DocumentAddressResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DocumentAddressResponse {
  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_STREET_NUMBER = "streetNumber";
  @SerializedName(SERIALIZED_NAME_STREET_NUMBER)
  private String streetNumber;

  public static final String SERIALIZED_NAME_BUILDING_NAME = "buildingName";
  @SerializedName(SERIALIZED_NAME_BUILDING_NAME)
  private String buildingName;

  public static final String SERIALIZED_NAME_BUILDING_NUMBER = "buildingNumber";
  @SerializedName(SERIALIZED_NAME_BUILDING_NUMBER)
  private String buildingNumber;

  public static final String SERIALIZED_NAME_FLAT_NUMBER = "flatNumber";
  @SerializedName(SERIALIZED_NAME_FLAT_NUMBER)
  private String flatNumber;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP_CODE = "zipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public DocumentAddressResponse() {
  }

  public DocumentAddressResponse street(String street) {
    
    
    
    
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    
    
    
    this.street = street;
  }


  public DocumentAddressResponse streetNumber(String streetNumber) {
    
    
    
    
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Get streetNumber
   * @return streetNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreetNumber() {
    return streetNumber;
  }


  public void setStreetNumber(String streetNumber) {
    
    
    
    this.streetNumber = streetNumber;
  }


  public DocumentAddressResponse buildingName(String buildingName) {
    
    
    
    
    this.buildingName = buildingName;
    return this;
  }

   /**
   * Get buildingName
   * @return buildingName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBuildingName() {
    return buildingName;
  }


  public void setBuildingName(String buildingName) {
    
    
    
    this.buildingName = buildingName;
  }


  public DocumentAddressResponse buildingNumber(String buildingNumber) {
    
    
    
    
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * Get buildingNumber
   * @return buildingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBuildingNumber() {
    return buildingNumber;
  }


  public void setBuildingNumber(String buildingNumber) {
    
    
    
    this.buildingNumber = buildingNumber;
  }


  public DocumentAddressResponse flatNumber(String flatNumber) {
    
    
    
    
    this.flatNumber = flatNumber;
    return this;
  }

   /**
   * Get flatNumber
   * @return flatNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFlatNumber() {
    return flatNumber;
  }


  public void setFlatNumber(String flatNumber) {
    
    
    
    this.flatNumber = flatNumber;
  }


  public DocumentAddressResponse city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public DocumentAddressResponse state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public DocumentAddressResponse zipCode(String zipCode) {
    
    
    
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    
    
    
    this.zipCode = zipCode;
  }


  public DocumentAddressResponse country(String country) {
    
    
    
    
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
   * @return the DocumentAddressResponse instance itself
   */
  public DocumentAddressResponse putAdditionalProperty(String key, Object value) {
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
    DocumentAddressResponse documentAddressResponse = (DocumentAddressResponse) o;
    return Objects.equals(this.street, documentAddressResponse.street) &&
        Objects.equals(this.streetNumber, documentAddressResponse.streetNumber) &&
        Objects.equals(this.buildingName, documentAddressResponse.buildingName) &&
        Objects.equals(this.buildingNumber, documentAddressResponse.buildingNumber) &&
        Objects.equals(this.flatNumber, documentAddressResponse.flatNumber) &&
        Objects.equals(this.city, documentAddressResponse.city) &&
        Objects.equals(this.state, documentAddressResponse.state) &&
        Objects.equals(this.zipCode, documentAddressResponse.zipCode) &&
        Objects.equals(this.country, documentAddressResponse.country)&&
        Objects.equals(this.additionalProperties, documentAddressResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, streetNumber, buildingName, buildingNumber, flatNumber, city, state, zipCode, country, additionalProperties);
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
    sb.append("class DocumentAddressResponse {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    flatNumber: ").append(toIndentedString(flatNumber)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
    openapiFields.add("street");
    openapiFields.add("streetNumber");
    openapiFields.add("buildingName");
    openapiFields.add("buildingNumber");
    openapiFields.add("flatNumber");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zipCode");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentAddressResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DocumentAddressResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentAddressResponse is not found in the empty JSON string", DocumentAddressResponse.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("street").isJsonNull() && (jsonObj.get("street") != null && !jsonObj.get("street").isJsonNull()) && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if (!jsonObj.get("streetNumber").isJsonNull() && (jsonObj.get("streetNumber") != null && !jsonObj.get("streetNumber").isJsonNull()) && !jsonObj.get("streetNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `streetNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("streetNumber").toString()));
      }
      if (!jsonObj.get("buildingName").isJsonNull() && (jsonObj.get("buildingName") != null && !jsonObj.get("buildingName").isJsonNull()) && !jsonObj.get("buildingName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buildingName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buildingName").toString()));
      }
      if (!jsonObj.get("buildingNumber").isJsonNull() && (jsonObj.get("buildingNumber") != null && !jsonObj.get("buildingNumber").isJsonNull()) && !jsonObj.get("buildingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buildingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buildingNumber").toString()));
      }
      if (!jsonObj.get("flatNumber").isJsonNull() && (jsonObj.get("flatNumber") != null && !jsonObj.get("flatNumber").isJsonNull()) && !jsonObj.get("flatNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flatNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flatNumber").toString()));
      }
      if (!jsonObj.get("city").isJsonNull() && (jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (!jsonObj.get("state").isJsonNull() && (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("zipCode").isJsonNull() && (jsonObj.get("zipCode") != null && !jsonObj.get("zipCode").isJsonNull()) && !jsonObj.get("zipCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipCode").toString()));
      }
      if (!jsonObj.get("country").isJsonNull() && (jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentAddressResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentAddressResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentAddressResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentAddressResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentAddressResponse>() {
           @Override
           public void write(JsonWriter out, DocumentAddressResponse value) throws IOException {
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
           public DocumentAddressResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DocumentAddressResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DocumentAddressResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentAddressResponse
  * @throws IOException if the JSON string is invalid with respect to DocumentAddressResponse
  */
  public static DocumentAddressResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentAddressResponse.class);
  }

 /**
  * Convert an instance of DocumentAddressResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

