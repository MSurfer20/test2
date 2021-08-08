#import "OAIMessagesBase.h"

@implementation OAIMessagesBase

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"avatarUrl": @"avatar_url", @"client": @"client", @"content": @"content", @"contentType": @"content_type", @"displayRecipient": @"display_recipient", @"_id": @"id", @"isMeMessage": @"is_me_message", @"reactions": @"reactions", @"recipientId": @"recipient_id", @"senderEmail": @"sender_email", @"senderFullName": @"sender_full_name", @"senderId": @"sender_id", @"senderRealmStr": @"sender_realm_str", @"streamId": @"stream_id", @"subject": @"subject", @"topicLinks": @"topic_links", @"submessages": @"submessages", @"timestamp": @"timestamp", @"type": @"type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"avatarUrl", @"client", @"content", @"contentType", @"displayRecipient", @"_id", @"isMeMessage", @"reactions", @"recipientId", @"senderEmail", @"senderFullName", @"senderId", @"senderRealmStr", @"streamId", @"subject", @"topicLinks", @"submessages", @"timestamp", @"type"];
  return [optionalProperties containsObject:propertyName];
}

@end
