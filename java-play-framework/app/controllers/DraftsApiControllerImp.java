package controllers;

import apimodels.CodedError;
import apimodels.Draft;
import apimodels.JsonError;
import apimodels.JsonSuccess;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
public class DraftsApiControllerImp extends DraftsApiControllerImpInterface {
    @Override
    public JsonSuccess createDrafts(Http.Request request, List<Draft> drafts) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess deleteDraft(Http.Request request, Integer draftId) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess editDraft(Http.Request request, Integer draftId, @NotNull Draft draft) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess getDrafts(Http.Request request) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

}
