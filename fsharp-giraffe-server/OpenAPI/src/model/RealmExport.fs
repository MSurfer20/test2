namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module RealmExport = 

  //#region RealmExport


  type RealmExport = {
    Id : int;
    ActingUserId : int;
    ExportTime : decimal;
    DeletedTimestamp : decimal option;
    FailedTimestamp : decimal option;
    ExportUrl : string option;
    Pending : bool;
  }
  //#endregion
  