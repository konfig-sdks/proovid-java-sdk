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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets eSourceOfIncomeAnswers
 */
@JsonAdapter(ESourceOfIncomeAnswers.Adapter.class)public enum ESourceOfIncomeAnswers {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3),
  
  NUMBER_4(4),
  
  NUMBER_5(5),
  
  NUMBER_6(6),
  
  NUMBER_7(7),
  
  NUMBER_MINUS_1(-1);

  private Integer value;

  ESourceOfIncomeAnswers(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ESourceOfIncomeAnswers fromValue(Integer value) {
    for (ESourceOfIncomeAnswers b : ESourceOfIncomeAnswers.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ESourceOfIncomeAnswers> {
    @Override
    public void write(final JsonWriter jsonWriter, final ESourceOfIncomeAnswers enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ESourceOfIncomeAnswers read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return ESourceOfIncomeAnswers.fromValue(value);
    }
  }
}

