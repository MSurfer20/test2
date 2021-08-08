namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BasicStream

module DefaultStreamGroup = 

  //#region DefaultStreamGroup


  type DefaultStreamGroup = {
    Name : string;
    Description : string;
    Id : int;
    Streams : BasicStream[];
  }
  //#endregion
  