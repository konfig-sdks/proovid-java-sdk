<div align="left">

[![Visit Proovid](./header.png)](https://www.proovid.com&#x2F;)

# [Proovid](https://www.proovid.com&#x2F;)

Proovid API is a RESTful application that specializes in electronic verification (Proof of address and Proof of Identity) by employing an advanced risk-tiered approacch in combination with a smart Risk assessment system. <a href='docs/PROOVid_ELV.pdf' target='_blank'>More information</a> 

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=PROOViD&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>proovid-java-sdk</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:proovid-java-sdk:v1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/proovid-java-sdk-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AddressApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://proovidapi.azurewebsites.net";
    
    configuration.bearer  = "YOUR API KEY";
    ProoViD client = new ProoViD(configuration);
    Long naturalPersonIndexId = 56L;
    String street = "street_example";
    String streetNumber = "streetNumber_example";
    String unit = "unit_example";
    String zipCode = "zipCode_example";
    String city = "city_example";
    String district = "district_example";
    String region = "region_example";
    String country = "country_example";
    String email = "email_example";
    String mobile = "mobile_example";
    String fullAddress = "fullAddress_example";
    try {
      AddressVerificationResult result = client
              .address
              .createNaturalPersonElv()
              .naturalPersonIndexId(naturalPersonIndexId)
              .street(street)
              .streetNumber(streetNumber)
              .unit(unit)
              .zipCode(zipCode)
              .city(city)
              .district(district)
              .region(region)
              .country(country)
              .email(email)
              .mobile(mobile)
              .fullAddress(fullAddress)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getReference());
      System.out.println(result.getStatus());
      System.out.println(result.getVerificationLevel());
      System.out.println(result.getLevels());
      System.out.println(result.getDocumentVerification());
      System.out.println(result.getUserVerificationUrl());
      System.out.println(result.getQrCode());
      System.out.println(result.getCreationTime());
      System.out.println(result.getError());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#createNaturalPersonElv");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddressVerificationResult> response = client
              .address
              .createNaturalPersonElv()
              .naturalPersonIndexId(naturalPersonIndexId)
              .street(street)
              .streetNumber(streetNumber)
              .unit(unit)
              .zipCode(zipCode)
              .city(city)
              .district(district)
              .region(region)
              .country(country)
              .email(email)
              .mobile(mobile)
              .fullAddress(fullAddress)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#createNaturalPersonElv");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://proovidapi.azurewebsites.net*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddressApi* | [**createNaturalPersonElv**](docs/AddressApi.md#createNaturalPersonElv) | **POST** /api/Address/NaturalPersonELV | 
*AddressApi* | [**linkResponse**](docs/AddressApi.md#linkResponse) | **POST** /api/Address/LinkResponse | 
*AddressApi* | [**verifyById**](docs/AddressApi.md#verifyById) | **GET** /api/Address/AddressVerification/{id} | 
*AddressApi* | [**verifyById_0**](docs/AddressApi.md#verifyById_0) | **DELETE** /api/Address/AddressVerification/{id} | 
*AddressApi* | [**verifyByLevel**](docs/AddressApi.md#verifyByLevel) | **POST** /api/Address/VerificationByLevel | 
*AddressApi* | [**verifyCertificatePdf**](docs/AddressApi.md#verifyCertificatePdf) | **GET** /api/Address/AddressVerification/{id}/certificate.pdf | 
*DocumentApi* | [**getCertificate**](docs/DocumentApi.md#getCertificate) | **GET** /api/Document/DocumentVerification/{id}/certificate.pdf | 
*DocumentApi* | [**verifyDeletion**](docs/DocumentApi.md#verifyDeletion) | **DELETE** /api/Document/DocumentVerification/{id} | 
*DocumentApi* | [**verifyStatus**](docs/DocumentApi.md#verifyStatus) | **GET** /api/Document/DocumentVerification/{id} | 
*DocumentApi* | [**verifyStatus_0**](docs/DocumentApi.md#verifyStatus_0) | **POST** /api/Document/VerifyDocument | 
*HealthApi* | [**getVersion**](docs/HealthApi.md#getVersion) | **GET** /api/Health/Version | 
*HealthApi* | [**statusCheck**](docs/HealthApi.md#statusCheck) | **GET** /api/Health/Status | 
*NaturalPersonApi* | [**createOrUpdate**](docs/NaturalPersonApi.md#createOrUpdate) | **POST** /api/NaturalPerson | 
*NaturalPersonApi* | [**deleteById**](docs/NaturalPersonApi.md#deleteById) | **DELETE** /api/NaturalPerson/{id} | 
*NaturalPersonApi* | [**getById**](docs/NaturalPersonApi.md#getById) | **GET** /api/NaturalPerson/{id} | 
*NaturalPersonApi* | [**getById_0**](docs/NaturalPersonApi.md#getById_0) | **GET** /api/NaturalPerson/{reference} | 
*NaturalPersonApi* | [**getCertificate**](docs/NaturalPersonApi.md#getCertificate) | **GET** /api/NaturalPerson/{naturalPersonId}/certificate | 
*NaturalPersonApi* | [**getDetails**](docs/NaturalPersonApi.md#getDetails) | **GET** /api/NaturalPerson/{naturalPersonId}/get | 
*NaturalPersonApi* | [**getVerificationRecord**](docs/NaturalPersonApi.md#getVerificationRecord) | **GET** /api/NaturalPerson/verificationRecord/{verificationId} | 
*NaturalPersonApi* | [**getVerifications**](docs/NaturalPersonApi.md#getVerifications) | **GET** /api/NaturalPerson/{naturalPersonId}/verifications | 
*NaturalPersonApi* | [**removeById**](docs/NaturalPersonApi.md#removeById) | **DELETE** /api/NaturalPerson/{naturalPersonId}/delete | 
*NaturalPersonApi* | [**updateDocuments**](docs/NaturalPersonApi.md#updateDocuments) | **POST** /api/NaturalPerson/{naturalPersonId}/updateDocuments | 
*NaturalPersonApi* | [**updateInformation**](docs/NaturalPersonApi.md#updateInformation) | **POST** /api/NaturalPerson/{naturalPersonId}/updateInfo | 
*NaturalPersonApi* | [**verifyDetails**](docs/NaturalPersonApi.md#verifyDetails) | **POST** /api/NaturalPerson/verify | 
*NaturalPersonApi* | [**verifyDetails_0**](docs/NaturalPersonApi.md#verifyDetails_0) | **POST** /api/NaturalPerson/{naturalPersonId}/verify | 
*NaturalPersonApi* | [**verifyDocuments**](docs/NaturalPersonApi.md#verifyDocuments) | **POST** /api/NaturalPerson/{naturalPersonId}/updateDocuments/verify | 
*NaturalPersonApi* | [**verifyEntity**](docs/NaturalPersonApi.md#verifyEntity) | **POST** /api/NaturalPerson/verifyentity | 
*ScreeningApi* | [**getAmlReport**](docs/ScreeningApi.md#getAmlReport) | **GET** /api/Screening/AmlReport/{reference} | 
*ScreeningApi* | [**getNaturalPersonById**](docs/ScreeningApi.md#getNaturalPersonById) | **GET** /api/Screening/NaturalPerson/{id} | 
*ScreeningApi* | [**removeNaturalPerson**](docs/ScreeningApi.md#removeNaturalPerson) | **DELETE** /api/Screening/NaturalPerson/{id} | 
*ScreeningApi* | [**submitNaturalPersonScreening**](docs/ScreeningApi.md#submitNaturalPersonScreening) | **POST** /api/Screening/NaturalPerson | 


## Documentation for Models

 - [AddNaturalPersonDataSaveResult](docs/AddNaturalPersonDataSaveResult.md)
 - [AddNaturalPersonInfoRequest](docs/AddNaturalPersonInfoRequest.md)
 - [AddNaturalPersonRequest](docs/AddNaturalPersonRequest.md)
 - [AddNaturalPersonResponse](docs/AddNaturalPersonResponse.md)
 - [AddNaturalPersonResponseBaseResponse](docs/AddNaturalPersonResponseBaseResponse.md)
 - [AddressDocumentVerificationResult](docs/AddressDocumentVerificationResult.md)
 - [AddressRequest](docs/AddressRequest.md)
 - [AddressVerificationDeleteResult](docs/AddressVerificationDeleteResult.md)
 - [AddressVerificationResult](docs/AddressVerificationResult.md)
 - [Agent](docs/Agent.md)
 - [AmlRecord](docs/AmlRecord.md)
 - [AmlReport](docs/AmlReport.md)
 - [Asset](docs/Asset.md)
 - [Associate](docs/Associate.md)
 - [BaseResponse](docs/BaseResponse.md)
 - [DeleteAmlReport](docs/DeleteAmlReport.md)
 - [DeleteDocumentVerificationResponse](docs/DeleteDocumentVerificationResponse.md)
 - [DescriptionLevels](docs/DescriptionLevels.md)
 - [DocumentAddressResponse](docs/DocumentAddressResponse.md)
 - [DocumentImages](docs/DocumentImages.md)
 - [DocumentVerificationData](docs/DocumentVerificationData.md)
 - [DocumentVerificationRequest](docs/DocumentVerificationRequest.md)
 - [DocumentVerificationResponse](docs/DocumentVerificationResponse.md)
 - [DocumentVerificationResult](docs/DocumentVerificationResult.md)
 - [EGender](docs/EGender.md)
 - [EMoneyRange](docs/EMoneyRange.md)
 - [ENegativeReputationAnswers](docs/ENegativeReputationAnswers.md)
 - [EPepAnswers](docs/EPepAnswers.md)
 - [ESanctionAnswers](docs/ESanctionAnswers.md)
 - [EScore](docs/EScore.md)
 - [ESourceOfIncomeAnswers](docs/ESourceOfIncomeAnswers.md)
 - [ESourceOfWealthAnswers](docs/ESourceOfWealthAnswers.md)
 - [EStatus](docs/EStatus.md)
 - [EWealthRange](docs/EWealthRange.md)
 - [Error](docs/Error.md)
 - [Field](docs/Field.md)
 - [Geolocation](docs/Geolocation.md)
 - [GpsLocation](docs/GpsLocation.md)
 - [IDDocType](docs/IDDocType.md)
 - [Info](docs/Info.md)
 - [InfoGps](docs/InfoGps.md)
 - [Level](docs/Level.md)
 - [Media](docs/Media.md)
 - [Name](docs/Name.md)
 - [NaturalPerson](docs/NaturalPerson.md)
 - [NaturalPersonAddressVerificationResponse](docs/NaturalPersonAddressVerificationResponse.md)
 - [NaturalPersonAmlVerificationHitResponse](docs/NaturalPersonAmlVerificationHitResponse.md)
 - [NaturalPersonAmlVerificationResponse](docs/NaturalPersonAmlVerificationResponse.md)
 - [NaturalPersonDocumentRequest](docs/NaturalPersonDocumentRequest.md)
 - [NaturalPersonDocumentVerificationResponse](docs/NaturalPersonDocumentVerificationResponse.md)
 - [NaturalPersonDocumentsRequest](docs/NaturalPersonDocumentsRequest.md)
 - [NaturalPersonELVRequest](docs/NaturalPersonELVRequest.md)
 - [NaturalPersonEconomicProfileResponse](docs/NaturalPersonEconomicProfileResponse.md)
 - [NaturalPersonFaceVerificationResponse](docs/NaturalPersonFaceVerificationResponse.md)
 - [NaturalPersonIdDocumentRequest](docs/NaturalPersonIdDocumentRequest.md)
 - [NaturalPersonInfoResponse](docs/NaturalPersonInfoResponse.md)
 - [NaturalPersonInfoResponseBaseResponse](docs/NaturalPersonInfoResponseBaseResponse.md)
 - [NaturalPersonOccupationResponse](docs/NaturalPersonOccupationResponse.md)
 - [NaturalPersonOtherSourceOfIncomeResponse](docs/NaturalPersonOtherSourceOfIncomeResponse.md)
 - [NaturalPersonOtherSourceOfWealthResponse](docs/NaturalPersonOtherSourceOfWealthResponse.md)
 - [NaturalPersonRequest](docs/NaturalPersonRequest.md)
 - [NaturalPersonResponse](docs/NaturalPersonResponse.md)
 - [NaturalPersonResponseBaseResponse](docs/NaturalPersonResponseBaseResponse.md)
 - [RejectLabelType](docs/RejectLabelType.md)
 - [ShuftiAddressData](docs/ShuftiAddressData.md)
 - [ShuftiAddressDataResponse](docs/ShuftiAddressDataResponse.md)
 - [ShuftiAddressResultResponse](docs/ShuftiAddressResultResponse.md)
 - [SourceNote](docs/SourceNote.md)
 - [StringBaseResponse](docs/StringBaseResponse.md)
 - [SumSubAmlVerificationHitResponse](docs/SumSubAmlVerificationHitResponse.md)
 - [SumSubAmlVerificationResponse](docs/SumSubAmlVerificationResponse.md)
 - [SumSubDocumentVerificationVerificationResponse](docs/SumSubDocumentVerificationVerificationResponse.md)
 - [SumSubVerificationResponse](docs/SumSubVerificationResponse.md)
 - [SumSubVerificationResponseBaseResponse](docs/SumSubVerificationResponseBaseResponse.md)
 - [SumSubVerificationResponseListBaseResponse](docs/SumSubVerificationResponseListBaseResponse.md)
 - [UpdateNaturalPersonDocumentsDataSaveResult](docs/UpdateNaturalPersonDocumentsDataSaveResult.md)
 - [UpdateNaturalPersonDocumentsResponse](docs/UpdateNaturalPersonDocumentsResponse.md)
 - [UpdateNaturalPersonDocumentsResponseBaseResponse](docs/UpdateNaturalPersonDocumentsResponseBaseResponse.md)
 - [UpdateNaturalPersonEconomicProfileRequest](docs/UpdateNaturalPersonEconomicProfileRequest.md)
 - [UpdateNaturalPersonInfoRequest](docs/UpdateNaturalPersonInfoRequest.md)
 - [VerificationData](docs/VerificationData.md)
 - [VerificationResult](docs/VerificationResult.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
