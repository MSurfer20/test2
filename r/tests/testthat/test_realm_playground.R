# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test RealmPlayground")

model.instance <- RealmPlayground$new()

test_that("id", {
  # tests for the property `id` (integer)
  # The unique ID for the realm playground. 

  # uncomment below to test the property 
  #expect_equal(model.instance$`id`, "EXPECTED_RESULT")
})

test_that("name", {
  # tests for the property `name` (character)
  # The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 

  # uncomment below to test the property 
  #expect_equal(model.instance$`name`, "EXPECTED_RESULT")
})

test_that("pygments_language", {
  # tests for the property `pygments_language` (character)
  # The name of the Pygments language lexer for that programming language. 

  # uncomment below to test the property 
  #expect_equal(model.instance$`pygments_language`, "EXPECTED_RESULT")
})

test_that("url_prefix", {
  # tests for the property `url_prefix` (character)
  # The url prefix for the playground. 

  # uncomment below to test the property 
  #expect_equal(model.instance$`url_prefix`, "EXPECTED_RESULT")
})

