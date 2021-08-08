#import "OAIEmojiReaction.h"

@implementation OAIEmojiReaction

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"emojiCode": @"emoji_code", @"emojiName": @"emoji_name", @"reactionType": @"reaction_type", @"userId": @"user_id", @"user": @"user" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"emojiCode", @"emojiName", @"reactionType", @"userId", @"user"];
  return [optionalProperties containsObject:propertyName];
}

@end
