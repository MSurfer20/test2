import {interfaces} from 'inversify';

import { AuthenticationService } from './api/authentication.service';
import { DraftsService } from './api/drafts.service';
import { MessagesService } from './api/messages.service';
import { RealTimeEventsService } from './api/realTimeEvents.service';
import { ServerAndOrganizationsService } from './api/serverAndOrganizations.service';
import { StreamsService } from './api/streams.service';
import { UsersService } from './api/users.service';
import { WebhooksService } from './api/webhooks.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<AuthenticationService>('AuthenticationService').to(AuthenticationService).inSingletonScope();
        container.bind<DraftsService>('DraftsService').to(DraftsService).inSingletonScope();
        container.bind<MessagesService>('MessagesService').to(MessagesService).inSingletonScope();
        container.bind<RealTimeEventsService>('RealTimeEventsService').to(RealTimeEventsService).inSingletonScope();
        container.bind<ServerAndOrganizationsService>('ServerAndOrganizationsService').to(ServerAndOrganizationsService).inSingletonScope();
        container.bind<StreamsService>('StreamsService').to(StreamsService).inSingletonScope();
        container.bind<UsersService>('UsersService').to(UsersService).inSingletonScope();
        container.bind<WebhooksService>('WebhooksService').to(WebhooksService).inSingletonScope();
    }
}
