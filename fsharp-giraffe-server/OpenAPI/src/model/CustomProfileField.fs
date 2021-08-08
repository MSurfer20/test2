namespace OpenAPI.Model

open System
open System.Collections.Generic

module CustomProfileField = 

  //#region CustomProfileField


  type CustomProfileField = {
    Id : int;
    Type : int;
    Order : int;
    Name : string;
    Hint : string;
    FieldData : string;
  }
  //#endregion
  