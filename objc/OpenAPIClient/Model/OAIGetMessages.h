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
#import "OAIGetMessagesAllOf.h"
#import "OAIMessagesBase.h"
@protocol OAIAnyType;
@class OAIAnyType;
@protocol OAIGetMessagesAllOf;
@class OAIGetMessagesAllOf;
@protocol OAIMessagesBase;
@class OAIMessagesBase;



@protocol OAIGetMessages
@end

@interface OAIGetMessages : OAIObject


@property(nonatomic) OAIAnyType* avatarUrl;

@property(nonatomic) OAIAnyType* client;

@property(nonatomic) OAIAnyType* content;

@property(nonatomic) OAIAnyType* contentType;

@property(nonatomic) OAIAnyType* displayRecipient;

@property(nonatomic) OAIAnyType* _id;

@property(nonatomic) OAIAnyType* isMeMessage;

@property(nonatomic) OAIAnyType* reactions;

@property(nonatomic) OAIAnyType* recipientId;

@property(nonatomic) OAIAnyType* senderEmail;

@property(nonatomic) OAIAnyType* senderFullName;

@property(nonatomic) OAIAnyType* senderId;

@property(nonatomic) OAIAnyType* senderRealmStr;

@property(nonatomic) OAIAnyType* streamId;

@property(nonatomic) OAIAnyType* subject;

@property(nonatomic) OAIAnyType* topicLinks;

@property(nonatomic) OAIAnyType* submessages;

@property(nonatomic) OAIAnyType* timestamp;

@property(nonatomic) OAIAnyType* type;
/* The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  [optional]
 */
@property(nonatomic) NSArray<NSString*>* flags;
/* The UNIX timestamp for when the message was last edited, in UTC seconds.  [optional]
 */
@property(nonatomic) NSNumber* lastEditTimestamp;
/* Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  [optional]
 */
@property(nonatomic) NSString* matchContent;
/* Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  [optional]
 */
@property(nonatomic) NSString* matchSubject;

@end
