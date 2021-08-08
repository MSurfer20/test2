#import "OAIBasicStreamBase.h"

@implementation OAIBasicStreamBase

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"streamId": @"stream_id", @"name": @"name", @"_description": @"description", @"dateCreated": @"date_created", @"inviteOnly": @"invite_only", @"renderedDescription": @"rendered_description", @"isWebPublic": @"is_web_public", @"streamPostPolicy": @"stream_post_policy", @"messageRetentionDays": @"message_retention_days", @"historyPublicToSubscribers": @"history_public_to_subscribers", @"firstMessageId": @"first_message_id", @"isAnnouncementOnly": @"is_announcement_only" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"streamId", @"name", @"_description", @"dateCreated", @"inviteOnly", @"renderedDescription", @"isWebPublic", @"streamPostPolicy", @"messageRetentionDays", @"historyPublicToSubscribers", @"firstMessageId", @"isAnnouncementOnly"];
  return [optionalProperties containsObject:propertyName];
}

@end
