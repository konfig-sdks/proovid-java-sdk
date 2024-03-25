

# NaturalPersonInfoResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**clientReferenceId** | **String** |  |  [optional] |
|**creationDate** | **OffsetDateTime** |  |  [optional] |
|**lastUpdatedDate** | **OffsetDateTime** |  |  [optional] |
|**deletionDate** | **OffsetDateTime** |  |  [optional] |
|**taxId** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**middleName** | **String** |  |  [optional] |
|**legalName** | **String** |  |  [optional] |
|**dateOfBirth** | **OffsetDateTime** |  |  [optional] |
|**gender** | **EGender** |  |  [optional] |
|**countryBirth** | **String** |  |  [optional] |
|**countryResidence** | **String** |  |  [optional] |
|**countryMainBusiness** | **String** |  |  [optional] |
|**nationality** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**emailTwo** | **String** |  |  [optional] |
|**mobilePhone** | **String** |  |  [optional] |
|**mobilePhoneTwo** | **String** |  |  [optional] |
|**automaticallyUpdateNPRisk** | **Boolean** |  |  [optional] |
|**riskLevel** | **EScore** |  |  [optional] |
|**riskLevelJustification** | **String** |  |  [optional] |
|**status** | **EStatus** |  |  [optional] |
|**rejectLabels** | **List&lt;RejectLabelType&gt;** |  |  [optional] |
|**isFlagged** | **Boolean** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**economicProfile** | [**NaturalPersonEconomicProfileResponse**](NaturalPersonEconomicProfileResponse.md) |  |  [optional] |
|**documentVerification** | [**NaturalPersonDocumentVerificationResponse**](NaturalPersonDocumentVerificationResponse.md) |  |  [optional] |
|**addressVerification** | [**NaturalPersonAddressVerificationResponse**](NaturalPersonAddressVerificationResponse.md) |  |  [optional] |
|**faceVerification** | [**NaturalPersonFaceVerificationResponse**](NaturalPersonFaceVerificationResponse.md) |  |  [optional] |
|**screeningVerification** | [**NaturalPersonAmlVerificationResponse**](NaturalPersonAmlVerificationResponse.md) |  |  [optional] |
|**otherSourcesOfIncome** | [**List&lt;NaturalPersonOtherSourceOfIncomeResponse&gt;**](NaturalPersonOtherSourceOfIncomeResponse.md) |  |  [optional] |
|**otherSourcesOfWealth** | [**List&lt;NaturalPersonOtherSourceOfWealthResponse&gt;**](NaturalPersonOtherSourceOfWealthResponse.md) |  |  [optional] |
|**industries** | [**List&lt;NaturalPersonOccupationResponse&gt;**](NaturalPersonOccupationResponse.md) |  |  [optional] |



