# XUserRestApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrUpdateGroupUsersList**](XUserRestApi.md#addOrUpdateGroupUsersList) | **POST** /xusers/ugsync/groupusers | 
[**addOrUpdateGroups**](XUserRestApi.md#addOrUpdateGroups) | **POST** /xusers/ugsync/groups | 
[**addOrUpdateUsers**](XUserRestApi.md#addOrUpdateUsers) | **POST** /xusers/ugsync/users | 
[**countXAuditMaps**](XUserRestApi.md#countXAuditMaps) | **GET** /xusers/auditmaps/count | 
[**countXGroupGroups**](XUserRestApi.md#countXGroupGroups) | **GET** /xusers/groupgroups/count | 
[**countXGroupPermission**](XUserRestApi.md#countXGroupPermission) | **GET** /xusers/permission/group/count | 
[**countXGroupUsers**](XUserRestApi.md#countXGroupUsers) | **GET** /xusers/groupusers/count | 
[**countXGroups**](XUserRestApi.md#countXGroups) | **GET** /xusers/groups/count | 
[**countXModuleDef**](XUserRestApi.md#countXModuleDef) | **GET** /xusers/permission/count | 
[**countXPermMaps**](XUserRestApi.md#countXPermMaps) | **GET** /xusers/permmaps/count | 
[**countXUserPermission**](XUserRestApi.md#countXUserPermission) | **GET** /xusers/permission/user/count | 
[**countXUsers**](XUserRestApi.md#countXUsers) | **GET** /xusers/users/count | 
[**createExternalUser**](XUserRestApi.md#createExternalUser) | **POST** /xusers/users/external | 
[**createXAuditMap**](XUserRestApi.md#createXAuditMap) | **POST** /xusers/auditmaps | 
[**createXGroup**](XUserRestApi.md#createXGroup) | **POST** /xusers/groups | 
[**createXGroupGroup**](XUserRestApi.md#createXGroupGroup) | **POST** /xusers/groupgroups | 
[**createXGroupPermission**](XUserRestApi.md#createXGroupPermission) | **POST** /xusers/permission/group | 
[**createXGroupUser**](XUserRestApi.md#createXGroupUser) | **POST** /xusers/groupusers | 
[**createXGroupUserFromMap**](XUserRestApi.md#createXGroupUserFromMap) | **POST** /xusers/groups/groupinfo | 
[**createXModuleDefPermission**](XUserRestApi.md#createXModuleDefPermission) | **POST** /xusers/permission | 
[**createXPermMap**](XUserRestApi.md#createXPermMap) | **POST** /xusers/permmaps | 
[**createXUser**](XUserRestApi.md#createXUser) | **POST** /xusers/users | 
[**createXUserGroupFromMap**](XUserRestApi.md#createXUserGroupFromMap) | **POST** /xusers/users/userinfo | 
[**createXUserPermission**](XUserRestApi.md#createXUserPermission) | **POST** /xusers/permission/user | 
[**deleteGroupsByGroupName**](XUserRestApi.md#deleteGroupsByGroupName) | **DELETE** /xusers/secure/groups/delete | 
[**deleteSingleGroupByGroupId**](XUserRestApi.md#deleteSingleGroupByGroupId) | **DELETE** /xusers/secure/groups/id/{groupId} | 
[**deleteSingleGroupByGroupName**](XUserRestApi.md#deleteSingleGroupByGroupName) | **DELETE** /xusers/secure/groups/{groupName} | 
[**deleteSingleUserByUserId**](XUserRestApi.md#deleteSingleUserByUserId) | **DELETE** /xusers/secure/users/id/{userId} | 
[**deleteSingleUserByUserName**](XUserRestApi.md#deleteSingleUserByUserName) | **DELETE** /xusers/secure/users/{userName} | 
[**deleteUsersByUserName**](XUserRestApi.md#deleteUsersByUserName) | **DELETE** /xusers/secure/users/delete | 
[**deleteXAuditMap**](XUserRestApi.md#deleteXAuditMap) | **DELETE** /xusers/auditmaps/{id} | 
[**deleteXGroup**](XUserRestApi.md#deleteXGroup) | **DELETE** /xusers/groups/{id} | 
[**deleteXGroupAndXUser**](XUserRestApi.md#deleteXGroupAndXUser) | **DELETE** /xusers/group/{groupName}/user/{userName} | 
[**deleteXGroupByGroupName**](XUserRestApi.md#deleteXGroupByGroupName) | **DELETE** /xusers/groups/groupName/{groupName} | 
[**deleteXGroupGroup**](XUserRestApi.md#deleteXGroupGroup) | **DELETE** /xusers/groupgroups/{id} | 
[**deleteXGroupPermission**](XUserRestApi.md#deleteXGroupPermission) | **DELETE** /xusers/permission/group/{id} | 
[**deleteXGroupUser**](XUserRestApi.md#deleteXGroupUser) | **DELETE** /xusers/groupusers/{id} | 
[**deleteXModuleDefPermission**](XUserRestApi.md#deleteXModuleDefPermission) | **DELETE** /xusers/permission/{id} | 
[**deleteXPermMap**](XUserRestApi.md#deleteXPermMap) | **DELETE** /xusers/permmaps/{id} | 
[**deleteXUser**](XUserRestApi.md#deleteXUser) | **DELETE** /xusers/users/{id} | 
[**deleteXUserByUserName**](XUserRestApi.md#deleteXUserByUserName) | **DELETE** /xusers/users/userName/{userName} | 
[**deleteXUserPermission**](XUserRestApi.md#deleteXUserPermission) | **DELETE** /xusers/permission/user/{id} | 
[**getAllGroupUsers**](XUserRestApi.md#getAllGroupUsers) | **GET** /xusers/ugsync/groupusers | 
[**getAuthSession**](XUserRestApi.md#getAuthSession) | **GET** /xusers/authSessions/info | 
[**getAuthSessions**](XUserRestApi.md#getAuthSessions) | **GET** /xusers/authSessions | 
[**getGroupsLookup**](XUserRestApi.md#getGroupsLookup) | **GET** /xusers/lookup/groups | 
[**getSecureRangerUserStoreIfUpdated**](XUserRestApi.md#getSecureRangerUserStoreIfUpdated) | **GET** /xusers/secure/download/{serviceName} | 
[**getUserRolesByExternalID**](XUserRestApi.md#getUserRolesByExternalID) | **GET** /xusers/secure/users/external/{userId} | 
[**getUserRolesByName**](XUserRestApi.md#getUserRolesByName) | **GET** /xusers/secure/users/roles/userName/{userName} | 
[**getUsersLookup**](XUserRestApi.md#getUsersLookup) | **GET** /xusers/lookup/users | 
[**getXAuditMap**](XUserRestApi.md#getXAuditMap) | **GET** /xusers/auditmaps/{id} | 
[**getXGroup**](XUserRestApi.md#getXGroup) | **GET** /xusers/groups/{id} | 
[**getXGroupByGroupName**](XUserRestApi.md#getXGroupByGroupName) | **GET** /xusers/groups/groupName/{groupName} | 
[**getXGroupGroup**](XUserRestApi.md#getXGroupGroup) | **GET** /xusers/groupgroups/{id} | 
[**getXGroupPermission**](XUserRestApi.md#getXGroupPermission) | **GET** /xusers/permission/group/{id} | 
[**getXGroupUser**](XUserRestApi.md#getXGroupUser) | **GET** /xusers/groupusers/{id} | 
[**getXGroupUsers**](XUserRestApi.md#getXGroupUsers) | **GET** /xusers/{groupId}/users | 
[**getXGroupUsersByGroupName**](XUserRestApi.md#getXGroupUsersByGroupName) | **GET** /xusers/groupusers/groupName/{groupName} | Implements the traditional search functionalities for XGroupUsers by Group name.
[**getXModuleDefPermission**](XUserRestApi.md#getXModuleDefPermission) | **GET** /xusers/permission/{id} | 
[**getXPermMap**](XUserRestApi.md#getXPermMap) | **GET** /xusers/permmaps/{id} | 
[**getXUser**](XUserRestApi.md#getXUser) | **GET** /xusers/users/{id} | 
[**getXUserByUserName**](XUserRestApi.md#getXUserByUserName) | **GET** /xusers/users/userName/{userName} | 
[**getXUserGroups**](XUserRestApi.md#getXUserGroups) | **GET** /xusers/{userId}/groups | 
[**getXUserPermission**](XUserRestApi.md#getXUserPermission) | **GET** /xusers/permission/user/{id} | 
[**modifyGroupsVisibility**](XUserRestApi.md#modifyGroupsVisibility) | **PUT** /xusers/secure/groups/visibility | 
[**modifyUserActiveStatus**](XUserRestApi.md#modifyUserActiveStatus) | **PUT** /xusers/secure/users/activestatus | 
[**modifyUserVisibility**](XUserRestApi.md#modifyUserVisibility) | **PUT** /xusers/secure/users/visibility | 
[**postUserGroupAuditInfo**](XUserRestApi.md#postUserGroupAuditInfo) | **POST** /xusers/ugsync/auditinfo | 
[**searchXAuditMaps**](XUserRestApi.md#searchXAuditMaps) | **GET** /xusers/auditmaps | Implements the traditional search functionalities for XAuditMaps.
[**searchXGroupGroups**](XUserRestApi.md#searchXGroupGroups) | **GET** /xusers/groupgroups | Implements the traditional search functionalities for XGroupGroups.
[**searchXGroupPermission**](XUserRestApi.md#searchXGroupPermission) | **GET** /xusers/permission/group | 
[**searchXGroupUsers**](XUserRestApi.md#searchXGroupUsers) | **GET** /xusers/groupusers | Implements the traditional search functionalities for XGroupUsers.
[**searchXGroups**](XUserRestApi.md#searchXGroups) | **GET** /xusers/groups | Implements the traditional search functionalities for XGroups.
[**searchXModuleDef**](XUserRestApi.md#searchXModuleDef) | **GET** /xusers/permission | 
[**searchXPermMaps**](XUserRestApi.md#searchXPermMaps) | **GET** /xusers/permmaps | Implements the traditional search functionalities for XPermMaps.
[**searchXUserPermission**](XUserRestApi.md#searchXUserPermission) | **GET** /xusers/permission/user | 
[**searchXUsers**](XUserRestApi.md#searchXUsers) | **GET** /xusers/users | Implements the traditional search functionalities for XUsers.
[**secureCreateXGroup**](XUserRestApi.md#secureCreateXGroup) | **POST** /xusers/secure/groups | 
[**secureCreateXUser**](XUserRestApi.md#secureCreateXUser) | **POST** /xusers/secure/users | 
[**secureGetXGroup**](XUserRestApi.md#secureGetXGroup) | **GET** /xusers/secure/groups/{id} | 
[**secureGetXUser**](XUserRestApi.md#secureGetXUser) | **GET** /xusers/secure/users/{id} | 
[**secureUpdateXGroup**](XUserRestApi.md#secureUpdateXGroup) | **PUT** /xusers/secure/groups/{id} | 
[**secureUpdateXUser**](XUserRestApi.md#secureUpdateXUser) | **PUT** /xusers/secure/users/{id} | 
[**setUserRolesByExternalID**](XUserRestApi.md#setUserRolesByExternalID) | **PUT** /xusers/secure/users/roles/{userId} | 
[**setUserRolesByName**](XUserRestApi.md#setUserRolesByName) | **PUT** /xusers/secure/users/roles/userName/{userName} | 
[**setXUserRolesByName**](XUserRestApi.md#setXUserRolesByName) | **POST** /xusers/users/roleassignments | 
[**updateDeletedGroups**](XUserRestApi.md#updateDeletedGroups) | **POST** /xusers/ugsync/groups/visibility | 
[**updateDeletedUsers**](XUserRestApi.md#updateDeletedUsers) | **POST** /xusers/ugsync/users/visibility | 
[**updateXAuditMap**](XUserRestApi.md#updateXAuditMap) | **PUT** /xusers/auditmaps | 
[**updateXGroup**](XUserRestApi.md#updateXGroup) | **PUT** /xusers/groups | 
[**updateXGroupGroup**](XUserRestApi.md#updateXGroupGroup) | **PUT** /xusers/groupgroups | 
[**updateXGroupPermission**](XUserRestApi.md#updateXGroupPermission) | **PUT** /xusers/permission/group/{id} | 
[**updateXGroupUser**](XUserRestApi.md#updateXGroupUser) | **PUT** /xusers/groupusers | 
[**updateXModuleDefPermission**](XUserRestApi.md#updateXModuleDefPermission) | **PUT** /xusers/permission/{id} | 
[**updateXPermMap**](XUserRestApi.md#updateXPermMap) | **PUT** /xusers/permmaps | 
[**updateXUser**](XUserRestApi.md#updateXUser) | **PUT** /xusers/users | 
[**updateXUserPermission**](XUserRestApi.md#updateXUserPermission) | **PUT** /xusers/permission/user/{id} | 


<a name="addOrUpdateGroupUsersList"></a>
# **addOrUpdateGroupUsersList**
> Integer addOrUpdateGroupUsersList(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
List<JsonGroupUserInfo> body = Arrays.asList(new JsonGroupUserInfo()); // List<JsonGroupUserInfo> | 
try {
    Integer result = apiInstance.addOrUpdateGroupUsersList(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#addOrUpdateGroupUsersList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;JsonGroupUserInfo&gt;**](JsonGroupUserInfo.md)|  | [optional]

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="addOrUpdateGroups"></a>
# **addOrUpdateGroups**
> Integer addOrUpdateGroups(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXGroupList body = new JsonVXGroupList(); // JsonVXGroupList | 
try {
    Integer result = apiInstance.addOrUpdateGroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#addOrUpdateGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXGroupList**](JsonVXGroupList.md)|  | [optional]

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="addOrUpdateUsers"></a>
# **addOrUpdateUsers**
> String addOrUpdateUsers(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXUserList body = new JsonVXUserList(); // JsonVXUserList | 
try {
    String result = apiInstance.addOrUpdateUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#addOrUpdateUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXUserList**](JsonVXUserList.md)|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="countXAuditMaps"></a>
# **countXAuditMaps**
> JsonVXLong countXAuditMaps()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXLong result = apiInstance.countXAuditMaps();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#countXAuditMaps");
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

<a name="countXGroupGroups"></a>
# **countXGroupGroups**
> JsonVXLong countXGroupGroups()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXLong result = apiInstance.countXGroupGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#countXGroupGroups");
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

<a name="countXGroupPermission"></a>
# **countXGroupPermission**
> JsonVXLong countXGroupPermission()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXLong result = apiInstance.countXGroupPermission();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#countXGroupPermission");
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

<a name="countXGroupUsers"></a>
# **countXGroupUsers**
> JsonVXLong countXGroupUsers()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXLong result = apiInstance.countXGroupUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#countXGroupUsers");
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

<a name="countXGroups"></a>
# **countXGroups**
> JsonVXLong countXGroups()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXLong result = apiInstance.countXGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#countXGroups");
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

<a name="countXModuleDef"></a>
# **countXModuleDef**
> JsonVXLong countXModuleDef()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXLong result = apiInstance.countXModuleDef();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#countXModuleDef");
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

<a name="countXPermMaps"></a>
# **countXPermMaps**
> JsonVXLong countXPermMaps()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXLong result = apiInstance.countXPermMaps();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#countXPermMaps");
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

<a name="countXUserPermission"></a>
# **countXUserPermission**
> JsonVXLong countXUserPermission()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXLong result = apiInstance.countXUserPermission();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#countXUserPermission");
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

<a name="countXUsers"></a>
# **countXUsers**
> JsonVXLong countXUsers()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXLong result = apiInstance.countXUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#countXUsers");
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

<a name="createExternalUser"></a>
# **createExternalUser**
> JsonVXUser createExternalUser(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXUser body = new JsonVXUser(); // JsonVXUser | 
try {
    JsonVXUser result = apiInstance.createExternalUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#createExternalUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXUser**](JsonVXUser.md)|  | [optional]

### Return type

[**JsonVXUser**](JsonVXUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createXAuditMap"></a>
# **createXAuditMap**
> JsonVXAuditMap createXAuditMap(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXAuditMap body = new JsonVXAuditMap(); // JsonVXAuditMap | 
try {
    JsonVXAuditMap result = apiInstance.createXAuditMap(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#createXAuditMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXAuditMap**](JsonVXAuditMap.md)|  | [optional]

### Return type

[**JsonVXAuditMap**](JsonVXAuditMap.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createXGroup"></a>
# **createXGroup**
> JsonVXGroup createXGroup(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXGroup body = new JsonVXGroup(); // JsonVXGroup | 
try {
    JsonVXGroup result = apiInstance.createXGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#createXGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXGroup**](JsonVXGroup.md)|  | [optional]

### Return type

[**JsonVXGroup**](JsonVXGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createXGroupGroup"></a>
# **createXGroupGroup**
> JsonVXGroupGroup createXGroupGroup(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXGroupGroup body = new JsonVXGroupGroup(); // JsonVXGroupGroup | 
try {
    JsonVXGroupGroup result = apiInstance.createXGroupGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#createXGroupGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXGroupGroup**](JsonVXGroupGroup.md)|  | [optional]

### Return type

[**JsonVXGroupGroup**](JsonVXGroupGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createXGroupPermission"></a>
# **createXGroupPermission**
> JsonVXGroupPermission createXGroupPermission(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXGroupPermission body = new JsonVXGroupPermission(); // JsonVXGroupPermission | 
try {
    JsonVXGroupPermission result = apiInstance.createXGroupPermission(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#createXGroupPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXGroupPermission**](JsonVXGroupPermission.md)|  | [optional]

### Return type

[**JsonVXGroupPermission**](JsonVXGroupPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createXGroupUser"></a>
# **createXGroupUser**
> JsonVXGroupUser createXGroupUser(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXGroupUser body = new JsonVXGroupUser(); // JsonVXGroupUser | 
try {
    JsonVXGroupUser result = apiInstance.createXGroupUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#createXGroupUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXGroupUser**](JsonVXGroupUser.md)|  | [optional]

### Return type

[**JsonVXGroupUser**](JsonVXGroupUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createXGroupUserFromMap"></a>
# **createXGroupUserFromMap**
> JsonVXGroupUserInfo createXGroupUserFromMap(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXGroupUserInfo body = new JsonVXGroupUserInfo(); // JsonVXGroupUserInfo | 
try {
    JsonVXGroupUserInfo result = apiInstance.createXGroupUserFromMap(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#createXGroupUserFromMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXGroupUserInfo**](JsonVXGroupUserInfo.md)|  | [optional]

### Return type

[**JsonVXGroupUserInfo**](JsonVXGroupUserInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createXModuleDefPermission"></a>
# **createXModuleDefPermission**
> JsonVXModuleDef createXModuleDefPermission(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXModuleDef body = new JsonVXModuleDef(); // JsonVXModuleDef | 
try {
    JsonVXModuleDef result = apiInstance.createXModuleDefPermission(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#createXModuleDefPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXModuleDef**](JsonVXModuleDef.md)|  | [optional]

### Return type

[**JsonVXModuleDef**](JsonVXModuleDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createXPermMap"></a>
# **createXPermMap**
> JsonVXPermMap createXPermMap(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXPermMap body = new JsonVXPermMap(); // JsonVXPermMap | 
try {
    JsonVXPermMap result = apiInstance.createXPermMap(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#createXPermMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXPermMap**](JsonVXPermMap.md)|  | [optional]

### Return type

[**JsonVXPermMap**](JsonVXPermMap.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createXUser"></a>
# **createXUser**
> JsonVXUser createXUser(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXUser body = new JsonVXUser(); // JsonVXUser | 
try {
    JsonVXUser result = apiInstance.createXUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#createXUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXUser**](JsonVXUser.md)|  | [optional]

### Return type

[**JsonVXUser**](JsonVXUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createXUserGroupFromMap"></a>
# **createXUserGroupFromMap**
> JsonVXUserGroupInfo createXUserGroupFromMap(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXUserGroupInfo body = new JsonVXUserGroupInfo(); // JsonVXUserGroupInfo | 
try {
    JsonVXUserGroupInfo result = apiInstance.createXUserGroupFromMap(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#createXUserGroupFromMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXUserGroupInfo**](JsonVXUserGroupInfo.md)|  | [optional]

### Return type

[**JsonVXUserGroupInfo**](JsonVXUserGroupInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createXUserPermission"></a>
# **createXUserPermission**
> JsonVXUserPermission createXUserPermission(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXUserPermission body = new JsonVXUserPermission(); // JsonVXUserPermission | 
try {
    JsonVXUserPermission result = apiInstance.createXUserPermission(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#createXUserPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXUserPermission**](JsonVXUserPermission.md)|  | [optional]

### Return type

[**JsonVXUserPermission**](JsonVXUserPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deleteGroupsByGroupName"></a>
# **deleteGroupsByGroupName**
> deleteGroupsByGroupName(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXStringList body = new JsonVXStringList(); // JsonVXStringList | 
try {
    apiInstance.deleteGroupsByGroupName(body);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteGroupsByGroupName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXStringList**](JsonVXStringList.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="deleteSingleGroupByGroupId"></a>
# **deleteSingleGroupByGroupId**
> deleteSingleGroupByGroupId(groupId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long groupId = 789L; // Long | 
try {
    apiInstance.deleteSingleGroupByGroupId(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteSingleGroupByGroupId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteSingleGroupByGroupName"></a>
# **deleteSingleGroupByGroupName**
> deleteSingleGroupByGroupName(groupName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
String groupName = "groupName_example"; // String | 
try {
    apiInstance.deleteSingleGroupByGroupName(groupName);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteSingleGroupByGroupName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteSingleUserByUserId"></a>
# **deleteSingleUserByUserId**
> deleteSingleUserByUserId(userId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long userId = 789L; // Long | 
try {
    apiInstance.deleteSingleUserByUserId(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteSingleUserByUserId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteSingleUserByUserName"></a>
# **deleteSingleUserByUserName**
> deleteSingleUserByUserName(userName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
String userName = "userName_example"; // String | 
try {
    apiInstance.deleteSingleUserByUserName(userName);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteSingleUserByUserName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteUsersByUserName"></a>
# **deleteUsersByUserName**
> deleteUsersByUserName(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXStringList body = new JsonVXStringList(); // JsonVXStringList | 
try {
    apiInstance.deleteUsersByUserName(body);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteUsersByUserName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXStringList**](JsonVXStringList.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="deleteXAuditMap"></a>
# **deleteXAuditMap**
> deleteXAuditMap(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteXAuditMap(id);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteXAuditMap");
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

<a name="deleteXGroup"></a>
# **deleteXGroup**
> deleteXGroup(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteXGroup(id);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteXGroup");
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

<a name="deleteXGroupAndXUser"></a>
# **deleteXGroupAndXUser**
> deleteXGroupAndXUser(groupName, userName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
String groupName = "groupName_example"; // String | 
String userName = "userName_example"; // String | 
try {
    apiInstance.deleteXGroupAndXUser(groupName, userName);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteXGroupAndXUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  |
 **userName** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteXGroupByGroupName"></a>
# **deleteXGroupByGroupName**
> deleteXGroupByGroupName(groupName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
String groupName = "groupName_example"; // String | 
try {
    apiInstance.deleteXGroupByGroupName(groupName);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteXGroupByGroupName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteXGroupGroup"></a>
# **deleteXGroupGroup**
> deleteXGroupGroup(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteXGroupGroup(id);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteXGroupGroup");
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

<a name="deleteXGroupPermission"></a>
# **deleteXGroupPermission**
> deleteXGroupPermission(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteXGroupPermission(id);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteXGroupPermission");
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

<a name="deleteXGroupUser"></a>
# **deleteXGroupUser**
> deleteXGroupUser(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteXGroupUser(id);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteXGroupUser");
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

<a name="deleteXModuleDefPermission"></a>
# **deleteXModuleDefPermission**
> deleteXModuleDefPermission(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteXModuleDefPermission(id);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteXModuleDefPermission");
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

<a name="deleteXPermMap"></a>
# **deleteXPermMap**
> deleteXPermMap(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteXPermMap(id);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteXPermMap");
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

<a name="deleteXUser"></a>
# **deleteXUser**
> deleteXUser(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteXUser(id);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteXUser");
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

<a name="deleteXUserByUserName"></a>
# **deleteXUserByUserName**
> deleteXUserByUserName(userName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
String userName = "userName_example"; // String | 
try {
    apiInstance.deleteXUserByUserName(userName);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteXUserByUserName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteXUserPermission"></a>
# **deleteXUserPermission**
> deleteXUserPermission(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteXUserPermission(id);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#deleteXUserPermission");
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

<a name="getAllGroupUsers"></a>
# **getAllGroupUsers**
> Map&lt;String, List&lt;String&gt;&gt; getAllGroupUsers()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    Map<String, List<String>> result = apiInstance.getAllGroupUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getAllGroupUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, List&lt;String&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAuthSession"></a>
# **getAuthSession**
> JsonVXAuthSession getAuthSession()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXAuthSession result = apiInstance.getAuthSession();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getAuthSession");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXAuthSession**](JsonVXAuthSession.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAuthSessions"></a>
# **getAuthSessions**
> JsonVXAuthSessionList getAuthSessions()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXAuthSessionList result = apiInstance.getAuthSessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getAuthSessions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXAuthSessionList**](JsonVXAuthSessionList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getGroupsLookup"></a>
# **getGroupsLookup**
> JsonVXStringList getGroupsLookup()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXStringList result = apiInstance.getGroupsLookup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getGroupsLookup");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXStringList**](JsonVXStringList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getSecureRangerUserStoreIfUpdated"></a>
# **getSecureRangerUserStoreIfUpdated**
> JsonRangerUserStore getSecureRangerUserStoreIfUpdated(serviceName, clusterName, lastActivationTime, lastKnownUserStoreVersion, pluginCapabilities, pluginId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
String serviceName = "serviceName_example"; // String | 
String clusterName = ""; // String | 
Long lastActivationTime = 0L; // Long | 
Long lastKnownUserStoreVersion = 789L; // Long | 
String pluginCapabilities = ""; // String | 
String pluginId = "pluginId_example"; // String | 
try {
    JsonRangerUserStore result = apiInstance.getSecureRangerUserStoreIfUpdated(serviceName, clusterName, lastActivationTime, lastKnownUserStoreVersion, pluginCapabilities, pluginId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getSecureRangerUserStoreIfUpdated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |
 **clusterName** | **String**|  | [optional] [default to ]
 **lastActivationTime** | **Long**|  | [optional] [default to 0]
 **lastKnownUserStoreVersion** | **Long**|  | [optional]
 **pluginCapabilities** | **String**|  | [optional] [default to ]
 **pluginId** | **String**|  | [optional]

### Return type

[**JsonRangerUserStore**](JsonRangerUserStore.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserRolesByExternalID"></a>
# **getUserRolesByExternalID**
> JsonVXStringList getUserRolesByExternalID(userId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long userId = 789L; // Long | 
try {
    JsonVXStringList result = apiInstance.getUserRolesByExternalID(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getUserRolesByExternalID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**|  |

### Return type

[**JsonVXStringList**](JsonVXStringList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserRolesByName"></a>
# **getUserRolesByName**
> JsonVXStringList getUserRolesByName(userName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
String userName = "userName_example"; // String | 
try {
    JsonVXStringList result = apiInstance.getUserRolesByName(userName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getUserRolesByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**|  |

### Return type

[**JsonVXStringList**](JsonVXStringList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUsersLookup"></a>
# **getUsersLookup**
> JsonVXStringList getUsersLookup()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXStringList result = apiInstance.getUsersLookup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getUsersLookup");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXStringList**](JsonVXStringList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXAuditMap"></a>
# **getXAuditMap**
> JsonVXAuditMap getXAuditMap(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    JsonVXAuditMap result = apiInstance.getXAuditMap(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getXAuditMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXAuditMap**](JsonVXAuditMap.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXGroup"></a>
# **getXGroup**
> JsonVXGroup getXGroup(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    JsonVXGroup result = apiInstance.getXGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getXGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXGroup**](JsonVXGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXGroupByGroupName"></a>
# **getXGroupByGroupName**
> JsonVXGroup getXGroupByGroupName(groupName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
String groupName = "groupName_example"; // String | 
try {
    JsonVXGroup result = apiInstance.getXGroupByGroupName(groupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getXGroupByGroupName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  |

### Return type

[**JsonVXGroup**](JsonVXGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXGroupGroup"></a>
# **getXGroupGroup**
> JsonVXGroupGroup getXGroupGroup(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    JsonVXGroupGroup result = apiInstance.getXGroupGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getXGroupGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXGroupGroup**](JsonVXGroupGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXGroupPermission"></a>
# **getXGroupPermission**
> JsonVXGroupPermission getXGroupPermission(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    JsonVXGroupPermission result = apiInstance.getXGroupPermission(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getXGroupPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXGroupPermission**](JsonVXGroupPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXGroupUser"></a>
# **getXGroupUser**
> JsonVXGroupUser getXGroupUser(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    JsonVXGroupUser result = apiInstance.getXGroupUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getXGroupUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXGroupUser**](JsonVXGroupUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXGroupUsers"></a>
# **getXGroupUsers**
> JsonVXUserList getXGroupUsers(groupId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long groupId = 789L; // Long | 
try {
    JsonVXUserList result = apiInstance.getXGroupUsers(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getXGroupUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**|  |

### Return type

[**JsonVXUserList**](JsonVXUserList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXGroupUsersByGroupName"></a>
# **getXGroupUsersByGroupName**
> JsonVXGroupUserInfo getXGroupUsersByGroupName(groupName)

Implements the traditional search functionalities for XGroupUsers by Group name.

Implements the traditional search functionalities for XGroupUsers by Group name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
String groupName = "groupName_example"; // String | 
try {
    JsonVXGroupUserInfo result = apiInstance.getXGroupUsersByGroupName(groupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getXGroupUsersByGroupName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  |

### Return type

[**JsonVXGroupUserInfo**](JsonVXGroupUserInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXModuleDefPermission"></a>
# **getXModuleDefPermission**
> JsonVXModuleDef getXModuleDefPermission(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    JsonVXModuleDef result = apiInstance.getXModuleDefPermission(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getXModuleDefPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXModuleDef**](JsonVXModuleDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXPermMap"></a>
# **getXPermMap**
> JsonVXPermMap getXPermMap(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    JsonVXPermMap result = apiInstance.getXPermMap(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getXPermMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXPermMap**](JsonVXPermMap.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXUser"></a>
# **getXUser**
> JsonVXUser getXUser(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    JsonVXUser result = apiInstance.getXUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getXUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXUser**](JsonVXUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXUserByUserName"></a>
# **getXUserByUserName**
> JsonVXUser getXUserByUserName(userName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
String userName = "userName_example"; // String | 
try {
    JsonVXUser result = apiInstance.getXUserByUserName(userName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getXUserByUserName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**|  |

### Return type

[**JsonVXUser**](JsonVXUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXUserGroups"></a>
# **getXUserGroups**
> JsonVXGroupList getXUserGroups(userId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long userId = 789L; // Long | 
try {
    JsonVXGroupList result = apiInstance.getXUserGroups(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getXUserGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**|  |

### Return type

[**JsonVXGroupList**](JsonVXGroupList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXUserPermission"></a>
# **getXUserPermission**
> JsonVXUserPermission getXUserPermission(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    JsonVXUserPermission result = apiInstance.getXUserPermission(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#getXUserPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXUserPermission**](JsonVXUserPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="modifyGroupsVisibility"></a>
# **modifyGroupsVisibility**
> modifyGroupsVisibility(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Object body = null; // Object | 
try {
    apiInstance.modifyGroupsVisibility(body);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#modifyGroupsVisibility");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="modifyUserActiveStatus"></a>
# **modifyUserActiveStatus**
> modifyUserActiveStatus(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Object body = null; // Object | 
try {
    apiInstance.modifyUserActiveStatus(body);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#modifyUserActiveStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="modifyUserVisibility"></a>
# **modifyUserVisibility**
> modifyUserVisibility(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Object body = null; // Object | 
try {
    apiInstance.modifyUserVisibility(body);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#modifyUserVisibility");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="postUserGroupAuditInfo"></a>
# **postUserGroupAuditInfo**
> JsonVXUgsyncAuditInfo postUserGroupAuditInfo(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXUgsyncAuditInfo body = new JsonVXUgsyncAuditInfo(); // JsonVXUgsyncAuditInfo | 
try {
    JsonVXUgsyncAuditInfo result = apiInstance.postUserGroupAuditInfo(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#postUserGroupAuditInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXUgsyncAuditInfo**](JsonVXUgsyncAuditInfo.md)|  | [optional]

### Return type

[**JsonVXUgsyncAuditInfo**](JsonVXUgsyncAuditInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="searchXAuditMaps"></a>
# **searchXAuditMaps**
> JsonVXAuditMapList searchXAuditMaps()

Implements the traditional search functionalities for XAuditMaps.

Implements the traditional search functionalities for XAuditMaps

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXAuditMapList result = apiInstance.searchXAuditMaps();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#searchXAuditMaps");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXAuditMapList**](JsonVXAuditMapList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchXGroupGroups"></a>
# **searchXGroupGroups**
> JsonVXGroupGroupList searchXGroupGroups()

Implements the traditional search functionalities for XGroupGroups.

Implements the traditional search functionalities for XGroupGroups

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXGroupGroupList result = apiInstance.searchXGroupGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#searchXGroupGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXGroupGroupList**](JsonVXGroupGroupList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchXGroupPermission"></a>
# **searchXGroupPermission**
> JsonVXGroupPermissionList searchXGroupPermission()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXGroupPermissionList result = apiInstance.searchXGroupPermission();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#searchXGroupPermission");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXGroupPermissionList**](JsonVXGroupPermissionList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchXGroupUsers"></a>
# **searchXGroupUsers**
> JsonVXGroupUserList searchXGroupUsers()

Implements the traditional search functionalities for XGroupUsers.

Implements the traditional search functionalities for XGroupUsers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXGroupUserList result = apiInstance.searchXGroupUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#searchXGroupUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXGroupUserList**](JsonVXGroupUserList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchXGroups"></a>
# **searchXGroups**
> JsonVXGroupList searchXGroups()

Implements the traditional search functionalities for XGroups.

Implements the traditional search functionalities for XGroups

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXGroupList result = apiInstance.searchXGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#searchXGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXGroupList**](JsonVXGroupList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchXModuleDef"></a>
# **searchXModuleDef**
> JsonVXModuleDefList searchXModuleDef()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXModuleDefList result = apiInstance.searchXModuleDef();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#searchXModuleDef");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXModuleDefList**](JsonVXModuleDefList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchXPermMaps"></a>
# **searchXPermMaps**
> JsonVXPermMapList searchXPermMaps()

Implements the traditional search functionalities for XPermMaps.

Implements the traditional search functionalities for XPermMaps

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXPermMapList result = apiInstance.searchXPermMaps();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#searchXPermMaps");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXPermMapList**](JsonVXPermMapList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchXUserPermission"></a>
# **searchXUserPermission**
> JsonVXUserPermissionList searchXUserPermission()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXUserPermissionList result = apiInstance.searchXUserPermission();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#searchXUserPermission");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXUserPermissionList**](JsonVXUserPermissionList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchXUsers"></a>
# **searchXUsers**
> JsonVXUserList searchXUsers()

Implements the traditional search functionalities for XUsers.

Implements the traditional search functionalities for XUsers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
try {
    JsonVXUserList result = apiInstance.searchXUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#searchXUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXUserList**](JsonVXUserList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="secureCreateXGroup"></a>
# **secureCreateXGroup**
> JsonVXGroup secureCreateXGroup(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXGroup body = new JsonVXGroup(); // JsonVXGroup | 
try {
    JsonVXGroup result = apiInstance.secureCreateXGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#secureCreateXGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXGroup**](JsonVXGroup.md)|  | [optional]

### Return type

[**JsonVXGroup**](JsonVXGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="secureCreateXUser"></a>
# **secureCreateXUser**
> JsonVXUser secureCreateXUser(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXUser body = new JsonVXUser(); // JsonVXUser | 
try {
    JsonVXUser result = apiInstance.secureCreateXUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#secureCreateXUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXUser**](JsonVXUser.md)|  | [optional]

### Return type

[**JsonVXUser**](JsonVXUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="secureGetXGroup"></a>
# **secureGetXGroup**
> JsonVXGroup secureGetXGroup(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    JsonVXGroup result = apiInstance.secureGetXGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#secureGetXGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXGroup**](JsonVXGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="secureGetXUser"></a>
# **secureGetXUser**
> JsonVXUser secureGetXUser(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long id = 789L; // Long | 
try {
    JsonVXUser result = apiInstance.secureGetXUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#secureGetXUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXUser**](JsonVXUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="secureUpdateXGroup"></a>
# **secureUpdateXGroup**
> JsonVXGroup secureUpdateXGroup(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXGroup body = new JsonVXGroup(); // JsonVXGroup | 
try {
    JsonVXGroup result = apiInstance.secureUpdateXGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#secureUpdateXGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXGroup**](JsonVXGroup.md)|  | [optional]

### Return type

[**JsonVXGroup**](JsonVXGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="secureUpdateXUser"></a>
# **secureUpdateXUser**
> JsonVXUser secureUpdateXUser(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXUser body = new JsonVXUser(); // JsonVXUser | 
try {
    JsonVXUser result = apiInstance.secureUpdateXUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#secureUpdateXUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXUser**](JsonVXUser.md)|  | [optional]

### Return type

[**JsonVXUser**](JsonVXUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="setUserRolesByExternalID"></a>
# **setUserRolesByExternalID**
> JsonVXStringList setUserRolesByExternalID(userId, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
Long userId = 789L; // Long | 
JsonVXStringList body = new JsonVXStringList(); // JsonVXStringList | 
try {
    JsonVXStringList result = apiInstance.setUserRolesByExternalID(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#setUserRolesByExternalID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**|  |
 **body** | [**JsonVXStringList**](JsonVXStringList.md)|  | [optional]

### Return type

[**JsonVXStringList**](JsonVXStringList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="setUserRolesByName"></a>
# **setUserRolesByName**
> JsonVXStringList setUserRolesByName(userName, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
String userName = "userName_example"; // String | 
JsonVXStringList body = new JsonVXStringList(); // JsonVXStringList | 
try {
    JsonVXStringList result = apiInstance.setUserRolesByName(userName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#setUserRolesByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**|  |
 **body** | [**JsonVXStringList**](JsonVXStringList.md)|  | [optional]

### Return type

[**JsonVXStringList**](JsonVXStringList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="setXUserRolesByName"></a>
# **setXUserRolesByName**
> List&lt;String&gt; setXUserRolesByName(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonUsersGroupRoleAssignments body = new JsonUsersGroupRoleAssignments(); // JsonUsersGroupRoleAssignments | 
try {
    List<String> result = apiInstance.setXUserRolesByName(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#setXUserRolesByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonUsersGroupRoleAssignments**](JsonUsersGroupRoleAssignments.md)|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateDeletedGroups"></a>
# **updateDeletedGroups**
> Integer updateDeletedGroups(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | 
try {
    Integer result = apiInstance.updateDeletedGroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#updateDeletedGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **List&lt;String&gt;**|  | [optional]

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateDeletedUsers"></a>
# **updateDeletedUsers**
> Integer updateDeletedUsers(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | 
try {
    Integer result = apiInstance.updateDeletedUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#updateDeletedUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **List&lt;String&gt;**|  | [optional]

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateXAuditMap"></a>
# **updateXAuditMap**
> JsonVXAuditMap updateXAuditMap(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXAuditMap body = new JsonVXAuditMap(); // JsonVXAuditMap | 
try {
    JsonVXAuditMap result = apiInstance.updateXAuditMap(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#updateXAuditMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXAuditMap**](JsonVXAuditMap.md)|  | [optional]

### Return type

[**JsonVXAuditMap**](JsonVXAuditMap.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateXGroup"></a>
# **updateXGroup**
> JsonVXGroup updateXGroup(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXGroup body = new JsonVXGroup(); // JsonVXGroup | 
try {
    JsonVXGroup result = apiInstance.updateXGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#updateXGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXGroup**](JsonVXGroup.md)|  | [optional]

### Return type

[**JsonVXGroup**](JsonVXGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateXGroupGroup"></a>
# **updateXGroupGroup**
> JsonVXGroupGroup updateXGroupGroup(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXGroupGroup body = new JsonVXGroupGroup(); // JsonVXGroupGroup | 
try {
    JsonVXGroupGroup result = apiInstance.updateXGroupGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#updateXGroupGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXGroupGroup**](JsonVXGroupGroup.md)|  | [optional]

### Return type

[**JsonVXGroupGroup**](JsonVXGroupGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateXGroupPermission"></a>
# **updateXGroupPermission**
> JsonVXGroupPermission updateXGroupPermission(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXGroupPermission body = new JsonVXGroupPermission(); // JsonVXGroupPermission | 
try {
    JsonVXGroupPermission result = apiInstance.updateXGroupPermission(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#updateXGroupPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXGroupPermission**](JsonVXGroupPermission.md)|  | [optional]

### Return type

[**JsonVXGroupPermission**](JsonVXGroupPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateXGroupUser"></a>
# **updateXGroupUser**
> JsonVXGroupUser updateXGroupUser(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXGroupUser body = new JsonVXGroupUser(); // JsonVXGroupUser | 
try {
    JsonVXGroupUser result = apiInstance.updateXGroupUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#updateXGroupUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXGroupUser**](JsonVXGroupUser.md)|  | [optional]

### Return type

[**JsonVXGroupUser**](JsonVXGroupUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateXModuleDefPermission"></a>
# **updateXModuleDefPermission**
> JsonVXModuleDef updateXModuleDefPermission(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXModuleDef body = new JsonVXModuleDef(); // JsonVXModuleDef | 
try {
    JsonVXModuleDef result = apiInstance.updateXModuleDefPermission(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#updateXModuleDefPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXModuleDef**](JsonVXModuleDef.md)|  | [optional]

### Return type

[**JsonVXModuleDef**](JsonVXModuleDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateXPermMap"></a>
# **updateXPermMap**
> JsonVXPermMap updateXPermMap(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXPermMap body = new JsonVXPermMap(); // JsonVXPermMap | 
try {
    JsonVXPermMap result = apiInstance.updateXPermMap(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#updateXPermMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXPermMap**](JsonVXPermMap.md)|  | [optional]

### Return type

[**JsonVXPermMap**](JsonVXPermMap.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateXUser"></a>
# **updateXUser**
> JsonVXUser updateXUser(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXUser body = new JsonVXUser(); // JsonVXUser | 
try {
    JsonVXUser result = apiInstance.updateXUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#updateXUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXUser**](JsonVXUser.md)|  | [optional]

### Return type

[**JsonVXUser**](JsonVXUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateXUserPermission"></a>
# **updateXUserPermission**
> JsonVXUserPermission updateXUserPermission(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XUserRestApi;


XUserRestApi apiInstance = new XUserRestApi();
JsonVXUserPermission body = new JsonVXUserPermission(); // JsonVXUserPermission | 
try {
    JsonVXUserPermission result = apiInstance.updateXUserPermission(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XUserRestApi#updateXUserPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXUserPermission**](JsonVXUserPermission.md)|  | [optional]

### Return type

[**JsonVXUserPermission**](JsonVXUserPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

