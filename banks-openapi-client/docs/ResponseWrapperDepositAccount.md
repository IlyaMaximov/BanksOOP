# ResponseWrapperDepositAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**bankId** | **Long** |  |  [optional]
**ownerId** | **Long** |  |  [optional]
**currentAmount** | **Long** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**balancePercentage** | **Double** |  |  [optional]
**accumulatedAmount** | **Long** |  |  [optional]
**upToDate** | [**LocalDate**](LocalDate.md) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CREDIT | &quot;CREDIT&quot;
DEBIT | &quot;DEBIT&quot;
DEPOSIT | &quot;DEPOSIT&quot;
