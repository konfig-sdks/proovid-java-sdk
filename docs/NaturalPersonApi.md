# NaturalPersonApi

All URIs are relative to *https://proovidapi.azurewebsites.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrUpdate**](NaturalPersonApi.md#createOrUpdate) | **POST** /api/NaturalPerson |  |
| [**deleteById**](NaturalPersonApi.md#deleteById) | **DELETE** /api/NaturalPerson/{id} |  |
| [**getById**](NaturalPersonApi.md#getById) | **GET** /api/NaturalPerson/{id} |  |
| [**getById_0**](NaturalPersonApi.md#getById_0) | **GET** /api/NaturalPerson/{reference} |  |
| [**getCertificate**](NaturalPersonApi.md#getCertificate) | **GET** /api/NaturalPerson/{naturalPersonId}/certificate |  |
| [**getDetails**](NaturalPersonApi.md#getDetails) | **GET** /api/NaturalPerson/{naturalPersonId}/get |  |
| [**getVerificationRecord**](NaturalPersonApi.md#getVerificationRecord) | **GET** /api/NaturalPerson/verificationRecord/{verificationId} |  |
| [**getVerifications**](NaturalPersonApi.md#getVerifications) | **GET** /api/NaturalPerson/{naturalPersonId}/verifications |  |
| [**removeById**](NaturalPersonApi.md#removeById) | **DELETE** /api/NaturalPerson/{naturalPersonId}/delete |  |
| [**updateDocuments**](NaturalPersonApi.md#updateDocuments) | **POST** /api/NaturalPerson/{naturalPersonId}/updateDocuments |  |
| [**updateInformation**](NaturalPersonApi.md#updateInformation) | **POST** /api/NaturalPerson/{naturalPersonId}/updateInfo |  |
| [**verifyDetails**](NaturalPersonApi.md#verifyDetails) | **POST** /api/NaturalPerson/verify |  |
| [**verifyDetails_0**](NaturalPersonApi.md#verifyDetails_0) | **POST** /api/NaturalPerson/{naturalPersonId}/verify |  |
| [**verifyDocuments**](NaturalPersonApi.md#verifyDocuments) | **POST** /api/NaturalPerson/{naturalPersonId}/updateDocuments/verify |  |
| [**verifyEntity**](NaturalPersonApi.md#verifyEntity) | **POST** /api/NaturalPerson/verifyentity |  |


<a name="createOrUpdate"></a>
# **createOrUpdate**
> AddNaturalPersonResponseBaseResponse createOrUpdate().addNaturalPersonRequest(addNaturalPersonRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://proovidapi.azurewebsites.net";
    
    configuration.bearer  = "YOUR API KEY";
    ProoViD client = new ProoViD(configuration);
    AddNaturalPersonInfoRequest info = new AddNaturalPersonInfoRequest();
    String clientReferenceId = "clientReferenceId_example";
    NaturalPersonDocumentsRequest documents = new NaturalPersonDocumentsRequest();
    try {
      AddNaturalPersonResponseBaseResponse result = client
              .naturalPerson
              .createOrUpdate()
              .info(info)
              .clientReferenceId(clientReferenceId)
              .documents(documents)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getData());
      System.out.println(result.getSucceeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#createOrUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddNaturalPersonResponseBaseResponse> response = client
              .naturalPerson
              .createOrUpdate()
              .info(info)
              .clientReferenceId(clientReferenceId)
              .documents(documents)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#createOrUpdate");
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
| **addNaturalPersonRequest** | [**AddNaturalPersonRequest**](AddNaturalPersonRequest.md)|  | [optional] |

### Return type

[**AddNaturalPersonResponseBaseResponse**](AddNaturalPersonResponseBaseResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteById"></a>
# **deleteById**
> DeleteAmlReport deleteById(id).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
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
              .naturalPerson
              .deleteById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSystemId());
      System.out.println(result.getSuccess());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeleteAmlReport> response = client
              .naturalPerson
              .deleteById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#deleteById");
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

<a name="getById"></a>
# **getById**
> AmlReport getById(id).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
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
              .naturalPerson
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreationTime());
      System.out.println(result.getReviewedVerificationStatus());
      System.out.println(result.getNumberOfRecords());
      System.out.println(result.getNaturalPerson());
      System.out.println(result.getAmlRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AmlReport> response = client
              .naturalPerson
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#getById");
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

<a name="getById_0"></a>
# **getById_0**
> AmlReport getById_0(reference).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
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
              .naturalPerson
              .getById_0(reference)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreationTime());
      System.out.println(result.getReviewedVerificationStatus());
      System.out.println(result.getNumberOfRecords());
      System.out.println(result.getNaturalPerson());
      System.out.println(result.getAmlRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#getById_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AmlReport> response = client
              .naturalPerson
              .getById_0(reference)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#getById_0");
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

<a name="getCertificate"></a>
# **getCertificate**
> File getCertificate(naturalPersonId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
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
    try {
      File result = client
              .naturalPerson
              .getCertificate(naturalPersonId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#getCertificate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .naturalPerson
              .getCertificate(naturalPersonId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#getCertificate");
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
| **naturalPersonId** | **Long**|  | |

### Return type

[**File**](File.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDetails"></a>
# **getDetails**
> NaturalPersonResponseBaseResponse getDetails(naturalPersonId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
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
    try {
      NaturalPersonResponseBaseResponse result = client
              .naturalPerson
              .getDetails(naturalPersonId)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getData());
      System.out.println(result.getSucceeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NaturalPersonResponseBaseResponse> response = client
              .naturalPerson
              .getDetails(naturalPersonId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#getDetails");
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
| **naturalPersonId** | **Long**|  | |

### Return type

[**NaturalPersonResponseBaseResponse**](NaturalPersonResponseBaseResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getVerificationRecord"></a>
# **getVerificationRecord**
> NaturalPersonInfoResponseBaseResponse getVerificationRecord(verificationId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://proovidapi.azurewebsites.net";
    
    configuration.bearer  = "YOUR API KEY";
    ProoViD client = new ProoViD(configuration);
    Long verificationId = 56L;
    try {
      NaturalPersonInfoResponseBaseResponse result = client
              .naturalPerson
              .getVerificationRecord(verificationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getData());
      System.out.println(result.getSucceeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#getVerificationRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NaturalPersonInfoResponseBaseResponse> response = client
              .naturalPerson
              .getVerificationRecord(verificationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#getVerificationRecord");
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
| **verificationId** | **Long**|  | |

### Return type

[**NaturalPersonInfoResponseBaseResponse**](NaturalPersonInfoResponseBaseResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getVerifications"></a>
# **getVerifications**
> SumSubVerificationResponseListBaseResponse getVerifications(naturalPersonId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
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
    try {
      SumSubVerificationResponseListBaseResponse result = client
              .naturalPerson
              .getVerifications(naturalPersonId)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getData());
      System.out.println(result.getSucceeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#getVerifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SumSubVerificationResponseListBaseResponse> response = client
              .naturalPerson
              .getVerifications(naturalPersonId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#getVerifications");
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
| **naturalPersonId** | **Long**|  | |

### Return type

[**SumSubVerificationResponseListBaseResponse**](SumSubVerificationResponseListBaseResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeById"></a>
# **removeById**
> BaseResponse removeById(naturalPersonId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
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
    try {
      BaseResponse result = client
              .naturalPerson
              .removeById(naturalPersonId)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getSucceeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BaseResponse> response = client
              .naturalPerson
              .removeById(naturalPersonId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#removeById");
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
| **naturalPersonId** | **Long**|  | |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateDocuments"></a>
# **updateDocuments**
> UpdateNaturalPersonDocumentsResponseBaseResponse updateDocuments(naturalPersonId).naturalPersonDocumentsRequest(naturalPersonDocumentsRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
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
    NaturalPersonIdDocumentRequest idDocument = new NaturalPersonIdDocumentRequest();
    NaturalPersonDocumentRequest addressDocument = new NaturalPersonDocumentRequest();
    try {
      UpdateNaturalPersonDocumentsResponseBaseResponse result = client
              .naturalPerson
              .updateDocuments(naturalPersonId)
              .idDocument(idDocument)
              .addressDocument(addressDocument)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getData());
      System.out.println(result.getSucceeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#updateDocuments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateNaturalPersonDocumentsResponseBaseResponse> response = client
              .naturalPerson
              .updateDocuments(naturalPersonId)
              .idDocument(idDocument)
              .addressDocument(addressDocument)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#updateDocuments");
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
| **naturalPersonId** | **Long**|  | |
| **naturalPersonDocumentsRequest** | [**NaturalPersonDocumentsRequest**](NaturalPersonDocumentsRequest.md)|  | [optional] |

### Return type

[**UpdateNaturalPersonDocumentsResponseBaseResponse**](UpdateNaturalPersonDocumentsResponseBaseResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateInformation"></a>
# **updateInformation**
> NaturalPersonInfoResponseBaseResponse updateInformation(naturalPersonId).updateNaturalPersonInfoRequest(updateNaturalPersonInfoRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
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
    String clientReferenceId = "clientReferenceId_example";
    String taxId = "taxId_example";
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String middleName = "middleName_example";
    String legalName = "legalName_example";
    OffsetDateTime dateOfBirth = OffsetDateTime.now();
    EGender gender = EGender.fromValue("0");
    String countryBirth = "countryBirth_example";
    String countryResidence = "countryResidence_example";
    String countryMainBusiness = "countryMainBusiness_example";
    String nationality = "nationality_example";
    String email = "email_example";
    String emailTwo = "emailTwo_example";
    String mobilePhone = "mobilePhone_example";
    String mobilePhoneTwo = "mobilePhoneTwo_example";
    Boolean automaticallyUpdateNPRisk = true;
    EScore riskLevel = EScore.fromValue("0");
    String riskLevelJustification = "riskLevelJustification_example";
    Boolean isFlagged = true;
    String comments = "comments_example";
    UpdateNaturalPersonEconomicProfileRequest economicProfile = new UpdateNaturalPersonEconomicProfileRequest();
    try {
      NaturalPersonInfoResponseBaseResponse result = client
              .naturalPerson
              .updateInformation(naturalPersonId)
              .clientReferenceId(clientReferenceId)
              .taxId(taxId)
              .firstName(firstName)
              .lastName(lastName)
              .middleName(middleName)
              .legalName(legalName)
              .dateOfBirth(dateOfBirth)
              .gender(gender)
              .countryBirth(countryBirth)
              .countryResidence(countryResidence)
              .countryMainBusiness(countryMainBusiness)
              .nationality(nationality)
              .email(email)
              .emailTwo(emailTwo)
              .mobilePhone(mobilePhone)
              .mobilePhoneTwo(mobilePhoneTwo)
              .automaticallyUpdateNPRisk(automaticallyUpdateNPRisk)
              .riskLevel(riskLevel)
              .riskLevelJustification(riskLevelJustification)
              .isFlagged(isFlagged)
              .comments(comments)
              .economicProfile(economicProfile)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getData());
      System.out.println(result.getSucceeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#updateInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NaturalPersonInfoResponseBaseResponse> response = client
              .naturalPerson
              .updateInformation(naturalPersonId)
              .clientReferenceId(clientReferenceId)
              .taxId(taxId)
              .firstName(firstName)
              .lastName(lastName)
              .middleName(middleName)
              .legalName(legalName)
              .dateOfBirth(dateOfBirth)
              .gender(gender)
              .countryBirth(countryBirth)
              .countryResidence(countryResidence)
              .countryMainBusiness(countryMainBusiness)
              .nationality(nationality)
              .email(email)
              .emailTwo(emailTwo)
              .mobilePhone(mobilePhone)
              .mobilePhoneTwo(mobilePhoneTwo)
              .automaticallyUpdateNPRisk(automaticallyUpdateNPRisk)
              .riskLevel(riskLevel)
              .riskLevelJustification(riskLevelJustification)
              .isFlagged(isFlagged)
              .comments(comments)
              .economicProfile(economicProfile)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#updateInformation");
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
| **naturalPersonId** | **Long**|  | |
| **updateNaturalPersonInfoRequest** | [**UpdateNaturalPersonInfoRequest**](UpdateNaturalPersonInfoRequest.md)|  | [optional] |

### Return type

[**NaturalPersonInfoResponseBaseResponse**](NaturalPersonInfoResponseBaseResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="verifyDetails"></a>
# **verifyDetails**
> AddNaturalPersonResponseBaseResponse verifyDetails().addNaturalPersonRequest(addNaturalPersonRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://proovidapi.azurewebsites.net";
    
    configuration.bearer  = "YOUR API KEY";
    ProoViD client = new ProoViD(configuration);
    AddNaturalPersonInfoRequest info = new AddNaturalPersonInfoRequest();
    String clientReferenceId = "clientReferenceId_example";
    NaturalPersonDocumentsRequest documents = new NaturalPersonDocumentsRequest();
    try {
      AddNaturalPersonResponseBaseResponse result = client
              .naturalPerson
              .verifyDetails()
              .info(info)
              .clientReferenceId(clientReferenceId)
              .documents(documents)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getData());
      System.out.println(result.getSucceeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#verifyDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddNaturalPersonResponseBaseResponse> response = client
              .naturalPerson
              .verifyDetails()
              .info(info)
              .clientReferenceId(clientReferenceId)
              .documents(documents)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#verifyDetails");
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
| **addNaturalPersonRequest** | [**AddNaturalPersonRequest**](AddNaturalPersonRequest.md)|  | [optional] |

### Return type

[**AddNaturalPersonResponseBaseResponse**](AddNaturalPersonResponseBaseResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="verifyDetails_0"></a>
# **verifyDetails_0**
> SumSubVerificationResponseBaseResponse verifyDetails_0(naturalPersonId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
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
    try {
      SumSubVerificationResponseBaseResponse result = client
              .naturalPerson
              .verifyDetails_0(naturalPersonId)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getData());
      System.out.println(result.getSucceeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#verifyDetails_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SumSubVerificationResponseBaseResponse> response = client
              .naturalPerson
              .verifyDetails_0(naturalPersonId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#verifyDetails_0");
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
| **naturalPersonId** | **Long**|  | |

### Return type

[**SumSubVerificationResponseBaseResponse**](SumSubVerificationResponseBaseResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="verifyDocuments"></a>
# **verifyDocuments**
> UpdateNaturalPersonDocumentsResponseBaseResponse verifyDocuments(naturalPersonId).naturalPersonDocumentsRequest(naturalPersonDocumentsRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
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
    NaturalPersonIdDocumentRequest idDocument = new NaturalPersonIdDocumentRequest();
    NaturalPersonDocumentRequest addressDocument = new NaturalPersonDocumentRequest();
    try {
      UpdateNaturalPersonDocumentsResponseBaseResponse result = client
              .naturalPerson
              .verifyDocuments(naturalPersonId)
              .idDocument(idDocument)
              .addressDocument(addressDocument)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getData());
      System.out.println(result.getSucceeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#verifyDocuments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateNaturalPersonDocumentsResponseBaseResponse> response = client
              .naturalPerson
              .verifyDocuments(naturalPersonId)
              .idDocument(idDocument)
              .addressDocument(addressDocument)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#verifyDocuments");
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
| **naturalPersonId** | **Long**|  | |
| **naturalPersonDocumentsRequest** | [**NaturalPersonDocumentsRequest**](NaturalPersonDocumentsRequest.md)|  | [optional] |

### Return type

[**UpdateNaturalPersonDocumentsResponseBaseResponse**](UpdateNaturalPersonDocumentsResponseBaseResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="verifyEntity"></a>
# **verifyEntity**
> AddNaturalPersonResponseBaseResponse verifyEntity().addNaturalPersonRequest(addNaturalPersonRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NaturalPersonApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://proovidapi.azurewebsites.net";
    
    configuration.bearer  = "YOUR API KEY";
    ProoViD client = new ProoViD(configuration);
    AddNaturalPersonInfoRequest info = new AddNaturalPersonInfoRequest();
    String clientReferenceId = "clientReferenceId_example";
    NaturalPersonDocumentsRequest documents = new NaturalPersonDocumentsRequest();
    try {
      AddNaturalPersonResponseBaseResponse result = client
              .naturalPerson
              .verifyEntity()
              .info(info)
              .clientReferenceId(clientReferenceId)
              .documents(documents)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getData());
      System.out.println(result.getSucceeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#verifyEntity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddNaturalPersonResponseBaseResponse> response = client
              .naturalPerson
              .verifyEntity()
              .info(info)
              .clientReferenceId(clientReferenceId)
              .documents(documents)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NaturalPersonApi#verifyEntity");
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
| **addNaturalPersonRequest** | [**AddNaturalPersonRequest**](AddNaturalPersonRequest.md)|  | [optional] |

### Return type

[**AddNaturalPersonResponseBaseResponse**](AddNaturalPersonResponseBaseResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

