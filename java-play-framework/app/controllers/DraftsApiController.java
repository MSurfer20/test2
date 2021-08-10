package controllers;

import apimodels.CodedError;
import apimodels.Draft;
import apimodels.JsonError;
import apimodels.JsonSuccess;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-10T11:44:22.210302Z[Etc/UTC]")
public class DraftsApiController extends Controller {
    private final DraftsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private DraftsApiController(Config configuration, DraftsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createDrafts(Http.Request request) throws Exception {
        String[] draftsArray = request.queryString().get("drafts");
        List<String> draftsList = OpenAPIUtils.parametersToList("multi", draftsArray);
        List<Draft> drafts = new ArrayList<>();
        for (String curParam : draftsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                drafts.add(curParam);
            }
        }
        return imp.createDraftsHttp(request, drafts);
    }

    @ApiAction
    public Result deleteDraft(Http.Request request, Integer draftId) throws Exception {
        return imp.deleteDraftHttp(request, draftId);
    }

    @ApiAction
    public Result editDraft(Http.Request request, Integer draftId) throws Exception {
        String valuedraft = request.getQueryString("draft");
        Draft draft;
        if (valuedraft != null) {
            draft = valuedraft;
        } else {
            throw new IllegalArgumentException("'draft' parameter is required");
        }
        return imp.editDraftHttp(request, draftId, draft);
    }

    @ApiAction
    public Result getDrafts(Http.Request request) throws Exception {
        return imp.getDraftsHttp(request);
    }

}
