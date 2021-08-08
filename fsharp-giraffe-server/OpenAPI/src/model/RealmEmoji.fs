namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.int option

module RealmEmoji = 

  //#region RealmEmoji


  type RealmEmoji = {
    Id : string;
    Name : string;
    SourceUrl : string;
    Deactivated : bool;
    AuthorId : int option;
  }
  //#endregion
  