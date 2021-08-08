import * as api from './api/api';
import * as angular from 'angular';

const apiModule = angular.module('api', [])
.service('AuthenticationApi', api.AuthenticationApi)
.service('DraftsApi', api.DraftsApi)
.service('MessagesApi', api.MessagesApi)
.service('RealTimeEventsApi', api.RealTimeEventsApi)
.service('ServerAndOrganizationsApi', api.ServerAndOrganizationsApi)
.service('StreamsApi', api.StreamsApi)
.service('UsersApi', api.UsersApi)
.service('WebhooksApi', api.WebhooksApi)

export default apiModule;
