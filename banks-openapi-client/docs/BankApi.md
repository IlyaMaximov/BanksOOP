# BankApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBank**](BankApi.md#createBank) | **POST** /bank/create | 
[**getBankAccounts**](BankApi.md#getBankAccounts) | **GET** /bank/{bankId}/accounts | 

<a name="createBank"></a>
# **createBank**
> ResponseWrapperBank createBank(debitPercentage, creditCommission, unverifiedAmountLimit)



Creates new bank

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BankApi;


BankApi apiInstance = new BankApi();
Double debitPercentage = 3.4D; // Double | 
Double creditCommission = 3.4D; // Double | 
Long unverifiedAmountLimit = 789L; // Long | 
try {
    ResponseWrapperBank result = apiInstance.createBank(debitPercentage, creditCommission, unverifiedAmountLimit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankApi#createBank");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **debitPercentage** | **Double**|  |
 **creditCommission** | **Double**|  |
 **unverifiedAmountLimit** | **Long**|  |

### Return type

[**ResponseWrapperBank**](ResponseWrapperBank.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankAccounts"></a>
# **getBankAccounts**
> ResponseWrapperListBaseAccount getBankAccounts(bankId)



Lists all bank accounts

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BankApi;


BankApi apiInstance = new BankApi();
Long bankId = 789L; // Long | 
try {
    ResponseWrapperListBaseAccount result = apiInstance.getBankAccounts(bankId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankApi#getBankAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankId** | **Long**|  |

### Return type

[**ResponseWrapperListBaseAccount**](ResponseWrapperListBaseAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

