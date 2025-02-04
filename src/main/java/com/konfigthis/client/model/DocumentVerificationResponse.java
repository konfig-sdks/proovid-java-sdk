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
import com.konfigthis.client.model.DocumentVerificationData;
import com.konfigthis.client.model.DocumentVerificationResult;
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
 * DocumentVerificationResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DocumentVerificationResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_SYSTEM_ID = "systemId";
  @SerializedName(SERIALIZED_NAME_SYSTEM_ID)
  private Integer systemId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_DOCUMENT_DATA = "documentData";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_DATA)
  private DocumentVerificationData documentData;

  public static final String SERIALIZED_NAME_DOCUMENT_RESULT = "documentResult";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_RESULT)
  private DocumentVerificationResult documentResult;

  public static final String SERIALIZED_NAME_DECLINED_REASON = "declinedReason";
  @SerializedName(SERIALIZED_NAME_DECLINED_REASON)
  private String declinedReason;

  public static final String SERIALIZED_NAME_DECLINED_CODE_PROOVID = "declinedCodeProovid";
  @SerializedName(SERIALIZED_NAME_DECLINED_CODE_PROOVID)
  private String declinedCodeProovid;

  public DocumentVerificationResponse() {
  }

  public DocumentVerificationResponse id(Long id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    
    
    
    this.id = id;
  }


  public DocumentVerificationResponse systemId(Integer systemId) {
    
    
    
    
    this.systemId = systemId;
    return this;
  }

   /**
   * Get systemId
   * @return systemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSystemId() {
    return systemId;
  }


  public void setSystemId(Integer systemId) {
    
    
    
    this.systemId = systemId;
  }


  public DocumentVerificationResponse status(Integer status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    
    
    
    this.status = status;
  }


  public DocumentVerificationResponse documentData(DocumentVerificationData documentData) {
    
    
    
    
    this.documentData = documentData;
    return this;
  }

   /**
   * Get documentData
   * @return documentData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentVerificationData getDocumentData() {
    return documentData;
  }


  public void setDocumentData(DocumentVerificationData documentData) {
    
    
    
    this.documentData = documentData;
  }


  public DocumentVerificationResponse documentResult(DocumentVerificationResult documentResult) {
    
    
    
    
    this.documentResult = documentResult;
    return this;
  }

   /**
   * Get documentResult
   * @return documentResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentVerificationResult getDocumentResult() {
    return documentResult;
  }


  public void setDocumentResult(DocumentVerificationResult documentResult) {
    
    
    
    this.documentResult = documentResult;
  }


  public DocumentVerificationResponse declinedReason(String declinedReason) {
    
    
    
    
    this.declinedReason = declinedReason;
    return this;
  }

   /**
   * Get declinedReason
   * @return declinedReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeclinedReason() {
    return declinedReason;
  }


  public void setDeclinedReason(String declinedReason) {
    
    
    
    this.declinedReason = declinedReason;
  }


  public DocumentVerificationResponse declinedCodeProovid(String declinedCodeProovid) {
    
    
    
    
    this.declinedCodeProovid = declinedCodeProovid;
    return this;
  }

   /**
   * Get declinedCodeProovid
   * @return declinedCodeProovid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeclinedCodeProovid() {
    return declinedCodeProovid;
  }


  public void setDeclinedCodeProovid(String declinedCodeProovid) {
    
    
    
    this.declinedCodeProovid = declinedCodeProovid;
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
   * @return the DocumentVerificationResponse instance itself
   */
  public DocumentVerificationResponse putAdditionalProperty(String key, Object value) {
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
    DocumentVerificationResponse documentVerificationResponse = (DocumentVerificationResponse) o;
    return Objects.equals(this.id, documentVerificationResponse.id) &&
        Objects.equals(this.systemId, documentVerificationResponse.systemId) &&
        Objects.equals(this.status, documentVerificationResponse.status) &&
        Objects.equals(this.documentData, documentVerificationResponse.documentData) &&
        Objects.equals(this.documentResult, documentVerificationResponse.documentResult) &&
        Objects.equals(this.declinedReason, documentVerificationResponse.declinedReason) &&
        Objects.equals(this.declinedCodeProovid, documentVerificationResponse.declinedCodeProovid)&&
        Objects.equals(this.additionalProperties, documentVerificationResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, systemId, status, documentData, documentResult, declinedReason, declinedCodeProovid, additionalProperties);
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
    sb.append("class DocumentVerificationResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    documentData: ").append(toIndentedString(documentData)).append("\n");
    sb.append("    documentResult: ").append(toIndentedString(documentResult)).append("\n");
    sb.append("    declinedReason: ").append(toIndentedString(declinedReason)).append("\n");
    sb.append("    declinedCodeProovid: ").append(toIndentedString(declinedCodeProovid)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("systemId");
    openapiFields.add("status");
    openapiFields.add("documentData");
    openapiFields.add("documentResult");
    openapiFields.add("declinedReason");
    openapiFields.add("declinedCodeProovid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentVerificationResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DocumentVerificationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentVerificationResponse is not found in the empty JSON string", DocumentVerificationResponse.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `documentData`
      if (jsonObj.get("documentData") != null && !jsonObj.get("documentData").isJsonNull()) {
        DocumentVerificationData.validateJsonObject(jsonObj.getAsJsonObject("documentData"));
      }
      // validate the optional field `documentResult`
      if (jsonObj.get("documentResult") != null && !jsonObj.get("documentResult").isJsonNull()) {
        DocumentVerificationResult.validateJsonObject(jsonObj.getAsJsonObject("documentResult"));
      }
      if (!jsonObj.get("declinedReason").isJsonNull() && (jsonObj.get("declinedReason") != null && !jsonObj.get("declinedReason").isJsonNull()) && !jsonObj.get("declinedReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `declinedReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("declinedReason").toString()));
      }
      if (!jsonObj.get("declinedCodeProovid").isJsonNull() && (jsonObj.get("declinedCodeProovid") != null && !jsonObj.get("declinedCodeProovid").isJsonNull()) && !jsonObj.get("declinedCodeProovid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `declinedCodeProovid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("declinedCodeProovid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentVerificationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentVerificationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentVerificationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentVerificationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentVerificationResponse>() {
           @Override
           public void write(JsonWriter out, DocumentVerificationResponse value) throws IOException {
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
           public DocumentVerificationResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DocumentVerificationResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DocumentVerificationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentVerificationResponse
  * @throws IOException if the JSON string is invalid with respect to DocumentVerificationResponse
  */
  public static DocumentVerificationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentVerificationResponse.class);
  }

 /**
  * Convert an instance of DocumentVerificationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

