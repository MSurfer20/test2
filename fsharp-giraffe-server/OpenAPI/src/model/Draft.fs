namespace OpenAPI.Model

open System
open System.Collections.Generic

module Draft = 

  //#region Draft

  //#region enums
  type TypeEnum = Empty of string  |  StreamEnum of string  |  PrivateEnum of string  
  //#endregion

  type Draft = {
    Id : int;
    Type : TypeEnum;
    To : int[];
    Topic : string;
    Content : string;
    Timestamp : decimal;
  }
  //#endregion
  