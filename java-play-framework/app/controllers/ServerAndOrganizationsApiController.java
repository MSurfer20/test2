package controllers;

import java.io.InputStream;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T21:11:44.583112Z[Etc/UTC]")
public class ServerAndOrganizationsApiController extends Controller {
    private final ServerAndOrganizationsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ServerAndOrganizationsApiController(Config configuration, ServerAndOrganizationsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addCodePlayground(Http.Request request) throws Exception {
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuepygmentsLanguage = request.getQueryString("pygments_language");
        String pygmentsLanguage;
        if (valuepygmentsLanguage != null) {
            pygmentsLanguage = valuepygmentsLanguage;
        } else {
            throw new IllegalArgumentException("'pygments_language' parameter is required");
        }
        String valueurlPrefix = request.getQueryString("url_prefix");
        String urlPrefix;
        if (valueurlPrefix != null) {
            urlPrefix = valueurlPrefix;
        } else {
            throw new IllegalArgumentException("'url_prefix' parameter is required");
        }
        return imp.addCodePlaygroundHttp(request, name, pygmentsLanguage, urlPrefix);
    }

    @ApiAction
    public Result addLinkifier(Http.Request request) throws Exception {
        String valuepattern = request.getQueryString("pattern");
        String pattern;
        if (valuepattern != null) {
            pattern = valuepattern;
        } else {
            throw new IllegalArgumentException("'pattern' parameter is required");
        }
        String valueurlFormatString = request.getQueryString("url_format_string");
        String urlFormatString;
        if (valueurlFormatString != null) {
            urlFormatString = valueurlFormatString;
        } else {
            throw new IllegalArgumentException("'url_format_string' parameter is required");
        }
        return imp.addLinkifierHttp(request, pattern, urlFormatString);
    }

    @ApiAction
    public Result createCustomProfileField(Http.Request request) throws Exception {
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuehint = request.getQueryString("hint");
        String hint;
        if (valuehint != null) {
            hint = valuehint;
        } else {
            hint = null;
        }
        String valuefieldType = request.getQueryString("field_type");
        Integer fieldType;
        if (valuefieldType != null) {
            fieldType = Integer.parseInt(valuefieldType);
        } else {
            throw new IllegalArgumentException("'field_type' parameter is required");
        }
        String valuefieldData = request.getQueryString("field_data");
        Object fieldData;
        if (valuefieldData != null) {
            fieldData = valuefieldData;
        } else {
            fieldData = null;
        }
        return imp.createCustomProfileFieldHttp(request, fieldType, name, hint, fieldData);
    }

    @ApiAction
    public Result getCustomEmoji(Http.Request request) throws Exception {
        return imp.getCustomEmojiHttp(request);
    }

    @ApiAction
    public Result getCustomProfileFields(Http.Request request) throws Exception {
        return imp.getCustomProfileFieldsHttp(request);
    }

    @ApiAction
    public Result getLinkifiers(Http.Request request) throws Exception {
        return imp.getLinkifiersHttp(request);
    }

    @ApiAction
    public Result getServerSettings(Http.Request request) throws Exception {
        return imp.getServerSettingsHttp(request);
    }

    @ApiAction
    public Result removeCodePlayground(Http.Request request, Integer playgroundId) throws Exception {
        return imp.removeCodePlaygroundHttp(request, playgroundId);
    }

    @ApiAction
    public Result removeLinkifier(Http.Request request, Integer filterId) throws Exception {
        return imp.removeLinkifierHttp(request, filterId);
    }

    @ApiAction
    public Result reorderCustomProfileFields(Http.Request request) throws Exception {
        String[] orderArray = request.queryString().get("order");
        if (orderArray == null) {
            throw new IllegalArgumentException("'order' parameter is required");
        }
        List<String> orderList = OpenAPIUtils.parametersToList("multi", orderArray);
        List<Integer> order = new ArrayList<>();
        for (String curParam : orderList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                order.add(Integer.parseInt(curParam));
            }
        }
        return imp.reorderCustomProfileFieldsHttp(request, order);
    }

    @ApiAction
    public Result updateLinkifier(Http.Request request, Integer filterId) throws Exception {
        String valuepattern = request.getQueryString("pattern");
        String pattern;
        if (valuepattern != null) {
            pattern = valuepattern;
        } else {
            throw new IllegalArgumentException("'pattern' parameter is required");
        }
        String valueurlFormatString = request.getQueryString("url_format_string");
        String urlFormatString;
        if (valueurlFormatString != null) {
            urlFormatString = valueurlFormatString;
        } else {
            throw new IllegalArgumentException("'url_format_string' parameter is required");
        }
        return imp.updateLinkifierHttp(request, filterId, pattern, urlFormatString);
    }

    @ApiAction
    public Result uploadCustomEmoji(Http.Request request, String emojiName) throws Exception {
        Http.MultipartFormData<TemporaryFile> bodyfilename = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> filename = bodyfilename.getFile("filename");
        return imp.uploadCustomEmojiHttp(request, emojiName, filename);
    }

}
