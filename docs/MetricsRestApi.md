# MetricsRestApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatus**](MetricsRestApi.md#getStatus) | **GET** /metrics/status | 


<a name="getStatus"></a>
# **getStatus**
> JsonRangerMetrics getStatus()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MetricsRestApi;


MetricsRestApi apiInstance = new MetricsRestApi();
try {
    JsonRangerMetrics result = apiInstance.getStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsRestApi#getStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonRangerMetrics**](JsonRangerMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

