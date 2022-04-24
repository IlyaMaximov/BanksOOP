# ResponseWrapperTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creatorClientId** | **Long** |  |  [optional]
**sourceAccountId** | **Long** |  |  [optional]
**targetAccountId** | **Long** |  |  [optional]
**amount** | **Long** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) |  |  [optional]
**completionTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**message** | **String** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NEW | &quot;NEW&quot;
PROCESSED | &quot;PROCESSED&quot;
TO_CANCEL | &quot;TO_CANCEL&quot;
CANCELLED | &quot;CANCELLED&quot;
FAILED | &quot;FAILED&quot;

<a name="CurrencyEnum"></a>
## Enum: CurrencyEnum
Name | Value
---- | -----
RUB | &quot;RUB&quot;
USD | &quot;USD&quot;
EUR | &quot;EUR&quot;
