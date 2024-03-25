# AddressApi

All URIs are relative to *https://proovidapi.azurewebsites.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNaturalPersonElv**](AddressApi.md#createNaturalPersonElv) | **POST** /api/Address/NaturalPersonELV |  |
| [**linkResponse**](AddressApi.md#linkResponse) | **POST** /api/Address/LinkResponse |  |
| [**verifyById**](AddressApi.md#verifyById) | **GET** /api/Address/AddressVerification/{id} |  |
| [**verifyById_0**](AddressApi.md#verifyById_0) | **DELETE** /api/Address/AddressVerification/{id} |  |
| [**verifyByLevel**](AddressApi.md#verifyByLevel) | **POST** /api/Address/VerificationByLevel |  |
| [**verifyCertificatePdf**](AddressApi.md#verifyCertificatePdf) | **GET** /api/Address/AddressVerification/{id}/certificate.pdf |  |


<a name="createNaturalPersonElv"></a>
# **createNaturalPersonElv**
> AddressVerificationResult createNaturalPersonElv().naturalPersonELVRequest(naturalPersonELVRequest).execute();



### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **naturalPersonELVRequest** | [**NaturalPersonELVRequest**](NaturalPersonELVRequest.md)|  | [optional] |

### Return type

[**AddressVerificationResult**](AddressVerificationResult.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="linkResponse"></a>
# **linkResponse**
> linkResponse().infoGps(infoGps).execute();



### Example
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
    String link = "link_example";
    List<GpsLocation> coords = Arrays.asList();
    try {
      client
              .address
              .linkResponse()
              .link(link)
              .coords(coords)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#linkResponse");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .address
              .linkResponse()
              .link(link)
              .coords(coords)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#linkResponse");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **infoGps** | [**InfoGps**](InfoGps.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="verifyById"></a>
# **verifyById**
> AddressVerificationResult verifyById(id).execute();



### Example
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
    Long id = 56L;
    try {
      AddressVerificationResult result = client
              .address
              .verifyById(id)
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
      System.err.println("Exception when calling AddressApi#verifyById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddressVerificationResult> response = client
              .address
              .verifyById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#verifyById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |

### Return type

[**AddressVerificationResult**](AddressVerificationResult.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="verifyById_0"></a>
# **verifyById_0**
> AddressVerificationDeleteResult verifyById_0(id).execute();



### Example
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
    Long id = 56L;
    try {
      AddressVerificationDeleteResult result = client
              .address
              .verifyById_0(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSystemId());
      System.out.println(result.getSuccess());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#verifyById_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddressVerificationDeleteResult> response = client
              .address
              .verifyById_0(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#verifyById_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |

### Return type

[**AddressVerificationDeleteResult**](AddressVerificationDeleteResult.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="verifyByLevel"></a>
# **verifyByLevel**
> AddressVerificationResult verifyByLevel().addressRequest(addressRequest).execute();



### Example
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
    String referenceId = "referenceId_example";
    String email = "email_example";
    Long naturalPersonId = 56L;
    Long naturalPersonIndexId = 56L;
    String name = "name_example";
    String surname = "surname_example";
    String mobilePhone = "mobilePhone_example";
    String language = "language_example";
    Integer verificationLevel = 56;
    String document = "document_example";
    String street = "street_example";
    String streetNumber = "streetNumber_example";
    String unit = "unit_example";
    String district = "district_example";
    String city = "city_example";
    String region = "region_example";
    String zipCode = "zipCode_example";
    String country = "country_example";
    String fullAddress = "fullAddress_example";
    Boolean skipDocumentComparison = true;
    Integer validityPeriod = 56;
    try {
      AddressVerificationResult result = client
              .address
              .verifyByLevel()
              .referenceId(referenceId)
              .email(email)
              .naturalPersonId(naturalPersonId)
              .naturalPersonIndexId(naturalPersonIndexId)
              .name(name)
              .surname(surname)
              .mobilePhone(mobilePhone)
              .language(language)
              .verificationLevel(verificationLevel)
              .document(document)
              .street(street)
              .streetNumber(streetNumber)
              .unit(unit)
              .district(district)
              .city(city)
              .region(region)
              .zipCode(zipCode)
              .country(country)
              .fullAddress(fullAddress)
              .skipDocumentComparison(skipDocumentComparison)
              .validityPeriod(validityPeriod)
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
      System.err.println("Exception when calling AddressApi#verifyByLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddressVerificationResult> response = client
              .address
              .verifyByLevel()
              .referenceId(referenceId)
              .email(email)
              .naturalPersonId(naturalPersonId)
              .naturalPersonIndexId(naturalPersonIndexId)
              .name(name)
              .surname(surname)
              .mobilePhone(mobilePhone)
              .language(language)
              .verificationLevel(verificationLevel)
              .document(document)
              .street(street)
              .streetNumber(streetNumber)
              .unit(unit)
              .district(district)
              .city(city)
              .region(region)
              .zipCode(zipCode)
              .country(country)
              .fullAddress(fullAddress)
              .skipDocumentComparison(skipDocumentComparison)
              .validityPeriod(validityPeriod)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#verifyByLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addressRequest** | [**AddressRequest**](AddressRequest.md)|  | [optional] |

### Return type

[**AddressVerificationResult**](AddressVerificationResult.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="verifyCertificatePdf"></a>
# **verifyCertificatePdf**
> File verifyCertificatePdf(id).execute();



### Example
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
    Integer id = 56;
    try {
      File result = client
              .address
              .verifyCertificatePdf(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#verifyCertificatePdf");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .address
              .verifyCertificatePdf(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#verifyCertificatePdf");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**File**](File.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

