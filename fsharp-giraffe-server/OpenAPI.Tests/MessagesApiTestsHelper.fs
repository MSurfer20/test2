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
open TestHelper
open OpenAPI.MessagesApiHandler
open OpenAPI.MessagesApiHandlerParams

module MessagesApiHandlerTestsHelper =

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()


  let mutable UploadFileExamples = Map.empty
  let mutable UploadFileBody = ""

  let getUploadFileExample mediaType =
    UploadFileExamples.[mediaType]
      |> getConverter mediaType
