package api

import model.ApiKeyResponse

/**
  * Provides a default implementation for [[AuthenticationApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:23:09.886767Z[Etc/UTC]")
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
