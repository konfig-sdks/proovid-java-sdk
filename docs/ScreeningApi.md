# ScreeningApi

All URIs are relative to *https://proovidapi.azurewebsites.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAmlReport**](ScreeningApi.md#getAmlReport) | **GET** /api/Screening/AmlReport/{reference} |  |
| [**getNaturalPersonById**](ScreeningApi.md#getNaturalPersonById) | **GET** /api/Screening/NaturalPerson/{id} |  |
| [**removeNaturalPerson**](ScreeningApi.md#removeNaturalPerson) | **DELETE** /api/Screening/NaturalPerson/{id} |  |
| [**submitNaturalPersonScreening**](ScreeningApi.md#submitNaturalPersonScreening) | **POST** /api/Screening/NaturalPerson |  |


<a name="getAmlReport"></a>
# **getAmlReport**
> AmlReport getAmlReport(reference).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScreeningApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://proovidapi.azurewebsites.net";
    
    configuration.bearer  = "YOUR API KEY";
    ProoViD client = new ProoViD(configuration);
    String reference = "reference_example";
    try {
      AmlReport result = client
              .screening
              .getAmlReport(reference)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreationTime());
      System.out.println(result.getReviewedVerificationStatus());
      System.out.println(result.getNumberOfRecords());
      System.out.println(result.getNaturalPerson());
      System.out.println(result.getAmlRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreeningApi#getAmlReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AmlReport> response = client
              .screening
              .getAmlReport(reference)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreeningApi#getAmlReport");
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
| **reference** | **String**|  | |

### Return type

[**AmlReport**](AmlReport.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getNaturalPersonById"></a>
# **getNaturalPersonById**
> AmlReport getNaturalPersonById(id).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScreeningApi;
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
      AmlReport result = client
              .screening
              .getNaturalPersonById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreationTime());
      System.out.println(result.getReviewedVerificationStatus());
      System.out.println(result.getNumberOfRecords());
      System.out.println(result.getNaturalPerson());
      System.out.println(result.getAmlRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreeningApi#getNaturalPersonById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AmlReport> response = client
              .screening
              .getNaturalPersonById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreeningApi#getNaturalPersonById");
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

[**AmlReport**](AmlReport.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeNaturalPerson"></a>
# **removeNaturalPerson**
> DeleteAmlReport removeNaturalPerson(id).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScreeningApi;
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
      DeleteAmlReport result = client
              .screening
              .removeNaturalPerson(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSystemId());
      System.out.println(result.getSuccess());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreeningApi#removeNaturalPerson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeleteAmlReport> response = client
              .screening
              .removeNaturalPerson(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreeningApi#removeNaturalPerson");
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

[**DeleteAmlReport**](DeleteAmlReport.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="submitNaturalPersonScreening"></a>
# **submitNaturalPersonScreening**
> AmlReport submitNaturalPersonScreening().naturalPersonRequest(naturalPersonRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScreeningApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://proovidapi.azurewebsites.net";
    
    configuration.bearer  = "YOUR API KEY";
    ProoViD client = new ProoViD(configuration);
    Long naturalPersonId = 56L;
    String firstName = "firstName_example";
    String middleName = "middleName_example";
    String lastName = "lastName_example";
    OffsetDateTime dob = OffsetDateTime.now();
    String partialMatch = "partialMatch_example";
    String document = "document_example";
    String documentType = "documentType_example";
    try {
      AmlReport result = client
              .screening
              .submitNaturalPersonScreening()
              .naturalPersonId(naturalPersonId)
              .firstName(firstName)
              .middleName(middleName)
              .lastName(lastName)
              .dob(dob)
              .partialMatch(partialMatch)
              .document(document)
              .documentType(documentType)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreationTime());
      System.out.println(result.getReviewedVerificationStatus());
      System.out.println(result.getNumberOfRecords());
      System.out.println(result.getNaturalPerson());
      System.out.println(result.getAmlRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreeningApi#submitNaturalPersonScreening");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AmlReport> response = client
              .screening
              .submitNaturalPersonScreening()
              .naturalPersonId(naturalPersonId)
              .firstName(firstName)
              .middleName(middleName)
              .lastName(lastName)
              .dob(dob)
              .partialMatch(partialMatch)
              .document(document)
              .documentType(documentType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreeningApi#submitNaturalPersonScreening");
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
| **naturalPersonRequest** | [**NaturalPersonRequest**](NaturalPersonRequest.md)|  | [optional] |

### Return type

[**AmlReport**](AmlReport.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

