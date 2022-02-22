# RoleRestApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsersAndGroups2**](RoleRestApi.md#addUsersAndGroups2) | **PUT** /roles/roles/{id}/addUsersAndGroups | 
[**createRole2**](RoleRestApi.md#createRole2) | **POST** /roles/roles | 
[**deleteRole2**](RoleRestApi.md#deleteRole2) | **DELETE** /roles/roles/name/{name} | 
[**deleteRole2_0**](RoleRestApi.md#deleteRole2_0) | **DELETE** /roles/roles/{id} | 
[**getAllRoleNames2**](RoleRestApi.md#getAllRoleNames2) | **GET** /roles/roles/names | 
[**getAllRoles2**](RoleRestApi.md#getAllRoles2) | **GET** /roles/roles | 
[**getAllRolesForUser**](RoleRestApi.md#getAllRolesForUser) | **GET** /roles/lookup/roles | 
[**getRangerRolesIfUpdated**](RoleRestApi.md#getRangerRolesIfUpdated) | **GET** /roles/download/{serviceName} | 
[**getRole2**](RoleRestApi.md#getRole2) | **GET** /roles/roles/name/{name} | 
[**getRole2_0**](RoleRestApi.md#getRole2_0) | **GET** /roles/roles/{id} | 
[**getSecureRangerRolesIfUpdated**](RoleRestApi.md#getSecureRangerRolesIfUpdated) | **GET** /roles/secure/download/{serviceName} | 
[**getUserRoles2**](RoleRestApi.md#getUserRoles2) | **GET** /roles/roles/user/{user} | 
[**grantRole2**](RoleRestApi.md#grantRole2) | **PUT** /roles/roles/grant/{serviceName} | 
[**removeAdminFromUsersAndGroups2**](RoleRestApi.md#removeAdminFromUsersAndGroups2) | **PUT** /roles/roles/{id}/removeAdminFromUsersAndGroups | 
[**removeUsersAndGroups2**](RoleRestApi.md#removeUsersAndGroups2) | **PUT** /roles/roles/{id}/removeUsersAndGroups | 
[**revokeRole**](RoleRestApi.md#revokeRole) | **PUT** /roles/roles/revoke/{serviceName} | 
[**updateRole2**](RoleRestApi.md#updateRole2) | **PUT** /roles/roles/{id} | 


<a name="addUsersAndGroups2"></a>
# **addUsersAndGroups2**
> JsonRangerRole addUsersAndGroups2(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
Boolean body = true; // Boolean | 
try {
    JsonRangerRole result = apiInstance.addUsersAndGroups2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#addUsersAndGroups2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Boolean**|  | [optional]

### Return type

[**JsonRangerRole**](JsonRangerRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createRole2"></a>
# **createRole2**
> JsonRangerRole createRole2(createNonExistUserGroup, serviceName, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
Boolean createNonExistUserGroup = false; // Boolean | 
String serviceName = "serviceName_example"; // String | 
JsonRangerRole body = new JsonRangerRole(); // JsonRangerRole | 
try {
    JsonRangerRole result = apiInstance.createRole2(createNonExistUserGroup, serviceName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#createRole2");
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

<a name="deleteRole2"></a>
# **deleteRole2**
> deleteRole2(name, execUser, serviceName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
String name = "name_example"; // String | 
String execUser = "execUser_example"; // String | 
String serviceName = "serviceName_example"; // String | 
try {
    apiInstance.deleteRole2(name, execUser, serviceName);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#deleteRole2");
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

<a name="deleteRole2_0"></a>
# **deleteRole2_0**
> deleteRole2_0(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteRole2_0(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#deleteRole2_0");
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

<a name="getAllRoleNames2"></a>
# **getAllRoleNames2**
> List&lt;String&gt; getAllRoleNames2(execUser, serviceName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
String execUser = "execUser_example"; // String | 
String serviceName = "serviceName_example"; // String | 
try {
    List<String> result = apiInstance.getAllRoleNames2(execUser, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#getAllRoleNames2");
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

<a name="getAllRoles2"></a>
# **getAllRoles2**
> JsonRangerRoleList getAllRoles2()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
try {
    JsonRangerRoleList result = apiInstance.getAllRoles2();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#getAllRoles2");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonRangerRoleList**](JsonRangerRoleList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAllRolesForUser"></a>
# **getAllRolesForUser**
> JsonRangerRoleList getAllRolesForUser()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
try {
    JsonRangerRoleList result = apiInstance.getAllRolesForUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#getAllRolesForUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonRangerRoleList**](JsonRangerRoleList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getRangerRolesIfUpdated"></a>
# **getRangerRolesIfUpdated**
> JsonRangerRoles getRangerRolesIfUpdated(serviceName, clusterName, lastActivationTime, lastKnownRoleVersion, pluginCapabilities, pluginId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
String serviceName = "serviceName_example"; // String | 
String clusterName = ""; // String | 
Long lastActivationTime = 0L; // Long | 
Long lastKnownRoleVersion = 789L; // Long | 
String pluginCapabilities = ""; // String | 
String pluginId = "pluginId_example"; // String | 
try {
    JsonRangerRoles result = apiInstance.getRangerRolesIfUpdated(serviceName, clusterName, lastActivationTime, lastKnownRoleVersion, pluginCapabilities, pluginId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#getRangerRolesIfUpdated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |
 **clusterName** | **String**|  | [optional] [default to ]
 **lastActivationTime** | **Long**|  | [optional] [default to 0]
 **lastKnownRoleVersion** | **Long**|  | [optional]
 **pluginCapabilities** | **String**|  | [optional] [default to ]
 **pluginId** | **String**|  | [optional]

### Return type

[**JsonRangerRoles**](JsonRangerRoles.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getRole2"></a>
# **getRole2**
> JsonRangerRole getRole2(name, execUser, serviceName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
String name = "name_example"; // String | 
String execUser = "execUser_example"; // String | 
String serviceName = "serviceName_example"; // String | 
try {
    JsonRangerRole result = apiInstance.getRole2(name, execUser, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#getRole2");
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

<a name="getRole2_0"></a>
# **getRole2_0**
> JsonRangerRole getRole2_0(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
Long id = 789L; // Long | 
try {
    JsonRangerRole result = apiInstance.getRole2_0(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#getRole2_0");
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

<a name="getSecureRangerRolesIfUpdated"></a>
# **getSecureRangerRolesIfUpdated**
> JsonRangerRoles getSecureRangerRolesIfUpdated(serviceName, clusterName, lastActivationTime, lastKnownRoleVersion, pluginCapabilities, pluginId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
String serviceName = "serviceName_example"; // String | 
String clusterName = ""; // String | 
Long lastActivationTime = 0L; // Long | 
Long lastKnownRoleVersion = 789L; // Long | 
String pluginCapabilities = ""; // String | 
String pluginId = "pluginId_example"; // String | 
try {
    JsonRangerRoles result = apiInstance.getSecureRangerRolesIfUpdated(serviceName, clusterName, lastActivationTime, lastKnownRoleVersion, pluginCapabilities, pluginId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#getSecureRangerRolesIfUpdated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |
 **clusterName** | **String**|  | [optional] [default to ]
 **lastActivationTime** | **Long**|  | [optional] [default to 0]
 **lastKnownRoleVersion** | **Long**|  | [optional]
 **pluginCapabilities** | **String**|  | [optional] [default to ]
 **pluginId** | **String**|  | [optional]

### Return type

[**JsonRangerRoles**](JsonRangerRoles.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserRoles2"></a>
# **getUserRoles2**
> List&lt;String&gt; getUserRoles2(user)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
String user = "user_example"; // String | 
try {
    List<String> result = apiInstance.getUserRoles2(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#getUserRoles2");
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

<a name="grantRole2"></a>
# **grantRole2**
> JsonRESTResponse grantRole2(serviceName, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
String serviceName = "serviceName_example"; // String | 
JsonGrantRevokeRoleRequest body = new JsonGrantRevokeRoleRequest(); // JsonGrantRevokeRoleRequest | 
try {
    JsonRESTResponse result = apiInstance.grantRole2(serviceName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#grantRole2");
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

<a name="removeAdminFromUsersAndGroups2"></a>
# **removeAdminFromUsersAndGroups2**
> JsonRangerRole removeAdminFromUsersAndGroups2(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | 
try {
    JsonRangerRole result = apiInstance.removeAdminFromUsersAndGroups2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#removeAdminFromUsersAndGroups2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **List&lt;String&gt;**|  | [optional]

### Return type

[**JsonRangerRole**](JsonRangerRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="removeUsersAndGroups2"></a>
# **removeUsersAndGroups2**
> JsonRangerRole removeUsersAndGroups2(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | 
try {
    JsonRangerRole result = apiInstance.removeUsersAndGroups2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#removeUsersAndGroups2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **List&lt;String&gt;**|  | [optional]

### Return type

[**JsonRangerRole**](JsonRangerRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="revokeRole"></a>
# **revokeRole**
> JsonRESTResponse revokeRole(serviceName, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
String serviceName = "serviceName_example"; // String | 
JsonGrantRevokeRoleRequest body = new JsonGrantRevokeRoleRequest(); // JsonGrantRevokeRoleRequest | 
try {
    JsonRESTResponse result = apiInstance.revokeRole(serviceName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#revokeRole");
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

<a name="updateRole2"></a>
# **updateRole2**
> JsonRangerRole updateRole2(id, createNonExistUserGroup, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleRestApi;


RoleRestApi apiInstance = new RoleRestApi();
Long id = 789L; // Long | 
Boolean createNonExistUserGroup = false; // Boolean | 
JsonRangerRole body = new JsonRangerRole(); // JsonRangerRole | 
try {
    JsonRangerRole result = apiInstance.updateRole2(id, createNonExistUserGroup, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleRestApi#updateRole2");
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

