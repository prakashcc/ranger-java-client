# XAuditRestApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countXAccessAudits**](XAuditRestApi.md#countXAccessAudits) | **GET** /xaudit/access_audit/count | 
[**countXTrxLogs**](XAuditRestApi.md#countXTrxLogs) | **GET** /xaudit/trx_log/count | 
[**createXTrxLog**](XAuditRestApi.md#createXTrxLog) | **POST** /xaudit/trx_log | 
[**deleteXTrxLog**](XAuditRestApi.md#deleteXTrxLog) | **DELETE** /xaudit/trx_log/{id} | 
[**getXTrxLog**](XAuditRestApi.md#getXTrxLog) | **GET** /xaudit/trx_log/{id} | 
[**searchXAccessAudits**](XAuditRestApi.md#searchXAccessAudits) | **GET** /xaudit/access_audit | Implements the traditional search functionalities for XAccessAudits.
[**searchXTrxLogs**](XAuditRestApi.md#searchXTrxLogs) | **GET** /xaudit/trx_log | Implements the traditional search functionalities for XTrxLogs.
[**updateXTrxLog**](XAuditRestApi.md#updateXTrxLog) | **PUT** /xaudit/trx_log | 


<a name="countXAccessAudits"></a>
# **countXAccessAudits**
> JsonVXLong countXAccessAudits()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XAuditRestApi;


XAuditRestApi apiInstance = new XAuditRestApi();
try {
    JsonVXLong result = apiInstance.countXAccessAudits();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XAuditRestApi#countXAccessAudits");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXLong**](JsonVXLong.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="countXTrxLogs"></a>
# **countXTrxLogs**
> JsonVXLong countXTrxLogs()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XAuditRestApi;


XAuditRestApi apiInstance = new XAuditRestApi();
try {
    JsonVXLong result = apiInstance.countXTrxLogs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XAuditRestApi#countXTrxLogs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXLong**](JsonVXLong.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="createXTrxLog"></a>
# **createXTrxLog**
> JsonVXTrxLog createXTrxLog(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XAuditRestApi;


XAuditRestApi apiInstance = new XAuditRestApi();
JsonVXTrxLog body = new JsonVXTrxLog(); // JsonVXTrxLog | 
try {
    JsonVXTrxLog result = apiInstance.createXTrxLog(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XAuditRestApi#createXTrxLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXTrxLog**](JsonVXTrxLog.md)|  | [optional]

### Return type

[**JsonVXTrxLog**](JsonVXTrxLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deleteXTrxLog"></a>
# **deleteXTrxLog**
> deleteXTrxLog(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XAuditRestApi;


XAuditRestApi apiInstance = new XAuditRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteXTrxLog(id);
} catch (ApiException e) {
    System.err.println("Exception when calling XAuditRestApi#deleteXTrxLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getXTrxLog"></a>
# **getXTrxLog**
> JsonVXTrxLog getXTrxLog(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XAuditRestApi;


XAuditRestApi apiInstance = new XAuditRestApi();
Long id = 789L; // Long | 
try {
    JsonVXTrxLog result = apiInstance.getXTrxLog(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XAuditRestApi#getXTrxLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXTrxLog**](JsonVXTrxLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchXAccessAudits"></a>
# **searchXAccessAudits**
> JsonVXAccessAuditList searchXAccessAudits()

Implements the traditional search functionalities for XAccessAudits.

Implements the traditional search functionalities for XAccessAudits

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XAuditRestApi;


XAuditRestApi apiInstance = new XAuditRestApi();
try {
    JsonVXAccessAuditList result = apiInstance.searchXAccessAudits();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XAuditRestApi#searchXAccessAudits");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXAccessAuditList**](JsonVXAccessAuditList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchXTrxLogs"></a>
# **searchXTrxLogs**
> JsonVXTrxLogList searchXTrxLogs()

Implements the traditional search functionalities for XTrxLogs.

Implements the traditional search functionalities for XTrxLogs

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XAuditRestApi;


XAuditRestApi apiInstance = new XAuditRestApi();
try {
    JsonVXTrxLogList result = apiInstance.searchXTrxLogs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XAuditRestApi#searchXTrxLogs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXTrxLogList**](JsonVXTrxLogList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateXTrxLog"></a>
# **updateXTrxLog**
> JsonVXTrxLog updateXTrxLog(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XAuditRestApi;


XAuditRestApi apiInstance = new XAuditRestApi();
JsonVXTrxLog body = new JsonVXTrxLog(); // JsonVXTrxLog | 
try {
    JsonVXTrxLog result = apiInstance.updateXTrxLog(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XAuditRestApi#updateXTrxLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXTrxLog**](JsonVXTrxLog.md)|  | [optional]

### Return type

[**JsonVXTrxLog**](JsonVXTrxLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

