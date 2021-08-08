/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */


package org.openapitools.app

import org.scalatra.swagger.{ ApiInfo, SwaggerWithAuth, Swagger }
import org.scalatra.swagger.{ JacksonSwaggerBase, Swagger }
import org.scalatra.ScalatraServlet
import org.json4s.{ DefaultFormats, Formats }

class ResourcesApp(implicit protected val swagger: OpenAPIApp)
  extends ScalatraServlet with JacksonSwaggerBase {
  before() {
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
}

class OpenAPIApp extends Swagger(apiInfo = OpenAPIInfo.apiInfo, apiVersion = "1.0", swaggerVersion = Swagger.SpecVersion)

object OpenAPIInfo {
  val apiInfo = ApiInfo(
    """Zulip REST API""",
    """Powerful open source group chat """,
    """https://zulip.com""",
    """team@openapitools.org""",
    """Apache 2.0""",
    """https://www.apache.org/licenses/LICENSE-2.0.html""")
}
