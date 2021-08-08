import { DynamicModule, HttpService, HttpModule, Module, Global } from '@nestjs/common';
import { Configuration } from './configuration';

import { AuthenticationService } from './api/authentication.service';
import { MessagesService } from './api/messages.service';
import { RealTimeEventsService } from './api/realTimeEvents.service';
import { ServerAndOrganizationsService } from './api/serverAndOrganizations.service';
import { StreamsService } from './api/streams.service';
import { UsersService } from './api/users.service';
import { WebhooksService } from './api/webhooks.service';

@Global()
@Module({
  imports:      [ HttpModule ],
  exports:      [
    AuthenticationService,
    MessagesService,
    RealTimeEventsService,
    ServerAndOrganizationsService,
    StreamsService,
    UsersService,
    WebhooksService
  ],
  providers: [
    AuthenticationService,
    MessagesService,
    RealTimeEventsService,
    ServerAndOrganizationsService,
    StreamsService,
    UsersService,
    WebhooksService
  ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): DynamicModule {
        return {
            module: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    constructor( httpService: HttpService) { }
}
