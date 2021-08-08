import com.google.inject.AbstractModule;

import controllers.*;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(AuthenticationApiControllerImpInterface.class).to(AuthenticationApiControllerImp.class);
        bind(MessagesApiControllerImpInterface.class).to(MessagesApiControllerImp.class);
        bind(RealTimeEventsApiControllerImpInterface.class).to(RealTimeEventsApiControllerImp.class);
        bind(ServerAndOrganizationsApiControllerImpInterface.class).to(ServerAndOrganizationsApiControllerImp.class);
        bind(StreamsApiControllerImpInterface.class).to(StreamsApiControllerImp.class);
        bind(UsersApiControllerImpInterface.class).to(UsersApiControllerImp.class);
        bind(WebhooksApiControllerImpInterface.class).to(WebhooksApiControllerImp.class);
    }
}