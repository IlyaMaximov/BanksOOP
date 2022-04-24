# TransactionApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllTransactionsByCreatorId**](TransactionApi.md#getAllTransactionsByCreatorId) | **GET** /bank/transactions/list | 
[**transfer**](TransactionApi.md#transfer) | **POST** /bank/client/{clientId}/transaction/create | 

<a name="getAllTransactionsByCreatorId"></a>
# **getAllTransactionsByCreatorId**
> ResponseWrapperListTransaction getAllTransactionsByCreatorId(creatorClientId)



lists all transactions made by user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionApi;


TransactionApi apiInstance = new TransactionApi();
Long creatorClientId = 789L; // Long | 
try {
    ResponseWrapperListTransaction result = apiInstance.getAllTransactionsByCreatorId(creatorClientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#getAllTransactionsByCreatorId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creatorClientId** | **Long**|  |

### Return type

[**ResponseWrapperListTransaction**](ResponseWrapperListTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="transfer"></a>
# **transfer**
> ResponseWrapperTransaction transfer(clientId, sourceAccountId, targetAccountId, currency, amount)



Creates a new transaction authorized by {clientId}

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionApi;


TransactionApi apiInstance = new TransactionApi();
Long clientId = 789L; // Long | 
Long sourceAccountId = 789L; // Long | 
Long targetAccountId = 789L; // Long | 
String currency = "currency_example"; // String | 
Long amount = 789L; // Long | 
try {
    ResponseWrapperTransaction result = apiInstance.transfer(clientId, sourceAccountId, targetAccountId, currency, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#transfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  |
 **sourceAccountId** | **Long**|  |
 **targetAccountId** | **Long**|  |
 **currency** | **String**|  | [enum: RUB, USD, EUR]
 **amount** | **Long**|  |

### Return type

[**ResponseWrapperTransaction**](ResponseWrapperTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

