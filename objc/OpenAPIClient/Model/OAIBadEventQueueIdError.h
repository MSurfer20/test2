#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* Zulip REST API
* Powerful open source group chat 
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#import "OAIAnyType.h"
#import "OAIBadEventQueueIdErrorAllOf.h"
#import "OAICodedErrorBase.h"
@protocol OAIAnyType;
@class OAIAnyType;
@protocol OAIBadEventQueueIdErrorAllOf;
@class OAIBadEventQueueIdErrorAllOf;
@protocol OAICodedErrorBase;
@class OAICodedErrorBase;



@protocol OAIBadEventQueueIdError
@end

@interface OAIBadEventQueueIdError : OAIObject


@property(nonatomic) OAIAnyType* result;

@property(nonatomic) OAIAnyType* msg;

@property(nonatomic) OAIAnyType* code;
/* The string that identifies the invalid event queue.  [optional]
 */
@property(nonatomic) NSString* queueId;

@end