# SecurityZoneRestApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSecurityZone2**](SecurityZoneRestApi.md#createSecurityZone2) | **POST** /zones/zones | 
[**deleteSecurityZone2**](SecurityZoneRestApi.md#deleteSecurityZone2) | **DELETE** /zones/zones/name/{name} | 
[**deleteSecurityZone2_0**](SecurityZoneRestApi.md#deleteSecurityZone2_0) | **DELETE** /zones/zones/{id} | 
[**getAllZones2**](SecurityZoneRestApi.md#getAllZones2) | **GET** /zones/zones | 
[**getSecurityZone2**](SecurityZoneRestApi.md#getSecurityZone2) | **GET** /zones/zones/name/{name} | 
[**getSecurityZone2_0**](SecurityZoneRestApi.md#getSecurityZone2_0) | **GET** /zones/zones/{id} | 
[**updateSecurityZone2**](SecurityZoneRestApi.md#updateSecurityZone2) | **PUT** /zones/zones/{id} | 


<a name="createSecurityZone2"></a>
# **createSecurityZone2**
> JsonRangerSecurityZone createSecurityZone2(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityZoneRestApi;


SecurityZoneRestApi apiInstance = new SecurityZoneRestApi();
JsonRangerSecurityZone body = new JsonRangerSecurityZone(); // JsonRangerSecurityZone | 
try {
    JsonRangerSecurityZone result = apiInstance.createSecurityZone2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityZoneRestApi#createSecurityZone2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonRangerSecurityZone**](JsonRangerSecurityZone.md)|  | [optional]

### Return type

[**JsonRangerSecurityZone**](JsonRangerSecurityZone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deleteSecurityZone2"></a>
# **deleteSecurityZone2**
> deleteSecurityZone2(name)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityZoneRestApi;


SecurityZoneRestApi apiInstance = new SecurityZoneRestApi();
String name = "name_example"; // String | 
try {
    apiInstance.deleteSecurityZone2(name);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityZoneRestApi#deleteSecurityZone2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteSecurityZone2_0"></a>
# **deleteSecurityZone2_0**
> deleteSecurityZone2_0(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityZoneRestApi;


SecurityZoneRestApi apiInstance = new SecurityZoneRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteSecurityZone2_0(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityZoneRestApi#deleteSecurityZone2_0");
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

<a name="getAllZones2"></a>
# **getAllZones2**
> JsonRangerSecurityZoneList getAllZones2()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityZoneRestApi;


SecurityZoneRestApi apiInstance = new SecurityZoneRestApi();
try {
    JsonRangerSecurityZoneList result = apiInstance.getAllZones2();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityZoneRestApi#getAllZones2");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonRangerSecurityZoneList**](JsonRangerSecurityZoneList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getSecurityZone2"></a>
# **getSecurityZone2**
> JsonRangerSecurityZone getSecurityZone2(name)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityZoneRestApi;


SecurityZoneRestApi apiInstance = new SecurityZoneRestApi();
String name = "name_example"; // String | 
try {
    JsonRangerSecurityZone result = apiInstance.getSecurityZone2(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityZoneRestApi#getSecurityZone2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**JsonRangerSecurityZone**](JsonRangerSecurityZone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getSecurityZone2_0"></a>
# **getSecurityZone2_0**
> JsonRangerSecurityZone getSecurityZone2_0(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityZoneRestApi;


SecurityZoneRestApi apiInstance = new SecurityZoneRestApi();
Long id = 789L; // Long | 
try {
    JsonRangerSecurityZone result = apiInstance.getSecurityZone2_0(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityZoneRestApi#getSecurityZone2_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonRangerSecurityZone**](JsonRangerSecurityZone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateSecurityZone2"></a>
# **updateSecurityZone2**
> JsonRangerSecurityZone updateSecurityZone2(id, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityZoneRestApi;


SecurityZoneRestApi apiInstance = new SecurityZoneRestApi();
Long id = 789L; // Long | 
JsonRangerSecurityZone body = new JsonRangerSecurityZone(); // JsonRangerSecurityZone | 
try {
    JsonRangerSecurityZone result = apiInstance.updateSecurityZone2(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityZoneRestApi#updateSecurityZone2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**JsonRangerSecurityZone**](JsonRangerSecurityZone.md)|  | [optional]

### Return type

[**JsonRangerSecurityZone**](JsonRangerSecurityZone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

