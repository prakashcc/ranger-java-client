# XKeyRestApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKey**](XKeyRestApi.md#createKey) | **POST** /keys/key | Implements the create key functionality.
[**deleteKey**](XKeyRestApi.md#deleteKey) | **DELETE** /keys/key/{alias} | Implements the delete key functionality.
[**getKey**](XKeyRestApi.md#getKey) | **GET** /keys/key/{alias} | 
[**rolloverKey**](XKeyRestApi.md#rolloverKey) | **PUT** /keys/key | Implements the Rollover key functionality.
[**searchKeys**](XKeyRestApi.md#searchKeys) | **GET** /keys/keys | Implements the traditional search functionalities for Keys.


<a name="createKey"></a>
# **createKey**
> JsonVXKmsKey createKey(provider, body)

Implements the create key functionality.

Implements the create key functionality

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XKeyRestApi;


XKeyRestApi apiInstance = new XKeyRestApi();
String provider = "provider_example"; // String | 
JsonVXKmsKey body = new JsonVXKmsKey(); // JsonVXKmsKey | 
try {
    JsonVXKmsKey result = apiInstance.createKey(provider, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XKeyRestApi#createKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider** | **String**|  | [optional]
 **body** | [**JsonVXKmsKey**](JsonVXKmsKey.md)|  | [optional]

### Return type

[**JsonVXKmsKey**](JsonVXKmsKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deleteKey"></a>
# **deleteKey**
> deleteKey(alias, provider)

Implements the delete key functionality.

Implements the delete key functionality

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XKeyRestApi;


XKeyRestApi apiInstance = new XKeyRestApi();
String alias = "alias_example"; // String | 
String provider = "provider_example"; // String | 
try {
    apiInstance.deleteKey(alias, provider);
} catch (ApiException e) {
    System.err.println("Exception when calling XKeyRestApi#deleteKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **String**|  |
 **provider** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getKey"></a>
# **getKey**
> JsonVXKmsKey getKey(alias, provider)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XKeyRestApi;


XKeyRestApi apiInstance = new XKeyRestApi();
String alias = "alias_example"; // String | 
String provider = "provider_example"; // String | 
try {
    JsonVXKmsKey result = apiInstance.getKey(alias, provider);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XKeyRestApi#getKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **String**|  |
 **provider** | **String**|  | [optional]

### Return type

[**JsonVXKmsKey**](JsonVXKmsKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="rolloverKey"></a>
# **rolloverKey**
> JsonVXKmsKey rolloverKey(provider, body)

Implements the Rollover key functionality.

Implements the Rollover key functionality

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XKeyRestApi;


XKeyRestApi apiInstance = new XKeyRestApi();
String provider = "provider_example"; // String | 
JsonVXKmsKey body = new JsonVXKmsKey(); // JsonVXKmsKey | 
try {
    JsonVXKmsKey result = apiInstance.rolloverKey(provider, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XKeyRestApi#rolloverKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider** | **String**|  | [optional]
 **body** | [**JsonVXKmsKey**](JsonVXKmsKey.md)|  | [optional]

### Return type

[**JsonVXKmsKey**](JsonVXKmsKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="searchKeys"></a>
# **searchKeys**
> JsonVXKmsKeyList searchKeys(provider)

Implements the traditional search functionalities for Keys.

Implements the traditional search functionalities for Keys

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XKeyRestApi;


XKeyRestApi apiInstance = new XKeyRestApi();
String provider = "provider_example"; // String | 
try {
    JsonVXKmsKeyList result = apiInstance.searchKeys(provider);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XKeyRestApi#searchKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider** | **String**|  | [optional]

### Return type

[**JsonVXKmsKeyList**](JsonVXKmsKeyList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

