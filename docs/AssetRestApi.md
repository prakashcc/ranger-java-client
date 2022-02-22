# AssetRestApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configTest**](AssetRestApi.md#configTest) | **POST** /assets/assets/testConfig | 
[**countXAssets**](AssetRestApi.md#countXAssets) | **GET** /assets/assets/count | 
[**countXCredentialStores**](AssetRestApi.md#countXCredentialStores) | **GET** /assets/credstores/count | 
[**countXResources**](AssetRestApi.md#countXResources) | **GET** /assets/resources/count | 
[**createXAsset**](AssetRestApi.md#createXAsset) | **POST** /assets/assets | 
[**createXCredentialStore**](AssetRestApi.md#createXCredentialStore) | **POST** /assets/credstores | 
[**createXResource**](AssetRestApi.md#createXResource) | **POST** /assets/resources | 
[**deleteXAsset**](AssetRestApi.md#deleteXAsset) | **DELETE** /assets/assets/{id} | 
[**deleteXCredentialStore**](AssetRestApi.md#deleteXCredentialStore) | **DELETE** /assets/credstores/{id} | 
[**deleteXResource**](AssetRestApi.md#deleteXResource) | **DELETE** /assets/resources/{id} | 
[**getAccessLogs**](AssetRestApi.md#getAccessLogs) | **GET** /assets/accessAudit | 
[**getReportLogs**](AssetRestApi.md#getReportLogs) | **GET** /assets/report | 
[**getResourceJSON**](AssetRestApi.md#getResourceJSON) | **GET** /assets/policyList/{repository} | 
[**getTransactionReport**](AssetRestApi.md#getTransactionReport) | **GET** /assets/report/{transactionId} | 
[**getUgsyncAudits**](AssetRestApi.md#getUgsyncAudits) | **GET** /assets/ugsyncAudits | 
[**getUgsyncAuditsBySyncSource**](AssetRestApi.md#getUgsyncAuditsBySyncSource) | **GET** /assets/ugsyncAudits/{syncSource} | 
[**getXAsset**](AssetRestApi.md#getXAsset) | **GET** /assets/assets/{id} | 
[**getXCredentialStore**](AssetRestApi.md#getXCredentialStore) | **GET** /assets/credstores/{id} | 
[**getXResource**](AssetRestApi.md#getXResource) | **GET** /assets/resources/{id} | 
[**getXResourceFile**](AssetRestApi.md#getXResourceFile) | **GET** /assets/resource/{id} | 
[**grantPermission**](AssetRestApi.md#grantPermission) | **POST** /assets/resources/grant | 
[**revokePermission**](AssetRestApi.md#revokePermission) | **POST** /assets/resources/revoke | 
[**searchXAssets**](AssetRestApi.md#searchXAssets) | **GET** /assets/assets | 
[**searchXCredentialStores**](AssetRestApi.md#searchXCredentialStores) | **GET** /assets/credstores | 
[**searchXPolicyExportAudits**](AssetRestApi.md#searchXPolicyExportAudits) | **GET** /assets/exportAudit | 
[**searchXResources**](AssetRestApi.md#searchXResources) | **GET** /assets/resources | 
[**updateXAsset**](AssetRestApi.md#updateXAsset) | **PUT** /assets/assets/{id} | 
[**updateXCredentialStore**](AssetRestApi.md#updateXCredentialStore) | **PUT** /assets/credstores | 
[**updateXResource**](AssetRestApi.md#updateXResource) | **PUT** /assets/resources/{id} | 


<a name="configTest"></a>
# **configTest**
> JsonVXResponse configTest(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
JsonVXAsset body = new JsonVXAsset(); // JsonVXAsset | 
try {
    JsonVXResponse result = apiInstance.configTest(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#configTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXAsset**](JsonVXAsset.md)|  | [optional]

### Return type

[**JsonVXResponse**](JsonVXResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="countXAssets"></a>
# **countXAssets**
> JsonVXLong countXAssets()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
try {
    JsonVXLong result = apiInstance.countXAssets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#countXAssets");
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

<a name="countXCredentialStores"></a>
# **countXCredentialStores**
> JsonVXLong countXCredentialStores()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
try {
    JsonVXLong result = apiInstance.countXCredentialStores();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#countXCredentialStores");
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

<a name="countXResources"></a>
# **countXResources**
> JsonVXLong countXResources()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
try {
    JsonVXLong result = apiInstance.countXResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#countXResources");
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

<a name="createXAsset"></a>
# **createXAsset**
> JsonVXAsset createXAsset(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
JsonVXAsset body = new JsonVXAsset(); // JsonVXAsset | 
try {
    JsonVXAsset result = apiInstance.createXAsset(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#createXAsset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXAsset**](JsonVXAsset.md)|  | [optional]

### Return type

[**JsonVXAsset**](JsonVXAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createXCredentialStore"></a>
# **createXCredentialStore**
> JsonVXCredentialStore createXCredentialStore(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
JsonVXCredentialStore body = new JsonVXCredentialStore(); // JsonVXCredentialStore | 
try {
    JsonVXCredentialStore result = apiInstance.createXCredentialStore(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#createXCredentialStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXCredentialStore**](JsonVXCredentialStore.md)|  | [optional]

### Return type

[**JsonVXCredentialStore**](JsonVXCredentialStore.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createXResource"></a>
# **createXResource**
> JsonVXResource createXResource(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
JsonVXResource body = new JsonVXResource(); // JsonVXResource | 
try {
    JsonVXResource result = apiInstance.createXResource(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#createXResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXResource**](JsonVXResource.md)|  | [optional]

### Return type

[**JsonVXResource**](JsonVXResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deleteXAsset"></a>
# **deleteXAsset**
> deleteXAsset(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteXAsset(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#deleteXAsset");
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

<a name="deleteXCredentialStore"></a>
# **deleteXCredentialStore**
> deleteXCredentialStore(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteXCredentialStore(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#deleteXCredentialStore");
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

<a name="deleteXResource"></a>
# **deleteXResource**
> deleteXResource(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteXResource(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#deleteXResource");
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

<a name="getAccessLogs"></a>
# **getAccessLogs**
> JsonVXAccessAuditList getAccessLogs()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
try {
    JsonVXAccessAuditList result = apiInstance.getAccessLogs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#getAccessLogs");
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

<a name="getReportLogs"></a>
# **getReportLogs**
> JsonVXTrxLogList getReportLogs()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
try {
    JsonVXTrxLogList result = apiInstance.getReportLogs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#getReportLogs");
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

<a name="getResourceJSON"></a>
# **getResourceJSON**
> String getResourceJSON(repository)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
String repository = "repository_example"; // String | 
try {
    String result = apiInstance.getResourceJSON(repository);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#getResourceJSON");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getTransactionReport"></a>
# **getTransactionReport**
> JsonVXTrxLogList getTransactionReport(transactionId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
String transactionId = "transactionId_example"; // String | 
try {
    JsonVXTrxLogList result = apiInstance.getTransactionReport(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#getTransactionReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**|  |

### Return type

[**JsonVXTrxLogList**](JsonVXTrxLogList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUgsyncAudits"></a>
# **getUgsyncAudits**
> JsonVXUgsyncAuditInfoList getUgsyncAudits()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
try {
    JsonVXUgsyncAuditInfoList result = apiInstance.getUgsyncAudits();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#getUgsyncAudits");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXUgsyncAuditInfoList**](JsonVXUgsyncAuditInfoList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUgsyncAuditsBySyncSource"></a>
# **getUgsyncAuditsBySyncSource**
> JsonVXUgsyncAuditInfoList getUgsyncAuditsBySyncSource(syncSource)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
String syncSource = "syncSource_example"; // String | 
try {
    JsonVXUgsyncAuditInfoList result = apiInstance.getUgsyncAuditsBySyncSource(syncSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#getUgsyncAuditsBySyncSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncSource** | **String**|  |

### Return type

[**JsonVXUgsyncAuditInfoList**](JsonVXUgsyncAuditInfoList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXAsset"></a>
# **getXAsset**
> JsonVXAsset getXAsset(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
Long id = 789L; // Long | 
try {
    JsonVXAsset result = apiInstance.getXAsset(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#getXAsset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXAsset**](JsonVXAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXCredentialStore"></a>
# **getXCredentialStore**
> JsonVXCredentialStore getXCredentialStore(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
Long id = 789L; // Long | 
try {
    JsonVXCredentialStore result = apiInstance.getXCredentialStore(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#getXCredentialStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXCredentialStore**](JsonVXCredentialStore.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXResource"></a>
# **getXResource**
> JsonVXResource getXResource(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
Long id = 789L; // Long | 
try {
    JsonVXResource result = apiInstance.getXResource(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#getXResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonVXResource**](JsonVXResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getXResourceFile"></a>
# **getXResourceFile**
> File getXResourceFile(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
Long id = 789L; // Long | 
try {
    File result = apiInstance.getXResourceFile(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#getXResourceFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="grantPermission"></a>
# **grantPermission**
> JsonVXPolicy grantPermission(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
JsonVXPolicy body = new JsonVXPolicy(); // JsonVXPolicy | 
try {
    JsonVXPolicy result = apiInstance.grantPermission(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#grantPermission");
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

<a name="revokePermission"></a>
# **revokePermission**
> JsonVXPolicy revokePermission(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
JsonVXPolicy body = new JsonVXPolicy(); // JsonVXPolicy | 
try {
    JsonVXPolicy result = apiInstance.revokePermission(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#revokePermission");
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

<a name="searchXAssets"></a>
# **searchXAssets**
> JsonVXAssetList searchXAssets()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
try {
    JsonVXAssetList result = apiInstance.searchXAssets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#searchXAssets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXAssetList**](JsonVXAssetList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchXCredentialStores"></a>
# **searchXCredentialStores**
> JsonVXCredentialStoreList searchXCredentialStores()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
try {
    JsonVXCredentialStoreList result = apiInstance.searchXCredentialStores();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#searchXCredentialStores");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXCredentialStoreList**](JsonVXCredentialStoreList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchXPolicyExportAudits"></a>
# **searchXPolicyExportAudits**
> JsonVXPolicyExportAuditList searchXPolicyExportAudits()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
try {
    JsonVXPolicyExportAuditList result = apiInstance.searchXPolicyExportAudits();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#searchXPolicyExportAudits");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXPolicyExportAuditList**](JsonVXPolicyExportAuditList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchXResources"></a>
# **searchXResources**
> JsonVXResourceList searchXResources()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
try {
    JsonVXResourceList result = apiInstance.searchXResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#searchXResources");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonVXResourceList**](JsonVXResourceList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateXAsset"></a>
# **updateXAsset**
> JsonVXAsset updateXAsset(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
JsonVXAsset body = new JsonVXAsset(); // JsonVXAsset | 
try {
    JsonVXAsset result = apiInstance.updateXAsset(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#updateXAsset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXAsset**](JsonVXAsset.md)|  | [optional]

### Return type

[**JsonVXAsset**](JsonVXAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateXCredentialStore"></a>
# **updateXCredentialStore**
> JsonVXCredentialStore updateXCredentialStore(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
JsonVXCredentialStore body = new JsonVXCredentialStore(); // JsonVXCredentialStore | 
try {
    JsonVXCredentialStore result = apiInstance.updateXCredentialStore(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#updateXCredentialStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXCredentialStore**](JsonVXCredentialStore.md)|  | [optional]

### Return type

[**JsonVXCredentialStore**](JsonVXCredentialStore.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateXResource"></a>
# **updateXResource**
> JsonVXResource updateXResource(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetRestApi;


AssetRestApi apiInstance = new AssetRestApi();
JsonVXResource body = new JsonVXResource(); // JsonVXResource | 
try {
    JsonVXResource result = apiInstance.updateXResource(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetRestApi#updateXResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonVXResource**](JsonVXResource.md)|  | [optional]

### Return type

[**JsonVXResource**](JsonVXResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

