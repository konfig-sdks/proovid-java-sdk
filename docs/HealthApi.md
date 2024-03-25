# HealthApi

All URIs are relative to *https://proovidapi.azurewebsites.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVersion**](HealthApi.md#getVersion) | **GET** /api/Health/Version |  |
| [**statusCheck**](HealthApi.md#statusCheck) | **GET** /api/Health/Status |  |


<a name="getVersion"></a>
# **getVersion**
> getVersion().execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HealthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://proovidapi.azurewebsites.net";
    
    configuration.bearer  = "YOUR API KEY";
    ProoViD client = new ProoViD(configuration);
    try {
      client
              .health
              .getVersion()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthApi#getVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .health
              .getVersion()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthApi#getVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="statusCheck"></a>
# **statusCheck**
> statusCheck().execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ProoViD;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HealthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://proovidapi.azurewebsites.net";
    
    configuration.bearer  = "YOUR API KEY";
    ProoViD client = new ProoViD(configuration);
    try {
      client
              .health
              .statusCheck()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthApi#statusCheck");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .health
              .statusCheck()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthApi#statusCheck");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

