# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test Presence")

model.instance <- Presence$new()

test_that("client", {
  # tests for the property `client` (character)
  # The client&#39;s platform name. 

  # uncomment below to test the property 
  #expect_equal(model.instance$`client`, "EXPECTED_RESULT")
})

test_that("status", {
  # tests for the property `status` (character)
  # The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;. 

  # uncomment below to test the property 
  #expect_equal(model.instance$`status`, "EXPECTED_RESULT")
})

test_that("timestamp", {
  # tests for the property `timestamp` (integer)
  # The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second. 

  # uncomment below to test the property 
  #expect_equal(model.instance$`timestamp`, "EXPECTED_RESULT")
})

test_that("pushable", {
  # tests for the property `pushable` (character)
  # Whether the client is capable of showing mobile/push notifications to the user. 

  # uncomment below to test the property 
  #expect_equal(model.instance$`pushable`, "EXPECTED_RESULT")
})

