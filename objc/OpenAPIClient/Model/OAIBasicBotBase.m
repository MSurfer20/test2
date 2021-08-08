#import "OAIBasicBotBase.h"

@implementation OAIBasicBotBase

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"userId": @"user_id", @"fullName": @"full_name", @"apiKey": @"api_key", @"defaultSendingStream": @"default_sending_stream", @"defaultEventsRegisterStream": @"default_events_register_stream", @"defaultAllPublicStreams": @"default_all_public_streams", @"avatarUrl": @"avatar_url", @"ownerId": @"owner_id", @"services": @"services" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"userId", @"fullName", @"apiKey", @"defaultSendingStream", @"defaultEventsRegisterStream", @"defaultAllPublicStreams", @"avatarUrl", @"ownerId", @"services"];
  return [optionalProperties containsObject:propertyName];
}

@end
