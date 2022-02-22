# ServiceRestApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyPolicy**](ServiceRestApi.md#applyPolicy) | **POST** /plugins/policies/apply | 
[**checkSSO**](ServiceRestApi.md#checkSSO) | **GET** /plugins/checksso | 
[**countPolicies**](ServiceRestApi.md#countPolicies) | **GET** /plugins/policies/count | 
[**countServices**](ServiceRestApi.md#countServices) | **GET** /plugins/services/count | 
[**createPolicy**](ServiceRestApi.md#createPolicy) | **POST** /plugins/policies | 
[**createService**](ServiceRestApi.md#createService) | **POST** /plugins/services | 
[**createServiceDef**](ServiceRestApi.md#createServiceDef) | **POST** /plugins/definitions | 
[**deleteClusterServices**](ServiceRestApi.md#deleteClusterServices) | **DELETE** /plugins/cluster-services/{clusterName} | Delete services/ repos associated with cluster.
[**deletePolicy**](ServiceRestApi.md#deletePolicy) | **DELETE** /plugins/policies/{id} | 
[**deletePolicyDeltas**](ServiceRestApi.md#deletePolicyDeltas) | **DELETE** /plugins/server/policydeltas | 
[**deleteService**](ServiceRestApi.md#deleteService) | **DELETE** /plugins/services/{id} | 
[**deleteServiceDef**](ServiceRestApi.md#deleteServiceDef) | **DELETE** /plugins/definitions/{id} | 
[**getCSRFProperties**](ServiceRestApi.md#getCSRFProperties) | **GET** /plugins/csrfconf | 
[**getMetricByType**](ServiceRestApi.md#getMetricByType) | **GET** /plugins/metrics/type/{type} | 
[**getPluginsInfo**](ServiceRestApi.md#getPluginsInfo) | **GET** /plugins/plugins/info | 
[**getPolicies**](ServiceRestApi.md#getPolicies) | **GET** /plugins/policies | 
[**getPoliciesForResource**](ServiceRestApi.md#getPoliciesForResource) | **GET** /plugins/policies/{serviceDefName}/for-resource | 
[**getPoliciesInCsv**](ServiceRestApi.md#getPoliciesInCsv) | **GET** /plugins/policies/csv | 
[**getPoliciesInExcel**](ServiceRestApi.md#getPoliciesInExcel) | **GET** /plugins/policies/downloadExcel | 
[**getPoliciesInJson**](ServiceRestApi.md#getPoliciesInJson) | **GET** /plugins/policies/exportJson | 
[**getPolicy**](ServiceRestApi.md#getPolicy) | **GET** /plugins/policies/{id} | 
[**getPolicyForVersionNumber**](ServiceRestApi.md#getPolicyForVersionNumber) | **GET** /plugins/policy/{policyId}/version/{versionNo} | 
[**getPolicyFromEventTime**](ServiceRestApi.md#getPolicyFromEventTime) | **GET** /plugins/policies/eventTime | 
[**getPolicyLabels**](ServiceRestApi.md#getPolicyLabels) | **GET** /plugins/policyLabels | 
[**getPolicyVersionList**](ServiceRestApi.md#getPolicyVersionList) | **GET** /plugins/policy/{policyId}/versionList | 
[**getSecureServicePoliciesIfUpdated**](ServiceRestApi.md#getSecureServicePoliciesIfUpdated) | **GET** /plugins/secure/policies/download/{serviceName} | 
[**getService**](ServiceRestApi.md#getService) | **GET** /plugins/services/{id} | 
[**getServiceByName**](ServiceRestApi.md#getServiceByName) | **GET** /plugins/services/name/{name} | 
[**getServiceDef**](ServiceRestApi.md#getServiceDef) | **GET** /plugins/definitions/{id} | 
[**getServiceDefByName**](ServiceRestApi.md#getServiceDefByName) | **GET** /plugins/definitions/name/{name} | 
[**getServiceDefs**](ServiceRestApi.md#getServiceDefs) | **GET** /plugins/definitions | 
[**getServicePolicies**](ServiceRestApi.md#getServicePolicies) | **GET** /plugins/policies/service/{id} | 
[**getServicePoliciesByName**](ServiceRestApi.md#getServicePoliciesByName) | **GET** /plugins/policies/service/name/{name} | 
[**getServicePoliciesIfUpdated**](ServiceRestApi.md#getServicePoliciesIfUpdated) | **GET** /plugins/policies/download/{serviceName} | 
[**getServices**](ServiceRestApi.md#getServices) | **GET** /plugins/services | 
[**grantAccess**](ServiceRestApi.md#grantAccess) | **POST** /plugins/services/grant/{serviceName} | 
[**importPoliciesFromFile**](ServiceRestApi.md#importPoliciesFromFile) | **POST** /plugins/policies/importPoliciesFromFile | 
[**lookupResource**](ServiceRestApi.md#lookupResource) | **POST** /plugins/services/lookupResource/{serviceName} | 
[**purgeEmptyPolicies**](ServiceRestApi.md#purgeEmptyPolicies) | **DELETE** /plugins/server/purgepolicies/{serviceName} | 
[**revokeAccess**](ServiceRestApi.md#revokeAccess) | **POST** /plugins/services/revoke/{serviceName} | 
[**secureGrantAccess**](ServiceRestApi.md#secureGrantAccess) | **POST** /plugins/secure/services/grant/{serviceName} | 
[**secureRevokeAccess**](ServiceRestApi.md#secureRevokeAccess) | **POST** /plugins/secure/services/revoke/{serviceName} | 
[**updatePolicy**](ServiceRestApi.md#updatePolicy) | **PUT** /plugins/policies/{id} | 
[**updateService**](ServiceRestApi.md#updateService) | **PUT** /plugins/services/{id} | 
[**updateServiceDef**](ServiceRestApi.md#updateServiceDef) | **PUT** /plugins/definitions/{id} | 
[**validateConfig**](ServiceRestApi.md#validateConfig) | **POST** /plugins/services/validateConfig | 


<a name="applyPolicy"></a>
# **applyPolicy**
> JsonRangerPolicy applyPolicy(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
JsonRangerPolicy body = new JsonRangerPolicy(); // JsonRangerPolicy | 
try {
    JsonRangerPolicy result = apiInstance.applyPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#applyPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonRangerPolicy**](JsonRangerPolicy.md)|  | [optional]

### Return type

[**JsonRangerPolicy**](JsonRangerPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="checkSSO"></a>
# **checkSSO**
> String checkSSO()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
try {
    String result = apiInstance.checkSSO();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#checkSSO");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="countPolicies"></a>
# **countPolicies**
> BigDecimal countPolicies()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
try {
    BigDecimal result = apiInstance.countPolicies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#countPolicies");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="countServices"></a>
# **countServices**
> BigDecimal countServices()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
try {
    BigDecimal result = apiInstance.countServices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#countServices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="createPolicy"></a>
# **createPolicy**
> JsonRangerPolicy createPolicy(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
JsonRangerPolicy body = new JsonRangerPolicy(); // JsonRangerPolicy | 
try {
    JsonRangerPolicy result = apiInstance.createPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#createPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonRangerPolicy**](JsonRangerPolicy.md)|  | [optional]

### Return type

[**JsonRangerPolicy**](JsonRangerPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createService"></a>
# **createService**
> JsonRangerService createService(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
JsonRangerService body = new JsonRangerService(); // JsonRangerService | 
try {
    JsonRangerService result = apiInstance.createService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#createService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonRangerService**](JsonRangerService.md)|  | [optional]

### Return type

[**JsonRangerService**](JsonRangerService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createServiceDef"></a>
# **createServiceDef**
> JsonRangerServiceDef createServiceDef(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
JsonRangerServiceDef body = new JsonRangerServiceDef(); // JsonRangerServiceDef | 
try {
    JsonRangerServiceDef result = apiInstance.createServiceDef(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#createServiceDef");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonRangerServiceDef**](JsonRangerServiceDef.md)|  | [optional]

### Return type

[**JsonRangerServiceDef**](JsonRangerServiceDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deleteClusterServices"></a>
# **deleteClusterServices**
> JsonResponseEntityOfList deleteClusterServices(clusterName)

Delete services/ repos associated with cluster.

Delete services/ repos associated with cluster. Only users with Ranger UserAdmin OR KeyAdmin are allowed to access this API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
String clusterName = "clusterName_example"; // String | 
try {
    JsonResponseEntityOfList result = apiInstance.deleteClusterServices(clusterName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#deleteClusterServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterName** | **String**|  |

### Return type

[**JsonResponseEntityOfList**](JsonResponseEntityOfList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deletePolicy"></a>
# **deletePolicy**
> deletePolicy(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deletePolicy(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#deletePolicy");
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

<a name="deletePolicyDeltas"></a>
# **deletePolicyDeltas**
> deletePolicyDeltas(days)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
Integer days = 7; // Integer | 
try {
    apiInstance.deletePolicyDeltas(days);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#deletePolicyDeltas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **days** | **Integer**|  | [optional] [default to 7]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteService"></a>
# **deleteService**
> deleteService(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteService(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#deleteService");
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

<a name="deleteServiceDef"></a>
# **deleteServiceDef**
> deleteServiceDef(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteServiceDef(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#deleteServiceDef");
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

<a name="getCSRFProperties"></a>
# **getCSRFProperties**
> Map&lt;String, Object&gt; getCSRFProperties()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
try {
    Map<String, Object> result = apiInstance.getCSRFProperties();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getCSRFProperties");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetricByType"></a>
# **getMetricByType**
> String getMetricByType(type)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
String type = "type_example"; // String | 
try {
    String result = apiInstance.getMetricByType(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getMetricByType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getPluginsInfo"></a>
# **getPluginsInfo**
> JsonRangerPluginInfoList getPluginsInfo()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
try {
    JsonRangerPluginInfoList result = apiInstance.getPluginsInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getPluginsInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonRangerPluginInfoList**](JsonRangerPluginInfoList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getPolicies"></a>
# **getPolicies**
> JsonRangerPolicyList getPolicies()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
try {
    JsonRangerPolicyList result = apiInstance.getPolicies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getPolicies");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonRangerPolicyList**](JsonRangerPolicyList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getPoliciesForResource"></a>
# **getPoliciesForResource**
> List&lt;JsonRangerPolicy&gt; getPoliciesForResource(serviceDefName, serviceName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
String serviceDefName = "serviceDefName_example"; // String | 
String serviceName = ""; // String | 
try {
    List<JsonRangerPolicy> result = apiInstance.getPoliciesForResource(serviceDefName, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getPoliciesForResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceDefName** | **String**|  |
 **serviceName** | **String**|  | [optional] [default to ]

### Return type

[**List&lt;JsonRangerPolicy&gt;**](JsonRangerPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getPoliciesInCsv"></a>
# **getPoliciesInCsv**
> getPoliciesInCsv()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
try {
    apiInstance.getPoliciesInCsv();
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getPoliciesInCsv");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPoliciesInExcel"></a>
# **getPoliciesInExcel**
> getPoliciesInExcel()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
try {
    apiInstance.getPoliciesInExcel();
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getPoliciesInExcel");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPoliciesInJson"></a>
# **getPoliciesInJson**
> getPoliciesInJson(checkPoliciesExists)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
Boolean checkPoliciesExists = true; // Boolean | 
try {
    apiInstance.getPoliciesInJson(checkPoliciesExists);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getPoliciesInJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkPoliciesExists** | **Boolean**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPolicy"></a>
# **getPolicy**
> JsonRangerPolicy getPolicy(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
Long id = 789L; // Long | 
try {
    JsonRangerPolicy result = apiInstance.getPolicy(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonRangerPolicy**](JsonRangerPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getPolicyForVersionNumber"></a>
# **getPolicyForVersionNumber**
> JsonRangerPolicy getPolicyForVersionNumber(policyId, versionNo)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
Long policyId = 789L; // Long | 
Integer versionNo = 56; // Integer | 
try {
    JsonRangerPolicy result = apiInstance.getPolicyForVersionNumber(policyId, versionNo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getPolicyForVersionNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**|  |
 **versionNo** | **Integer**|  |

### Return type

[**JsonRangerPolicy**](JsonRangerPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getPolicyFromEventTime"></a>
# **getPolicyFromEventTime**
> JsonRangerPolicy getPolicyFromEventTime()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
try {
    JsonRangerPolicy result = apiInstance.getPolicyFromEventTime();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getPolicyFromEventTime");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonRangerPolicy**](JsonRangerPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getPolicyLabels"></a>
# **getPolicyLabels**
> List&lt;String&gt; getPolicyLabels()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
try {
    List<String> result = apiInstance.getPolicyLabels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getPolicyLabels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getPolicyVersionList"></a>
# **getPolicyVersionList**
> JsonVXString getPolicyVersionList(policyId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
Long policyId = 789L; // Long | 
try {
    JsonVXString result = apiInstance.getPolicyVersionList(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getPolicyVersionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**|  |

### Return type

[**JsonVXString**](JsonVXString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getSecureServicePoliciesIfUpdated"></a>
# **getSecureServicePoliciesIfUpdated**
> JsonServicePolicies getSecureServicePoliciesIfUpdated(serviceName, clusterName, lastActivationTime, lastKnownVersion, pluginCapabilities, pluginId, supportsPolicyDeltas, zoneName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
String serviceName = "serviceName_example"; // String | 
String clusterName = ""; // String | 
Long lastActivationTime = 0L; // Long | 
Long lastKnownVersion = 789L; // Long | 
String pluginCapabilities = ""; // String | 
String pluginId = "pluginId_example"; // String | 
Boolean supportsPolicyDeltas = false; // Boolean | 
String zoneName = ""; // String | 
try {
    JsonServicePolicies result = apiInstance.getSecureServicePoliciesIfUpdated(serviceName, clusterName, lastActivationTime, lastKnownVersion, pluginCapabilities, pluginId, supportsPolicyDeltas, zoneName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getSecureServicePoliciesIfUpdated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |
 **clusterName** | **String**|  | [optional] [default to ]
 **lastActivationTime** | **Long**|  | [optional] [default to 0]
 **lastKnownVersion** | **Long**|  | [optional]
 **pluginCapabilities** | **String**|  | [optional] [default to ]
 **pluginId** | **String**|  | [optional]
 **supportsPolicyDeltas** | **Boolean**|  | [optional] [default to false]
 **zoneName** | **String**|  | [optional] [default to ]

### Return type

[**JsonServicePolicies**](JsonServicePolicies.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getService"></a>
# **getService**
> JsonRangerService getService(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
Long id = 789L; // Long | 
try {
    JsonRangerService result = apiInstance.getService(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonRangerService**](JsonRangerService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getServiceByName"></a>
# **getServiceByName**
> JsonRangerService getServiceByName(name)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
String name = "name_example"; // String | 
try {
    JsonRangerService result = apiInstance.getServiceByName(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getServiceByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**JsonRangerService**](JsonRangerService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getServiceDef"></a>
# **getServiceDef**
> JsonRangerServiceDef getServiceDef(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
Long id = 789L; // Long | 
try {
    JsonRangerServiceDef result = apiInstance.getServiceDef(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getServiceDef");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonRangerServiceDef**](JsonRangerServiceDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getServiceDefByName"></a>
# **getServiceDefByName**
> JsonRangerServiceDef getServiceDefByName(name)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
String name = "name_example"; // String | 
try {
    JsonRangerServiceDef result = apiInstance.getServiceDefByName(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getServiceDefByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**JsonRangerServiceDef**](JsonRangerServiceDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getServiceDefs"></a>
# **getServiceDefs**
> JsonRangerServiceDefList getServiceDefs()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
try {
    JsonRangerServiceDefList result = apiInstance.getServiceDefs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getServiceDefs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonRangerServiceDefList**](JsonRangerServiceDefList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getServicePolicies"></a>
# **getServicePolicies**
> JsonRangerPolicyList getServicePolicies(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
Long id = 789L; // Long | 
try {
    JsonRangerPolicyList result = apiInstance.getServicePolicies(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getServicePolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonRangerPolicyList**](JsonRangerPolicyList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getServicePoliciesByName"></a>
# **getServicePoliciesByName**
> JsonRangerPolicyList getServicePoliciesByName(name)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
String name = "name_example"; // String | 
try {
    JsonRangerPolicyList result = apiInstance.getServicePoliciesByName(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getServicePoliciesByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**JsonRangerPolicyList**](JsonRangerPolicyList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getServicePoliciesIfUpdated"></a>
# **getServicePoliciesIfUpdated**
> JsonServicePolicies getServicePoliciesIfUpdated(serviceName, clusterName, lastActivationTime, lastKnownVersion, pluginCapabilities, pluginId, supportsPolicyDeltas, zoneName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
String serviceName = "serviceName_example"; // String | 
String clusterName = ""; // String | 
Long lastActivationTime = 0L; // Long | 
Long lastKnownVersion = 789L; // Long | 
String pluginCapabilities = ""; // String | 
String pluginId = "pluginId_example"; // String | 
Boolean supportsPolicyDeltas = false; // Boolean | 
String zoneName = ""; // String | 
try {
    JsonServicePolicies result = apiInstance.getServicePoliciesIfUpdated(serviceName, clusterName, lastActivationTime, lastKnownVersion, pluginCapabilities, pluginId, supportsPolicyDeltas, zoneName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getServicePoliciesIfUpdated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |
 **clusterName** | **String**|  | [optional] [default to ]
 **lastActivationTime** | **Long**|  | [optional] [default to 0]
 **lastKnownVersion** | **Long**|  | [optional]
 **pluginCapabilities** | **String**|  | [optional] [default to ]
 **pluginId** | **String**|  | [optional]
 **supportsPolicyDeltas** | **Boolean**|  | [optional] [default to false]
 **zoneName** | **String**|  | [optional] [default to ]

### Return type

[**JsonServicePolicies**](JsonServicePolicies.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getServices"></a>
# **getServices**
> JsonRangerServiceList getServices()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
try {
    JsonRangerServiceList result = apiInstance.getServices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#getServices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonRangerServiceList**](JsonRangerServiceList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="grantAccess"></a>
# **grantAccess**
> JsonRESTResponse grantAccess(serviceName, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
String serviceName = "serviceName_example"; // String | 
JsonGrantRevokeRequest body = new JsonGrantRevokeRequest(); // JsonGrantRevokeRequest | 
try {
    JsonRESTResponse result = apiInstance.grantAccess(serviceName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#grantAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |
 **body** | [**JsonGrantRevokeRequest**](JsonGrantRevokeRequest.md)|  | [optional]

### Return type

[**JsonRESTResponse**](JsonRESTResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="importPoliciesFromFile"></a>
# **importPoliciesFromFile**
> importPoliciesFromFile(fileDetail, serviceMapStream, uploadedInputStream, zoneMapStream, importType, isOverride, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
File fileDetail = new File("/path/to/file.txt"); // File | 
File serviceMapStream = new File("/path/to/file.txt"); // File | 
File uploadedInputStream = new File("/path/to/file.txt"); // File | 
File zoneMapStream = new File("/path/to/file.txt"); // File | 
String importType = "importType_example"; // String | 
Boolean isOverride = true; // Boolean | 
String body = "body_example"; // String | 
try {
    apiInstance.importPoliciesFromFile(fileDetail, serviceMapStream, uploadedInputStream, zoneMapStream, importType, isOverride, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#importPoliciesFromFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileDetail** | **File**|  | [optional]
 **serviceMapStream** | **File**|  | [optional]
 **uploadedInputStream** | **File**|  | [optional]
 **zoneMapStream** | **File**|  | [optional]
 **importType** | **String**|  | [optional]
 **isOverride** | **Boolean**|  | [optional]
 **body** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

<a name="lookupResource"></a>
# **lookupResource**
> List&lt;String&gt; lookupResource(serviceName, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
String serviceName = "serviceName_example"; // String | 
JsonResourceLookupContext body = new JsonResourceLookupContext(); // JsonResourceLookupContext | 
try {
    List<String> result = apiInstance.lookupResource(serviceName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#lookupResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |
 **body** | [**JsonResourceLookupContext**](JsonResourceLookupContext.md)|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="purgeEmptyPolicies"></a>
# **purgeEmptyPolicies**
> purgeEmptyPolicies(serviceName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
String serviceName = "serviceName_example"; // String | 
try {
    apiInstance.purgeEmptyPolicies(serviceName);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#purgeEmptyPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="revokeAccess"></a>
# **revokeAccess**
> JsonRESTResponse revokeAccess(serviceName, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
String serviceName = "serviceName_example"; // String | 
JsonGrantRevokeRequest body = new JsonGrantRevokeRequest(); // JsonGrantRevokeRequest | 
try {
    JsonRESTResponse result = apiInstance.revokeAccess(serviceName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#revokeAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |
 **body** | [**JsonGrantRevokeRequest**](JsonGrantRevokeRequest.md)|  | [optional]

### Return type

[**JsonRESTResponse**](JsonRESTResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="secureGrantAccess"></a>
# **secureGrantAccess**
> JsonRESTResponse secureGrantAccess(serviceName, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
String serviceName = "serviceName_example"; // String | 
JsonGrantRevokeRequest body = new JsonGrantRevokeRequest(); // JsonGrantRevokeRequest | 
try {
    JsonRESTResponse result = apiInstance.secureGrantAccess(serviceName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#secureGrantAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |
 **body** | [**JsonGrantRevokeRequest**](JsonGrantRevokeRequest.md)|  | [optional]

### Return type

[**JsonRESTResponse**](JsonRESTResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="secureRevokeAccess"></a>
# **secureRevokeAccess**
> JsonRESTResponse secureRevokeAccess(serviceName, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
String serviceName = "serviceName_example"; // String | 
JsonGrantRevokeRequest body = new JsonGrantRevokeRequest(); // JsonGrantRevokeRequest | 
try {
    JsonRESTResponse result = apiInstance.secureRevokeAccess(serviceName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#secureRevokeAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |
 **body** | [**JsonGrantRevokeRequest**](JsonGrantRevokeRequest.md)|  | [optional]

### Return type

[**JsonRESTResponse**](JsonRESTResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updatePolicy"></a>
# **updatePolicy**
> JsonRangerPolicy updatePolicy(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
JsonRangerPolicy body = new JsonRangerPolicy(); // JsonRangerPolicy | 
try {
    JsonRangerPolicy result = apiInstance.updatePolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#updatePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonRangerPolicy**](JsonRangerPolicy.md)|  | [optional]

### Return type

[**JsonRangerPolicy**](JsonRangerPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateService"></a>
# **updateService**
> JsonRangerService updateService(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
JsonRangerService body = new JsonRangerService(); // JsonRangerService | 
try {
    JsonRangerService result = apiInstance.updateService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#updateService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonRangerService**](JsonRangerService.md)|  | [optional]

### Return type

[**JsonRangerService**](JsonRangerService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateServiceDef"></a>
# **updateServiceDef**
> JsonRangerServiceDef updateServiceDef(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
JsonRangerServiceDef body = new JsonRangerServiceDef(); // JsonRangerServiceDef | 
try {
    JsonRangerServiceDef result = apiInstance.updateServiceDef(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#updateServiceDef");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonRangerServiceDef**](JsonRangerServiceDef.md)|  | [optional]

### Return type

[**JsonRangerServiceDef**](JsonRangerServiceDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="validateConfig"></a>
# **validateConfig**
> JsonVXResponse validateConfig(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceRestApi;


ServiceRestApi apiInstance = new ServiceRestApi();
JsonRangerService body = new JsonRangerService(); // JsonRangerService | 
try {
    JsonVXResponse result = apiInstance.validateConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceRestApi#validateConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonRangerService**](JsonRangerService.md)|  | [optional]

### Return type

[**JsonVXResponse**](JsonVXResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

