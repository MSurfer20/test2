namespace OpenAPI.Model

open System
open System.Collections.Generic

module Presence = 

  //#region Presence

  //#region enums
  type StatusEnum = IdleEnum of string  |  ActiveEnum of string  
  //#endregion

  type Presence = {
    Client : string;
    Status : StatusEnum;
    Timestamp : int;
    Pushable : bool;
  }
  //#endregion
  