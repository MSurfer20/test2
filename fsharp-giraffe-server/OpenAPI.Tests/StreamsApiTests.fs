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
open StreamsApiHandlerTestsHelper
open OpenAPI.StreamsApiHandler
open OpenAPI.StreamsApiHandlerParams
open OpenAPI.Model.CodedError
open OpenAPI.Model.JsonError
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open OpenAPI.Model.NonExistingStreamError
open OpenAPI.Model.OneOfobjectobject
open OpenAPI.Model.OneOfstringinteger

module StreamsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``ArchiveStream - Archive a stream returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/streams/{stream_id}".Replace("streamId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ArchiveStream - Archive a stream returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/streams/{stream_id}".Replace("streamId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CreateBigBlueButtonVideoCall - Create BigBlueButton video call returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/calls/bigbluebutton/create"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteTopic - Delete a topic returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/streams/{stream_id}/delete_topic".Replace("streamId", "ADDME") + "?topicName=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteTopic - Delete a topic returns 400 where Error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/streams/{stream_id}/delete_topic".Replace("streamId", "ADDME") + "?topicName=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetStreamId - Get stream ID returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/get_stream_id" + "?stream=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetStreamId - Get stream ID returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/get_stream_id" + "?stream=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetStreamTopics - Get topics in a stream returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/{stream_id}/topics".Replace("streamId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetStreamTopics - Get topics in a stream returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/{stream_id}/topics".Replace("streamId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetStreams - Get all streams returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/streams" + "?includePublic=ADDME&includeWebPublic=ADDME&includeSubscribed=ADDME&includeAllActive=ADDME&includeDefault=ADDME&includeOwnerSubscribed=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetStreams - Get all streams returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/streams" + "?includePublic=ADDME&includeWebPublic=ADDME&includeSubscribed=ADDME&includeAllActive=ADDME&includeDefault=ADDME&includeOwnerSubscribed=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetSubscribers - Get the subscribers of a stream returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/streams/{stream_id}/members".Replace("streamId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetSubscribers - Get the subscribers of a stream returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/streams/{stream_id}/members".Replace("streamId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetSubscriptionStatus - Get subscription status returns 200 where Success`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/{user_id}/subscriptions/{stream_id}".Replace("userId", "ADDME").Replace("streamId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetSubscriptions - Get subscribed streams returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/subscriptions" + "?includeSubscribers=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MuteTopic - Topic muting returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/subscriptions/muted_topics" + "?stream=ADDME&streamId=ADDME&topic=ADDME&op=ADDME"

      HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MuteTopic - Topic muting returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/subscriptions/muted_topics" + "?stream=ADDME&streamId=ADDME&topic=ADDME&op=ADDME"

      HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``Subscribe - Subscribe to a stream returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/subscriptions" + "?subscriptions=ADDME&principals=ADDME&authorizationErrorsFatal=ADDME&announce=ADDME&inviteOnly=ADDME&historyPublicToSubscribers=ADDME&streamPostPolicy=ADDME&messageRetentionDays=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``Subscribe - Subscribe to a stream returns 400 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/subscriptions" + "?subscriptions=ADDME&principals=ADDME&authorizationErrorsFatal=ADDME&announce=ADDME&inviteOnly=ADDME&historyPublicToSubscribers=ADDME&streamPostPolicy=ADDME&messageRetentionDays=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``Unsubscribe - Unsubscribe from a stream returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/subscriptions" + "?subscriptions=ADDME&principals=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``Unsubscribe - Unsubscribe from a stream returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/subscriptions" + "?subscriptions=ADDME&principals=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateStream - Update a stream returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/streams/{stream_id}".Replace("streamId", "ADDME") + "?description=ADDME&newName=ADDME&isPrivate=ADDME&isAnnouncementOnly=ADDME&streamPostPolicy=ADDME&historyPublicToSubscribers=ADDME&messageRetentionDays=ADDME"

      HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateStream - Update a stream returns 400 where Bad request.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/streams/{stream_id}".Replace("streamId", "ADDME") + "?description=ADDME&newName=ADDME&isPrivate=ADDME&isAnnouncementOnly=ADDME&streamPostPolicy=ADDME&historyPublicToSubscribers=ADDME&messageRetentionDays=ADDME"

      HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateSubscriptionSettings - Update subscription settings returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/subscriptions/properties" + "?subscriptionData=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateSubscriptions - Update subscriptions returns 200 where Success.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v1/users/me/subscriptions" + "?delete=ADDME&add=ADDME"

      HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

