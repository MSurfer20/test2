package org.openapitools.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import org.openapitools.api.impl.AttachmentsApiServiceImpl;
import org.openapitools.api.impl.CallsApiServiceImpl;
import org.openapitools.api.impl.DevFetchApiKeyApiServiceImpl;
import org.openapitools.api.impl.DraftsApiServiceImpl;
import org.openapitools.api.impl.EventsApiServiceImpl;
import org.openapitools.api.impl.FetchApiKeyApiServiceImpl;
import org.openapitools.api.impl.GetStreamIdApiServiceImpl;
import org.openapitools.api.impl.MarkAllAsReadApiServiceImpl;
import org.openapitools.api.impl.MarkStreamAsReadApiServiceImpl;
import org.openapitools.api.impl.MarkTopicAsReadApiServiceImpl;
import org.openapitools.api.impl.MessagesApiServiceImpl;
import org.openapitools.api.impl.RealTimeApiServiceImpl;
import org.openapitools.api.impl.RealmApiServiceImpl;
import org.openapitools.api.impl.RegisterApiServiceImpl;
import org.openapitools.api.impl.RestErrorHandlingApiServiceImpl;
import org.openapitools.api.impl.ServerSettingsApiServiceImpl;
import org.openapitools.api.impl.SettingsApiServiceImpl;
import org.openapitools.api.impl.StreamsApiServiceImpl;
import org.openapitools.api.impl.TypingApiServiceImpl;
import org.openapitools.api.impl.UserGroupsApiServiceImpl;
import org.openapitools.api.impl.UserUploadsApiServiceImpl;
import org.openapitools.api.impl.UsersApiServiceImpl;
import org.openapitools.api.impl.ZulipOutgoingWebhookApiServiceImpl;

@ApplicationPath("/api/v1")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(AttachmentsApiServiceImpl.class);
        resources.add(CallsApiServiceImpl.class);
        resources.add(DevFetchApiKeyApiServiceImpl.class);
        resources.add(DraftsApiServiceImpl.class);
        resources.add(EventsApiServiceImpl.class);
        resources.add(FetchApiKeyApiServiceImpl.class);
        resources.add(GetStreamIdApiServiceImpl.class);
        resources.add(MarkAllAsReadApiServiceImpl.class);
        resources.add(MarkStreamAsReadApiServiceImpl.class);
        resources.add(MarkTopicAsReadApiServiceImpl.class);
        resources.add(MessagesApiServiceImpl.class);
        resources.add(RealTimeApiServiceImpl.class);
        resources.add(RealmApiServiceImpl.class);
        resources.add(RegisterApiServiceImpl.class);
        resources.add(RestErrorHandlingApiServiceImpl.class);
        resources.add(ServerSettingsApiServiceImpl.class);
        resources.add(SettingsApiServiceImpl.class);
        resources.add(StreamsApiServiceImpl.class);
        resources.add(TypingApiServiceImpl.class);
        resources.add(UserGroupsApiServiceImpl.class);
        resources.add(UserUploadsApiServiceImpl.class);
        resources.add(UsersApiServiceImpl.class);
        resources.add(ZulipOutgoingWebhookApiServiceImpl.class);

        return resources;
    }




}