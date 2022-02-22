# PublicApIsv2Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsersAndGroups**](PublicApIsv2Api.md#addUsersAndGroups) | **PUT** /public/v2/api/roles/{id}/addUsersAndGroups | 
[**applyPolicy2**](PublicApIsv2Api.md#applyPolicy2) | **POST** /public/v2/api/policy/apply | 
[**createPolicy3**](PublicApIsv2Api.md#createPolicy3) | **POST** /public/v2/api/policy | 
[**createRole**](PublicApIsv2Api.md#createRole) | **POST** /public/v2/api/roles | 
[**createSecurityZone**](PublicApIsv2Api.md#createSecurityZone) | **POST** /public/v2/api/zones | 
[**createService2**](PublicApIsv2Api.md#createService2) | **POST** /public/v2/api/service | 
[**createServiceDef2**](PublicApIsv2Api.md#createServiceDef2) | **POST** /public/v2/api/servicedef | 
[**deletePolicy3**](PublicApIsv2Api.md#deletePolicy3) | **DELETE** /public/v2/api/policy/{id} | 
[**deletePolicyByName**](PublicApIsv2Api.md#deletePolicyByName) | **DELETE** /public/v2/api/policy | 
[**deletePolicyDeltas2**](PublicApIsv2Api.md#deletePolicyDeltas2) | **DELETE** /public/v2/api/server/policydeltas | 
[**deleteRole**](PublicApIsv2Api.md#deleteRole) | **DELETE** /public/v2/api/roles/name/{name} | 
[**deleteRole_0**](PublicApIsv2Api.md#deleteRole_0) | **DELETE** /public/v2/api/roles/{id} | 
[**deleteSecurityZone**](PublicApIsv2Api.md#deleteSecurityZone) | **DELETE** /public/v2/api/zones/name/{name} | 
[**deleteSecurityZone_0**](PublicApIsv2Api.md#deleteSecurityZone_0) | **DELETE** /public/v2/api/zones/{id} | 
[**deleteService2**](PublicApIsv2Api.md#deleteService2) | **DELETE** /public/v2/api/service/{id} | 
[**deleteServiceByName**](PublicApIsv2Api.md#deleteServiceByName) | **DELETE** /public/v2/api/service/name/{name} | 
[**deleteServiceDef2**](PublicApIsv2Api.md#deleteServiceDef2) | **DELETE** /public/v2/api/servicedef/{id} | 
[**deleteServiceDefByName**](PublicApIsv2Api.md#deleteServiceDefByName) | **DELETE** /public/v2/api/servicedef/name/{name} | 
[**deleteTagDeltas**](PublicApIsv2Api.md#deleteTagDeltas) | **DELETE** /public/v2/api/server/tagdeltas | 
[**getAllRoleNames**](PublicApIsv2Api.md#getAllRoleNames) | **GET** /public/v2/api/roles/names | 
[**getAllRoles**](PublicApIsv2Api.md#getAllRoles) | **GET** /public/v2/api/roles | 
[**getAllZones**](PublicApIsv2Api.md#getAllZones) | **GET** /public/v2/api/zones | 
[**getPluginsInfo2**](PublicApIsv2Api.md#getPluginsInfo2) | **GET** /public/v2/api/plugins/info | 
[**getPolicies2**](PublicApIsv2Api.md#getPolicies2) | **GET** /public/v2/api/policy | 
[**getPoliciesForResource2**](PublicApIsv2Api.md#getPoliciesForResource2) | **GET** /public/v2/api/policies/{serviceDefName}/for-resource | 
[**getPolicy3**](PublicApIsv2Api.md#getPolicy3) | **GET** /public/v2/api/policy/{id} | 
[**getPolicyByName**](PublicApIsv2Api.md#getPolicyByName) | **GET** /public/v2/api/service/{servicename}/policy/{policyname} | 
[**getRole**](PublicApIsv2Api.md#getRole) | **GET** /public/v2/api/roles/name/{name} | 
[**getRole_0**](PublicApIsv2Api.md#getRole_0) | **GET** /public/v2/api/roles/{id} | 
[**getSecurityZone**](PublicApIsv2Api.md#getSecurityZone) | **GET** /public/v2/api/zones/name/{name} | 
[**getSecurityZone_0**](PublicApIsv2Api.md#getSecurityZone_0) | **GET** /public/v2/api/zones/{id} | 
[**getService2**](PublicApIsv2Api.md#getService2) | **GET** /public/v2/api/service/{id} | 
[**getServiceByName2**](PublicApIsv2Api.md#getServiceByName2) | **GET** /public/v2/api/service/name/{name} | 
[**getServiceDef2**](PublicApIsv2Api.md#getServiceDef2) | **GET** /public/v2/api/servicedef/{id} | 
[**getServiceDefByName2**](PublicApIsv2Api.md#getServiceDefByName2) | **GET** /public/v2/api/servicedef/name/{name} | 
[**getUserRoles**](PublicApIsv2Api.md#getUserRoles) | **GET** /public/v2/api/roles/user/{user} | 
[**grantRole**](PublicApIsv2Api.md#grantRole) | **PUT** /public/v2/api/roles/grant/{serviceName} | 
[**purgeEmptyPolicies2**](PublicApIsv2Api.md#purgeEmptyPolicies2) | **DELETE** /public/v2/api/server/purgepolicies/{serviceName} | 
[**removeAdminFromUsersAndGroups**](PublicApIsv2Api.md#removeAdminFromUsersAndGroups) | **PUT** /public/v2/api/roles/{id}/removeAdminFromUsersAndGroups | 
[**removeUsersAndGroups**](PublicApIsv2Api.md#removeUsersAndGroups) | **PUT** /public/v2/api/roles/{id}/removeUsersAndGroups | 
[**revokeRoleUsersAndRoles**](PublicApIsv2Api.md#revokeRoleUsersAndRoles) | **PUT** /public/v2/api/roles/revoke/{serviceName} | 
[**searchPolicies2**](PublicApIsv2Api.md#searchPolicies2) | **GET** /public/v2/api/service/{servicename}/policy | 
[**searchServiceDefs**](PublicApIsv2Api.md#searchServiceDefs) | **GET** /public/v2/api/servicedef | 
[**searchServices**](PublicApIsv2Api.md#searchServices) | **GET** /public/v2/api/service | 
[**updatePolicy3**](PublicApIsv2Api.md#updatePolicy3) | **PUT** /public/v2/api/policy/{id} | 
[**updatePolicyByName**](PublicApIsv2Api.md#updatePolicyByName) | **PUT** /public/v2/api/service/{servicename}/policy/{policyname} | 
[**updateRole**](PublicApIsv2Api.md#updateRole) | **PUT** /public/v2/api/roles/{id} | 
[**updateSecurityZone**](PublicApIsv2Api.md#updateSecurityZone) | **PUT** /public/v2/api/zones/{id} | 
[**updateService2**](PublicApIsv2Api.md#updateService2) | **PUT** /public/v2/api/service/{id} | 
[**updateServiceByName**](PublicApIsv2Api.md#updateServiceByName) | **PUT** /public/v2/api/service/name/{name} | 
[**updateServiceDef2**](PublicApIsv2Api.md#updateServiceDef2) | **PUT** /public/v2/api/servicedef/{id} | 
[**updateServiceDefByName**](PublicApIsv2Api.md#updateServiceDefByName) | **PUT** /public/v2/api/servicedef/name/{name} | 


<a name="addUsersAndGroups"></a>
# **addUsersAndGroups**
> JsonRangerRole addUsersAndGroups(id, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
Boolean body = true; // Boolean | 
try {
    JsonRangerRole result = apiInstance.addUsersAndGroups(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#addUsersAndGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | **Boolean**|  | [optional]

### Return type

[**JsonRangerRole**](JsonRangerRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="applyPolicy2"></a>
# **applyPolicy2**
> JsonRangerPolicy applyPolicy2(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
JsonRangerPolicy body = new JsonRangerPolicy(); // JsonRangerPolicy | 
try {
    JsonRangerPolicy result = apiInstance.applyPolicy2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#applyPolicy2");
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

<a name="createPolicy3"></a>
# **createPolicy3**
> JsonRangerPolicy createPolicy3(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
JsonRangerPolicy body = new JsonRangerPolicy(); // JsonRangerPolicy | 
try {
    JsonRangerPolicy result = apiInstance.createPolicy3(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#createPolicy3");
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

<a name="createRole"></a>
# **createRole**
> JsonRangerRole createRole(createNonExistUserGroup, serviceName, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Boolean createNonExistUserGroup = false; // Boolean | 
String serviceName = "serviceName_example"; // String | 
JsonRangerRole body = new JsonRangerRole(); // JsonRangerRole | 
try {
    JsonRangerRole result = apiInstance.createRole(createNonExistUserGroup, serviceName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#createRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createNonExistUserGroup** | **Boolean**|  | [optional] [default to false]
 **serviceName** | **String**|  | [optional]
 **body** | [**JsonRangerRole**](JsonRangerRole.md)|  | [optional]

### Return type

[**JsonRangerRole**](JsonRangerRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createSecurityZone"></a>
# **createSecurityZone**
> JsonRangerSecurityZone createSecurityZone(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
JsonRangerSecurityZone body = new JsonRangerSecurityZone(); // JsonRangerSecurityZone | 
try {
    JsonRangerSecurityZone result = apiInstance.createSecurityZone(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#createSecurityZone");
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

<a name="createService2"></a>
# **createService2**
> JsonRangerService createService2(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
JsonRangerService body = new JsonRangerService(); // JsonRangerService | 
try {
    JsonRangerService result = apiInstance.createService2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#createService2");
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

<a name="createServiceDef2"></a>
# **createServiceDef2**
> JsonRangerServiceDef createServiceDef2(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
JsonRangerServiceDef body = new JsonRangerServiceDef(); // JsonRangerServiceDef | 
try {
    JsonRangerServiceDef result = apiInstance.createServiceDef2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#createServiceDef2");
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

<a name="deletePolicy3"></a>
# **deletePolicy3**
> deletePolicy3(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
try {
    apiInstance.deletePolicy3(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#deletePolicy3");
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

<a name="deletePolicyByName"></a>
# **deletePolicyByName**
> deletePolicyByName(policyname, servicename)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String policyname = "policyname_example"; // String | 
String servicename = "servicename_example"; // String | 
try {
    apiInstance.deletePolicyByName(policyname, servicename);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#deletePolicyByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyname** | **String**|  | [optional]
 **servicename** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deletePolicyDeltas2"></a>
# **deletePolicyDeltas2**
> deletePolicyDeltas2(days)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Integer days = 7; // Integer | 
try {
    apiInstance.deletePolicyDeltas2(days);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#deletePolicyDeltas2");
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

<a name="deleteRole"></a>
# **deleteRole**
> deleteRole(name, execUser, serviceName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String name = "name_example"; // String | 
String execUser = "execUser_example"; // String | 
String serviceName = "serviceName_example"; // String | 
try {
    apiInstance.deleteRole(name, execUser, serviceName);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#deleteRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **execUser** | **String**|  | [optional]
 **serviceName** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteRole_0"></a>
# **deleteRole_0**
> deleteRole_0(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
try {
    apiInstance.deleteRole_0(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#deleteRole_0");
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

<a name="deleteSecurityZone"></a>
# **deleteSecurityZone**
> deleteSecurityZone(name)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String name = "name_example"; // String | 
try {
    apiInstance.deleteSecurityZone(name);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#deleteSecurityZone");
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

<a name="deleteSecurityZone_0"></a>
# **deleteSecurityZone_0**
> deleteSecurityZone_0(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
try {
    apiInstance.deleteSecurityZone_0(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#deleteSecurityZone_0");
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

<a name="deleteService2"></a>
# **deleteService2**
> deleteService2(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
try {
    apiInstance.deleteService2(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#deleteService2");
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

<a name="deleteServiceByName"></a>
# **deleteServiceByName**
> deleteServiceByName(name)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String name = "name_example"; // String | 
try {
    apiInstance.deleteServiceByName(name);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#deleteServiceByName");
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

<a name="deleteServiceDef2"></a>
# **deleteServiceDef2**
> deleteServiceDef2(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
try {
    apiInstance.deleteServiceDef2(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#deleteServiceDef2");
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

<a name="deleteServiceDefByName"></a>
# **deleteServiceDefByName**
> deleteServiceDefByName(name)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String name = "name_example"; // String | 
try {
    apiInstance.deleteServiceDefByName(name);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#deleteServiceDefByName");
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

<a name="deleteTagDeltas"></a>
# **deleteTagDeltas**
> deleteTagDeltas(days)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Integer days = 7; // Integer | 
try {
    apiInstance.deleteTagDeltas(days);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#deleteTagDeltas");
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

<a name="getAllRoleNames"></a>
# **getAllRoleNames**
> List&lt;String&gt; getAllRoleNames(execUser, serviceName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String execUser = "execUser_example"; // String | 
String serviceName = "serviceName_example"; // String | 
try {
    List<String> result = apiInstance.getAllRoleNames(execUser, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getAllRoleNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **execUser** | **String**|  | [optional]
 **serviceName** | **String**|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAllRoles"></a>
# **getAllRoles**
> List&lt;JsonRangerRole&gt; getAllRoles()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
try {
    List<JsonRangerRole> result = apiInstance.getAllRoles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getAllRoles");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;JsonRangerRole&gt;**](JsonRangerRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAllZones"></a>
# **getAllZones**
> List&lt;JsonRangerSecurityZone&gt; getAllZones()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
try {
    List<JsonRangerSecurityZone> result = apiInstance.getAllZones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getAllZones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;JsonRangerSecurityZone&gt;**](JsonRangerSecurityZone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getPluginsInfo2"></a>
# **getPluginsInfo2**
> List&lt;JsonRangerPluginInfo&gt; getPluginsInfo2()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
try {
    List<JsonRangerPluginInfo> result = apiInstance.getPluginsInfo2();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getPluginsInfo2");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;JsonRangerPluginInfo&gt;**](JsonRangerPluginInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getPolicies2"></a>
# **getPolicies2**
> List&lt;JsonRangerPolicy&gt; getPolicies2()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
try {
    List<JsonRangerPolicy> result = apiInstance.getPolicies2();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getPolicies2");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;JsonRangerPolicy&gt;**](JsonRangerPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getPoliciesForResource2"></a>
# **getPoliciesForResource2**
> List&lt;JsonRangerPolicy&gt; getPoliciesForResource2(serviceDefName, serviceName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String serviceDefName = "serviceDefName_example"; // String | 
String serviceName = ""; // String | 
try {
    List<JsonRangerPolicy> result = apiInstance.getPoliciesForResource2(serviceDefName, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getPoliciesForResource2");
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

<a name="getPolicy3"></a>
# **getPolicy3**
> JsonRangerPolicy getPolicy3(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
try {
    JsonRangerPolicy result = apiInstance.getPolicy3(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getPolicy3");
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

<a name="getPolicyByName"></a>
# **getPolicyByName**
> JsonRangerPolicy getPolicyByName(policyname, servicename)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String policyname = "policyname_example"; // String | 
String servicename = "servicename_example"; // String | 
try {
    JsonRangerPolicy result = apiInstance.getPolicyByName(policyname, servicename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getPolicyByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyname** | **String**|  |
 **servicename** | **String**|  |

### Return type

[**JsonRangerPolicy**](JsonRangerPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getRole"></a>
# **getRole**
> JsonRangerRole getRole(name, execUser, serviceName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String name = "name_example"; // String | 
String execUser = "execUser_example"; // String | 
String serviceName = "serviceName_example"; // String | 
try {
    JsonRangerRole result = apiInstance.getRole(name, execUser, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **execUser** | **String**|  | [optional]
 **serviceName** | **String**|  | [optional]

### Return type

[**JsonRangerRole**](JsonRangerRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getRole_0"></a>
# **getRole_0**
> JsonRangerRole getRole_0(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
try {
    JsonRangerRole result = apiInstance.getRole_0(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getRole_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonRangerRole**](JsonRangerRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getSecurityZone"></a>
# **getSecurityZone**
> JsonRangerSecurityZone getSecurityZone(name)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String name = "name_example"; // String | 
try {
    JsonRangerSecurityZone result = apiInstance.getSecurityZone(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getSecurityZone");
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

<a name="getSecurityZone_0"></a>
# **getSecurityZone_0**
> JsonRangerSecurityZone getSecurityZone_0(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
try {
    JsonRangerSecurityZone result = apiInstance.getSecurityZone_0(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getSecurityZone_0");
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

<a name="getService2"></a>
# **getService2**
> JsonRangerService getService2(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
try {
    JsonRangerService result = apiInstance.getService2(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getService2");
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

<a name="getServiceByName2"></a>
# **getServiceByName2**
> JsonRangerService getServiceByName2(name)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String name = "name_example"; // String | 
try {
    JsonRangerService result = apiInstance.getServiceByName2(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getServiceByName2");
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

<a name="getServiceDef2"></a>
# **getServiceDef2**
> JsonRangerServiceDef getServiceDef2(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
try {
    JsonRangerServiceDef result = apiInstance.getServiceDef2(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getServiceDef2");
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

<a name="getServiceDefByName2"></a>
# **getServiceDefByName2**
> JsonRangerServiceDef getServiceDefByName2(name)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String name = "name_example"; // String | 
try {
    JsonRangerServiceDef result = apiInstance.getServiceDefByName2(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getServiceDefByName2");
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

<a name="getUserRoles"></a>
# **getUserRoles**
> List&lt;String&gt; getUserRoles(user)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String user = "user_example"; // String | 
try {
    List<String> result = apiInstance.getUserRoles(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#getUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | **String**|  |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="grantRole"></a>
# **grantRole**
> JsonRESTResponse grantRole(serviceName, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String serviceName = "serviceName_example"; // String | 
JsonGrantRevokeRoleRequest body = new JsonGrantRevokeRoleRequest(); // JsonGrantRevokeRoleRequest | 
try {
    JsonRESTResponse result = apiInstance.grantRole(serviceName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#grantRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |
 **body** | [**JsonGrantRevokeRoleRequest**](JsonGrantRevokeRoleRequest.md)|  | [optional]

### Return type

[**JsonRESTResponse**](JsonRESTResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="purgeEmptyPolicies2"></a>
# **purgeEmptyPolicies2**
> purgeEmptyPolicies2(serviceName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String serviceName = "serviceName_example"; // String | 
try {
    apiInstance.purgeEmptyPolicies2(serviceName);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#purgeEmptyPolicies2");
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

<a name="removeAdminFromUsersAndGroups"></a>
# **removeAdminFromUsersAndGroups**
> JsonRangerRole removeAdminFromUsersAndGroups(id, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
List<String> body = Arrays.asList(new List<String>()); // List<String> | 
try {
    JsonRangerRole result = apiInstance.removeAdminFromUsersAndGroups(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#removeAdminFromUsersAndGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | **List&lt;String&gt;**|  | [optional]

### Return type

[**JsonRangerRole**](JsonRangerRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="removeUsersAndGroups"></a>
# **removeUsersAndGroups**
> JsonRangerRole removeUsersAndGroups(id, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
List<String> body = Arrays.asList(new List<String>()); // List<String> | 
try {
    JsonRangerRole result = apiInstance.removeUsersAndGroups(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#removeUsersAndGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | **List&lt;String&gt;**|  | [optional]

### Return type

[**JsonRangerRole**](JsonRangerRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="revokeRoleUsersAndRoles"></a>
# **revokeRoleUsersAndRoles**
> JsonRESTResponse revokeRoleUsersAndRoles(serviceName, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String serviceName = "serviceName_example"; // String | 
JsonGrantRevokeRoleRequest body = new JsonGrantRevokeRoleRequest(); // JsonGrantRevokeRoleRequest | 
try {
    JsonRESTResponse result = apiInstance.revokeRoleUsersAndRoles(serviceName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#revokeRoleUsersAndRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |
 **body** | [**JsonGrantRevokeRoleRequest**](JsonGrantRevokeRoleRequest.md)|  | [optional]

### Return type

[**JsonRESTResponse**](JsonRESTResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="searchPolicies2"></a>
# **searchPolicies2**
> List&lt;JsonRangerPolicy&gt; searchPolicies2(servicename)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String servicename = "servicename_example"; // String | 
try {
    List<JsonRangerPolicy> result = apiInstance.searchPolicies2(servicename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#searchPolicies2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **servicename** | **String**|  |

### Return type

[**List&lt;JsonRangerPolicy&gt;**](JsonRangerPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchServiceDefs"></a>
# **searchServiceDefs**
> List&lt;JsonRangerServiceDef&gt; searchServiceDefs()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
try {
    List<JsonRangerServiceDef> result = apiInstance.searchServiceDefs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#searchServiceDefs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;JsonRangerServiceDef&gt;**](JsonRangerServiceDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchServices"></a>
# **searchServices**
> List&lt;JsonRangerService&gt; searchServices()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
try {
    List<JsonRangerService> result = apiInstance.searchServices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#searchServices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;JsonRangerService&gt;**](JsonRangerService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updatePolicy3"></a>
# **updatePolicy3**
> JsonRangerPolicy updatePolicy3(id, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
JsonRangerPolicy body = new JsonRangerPolicy(); // JsonRangerPolicy | 
try {
    JsonRangerPolicy result = apiInstance.updatePolicy3(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#updatePolicy3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**JsonRangerPolicy**](JsonRangerPolicy.md)|  | [optional]

### Return type

[**JsonRangerPolicy**](JsonRangerPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updatePolicyByName"></a>
# **updatePolicyByName**
> JsonRangerPolicy updatePolicyByName(policyname, servicename, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String policyname = "policyname_example"; // String | 
String servicename = "servicename_example"; // String | 
JsonRangerPolicy body = new JsonRangerPolicy(); // JsonRangerPolicy | 
try {
    JsonRangerPolicy result = apiInstance.updatePolicyByName(policyname, servicename, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#updatePolicyByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyname** | **String**|  |
 **servicename** | **String**|  |
 **body** | [**JsonRangerPolicy**](JsonRangerPolicy.md)|  | [optional]

### Return type

[**JsonRangerPolicy**](JsonRangerPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateRole"></a>
# **updateRole**
> JsonRangerRole updateRole(id, createNonExistUserGroup, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
Boolean createNonExistUserGroup = false; // Boolean | 
JsonRangerRole body = new JsonRangerRole(); // JsonRangerRole | 
try {
    JsonRangerRole result = apiInstance.updateRole(id, createNonExistUserGroup, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#updateRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **createNonExistUserGroup** | **Boolean**|  | [optional] [default to false]
 **body** | [**JsonRangerRole**](JsonRangerRole.md)|  | [optional]

### Return type

[**JsonRangerRole**](JsonRangerRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateSecurityZone"></a>
# **updateSecurityZone**
> JsonRangerSecurityZone updateSecurityZone(id, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
JsonRangerSecurityZone body = new JsonRangerSecurityZone(); // JsonRangerSecurityZone | 
try {
    JsonRangerSecurityZone result = apiInstance.updateSecurityZone(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#updateSecurityZone");
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

<a name="updateService2"></a>
# **updateService2**
> JsonRangerService updateService2(id, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
JsonRangerService body = new JsonRangerService(); // JsonRangerService | 
try {
    JsonRangerService result = apiInstance.updateService2(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#updateService2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**JsonRangerService**](JsonRangerService.md)|  | [optional]

### Return type

[**JsonRangerService**](JsonRangerService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateServiceByName"></a>
# **updateServiceByName**
> JsonRangerService updateServiceByName(name, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String name = "name_example"; // String | 
JsonRangerService body = new JsonRangerService(); // JsonRangerService | 
try {
    JsonRangerService result = apiInstance.updateServiceByName(name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#updateServiceByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **body** | [**JsonRangerService**](JsonRangerService.md)|  | [optional]

### Return type

[**JsonRangerService**](JsonRangerService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateServiceDef2"></a>
# **updateServiceDef2**
> JsonRangerServiceDef updateServiceDef2(id, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
Long id = 789L; // Long | 
JsonRangerServiceDef body = new JsonRangerServiceDef(); // JsonRangerServiceDef | 
try {
    JsonRangerServiceDef result = apiInstance.updateServiceDef2(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#updateServiceDef2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**JsonRangerServiceDef**](JsonRangerServiceDef.md)|  | [optional]

### Return type

[**JsonRangerServiceDef**](JsonRangerServiceDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateServiceDefByName"></a>
# **updateServiceDefByName**
> JsonRangerServiceDef updateServiceDefByName(name, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApIsv2Api;


PublicApIsv2Api apiInstance = new PublicApIsv2Api();
String name = "name_example"; // String | 
JsonRangerServiceDef body = new JsonRangerServiceDef(); // JsonRangerServiceDef | 
try {
    JsonRangerServiceDef result = apiInstance.updateServiceDefByName(name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApIsv2Api#updateServiceDefByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **body** | [**JsonRangerServiceDef**](JsonRangerServiceDef.md)|  | [optional]

### Return type

[**JsonRangerServiceDef**](JsonRangerServiceDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

