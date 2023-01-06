Feature: personal Info API
   @toan
  Scenario Outline:
    Given User gets token when flag is "<flag>"
    When User submits GET request to "personalURL"
    And User validates if status code is 200
   Then User validates "<elements>" in response
    Examples:
  | flag |elements|
  |A|name|
  | B|surname|
  | C|middleName|
  | false|companyName|
  | false|userName|
  | false|emailAddress|
  | false|phoneNumber|
  | false|address|
  | false|address2|
  | false|countryState|
  | false|city|
  | false|postalCode|
  | false|tenantName|
  | false|accountType|
  | false|birthDate|
  | false|businessType|
  | false|profileImageUrl|
  | false|numberOfEmployees|
  | false|registrationNumber|
  | false|approximateAGI|
  | false|businessTypeId|
  | false|countryStateId|
