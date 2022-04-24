# AccountApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeposit**](AccountApi.md#createDeposit) | **POST** /bank/client/{clientId}/account/deposit/create | 

<a name="createDeposit"></a>
# **createDeposit**
> ResponseWrapperDepositAccount createDeposit(clientId, upToDate)



Creates bank deposit account for client with {clientId} 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
Long clientId = 789L; // Long | 
LocalDate upToDate = new LocalDate(); // LocalDate | 
try {
    ResponseWrapperDepositAccount result = apiInstance.createDeposit(clientId, upToDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#createDeposit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  |
 **upToDate** | **LocalDate**|  |

### Return type

[**ResponseWrapperDepositAccount**](ResponseWrapperDepositAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

