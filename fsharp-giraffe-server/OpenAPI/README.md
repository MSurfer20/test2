# OpenAPI

A [Giraffe](https://github.com/giraffe-fsharp/Giraffe) server stub for the OpenAPI package, created via the [OpenAPI generator](https://github.com/OpenAPITools/openapi-generator/).

## Models

The following models have been auto-generated from the provided OpenAPI schema:

- model/CodedErrorBaseAllOfModel.fs
- model/UserGroupModel.fs
- model/JsonErrorBaseAllOfModel.fs
- model/UserBaseModel.fs
- model/UserAllOfModel.fs
- model/UserModel.fs
- model/SubscriptionsModel.fs
- model/RealmPlaygroundModel.fs
- model/RealmExportModel.fs
- model/RealmEmojiModel.fs
- model/RealmDomainModel.fs
- model/JsonResponseBaseModel.fs
- model/CodedErrorAllOfModel.fs
- model/PresenceModel.fs
- model/NonExistingStreamErrorAllOfModel.fs
- model/JsonErrorBaseModel.fs
- model/MissingArgumentErrorAllOfModel.fs
- model/CodedErrorBaseModel.fs
- model/MessagesBaseTopicLinksModel.fs
- model/EmojiReactionAllOfModel.fs
- model/MessagesAllOfModel.fs
- model/EmojiReactionBaseUserModel.fs
- model/JsonSuccessBaseAllOfModel.fs
- model/CodedErrorModel.fs
- model/JsonSuccessAllOfModel.fs
- model/JsonSuccessBaseModel.fs
- model/JsonSuccessModel.fs
- model/UserNotAuthorizedErrorModel.fs
- model/UserDeactivatedErrorModel.fs
- model/JsonErrorModel.fs
- model/InvalidMessageErrorAllOfModel.fs
- model/InvalidMessageErrorModel.fs
- model/InvalidApiKeyErrorModel.fs
- model/EmojiReactionBaseModel.fs
- model/HotspotModel.fs
- model/GetMessagesAllOfModel.fs
- model/EmojiReactionModel.fs
- model/MessagesBaseModel.fs
- model/MessagesModel.fs
- model/InlineResponse200Model.fs
- model/GetMessagesModel.fs
- model/BasicStreamAllOfModel.fs
- model/CustomProfileFieldModel.fs
- model/NonExistingStreamErrorModel.fs
- model/MissingArgumentErrorModel.fs
- model/RealmDeactivatedErrorModel.fs
- model/RateLimitedErrorModel.fs
- model/BotAllOfModel.fs
- model/BasicBotBaseModel.fs
- model/BasicStreamBaseModel.fs
- model/BasicStreamModel.fs
- model/DefaultStreamGroupModel.fs
- model/BotModel.fs
- model/BasicBotAllOfModel.fs
- model/BasicBotModel.fs
- model/BadEventQueueIdErrorAllOfModel.fs
- model/BadEventQueueIdErrorModel.fs
- model/AttachmentsMessagesModel.fs
- model/AttachmentsModel.fs
- model/ApiKeyResponseAllOfModel.fs
- model/ApiKeyResponseModel.fs
- model/AddSubscriptionsResponseAllOfModel.fs
- model/AddSubscriptionsResponseModel.fs

## Operations

Handlers have been auto-generated from the operations specified in the OpenAPI schema as follows:


## Operation Parameters

Types have been generated for the URL, query, form, header and cookie parameters passed to each handler in the following files:

- api/AuthenticationApiHandlerParams.fs
- api/MessagesApiHandlerParams.fs
- api/RealTimeEventsApiHandlerParams.fs
- api/ServerAndOrganizationsApiHandlerParams.fs
- api/StreamsApiHandlerParams.fs
- api/UsersApiHandlerParams.fs
- api/WebhooksApiHandlerParams.fs

## Service Interfaces

Handlers will attempt to bind parameters to the applicable type and pass to a Service specific to that Handler. Service interfaces have been generated as follows:

- api/AuthenticationApiServiceInterface.fs
- api/MessagesApiServiceInterface.fs
- api/RealTimeEventsApiServiceInterface.fs
- api/ServerAndOrganizationsApiServiceInterface.fs
- api/StreamsApiServiceInterface.fs
- api/UsersApiServiceInterface.fs
- api/WebhooksApiServiceInterface.fs

Each Service contains functions for each [OperationId], each accepting a [OperationId]Params object that wraps the operation's parameters.

If a requestBody is a ref type (i.e. a Model) or a single simple type, the operation parameter will be typed as the expected Model:

`type AddPetBodyParams = Pet`

If a requestBody is a simple type with named properties, the operation parameters will be typed to reflect those properties:

`type AddFooBodyParams = {
  Name:string;
  Age:int
}

Each Service/operation function must accept the [OperationId]Params object and return a [OperationId]Result type. For example:

`type AddPetArgs = { bodyParams:AddPetBodyParams }
type IPetApiService = abstract member AddPet:HttpContext -> AddPetArgs->AddPetResult`

[OperationId]Result is a discriminated union of all possible OpenAPI response types for that operation. 

This means that service implementations can only return status codes that have been declared in the OpenAPI specification. 
However, if the OpenAPI spec declares a default Response for an operation, the service can manually set the status code.

For example:

`type FindPetsByStatusDefaultStatusCodeResponse = { content:Pet[];}
type FindPetsByStatusStatusCode400Response = { content:string; }
type FindPetsByStatusResult = FindPetsByStatusDefaultStatusCode of FindPetsByStatusDefaultStatusCodeResponse | FindPetsByStatusStatusCode400 of FindPetsByStatusStatusCode400Response`

## Note on nullable/optional properties 

Currently, handler parameters and models do not distinguish between required properties and optional (or nullable) properties***.

If a request body is missing a property, the parameter will be bound as null (and likewise, missing model properties will be serialized as null).

This is only a temporary measure, and does need to be fixed to conform to the OpenAPI spec.

Ideally, Option types would be used for all parameters not marked as required (or marked as nullable).

This won't be possible until Giraffe supports binding option types in request bodies.

This may cause problems with certain parameter types (e.g. map types) - please file an issue if you come across one.

*** Except for DateTime, where properties not marked required are bound as Nullable<DateTime>.

## Note on response codes for URL parameter binding

Giraffe binds URL parameters by requiring compile-time format strings for routes  (e.g. "/foo/%s/%d) or known types (e.g. FooUrlParameters).

With either approach, Giraffe will emit a 400 error response if parameter binding fails (e.g. if a string is provided where an int was expected).

Currently, I am not aware of any way to customize this response, meaning if your OpenAPI schema specifies a different response code for an incorrectly formatted URL parameter, this will basically be ignored.

To ensure your OpenAPI schema and implementation are consistent, I suggest ensuring that your schema only specifies return code 400 for incorrectly formatted URL parameters.

If you have any suggestions for customizing this, please file an issue.

## Service Implementations

Stubbed service implementations of those interfaces have been generated as follows:

- impl/AuthenticationApiService.fs
- impl/MessagesApiService.fs
- impl/RealTimeEventsApiService.fs
- impl/ServerAndOrganizationsApiService.fs
- impl/StreamsApiService.fs
- impl/UsersApiService.fs
- impl/WebhooksApiService.fs

You should manually edit these files to implement your business logic.

## Additional Handlers

Additional handlers can be configured in the Customization.fs

`let handlers : HttpHandler list = [
    // insert your handlers here
    GET >=> 
      choose [
        route "/login" >=> redirectToLogin
        route "/logout" >=> logout
      ]
  ]`

## Authentication

### OAuth

If your OpenAPI spec contains oAuth2 securitySchemes, these will have been auto-generated.

To configure any of these, you must set the "xxxClientId" and "xxxClientSecret" environment variables (e.g. "GoogleClientId", "GoogleClientSecret") where xxx is the securityScheme ID.

If you specify the securityScheme ID as "Google" or "GitHub" (note the capital "G" and "H" in the latter), the generator will default to:
- for Google, the [ASP.NET Core providers](https://docs.microsoft.com/en-us/aspnet/core/security/authentication/social/google-logins?view=aspnetcore-2.2)
- for GitHub, the [aspnet-contrib provider](https://www.nuget.org/packages/AspNet.Security.OAuth.GitHub/)

For any other ID (e.g. "Facebook"), a [generic ASP.NET Core oAuth provider](https://docs.microsoft.com/en-us/dotnet/api/microsoft.extensions.dependencyinjection.oauthextensions.addoauth?view=aspnetcore-2.2) will be configured.

See impl/AuthSchemes.fs for further details.

NOTE - currently, authentication against ANY defined OAuth scheme will allow access to a handler (even if the scheme was not specified as a security scheme for the particular handler).
This is on the TODO list.

### API key

API key authentication is supported via the (AspNet.Security.ApiKey.Providers package)[https://github.com/jamesharling/AspNet.Security.ApiKey.Providers].

You must implement your own validation logic for the key in CustomHandlers.setApiKeyEvents.


## TODO/currently unsupported

- form request bodies (URL-encoded or multipart)
- implicit oAuth
- limit handler access to specified oAuth scheme when multiple oAuth schemes defined
- XML content/response types
- http authentication
- testing header params

## .openapi-generator-ignore

It is recommended to add src/impl/** and the project's .fsproj file to the .openapi-generator-ignore file. 

This will allow you to regenerate model, operation and parameter files without overriding your implementations of business logic, authentication, data layers, and so on.

## Build and test the application

### Windows

Run the `build.bat` script in order to restore, build and test (if you've selected to include tests) the application:

```
> ./build.bat
```

### Linux/macOS

Run the `build.sh` script in order to restore, build and test (if you've selected to include tests) the application:

```
$ ./build.sh
```

## Run the application

After a successful build you can start the web application by executing the following command in your terminal:

```
dotnet run --project src/{{packageName}
```

After the application has started visit [http://localhost:5000](http://localhost:5000) in your preferred browser.