# ClientApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addClient**](ClientApi.md#addClient) | **POST** /bank/{bankId}/client/add | 
[**editClient**](ClientApi.md#editClient) | **PUT** /bank/client/{clientId}/edit | 
[**getBankClients**](ClientApi.md#getBankClients) | **GET** /bank/{bankId}/clients | 
[**getClient**](ClientApi.md#getClient) | **GET** /bank/client/{clientId} | 

<a name="addClient"></a>
# **addClient**
> ResponseWrapperClientWrapper addClient(bankId, firstName, secondName)



Creates a new client in bank with {bankId}

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
Long bankId = 789L; // Long | 
String firstName = "firstName_example"; // String | 
String secondName = "secondName_example"; // String | 
try {
    ResponseWrapperClientWrapper result = apiInstance.addClient(bankId, firstName, secondName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#addClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankId** | **Long**|  |
 **firstName** | **String**|  |
 **secondName** | **String**|  |

### Return type

[**ResponseWrapperClientWrapper**](ResponseWrapperClientWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editClient"></a>
# **editClient**
> ResponseWrapperClientWrapper editClient(body, clientId)



Edits client with {clientID} in bank

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
Client body = new Client(); // Client | 
Long clientId = 789L; // Long | 
try {
    ResponseWrapperClientWrapper result = apiInstance.editClient(body, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#editClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Client**](Client.md)|  |
 **clientId** | **Long**|  |

### Return type

[**ResponseWrapperClientWrapper**](ResponseWrapperClientWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBankClients"></a>
# **getBankClients**
> ResponseWrapperListClient getBankClients(bankId)



Get clients of bank with {bankId}

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
Long bankId = 789L; // Long | 
try {
    ResponseWrapperListClient result = apiInstance.getBankClients(bankId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getBankClients");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankId** | **Long**|  |

### Return type

[**ResponseWrapperListClient**](ResponseWrapperListClient.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClient"></a>
# **getClient**
> ResponseWrapperClientWrapper getClient(clientId)



Get client info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
Long clientId = 789L; // Long | 
try {
    ResponseWrapperClientWrapper result = apiInstance.getClient(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  |

### Return type

[**ResponseWrapperClientWrapper**](ResponseWrapperClientWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

