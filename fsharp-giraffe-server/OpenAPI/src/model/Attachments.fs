namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AttachmentsMessages

module Attachments = 

  //#region Attachments


  type Attachments = {
    Id : int;
    Name : string;
    PathId : string;
    Size : int;
    CreateTime : int;
    Messages : AttachmentsMessages[];
  }
  //#endregion
  