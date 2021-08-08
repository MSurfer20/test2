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
#import "OAIEmojiReactionAllOf.h"
#import "OAIEmojiReactionBase.h"
@protocol OAIAnyType;
@class OAIAnyType;
@protocol OAIEmojiReactionAllOf;
@class OAIEmojiReactionAllOf;
@protocol OAIEmojiReactionBase;
@class OAIEmojiReactionBase;



@protocol OAIEmojiReaction
@end

@interface OAIEmojiReaction : OAIObject


@property(nonatomic) OAIAnyType* emojiCode;

@property(nonatomic) OAIAnyType* emojiName;

@property(nonatomic) OAIAnyType* reactionType;

@property(nonatomic) OAIAnyType* userId;

@property(nonatomic) OAIAnyType* user;

@end