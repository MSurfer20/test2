package controllers;

import apimodels.CodedError;
import apimodels.JsonError;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;
import apimodels.NonExistingStreamError;
import apimodels.OneOfobjectobject;
import apimodels.OneOfstringinteger;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
public class StreamsApiControllerImp extends StreamsApiControllerImpInterface {
    @Override
    public JsonSuccess archiveStream(Http.Request request, Integer streamId) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccessBase createBigBlueButtonVideoCall(Http.Request request) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccess deleteTopic(Http.Request request, Integer streamId, @NotNull String topicName) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccessBase getStreamId(Http.Request request, @NotNull String stream) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getStreamTopics(Http.Request request, Integer streamId) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getStreams(Http.Request request, Boolean includePublic, Boolean includeWebPublic, Boolean includeSubscribed, Boolean includeAllActive, Boolean includeDefault, Boolean includeOwnerSubscribed) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getSubscribers(Http.Request request, Integer streamId) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getSubscriptionStatus(Http.Request request, Integer userId, Integer streamId) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getSubscriptions(Http.Request request, Boolean includeSubscribers) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccess muteTopic(Http.Request request, @NotNull String topic, @NotNull String op, String stream, Integer streamId) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public OneOfobjectobject subscribe(Http.Request request, @NotNull List<Object> subscriptions, List<OneOfstringinteger> principals, Boolean authorizationErrorsFatal, Boolean announce, Boolean inviteOnly, Boolean historyPublicToSubscribers, Integer streamPostPolicy, OneOfstringinteger messageRetentionDays) throws Exception {
        //Do your magic!!!
        return new OneOfobjectobject();
    }

    @Override
    public JsonSuccessBase unsubscribe(Http.Request request, @NotNull List<String> subscriptions, List<OneOfstringinteger> principals) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccess updateStream(Http.Request request, Integer streamId, String description, String newName, Boolean isPrivate, Boolean isAnnouncementOnly, Integer streamPostPolicy, Boolean historyPublicToSubscribers, OneOfstringinteger messageRetentionDays) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccessBase updateSubscriptionSettings(Http.Request request, @NotNull List<Object> subscriptionData) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase updateSubscriptions(Http.Request request, List<String> delete, List<Object> add) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

}
