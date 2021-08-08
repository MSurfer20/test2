export * from './AuthenticationApi';
import { AuthenticationApi } from './AuthenticationApi';
export * from './DraftsApi';
import { DraftsApi } from './DraftsApi';
export * from './MessagesApi';
import { MessagesApi } from './MessagesApi';
export * from './RealTimeEventsApi';
import { RealTimeEventsApi } from './RealTimeEventsApi';
export * from './ServerAndOrganizationsApi';
import { ServerAndOrganizationsApi } from './ServerAndOrganizationsApi';
export * from './StreamsApi';
import { StreamsApi } from './StreamsApi';
export * from './UsersApi';
import { UsersApi } from './UsersApi';
export * from './WebhooksApi';
import { WebhooksApi } from './WebhooksApi';
export const APIS = [AuthenticationApi, DraftsApi, MessagesApi, RealTimeEventsApi, ServerAndOrganizationsApi, StreamsApi, UsersApi, WebhooksApi];
