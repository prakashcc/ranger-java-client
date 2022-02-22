# UserRestApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeEmailAddress**](UserRestApi.md#changeEmailAddress) | **POST** /users/{userId}/emailchange | 
[**changePassword**](UserRestApi.md#changePassword) | **POST** /users/{userId}/passwordchange | 
[**create**](UserRestApi.md#create) | **POST** /users | 
[**createDefaultAccountUser**](UserRestApi.md#createDefaultAccountUser) | **POST** /users/default | 
[**deactivateUser**](UserRestApi.md#deactivateUser) | **POST** /users/{userId}/deactivate | Deactivate the user.
[**getUserProfile**](UserRestApi.md#getUserProfile) | **GET** /users/profile | This method returns the VUserProfile for the current session.
[**getUserProfileForUser**](UserRestApi.md#getUserProfileForUser) | **GET** /users/{userId} | Return the VUserProfile for the given userId.
[**searchUsers**](UserRestApi.md#searchUsers) | **GET** /users | Implements the traditional search functionalities for UserProfile.
[**setUserRoles**](UserRestApi.md#setUserRoles) | **PUT** /users/{userId}/roles | 
[**suggestUserFirstName**](UserRestApi.md#suggestUserFirstName) | **GET** /users/firstnames | 
[**update**](UserRestApi.md#update) | **PUT** /users | 


<a name="changeEmailAddress"></a>
# **changeEmailAddress**
> JsonVXPortalUser changeEmailAddress(userId, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserRestApi;


UserRestApi apiInstance = new UserRestApi();
Long userId = 789L; // Long | 
JsonVXPasswordChange body = new JsonVXPasswordChange(); // JsonVXPasswordChange | 
try {
    JsonVXPortalUser result = apiInstance.changeEmailAddress(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRestApi#changeEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**|  |
 **body** | [**JsonVXPasswordChange**](JsonVXPasswordChange.md)|  | [optional]

### Return type

[**JsonVXPortalUser**](JsonVXPortalUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="changePassword"></a>
# **changePassword**
> JsonVXResponse changePassword(userId, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserRestApi;


UserRestApi apiInstance = new UserRestApi();
Long userId = 789L; // Long | 
JsonVXPasswordChange body = new JsonVXPasswordChange(); // JsonVXPasswordChange | 
try {
    JsonVXResponse result = apiInstance.changePassword(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRestApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**|  |
 **body** | [**JsonVXPasswordChange**](JsonVXPasswordChange.md)|  | [optional]

### Return type

[**JsonVXResponse**](JsonVXResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="create"></a>
# **create**
> JsonVXPortalUser create(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserRestApi;


UserRestApi apiInstance = new UserRestApi();
JsonVXPortalUser body = new JsonVXPortalUser(); // JsonVXPortalUser | 
try {
    JsonVXPortalUser result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRestApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXPortalUser**](JsonVXPortalUser.md)|  | [optional]

### Return type

[**JsonVXPortalUser**](JsonVXPortalUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createDefaultAccountUser"></a>
# **createDefaultAccountUser**
> JsonVXPortalUser createDefaultAccountUser(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserRestApi;


UserRestApi apiInstance = new UserRestApi();
JsonVXPortalUser body = new JsonVXPortalUser(); // JsonVXPortalUser | 
try {
    JsonVXPortalUser result = apiInstance.createDefaultAccountUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRestApi#createDefaultAccountUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXPortalUser**](JsonVXPortalUser.md)|  | [optional]

### Return type

[**JsonVXPortalUser**](JsonVXPortalUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deactivateUser"></a>
# **deactivateUser**
> JsonVXPortalUser deactivateUser(userId)

Deactivate the user.

Deactivate the user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserRestApi;


UserRestApi apiInstance = new UserRestApi();
Long userId = 789L; // Long | 
try {
    JsonVXPortalUser result = apiInstance.deactivateUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRestApi#deactivateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**|  |

### Return type

[**JsonVXPortalUser**](JsonVXPortalUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserProfile"></a>
# **getUserProfile**
> JsonVXPortalUser getUserProfile()

This method returns the VUserProfile for the current session.

This method returns the VUserProfile for the current session

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserRestApi;


UserRestApi apiInstance = new UserRestApi();
try {
    JsonVXPortalUser result = apiInstance.getUserProfile();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRestApi#getUserProfile");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXPortalUser**](JsonVXPortalUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserProfileForUser"></a>
# **getUserProfileForUser**
> JsonVXPortalUser getUserProfileForUser(userId)

Return the VUserProfile for the given userId.

Return the VUserProfile for the given userId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserRestApi;


UserRestApi apiInstance = new UserRestApi();
Long userId = 789L; // Long | 
try {
    JsonVXPortalUser result = apiInstance.getUserProfileForUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRestApi#getUserProfileForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**|  |

### Return type

[**JsonVXPortalUser**](JsonVXPortalUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchUsers"></a>
# **searchUsers**
> JsonVXPortalUserList searchUsers()

Implements the traditional search functionalities for UserProfile.

Implements the traditional search functionalities for UserProfile

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserRestApi;


UserRestApi apiInstance = new UserRestApi();
try {
    JsonVXPortalUserList result = apiInstance.searchUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRestApi#searchUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXPortalUserList**](JsonVXPortalUserList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="setUserRoles"></a>
# **setUserRoles**
> JsonVXResponse setUserRoles(userId, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserRestApi;


UserRestApi apiInstance = new UserRestApi();
Long userId = 789L; // Long | 
JsonVXStringList body = new JsonVXStringList(); // JsonVXStringList | 
try {
    JsonVXResponse result = apiInstance.setUserRoles(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRestApi#setUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**|  |
 **body** | [**JsonVXStringList**](JsonVXStringList.md)|  | [optional]

### Return type

[**JsonVXResponse**](JsonVXResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="suggestUserFirstName"></a>
# **suggestUserFirstName**
> String suggestUserFirstName(letters)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserRestApi;


UserRestApi apiInstance = new UserRestApi();
String letters = "letters_example"; // String | 
try {
    String result = apiInstance.suggestUserFirstName(letters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRestApi#suggestUserFirstName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **letters** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="update"></a>
# **update**
> JsonVXPortalUser update(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserRestApi;


UserRestApi apiInstance = new UserRestApi();
JsonVXPortalUser body = new JsonVXPortalUser(); // JsonVXPortalUser | 
try {
    JsonVXPortalUser result = apiInstance.update(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRestApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXPortalUser**](JsonVXPortalUser.md)|  | [optional]

### Return type

[**JsonVXPortalUser**](JsonVXPortalUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

