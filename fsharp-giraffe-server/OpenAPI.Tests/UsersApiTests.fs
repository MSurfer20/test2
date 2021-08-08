namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open Newtonsoft
open TestHelper
open UsersApiHandlerTestsHelper
open OpenAPI.UsersApiHandler
open OpenAPI.UsersApiHandlerParams
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedError
open OpenAPI.Model.JsonError
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open OpenAPI.Model.OneOfobjectobject
open OpenAPI.Model.OneOfobjectobjectobject

module UsersApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CreateUser - Create a user returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users" + "?email=ADDME&password=ADDME&fullName=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CreateUser - Create a user returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users" + "?email=ADDME&password=ADDME&fullName=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CreateUserGroup - Create a user group returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/user_groups/create" + "?name=ADDME&description=ADDME&members=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CreateUserGroup - Create a user group returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/user_groups/create" + "?name=ADDME&description=ADDME&members=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeactivateOwnUser - Deactivate own user returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeactivateOwnUser - Deactivate own user returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeactivateUser - Deactivate a user returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/{user_id}".Replace("userId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeactivateUser - Deactivate a user returns 400 where Bad request`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/{user_id}".Replace("userId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAttachments - Get attachments returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/attachments"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOwnUser - Get own user returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetUser - Get a user returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/{user_id}".Replace("userId", "ADDME") + "?clientGravatar=ADDME&includeCustomProfileFields=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetUserByEmail - Get a user by email returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/{email}".Replace("email", "ADDME") + "?clientGravatar=ADDME&includeCustomProfileFields=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetUserGroups - Get user groups returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/user_groups"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetUserPresence - Get user presence returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/{user_id_or_email}/presence".Replace("userIdOrEmail", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetUsers - Get all users returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users" + "?clientGravatar=ADDME&includeCustomProfileFields=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MuteUser - Mute a user returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/muted_users/{muted_user_id}".Replace("mutedUserId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MuteUser - Mute a user returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/muted_users/{muted_user_id}".Replace("mutedUserId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ReactivateUser - Reactivate a user returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/{user_id}/reactivate".Replace("userId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RemoveUserGroup - Delete a user group returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/user_groups/{user_group_id}".Replace("userGroupId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RemoveUserGroup - Delete a user group returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/user_groups/{user_group_id}".Replace("userGroupId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SetTypingStatus - Set \&quot;typing\&quot; status returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/typing" + "?_type=ADDME&op=ADDME&_to=ADDME&topic=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SetTypingStatus - Set \&quot;typing\&quot; status returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/typing" + "?_type=ADDME&op=ADDME&_to=ADDME&topic=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UnmuteUser - Unmute a user returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/muted_users/{muted_user_id}".Replace("mutedUserId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UnmuteUser - Unmute a user returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/muted_users/{muted_user_id}".Replace("mutedUserId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateDisplaySettings - Update display settings returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/settings/display" + "?twentyFourHourTime=ADDME&denseMode=ADDME&starredMessageCounts=ADDME&fluidLayoutWidth=ADDME&highContrastMode=ADDME&colorScheme=ADDME&translateEmoticons=ADDME&defaultLanguage=ADDME&defaultView=ADDME&leftSideUserlist=ADDME&emojiset=ADDME&demoteInactiveStreams=ADDME&timezone=ADDME"

      HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateNotificationSettings - Update notification settings returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/settings/notifications" + "?enableStreamDesktopNotifications=ADDME&enableStreamEmailNotifications=ADDME&enableStreamPushNotifications=ADDME&enableStreamAudibleNotifications=ADDME&notificationSound=ADDME&enableDesktopNotifications=ADDME&enableSounds=ADDME&enableOfflineEmailNotifications=ADDME&enableOfflinePushNotifications=ADDME&enableOnlinePushNotifications=ADDME&enableDigestEmails=ADDME&enableMarketingEmails=ADDME&enableLoginEmails=ADDME&messageContentInEmailNotifications=ADDME&pmContentInDesktopNotifications=ADDME&wildcardMentionsNotify=ADDME&desktopIconCountDisplay=ADDME&realmNameInNotifications=ADDME&presenceEnabled=ADDME"

      HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateUser - Update a user returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/{user_id}".Replace("userId", "ADDME") + "?fullName=ADDME&role=ADDME&profileData=ADDME"

      HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateUser - Update a user returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/{user_id}".Replace("userId", "ADDME") + "?fullName=ADDME&role=ADDME&profileData=ADDME"

      HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateUserGroup - Update a user group returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/user_groups/{user_group_id}".Replace("userGroupId", "ADDME") + "?name=ADDME&description=ADDME"

      HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateUserGroup - Update a user group returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/user_groups/{user_group_id}".Replace("userGroupId", "ADDME") + "?name=ADDME&description=ADDME"

      HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateUserGroupMembers - Update user group members returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/user_groups/{user_group_id}/members".Replace("userGroupId", "ADDME") + "?delete=ADDME&add=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

