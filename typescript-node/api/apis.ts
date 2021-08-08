export * from './authenticationApi';
import { AuthenticationApi } from './authenticationApi';
export * from './messagesApi';
import { MessagesApi } from './messagesApi';
export * from './realTimeEventsApi';
import { RealTimeEventsApi } from './realTimeEventsApi';
export * from './serverAndOrganizationsApi';
import { ServerAndOrganizationsApi } from './serverAndOrganizationsApi';
export * from './streamsApi';
import { StreamsApi } from './streamsApi';
export * from './usersApi';
import { UsersApi } from './usersApi';
export * from './webhooksApi';
import { WebhooksApi } from './webhooksApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [AuthenticationApi, MessagesApi, RealTimeEventsApi, ServerAndOrganizationsApi, StreamsApi, UsersApi, WebhooksApi];
