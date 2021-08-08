namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessagesBase

module InlineResponse200 = 

  //#region InlineResponse200


  type inline_response_200 = {
    BotEmail : string;
    BotFullName : string;
    Data : string;
    Trigger : string;
    Token : string;
    Message : MessagesBase;
  }
  //#endregion
  