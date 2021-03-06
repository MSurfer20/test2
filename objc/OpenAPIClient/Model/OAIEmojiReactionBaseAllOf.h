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


#import "OAIEmojiReactionBaseAllOfUser.h"
@protocol OAIEmojiReactionBaseAllOfUser;
@class OAIEmojiReactionBaseAllOfUser;



@protocol OAIEmojiReactionBaseAllOf
@end

@interface OAIEmojiReactionBaseAllOf : OAIObject

/* The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.  [optional]
 */
@property(nonatomic) NSNumber* userId;

@property(nonatomic) OAIEmojiReactionBaseAllOfUser* user;

@end
