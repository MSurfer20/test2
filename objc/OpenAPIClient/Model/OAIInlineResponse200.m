#import "OAIInlineResponse200.h"

@implementation OAIInlineResponse200

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"botEmail": @"bot_email", @"botFullName": @"bot_full_name", @"data": @"data", @"trigger": @"trigger", @"token": @"token", @"message": @"message" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"botEmail", @"botFullName", @"data", @"trigger", @"token", @"message"];
  return [optionalProperties containsObject:propertyName];
}

@end
