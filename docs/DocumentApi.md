# DocumentApi

All URIs are relative to *https://proovidapi.azurewebsites.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCertificate**](DocumentApi.md#getCertificate) | **GET** /api/Document/DocumentVerification/{id}/certificate.pdf |  |
| [**verifyDeletion**](DocumentApi.md#verifyDeletion) | **DELETE** /api/Document/DocumentVerification/{id} |  |
| [**verifyStatus**](DocumentApi.md#verifyStatus) | **GET** /api/Document/DocumentVerification/{id} |  |
| [**verifyStatus_0**](DocumentApi.md#verifyStatus_0) | **POST** /api/Document/VerifyDocument |  |


<a name="getCertificate"></a>
# **getCertificate**
> File getCertificate(id).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentApi;
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
              .document
              .getCertificate(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#getCertificate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .document
              .getCertificate(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#getCertificate");
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

<a name="verifyDeletion"></a>
# **verifyDeletion**
> DeleteDocumentVerificationResponse verifyDeletion(id).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentApi;
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
      DeleteDocumentVerificationResponse result = client
              .document
              .verifyDeletion(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSystemId());
      System.out.println(result.getSuccess());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#verifyDeletion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeleteDocumentVerificationResponse> response = client
              .document
              .verifyDeletion(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#verifyDeletion");
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

[**DeleteDocumentVerificationResponse**](DeleteDocumentVerificationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="verifyStatus"></a>
# **verifyStatus**
> DocumentVerificationResponse verifyStatus(id).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentApi;
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
      DocumentVerificationResponse result = client
              .document
              .verifyStatus(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSystemId());
      System.out.println(result.getStatus());
      System.out.println(result.getDocumentData());
      System.out.println(result.getDocumentResult());
      System.out.println(result.getDeclinedReason());
      System.out.println(result.getDeclinedCodeProovid());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#verifyStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocumentVerificationResponse> response = client
              .document
              .verifyStatus(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#verifyStatus");
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

[**DocumentVerificationResponse**](DocumentVerificationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="verifyStatus_0"></a>
# **verifyStatus_0**
> DocumentVerificationResponse verifyStatus_0().documentVerificationRequest(documentVerificationRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://proovidapi.azurewebsites.net";
    
    configuration.bearer  = "YOUR API KEY";
    ProoViD client = new ProoViD(configuration);
    String email = "email_example";
    String country = "country_example";
    String document = "document_example";
    String additionalDocument = "additionalDocument_example";
    String face = "face_example";
    String documentType = "documentType_example";
    Long naturalPersonId = 56L;
    try {
      DocumentVerificationResponse result = client
              .document
              .verifyStatus_0()
              .email(email)
              .country(country)
              .document(document)
              .additionalDocument(additionalDocument)
              .face(face)
              .documentType(documentType)
              .naturalPersonId(naturalPersonId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSystemId());
      System.out.println(result.getStatus());
      System.out.println(result.getDocumentData());
      System.out.println(result.getDocumentResult());
      System.out.println(result.getDeclinedReason());
      System.out.println(result.getDeclinedCodeProovid());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#verifyStatus_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocumentVerificationResponse> response = client
              .document
              .verifyStatus_0()
              .email(email)
              .country(country)
              .document(document)
              .additionalDocument(additionalDocument)
              .face(face)
              .documentType(documentType)
              .naturalPersonId(naturalPersonId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#verifyStatus_0");
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
| **documentVerificationRequest** | [**DocumentVerificationRequest**](DocumentVerificationRequest.md)|  | [optional] |

### Return type

[**DocumentVerificationResponse**](DocumentVerificationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

