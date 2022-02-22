# PublicApIsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countPolicies2**](PublicApIsApi.md#countPolicies2) | **GET** /public/api/policy/count | 
[**countRepositories**](PublicApIsApi.md#countRepositories) | **GET** /public/api/repository/count | 
[**createPolicy2**](PublicApIsApi.md#createPolicy2) | **POST** /public/api/policy | 
[**createRepository**](PublicApIsApi.md#createRepository) | **POST** /public/api/repository | 
[**deletePolicy2**](PublicApIsApi.md#deletePolicy2) | **DELETE** /public/api/policy/{id} | 
[**deleteRepository**](PublicApIsApi.md#deleteRepository) | **DELETE** /public/api/repository/{id} | 
[**getPolicy2**](PublicApIsApi.md#getPolicy2) | **GET** /public/api/policy/{id} | 
[**getRepository**](PublicApIsApi.md#getRepository) | **GET** /public/api/repository/{id} | 
[**searchPolicies**](PublicApIsApi.md#searchPolicies) | **GET** /public/api/policy | 
[**searchRepositories**](PublicApIsApi.md#searchRepositories) | **GET** /public/api/repository | 
[**updatePolicy2**](PublicApIsApi.md#updatePolicy2) | **PUT** /public/api/policy/{id} | 
[**updateRepository**](PublicApIsApi.md#updateRepository) | **PUT** /public/api/repository/{id} | 


<a name="countPolicies2"></a>
# **countPolicies2**
> JsonVXLong countPolicies2()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsApi;


PublicApIsApi apiInstance = new PublicApIsApi();
try {
    JsonVXLong result = apiInstance.countPolicies2();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsApi#countPolicies2");
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

<a name="countRepositories"></a>
# **countRepositories**
> JsonVXLong countRepositories()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsApi;


PublicApIsApi apiInstance = new PublicApIsApi();
try {
    JsonVXLong result = apiInstance.countRepositories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsApi#countRepositories");
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

<a name="createPolicy2"></a>
# **createPolicy2**
> JsonVXPolicy createPolicy2(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsApi;


PublicApIsApi apiInstance = new PublicApIsApi();
JsonVXPolicy body = new JsonVXPolicy(); // JsonVXPolicy | 
try {
    JsonVXPolicy result = apiInstance.createPolicy2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsApi#createPolicy2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXPolicy**](JsonVXPolicy.md)|  | [optional]

### Return type

[**JsonVXPolicy**](JsonVXPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createRepository"></a>
# **createRepository**
> JsonVXRepository createRepository(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsApi;


PublicApIsApi apiInstance = new PublicApIsApi();
JsonVXRepository body = new JsonVXRepository(); // JsonVXRepository | 
try {
    JsonVXRepository result = apiInstance.createRepository(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsApi#createRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXRepository**](JsonVXRepository.md)|  | [optional]

### Return type

[**JsonVXRepository**](JsonVXRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deletePolicy2"></a>
# **deletePolicy2**
> deletePolicy2(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsApi;


PublicApIsApi apiInstance = new PublicApIsApi();
Long id = 789L; // Long | 
try {
    apiInstance.deletePolicy2(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsApi#deletePolicy2");
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

<a name="deleteRepository"></a>
# **deleteRepository**
> deleteRepository(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsApi;


PublicApIsApi apiInstance = new PublicApIsApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteRepository(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsApi#deleteRepository");
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

<a name="getPolicy2"></a>
# **getPolicy2**
> JsonVXPolicy getPolicy2(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsApi;


PublicApIsApi apiInstance = new PublicApIsApi();
Long id = 789L; // Long | 
try {
    JsonVXPolicy result = apiInstance.getPolicy2(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsApi#getPolicy2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXPolicy**](JsonVXPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getRepository"></a>
# **getRepository**
> JsonVXRepository getRepository(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsApi;


PublicApIsApi apiInstance = new PublicApIsApi();
Long id = 789L; // Long | 
try {
    JsonVXRepository result = apiInstance.getRepository(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsApi#getRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXRepository**](JsonVXRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchPolicies"></a>
# **searchPolicies**
> JsonVXPolicyList searchPolicies()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsApi;


PublicApIsApi apiInstance = new PublicApIsApi();
try {
    JsonVXPolicyList result = apiInstance.searchPolicies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsApi#searchPolicies");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXPolicyList**](JsonVXPolicyList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchRepositories"></a>
# **searchRepositories**
> JsonVXRepositoryList searchRepositories()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsApi;


PublicApIsApi apiInstance = new PublicApIsApi();
try {
    JsonVXRepositoryList result = apiInstance.searchRepositories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsApi#searchRepositories");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXRepositoryList**](JsonVXRepositoryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updatePolicy2"></a>
# **updatePolicy2**
> JsonVXPolicy updatePolicy2(id, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsApi;


PublicApIsApi apiInstance = new PublicApIsApi();
Long id = 789L; // Long | 
JsonVXPolicy body = new JsonVXPolicy(); // JsonVXPolicy | 
try {
    JsonVXPolicy result = apiInstance.updatePolicy2(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsApi#updatePolicy2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**JsonVXPolicy**](JsonVXPolicy.md)|  | [optional]

### Return type

[**JsonVXPolicy**](JsonVXPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateRepository"></a>
# **updateRepository**
> JsonVXRepository updateRepository(id, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsApi;


PublicApIsApi apiInstance = new PublicApIsApi();
Long id = 789L; // Long | 
JsonVXRepository body = new JsonVXRepository(); // JsonVXRepository | 
try {
    JsonVXRepository result = apiInstance.updateRepository(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsApi#updateRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**JsonVXRepository**](JsonVXRepository.md)|  | [optional]

### Return type

[**JsonVXRepository**](JsonVXRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

