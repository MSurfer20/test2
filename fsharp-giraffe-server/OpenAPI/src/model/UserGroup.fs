namespace OpenAPI.Model

open System
open System.Collections.Generic

module UserGroup = 

  //#region UserGroup


  type UserGroup = {
    Name : string;
    Description : string;
    Members : int[];
    Id : int;
  }
  //#endregion
  