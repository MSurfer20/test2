#import "OAIRealmExport.h"

@implementation OAIRealmExport

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"actingUserId": @"acting_user_id", @"exportTime": @"export_time", @"deletedTimestamp": @"deleted_timestamp", @"failedTimestamp": @"failed_timestamp", @"exportUrl": @"export_url", @"pending": @"pending" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"actingUserId", @"exportTime", @"deletedTimestamp", @"failedTimestamp", @"exportUrl", @"pending"];
  return [optionalProperties containsObject:propertyName];
}

@end
