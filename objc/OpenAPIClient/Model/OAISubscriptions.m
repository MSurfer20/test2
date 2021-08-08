#import "OAISubscriptions.h"

@implementation OAISubscriptions

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"streamId": @"stream_id", @"name": @"name", @"_description": @"description", @"renderedDescription": @"rendered_description", @"dateCreated": @"date_created", @"inviteOnly": @"invite_only", @"subscribers": @"subscribers", @"desktopNotifications": @"desktop_notifications", @"emailNotifications": @"email_notifications", @"wildcardMentionsNotify": @"wildcard_mentions_notify", @"pushNotifications": @"push_notifications", @"audibleNotifications": @"audible_notifications", @"pinToTop": @"pin_to_top", @"emailAddress": @"email_address", @"isMuted": @"is_muted", @"inHomeView": @"in_home_view", @"isAnnouncementOnly": @"is_announcement_only", @"isWebPublic": @"is_web_public", @"role": @"role", @"color": @"color", @"streamPostPolicy": @"stream_post_policy", @"messageRetentionDays": @"message_retention_days", @"historyPublicToSubscribers": @"history_public_to_subscribers", @"firstMessageId": @"first_message_id", @"streamWeeklyTraffic": @"stream_weekly_traffic" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"streamId", @"name", @"_description", @"renderedDescription", @"dateCreated", @"inviteOnly", @"subscribers", @"desktopNotifications", @"emailNotifications", @"wildcardMentionsNotify", @"pushNotifications", @"audibleNotifications", @"pinToTop", @"emailAddress", @"isMuted", @"inHomeView", @"isAnnouncementOnly", @"isWebPublic", @"role", @"color", @"streamPostPolicy", @"messageRetentionDays", @"historyPublicToSubscribers", @"firstMessageId", @"streamWeeklyTraffic"];
  return [optionalProperties containsObject:propertyName];
}

@end
