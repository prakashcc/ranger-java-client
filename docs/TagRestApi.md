# TagRestApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceResource**](TagRestApi.md#createServiceResource) | **POST** /tags/resources | 
[**createTag**](TagRestApi.md#createTag) | **POST** /tags/tags | 
[**createTagDef**](TagRestApi.md#createTagDef) | **POST** /tags/tagdefs | 
[**createTagResourceMap**](TagRestApi.md#createTagResourceMap) | **POST** /tags/tagresourcemaps | 
[**deleteServiceResource**](TagRestApi.md#deleteServiceResource) | **DELETE** /tags/resource/{id} | 
[**deleteServiceResourceByGuid**](TagRestApi.md#deleteServiceResourceByGuid) | **DELETE** /tags/resource/guid/{guid} | 
[**deleteTag**](TagRestApi.md#deleteTag) | **DELETE** /tags/tag/{id} | 
[**deleteTagByGuid**](TagRestApi.md#deleteTagByGuid) | **DELETE** /tags/tag/guid/{guid} | 
[**deleteTagDef**](TagRestApi.md#deleteTagDef) | **DELETE** /tags/tagdef/{id} | 
[**deleteTagDefByGuid**](TagRestApi.md#deleteTagDefByGuid) | **DELETE** /tags/tagdef/guid/{guid} | 
[**deleteTagDeltas2**](TagRestApi.md#deleteTagDeltas2) | **DELETE** /tags/server/tagdeltas | 
[**deleteTagResourceMap**](TagRestApi.md#deleteTagResourceMap) | **DELETE** /tags/tagresourcemap/{id} | 
[**deleteTagResourceMapByGuid**](TagRestApi.md#deleteTagResourceMapByGuid) | **DELETE** /tags/tagresourcemap/guid/{guid} | 
[**deleteTagResourceMap_0**](TagRestApi.md#deleteTagResourceMap_0) | **DELETE** /tags/tagresourcemaps | 
[**getAllServiceResources**](TagRestApi.md#getAllServiceResources) | **GET** /tags/resources | 
[**getAllTagDefs**](TagRestApi.md#getAllTagDefs) | **GET** /tags/tagdefs | 
[**getAllTagResourceMaps**](TagRestApi.md#getAllTagResourceMaps) | **GET** /tags/tagresourcemaps | 
[**getAllTags**](TagRestApi.md#getAllTags) | **GET** /tags/tags | 
[**getSecureServiceTagsIfUpdated**](TagRestApi.md#getSecureServiceTagsIfUpdated) | **GET** /tags/secure/download/{serviceName} | 
[**getServiceResource**](TagRestApi.md#getServiceResource) | **GET** /tags/resource/{id} | 
[**getServiceResourceByGuid**](TagRestApi.md#getServiceResourceByGuid) | **GET** /tags/resource/guid/{guid} | 
[**getServiceResourceByServiceAndResourceSignature**](TagRestApi.md#getServiceResourceByServiceAndResourceSignature) | **GET** /tags/resource/service/{serviceName}/signature/{resourceSignature} | 
[**getServiceResourcesByService**](TagRestApi.md#getServiceResourcesByService) | **GET** /tags/resources/service/{serviceName} | 
[**getServiceTagsIfUpdated**](TagRestApi.md#getServiceTagsIfUpdated) | **GET** /tags/download/{serviceName} | 
[**getTag**](TagRestApi.md#getTag) | **GET** /tags/tag/{id} | 
[**getTagByGuid**](TagRestApi.md#getTagByGuid) | **GET** /tags/tag/guid/{guid} | 
[**getTagDef**](TagRestApi.md#getTagDef) | **GET** /tags/tagdef/{id} | 
[**getTagDefByGuid**](TagRestApi.md#getTagDefByGuid) | **GET** /tags/tagdef/guid/{guid} | 
[**getTagDefByName**](TagRestApi.md#getTagDefByName) | **GET** /tags/tagdef/name/{name} | 
[**getTagResourceMap**](TagRestApi.md#getTagResourceMap) | **GET** /tags/tagresourcemap/tag-resource-guid | 
[**getTagResourceMapByGuid**](TagRestApi.md#getTagResourceMapByGuid) | **GET** /tags/tagresourcemap/guid/{guid} | 
[**getTagResourceMap_0**](TagRestApi.md#getTagResourceMap_0) | **GET** /tags/tagresourcemap/{id} | 
[**getTagTypes**](TagRestApi.md#getTagTypes) | **GET** /tags/types | 
[**getTagsByType**](TagRestApi.md#getTagsByType) | **GET** /tags/tags/type/{type} | 
[**importServiceTags**](TagRestApi.md#importServiceTags) | **PUT** /tags/importservicetags | 
[**updateServiceResource**](TagRestApi.md#updateServiceResource) | **PUT** /tags/resource/{id} | 
[**updateServiceResourceByGuid**](TagRestApi.md#updateServiceResourceByGuid) | **PUT** /tags/resource/guid/{guid} | 
[**updateTag**](TagRestApi.md#updateTag) | **PUT** /tags/tag/{id} | 
[**updateTagByGuid**](TagRestApi.md#updateTagByGuid) | **PUT** /tags/tag/guid/{guid} | 
[**updateTagDef**](TagRestApi.md#updateTagDef) | **PUT** /tags/tagdef/{id} | 


<a name="createServiceResource"></a>
# **createServiceResource**
> JsonRangerServiceResource createServiceResource(updateIfExists, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Boolean updateIfExists = true; // Boolean | 
JsonRangerServiceResource body = new JsonRangerServiceResource(); // JsonRangerServiceResource | 
try {
    JsonRangerServiceResource result = apiInstance.createServiceResource(updateIfExists, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#createServiceResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateIfExists** | **Boolean**|  | [optional] [default to true]
 **body** | [**JsonRangerServiceResource**](JsonRangerServiceResource.md)|  | [optional]

### Return type

[**JsonRangerServiceResource**](JsonRangerServiceResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createTag"></a>
# **createTag**
> JsonRangerTag createTag(updateIfExists, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Boolean updateIfExists = true; // Boolean | 
JsonRangerTag body = new JsonRangerTag(); // JsonRangerTag | 
try {
    JsonRangerTag result = apiInstance.createTag(updateIfExists, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#createTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateIfExists** | **Boolean**|  | [optional] [default to true]
 **body** | [**JsonRangerTag**](JsonRangerTag.md)|  | [optional]

### Return type

[**JsonRangerTag**](JsonRangerTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createTagDef"></a>
# **createTagDef**
> JsonRangerTagDef createTagDef(updateIfExists, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Boolean updateIfExists = true; // Boolean | 
JsonRangerTagDef body = new JsonRangerTagDef(); // JsonRangerTagDef | 
try {
    JsonRangerTagDef result = apiInstance.createTagDef(updateIfExists, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#createTagDef");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateIfExists** | **Boolean**|  | [optional] [default to true]
 **body** | [**JsonRangerTagDef**](JsonRangerTagDef.md)|  | [optional]

### Return type

[**JsonRangerTagDef**](JsonRangerTagDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createTagResourceMap"></a>
# **createTagResourceMap**
> JsonRangerTagResourceMap createTagResourceMap(lenient, resourceGuid, tagGuid)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Boolean lenient = false; // Boolean | 
String resourceGuid = "resourceGuid_example"; // String | 
String tagGuid = "tagGuid_example"; // String | 
try {
    JsonRangerTagResourceMap result = apiInstance.createTagResourceMap(lenient, resourceGuid, tagGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#createTagResourceMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lenient** | **Boolean**|  | [optional] [default to false]
 **resourceGuid** | **String**|  | [optional]
 **tagGuid** | **String**|  | [optional]

### Return type

[**JsonRangerTagResourceMap**](JsonRangerTagResourceMap.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteServiceResource"></a>
# **deleteServiceResource**
> deleteServiceResource(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteServiceResource(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#deleteServiceResource");
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

<a name="deleteServiceResourceByGuid"></a>
# **deleteServiceResourceByGuid**
> deleteServiceResourceByGuid(guid, deleteReferences)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String guid = "guid_example"; // String | 
Boolean deleteReferences = false; // Boolean | 
try {
    apiInstance.deleteServiceResourceByGuid(guid, deleteReferences);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#deleteServiceResourceByGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**|  |
 **deleteReferences** | **Boolean**|  | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteTag"></a>
# **deleteTag**
> deleteTag(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteTag(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#deleteTag");
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

<a name="deleteTagByGuid"></a>
# **deleteTagByGuid**
> deleteTagByGuid(guid)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String guid = "guid_example"; // String | 
try {
    apiInstance.deleteTagByGuid(guid);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#deleteTagByGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteTagDef"></a>
# **deleteTagDef**
> deleteTagDef(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteTagDef(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#deleteTagDef");
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

<a name="deleteTagDefByGuid"></a>
# **deleteTagDefByGuid**
> deleteTagDefByGuid(guid)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String guid = "guid_example"; // String | 
try {
    apiInstance.deleteTagDefByGuid(guid);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#deleteTagDefByGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteTagDeltas2"></a>
# **deleteTagDeltas2**
> deleteTagDeltas2(days)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Integer days = 3; // Integer | 
try {
    apiInstance.deleteTagDeltas2(days);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#deleteTagDeltas2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **days** | **Integer**|  | [optional] [default to 3]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteTagResourceMap"></a>
# **deleteTagResourceMap**
> deleteTagResourceMap(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteTagResourceMap(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#deleteTagResourceMap");
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

<a name="deleteTagResourceMapByGuid"></a>
# **deleteTagResourceMapByGuid**
> deleteTagResourceMapByGuid(guid)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String guid = "guid_example"; // String | 
try {
    apiInstance.deleteTagResourceMapByGuid(guid);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#deleteTagResourceMapByGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteTagResourceMap_0"></a>
# **deleteTagResourceMap_0**
> deleteTagResourceMap_0(resourceGuid, tagGuid)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String resourceGuid = "resourceGuid_example"; // String | 
String tagGuid = "tagGuid_example"; // String | 
try {
    apiInstance.deleteTagResourceMap_0(resourceGuid, tagGuid);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#deleteTagResourceMap_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceGuid** | **String**|  | [optional]
 **tagGuid** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllServiceResources"></a>
# **getAllServiceResources**
> List&lt;JsonRangerServiceResource&gt; getAllServiceResources()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
try {
    List<JsonRangerServiceResource> result = apiInstance.getAllServiceResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getAllServiceResources");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;JsonRangerServiceResource&gt;**](JsonRangerServiceResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAllTagDefs"></a>
# **getAllTagDefs**
> List&lt;JsonRangerTagDef&gt; getAllTagDefs()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
try {
    List<JsonRangerTagDef> result = apiInstance.getAllTagDefs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getAllTagDefs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;JsonRangerTagDef&gt;**](JsonRangerTagDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAllTagResourceMaps"></a>
# **getAllTagResourceMaps**
> List&lt;JsonRangerTagResourceMap&gt; getAllTagResourceMaps()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
try {
    List<JsonRangerTagResourceMap> result = apiInstance.getAllTagResourceMaps();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getAllTagResourceMaps");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;JsonRangerTagResourceMap&gt;**](JsonRangerTagResourceMap.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAllTags"></a>
# **getAllTags**
> List&lt;JsonRangerTag&gt; getAllTags()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
try {
    List<JsonRangerTag> result = apiInstance.getAllTags();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getAllTags");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;JsonRangerTag&gt;**](JsonRangerTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getSecureServiceTagsIfUpdated"></a>
# **getSecureServiceTagsIfUpdated**
> JsonServiceTags getSecureServiceTagsIfUpdated(serviceName, lastActivationTime, lastKnownVersion, pluginCapabilities, pluginId, supportsTagDeltas)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String serviceName = "serviceName_example"; // String | 
Long lastActivationTime = 0L; // Long | 
Long lastKnownVersion = 789L; // Long | 
String pluginCapabilities = ""; // String | 
String pluginId = "pluginId_example"; // String | 
Boolean supportsTagDeltas = false; // Boolean | 
try {
    JsonServiceTags result = apiInstance.getSecureServiceTagsIfUpdated(serviceName, lastActivationTime, lastKnownVersion, pluginCapabilities, pluginId, supportsTagDeltas);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getSecureServiceTagsIfUpdated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |
 **lastActivationTime** | **Long**|  | [optional] [default to 0]
 **lastKnownVersion** | **Long**|  | [optional]
 **pluginCapabilities** | **String**|  | [optional] [default to ]
 **pluginId** | **String**|  | [optional]
 **supportsTagDeltas** | **Boolean**|  | [optional] [default to false]

### Return type

[**JsonServiceTags**](JsonServiceTags.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getServiceResource"></a>
# **getServiceResource**
> JsonRangerServiceResource getServiceResource(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Long id = 789L; // Long | 
try {
    JsonRangerServiceResource result = apiInstance.getServiceResource(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getServiceResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonRangerServiceResource**](JsonRangerServiceResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getServiceResourceByGuid"></a>
# **getServiceResourceByGuid**
> JsonRangerServiceResource getServiceResourceByGuid(guid)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String guid = "guid_example"; // String | 
try {
    JsonRangerServiceResource result = apiInstance.getServiceResourceByGuid(guid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getServiceResourceByGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**|  |

### Return type

[**JsonRangerServiceResource**](JsonRangerServiceResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getServiceResourceByServiceAndResourceSignature"></a>
# **getServiceResourceByServiceAndResourceSignature**
> JsonRangerServiceResource getServiceResourceByServiceAndResourceSignature(resourceSignature, serviceName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String resourceSignature = "resourceSignature_example"; // String | 
String serviceName = "serviceName_example"; // String | 
try {
    JsonRangerServiceResource result = apiInstance.getServiceResourceByServiceAndResourceSignature(resourceSignature, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getServiceResourceByServiceAndResourceSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceSignature** | **String**|  |
 **serviceName** | **String**|  |

### Return type

[**JsonRangerServiceResource**](JsonRangerServiceResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getServiceResourcesByService"></a>
# **getServiceResourcesByService**
> List&lt;JsonRangerServiceResource&gt; getServiceResourcesByService(serviceName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String serviceName = "serviceName_example"; // String | 
try {
    List<JsonRangerServiceResource> result = apiInstance.getServiceResourcesByService(serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getServiceResourcesByService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |

### Return type

[**List&lt;JsonRangerServiceResource&gt;**](JsonRangerServiceResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getServiceTagsIfUpdated"></a>
# **getServiceTagsIfUpdated**
> JsonServiceTags getServiceTagsIfUpdated(serviceName, lastActivationTime, lastKnownVersion, pluginCapabilities, pluginId, supportsTagDeltas)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String serviceName = "serviceName_example"; // String | 
Long lastActivationTime = 0L; // Long | 
Long lastKnownVersion = 789L; // Long | 
String pluginCapabilities = ""; // String | 
String pluginId = "pluginId_example"; // String | 
Boolean supportsTagDeltas = false; // Boolean | 
try {
    JsonServiceTags result = apiInstance.getServiceTagsIfUpdated(serviceName, lastActivationTime, lastKnownVersion, pluginCapabilities, pluginId, supportsTagDeltas);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getServiceTagsIfUpdated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**|  |
 **lastActivationTime** | **Long**|  | [optional] [default to 0]
 **lastKnownVersion** | **Long**|  | [optional]
 **pluginCapabilities** | **String**|  | [optional] [default to ]
 **pluginId** | **String**|  | [optional]
 **supportsTagDeltas** | **Boolean**|  | [optional] [default to false]

### Return type

[**JsonServiceTags**](JsonServiceTags.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getTag"></a>
# **getTag**
> JsonRangerTag getTag(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Long id = 789L; // Long | 
try {
    JsonRangerTag result = apiInstance.getTag(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonRangerTag**](JsonRangerTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getTagByGuid"></a>
# **getTagByGuid**
> JsonRangerTag getTagByGuid(guid)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String guid = "guid_example"; // String | 
try {
    JsonRangerTag result = apiInstance.getTagByGuid(guid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getTagByGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**|  |

### Return type

[**JsonRangerTag**](JsonRangerTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getTagDef"></a>
# **getTagDef**
> JsonRangerTagDef getTagDef(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Long id = 789L; // Long | 
try {
    JsonRangerTagDef result = apiInstance.getTagDef(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getTagDef");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonRangerTagDef**](JsonRangerTagDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getTagDefByGuid"></a>
# **getTagDefByGuid**
> JsonRangerTagDef getTagDefByGuid(guid)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String guid = "guid_example"; // String | 
try {
    JsonRangerTagDef result = apiInstance.getTagDefByGuid(guid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getTagDefByGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**|  |

### Return type

[**JsonRangerTagDef**](JsonRangerTagDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getTagDefByName"></a>
# **getTagDefByName**
> JsonRangerTagDef getTagDefByName(name)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String name = "name_example"; // String | 
try {
    JsonRangerTagDef result = apiInstance.getTagDefByName(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getTagDefByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**JsonRangerTagDef**](JsonRangerTagDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getTagResourceMap"></a>
# **getTagResourceMap**
> JsonRangerTagResourceMap getTagResourceMap(resourceGuid, tagGuid)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String resourceGuid = "resourceGuid_example"; // String | 
String tagGuid = "tagGuid_example"; // String | 
try {
    JsonRangerTagResourceMap result = apiInstance.getTagResourceMap(resourceGuid, tagGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getTagResourceMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceGuid** | **String**|  | [optional]
 **tagGuid** | **String**|  | [optional]

### Return type

[**JsonRangerTagResourceMap**](JsonRangerTagResourceMap.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getTagResourceMapByGuid"></a>
# **getTagResourceMapByGuid**
> JsonRangerTagResourceMap getTagResourceMapByGuid(guid)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String guid = "guid_example"; // String | 
try {
    JsonRangerTagResourceMap result = apiInstance.getTagResourceMapByGuid(guid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getTagResourceMapByGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**|  |

### Return type

[**JsonRangerTagResourceMap**](JsonRangerTagResourceMap.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getTagResourceMap_0"></a>
# **getTagResourceMap_0**
> JsonRangerTagResourceMap getTagResourceMap_0(id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Long id = 789L; // Long | 
try {
    JsonRangerTagResourceMap result = apiInstance.getTagResourceMap_0(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getTagResourceMap_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JsonRangerTagResourceMap**](JsonRangerTagResourceMap.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getTagTypes"></a>
# **getTagTypes**
> List&lt;String&gt; getTagTypes()





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
try {
    List<String> result = apiInstance.getTagTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getTagTypes");
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

<a name="getTagsByType"></a>
# **getTagsByType**
> List&lt;JsonRangerTag&gt; getTagsByType(type)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String type = "type_example"; // String | 
try {
    List<JsonRangerTag> result = apiInstance.getTagsByType(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#getTagsByType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  |

### Return type

[**List&lt;JsonRangerTag&gt;**](JsonRangerTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="importServiceTags"></a>
# **importServiceTags**
> importServiceTags(body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
JsonServiceTags body = new JsonServiceTags(); // JsonServiceTags | 
try {
    apiInstance.importServiceTags(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#importServiceTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JsonServiceTags**](JsonServiceTags.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="updateServiceResource"></a>
# **updateServiceResource**
> JsonRangerServiceResource updateServiceResource(id, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Long id = 789L; // Long | 
JsonRangerServiceResource body = new JsonRangerServiceResource(); // JsonRangerServiceResource | 
try {
    JsonRangerServiceResource result = apiInstance.updateServiceResource(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#updateServiceResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**JsonRangerServiceResource**](JsonRangerServiceResource.md)|  | [optional]

### Return type

[**JsonRangerServiceResource**](JsonRangerServiceResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateServiceResourceByGuid"></a>
# **updateServiceResourceByGuid**
> JsonRangerServiceResource updateServiceResourceByGuid(guid, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String guid = "guid_example"; // String | 
JsonRangerServiceResource body = new JsonRangerServiceResource(); // JsonRangerServiceResource | 
try {
    JsonRangerServiceResource result = apiInstance.updateServiceResourceByGuid(guid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#updateServiceResourceByGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**|  |
 **body** | [**JsonRangerServiceResource**](JsonRangerServiceResource.md)|  | [optional]

### Return type

[**JsonRangerServiceResource**](JsonRangerServiceResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateTag"></a>
# **updateTag**
> JsonRangerTag updateTag(id, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Long id = 789L; // Long | 
JsonRangerTag body = new JsonRangerTag(); // JsonRangerTag | 
try {
    JsonRangerTag result = apiInstance.updateTag(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#updateTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**JsonRangerTag**](JsonRangerTag.md)|  | [optional]

### Return type

[**JsonRangerTag**](JsonRangerTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateTagByGuid"></a>
# **updateTagByGuid**
> JsonRangerTag updateTagByGuid(guid, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
String guid = "guid_example"; // String | 
JsonRangerTag body = new JsonRangerTag(); // JsonRangerTag | 
try {
    JsonRangerTag result = apiInstance.updateTagByGuid(guid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#updateTagByGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**|  |
 **body** | [**JsonRangerTag**](JsonRangerTag.md)|  | [optional]

### Return type

[**JsonRangerTag**](JsonRangerTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateTagDef"></a>
# **updateTagDef**
> JsonRangerTagDef updateTagDef(id, body)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagRestApi;


TagRestApi apiInstance = new TagRestApi();
Long id = 789L; // Long | 
JsonRangerTagDef body = new JsonRangerTagDef(); // JsonRangerTagDef | 
try {
    JsonRangerTagDef result = apiInstance.updateTagDef(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagRestApi#updateTagDef");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**JsonRangerTagDef**](JsonRangerTagDef.md)|  | [optional]

### Return type

[**JsonRangerTagDef**](JsonRangerTagDef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

