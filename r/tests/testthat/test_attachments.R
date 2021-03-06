# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test Attachments")

model.instance <- Attachments$new()

test_that("id", {
  # tests for the property `id` (integer)
  # The unique ID for the attachment. 

  # uncomment below to test the property 
  #expect_equal(model.instance$`id`, "EXPECTED_RESULT")
})

test_that("name", {
  # tests for the property `name` (character)
  # Name of the uploaded file. 

  # uncomment below to test the property 
  #expect_equal(model.instance$`name`, "EXPECTED_RESULT")
})

test_that("path_id", {
  # tests for the property `path_id` (character)
  # A representation of the path of the file within the repository of user-uploaded files.  If the &#x60;path_id&#x60; of a file is &#x60;{realm_id}/ab/cdef/temp_file.py&#x60;, its URL will be: &#x60;{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py&#x60;. 

  # uncomment below to test the property 
  #expect_equal(model.instance$`path_id`, "EXPECTED_RESULT")
})

test_that("size", {
  # tests for the property `size` (integer)
  # Size of the file in bytes. 

  # uncomment below to test the property 
  #expect_equal(model.instance$`size`, "EXPECTED_RESULT")
})

test_that("create_time", {
  # tests for the property `create_time` (integer)
  # Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 

  # uncomment below to test the property 
  #expect_equal(model.instance$`create_time`, "EXPECTED_RESULT")
})

test_that("messages", {
  # tests for the property `messages` (array[AttachmentsMessages])
  # Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 

  # uncomment below to test the property 
  #expect_equal(model.instance$`messages`, "EXPECTED_RESULT")
})

