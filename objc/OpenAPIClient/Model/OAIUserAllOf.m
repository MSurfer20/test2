#import "OAIUserAllOf.h"

@implementation OAIUserAllOf

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"email": @"email", @"isBot": @"is_bot", @"avatarUrl": @"avatar_url", @"avatarVersion": @"avatar_version", @"fullName": @"full_name", @"isAdmin": @"is_admin", @"isOwner": @"is_owner", @"isBillingAdmin": @"is_billing_admin", @"role": @"role", @"botType": @"bot_type", @"userId": @"user_id", @"botOwnerId": @"bot_owner_id", @"isActive": @"is_active", @"isGuest": @"is_guest", @"timezone": @"timezone", @"dateJoined": @"date_joined", @"deliveryEmail": @"delivery_email", @"profileData": @"profile_data" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"email", @"isBot", @"avatarUrl", @"avatarVersion", @"fullName", @"isAdmin", @"isOwner", @"isBillingAdmin", @"role", @"botType", @"userId", @"botOwnerId", @"isActive", @"isGuest", @"timezone", @"dateJoined", @"deliveryEmail", @"profileData"];
  return [optionalProperties containsObject:propertyName];
}

@end
