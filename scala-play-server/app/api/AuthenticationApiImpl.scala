package api

import model.ApiKeyResponse

/**
  * Provides a default implementation for [[AuthenticationApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-09T21:37:15.417726Z[Etc/UTC]")
class AuthenticationApiImpl extends AuthenticationApi {
  /**
    * @inheritdoc
    */
  override def devFetchApiKey(username: String): ApiKeyResponse = {
    // TODO: Implement better logic

    ApiKeyResponse(null, null, "", "")
  }

  /**
    * @inheritdoc
    */
  override def fetchApiKey(username: String, password: String): ApiKeyResponse = {
    // TODO: Implement better logic

    ApiKeyResponse(null, null, "", "")
  }
}
