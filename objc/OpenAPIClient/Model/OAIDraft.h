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





@protocol OAIDraft
@end

@interface OAIDraft : OAIObject

/* The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited.  [optional]
 */
@property(nonatomic) NSNumber* _id;
/* The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages).  
 */
@property(nonatomic) NSString* type;
/* An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array.  
 */
@property(nonatomic) NSArray<NSNumber*>* to;
/* For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes.  
 */
@property(nonatomic) NSString* topic;
/* The body of the draft. Should not contain null bytes.  
 */
@property(nonatomic) NSString* content;
/* A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server.  [optional]
 */
@property(nonatomic) NSNumber* timestamp;

@end
