/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#ifndef OAI_OAIMessagesApiHandler_H
#define OAI_OAIMessagesApiHandler_H

#include <QObject>

#include "OAIAnyType.h"
#include "OAICodedError.h"
#include "OAIHttpFileElement.h"
#include "OAIInvalidMessageError.h"
#include "OAIJsonSuccess.h"
#include "OAIJsonSuccessBase.h"
#include "OAIObject.h"
#include "OAIOneOfobjectobject.h"
#include "OAIOneOfstringinteger.h"
#include <QString>

namespace OpenAPI {

class OAIMessagesApiHandler : public QObject
{
    Q_OBJECT
    
public:
    OAIMessagesApiHandler();
    virtual ~OAIMessagesApiHandler();


public slots:
    virtual void addReaction(qint32 message_id, QString emoji_name, QString emoji_code, QString reaction_type);
    virtual void checkMessagesMatchNarrow(QList<qint32> msg_ids, QList<OAIObject> narrow);
    virtual void deleteMessage(qint32 message_id);
    virtual void getFileTemporaryUrl(qint32 realm_id_str, QString filename);
    virtual void getMessageHistory(qint32 message_id);
    virtual void getMessages(qint32 num_before, qint32 num_after, OAIOneOfstringinteger anchor, QList<OAIObject> narrow, bool client_gravatar, bool apply_markdown, bool use_first_unread_anchor);
    virtual void getRawMessage(qint32 message_id);
    virtual void markAllAsRead();
    virtual void markStreamAsRead(qint32 stream_id);
    virtual void markTopicAsRead(qint32 stream_id, QString topic_name);
    virtual void removeReaction(qint32 message_id, QString emoji_name, QString emoji_code, QString reaction_type);
    virtual void renderMessage(QString content);
    virtual void sendMessage(QString type, QList<qint32> to, QString content, QString topic, QString queue_id, QString local_id);
    virtual void updateMessage(qint32 message_id, QString topic, QString propagate_mode, bool send_notification_to_old_thread, bool send_notification_to_new_thread, QString content, qint32 stream_id);
    virtual void updateMessageFlags(QList<qint32> messages, QString op, QString flag);
    virtual void uploadFile(OAIHttpFileElement filename);
    

};

}

#endif // OAI_OAIMessagesApiHandler_H