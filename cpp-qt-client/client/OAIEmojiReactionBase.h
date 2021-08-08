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

/*
 * OAIEmojiReactionBase.h
 *
 * 
 */

#ifndef OAIEmojiReactionBase_H
#define OAIEmojiReactionBase_H

#include <QJsonObject>

#include "OAIEmojiBase.h"
#include "OAIEmojiReactionBase_allOf.h"
#include "OAIEmojiReactionBase_allOf_user.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIEmojiReactionBase : public OAIObject {
public:
    OAIEmojiReactionBase();
    OAIEmojiReactionBase(QString json);
    ~OAIEmojiReactionBase() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getEmojiCode() const;
    void setEmojiCode(const QString &emoji_code);
    bool is_emoji_code_Set() const;
    bool is_emoji_code_Valid() const;

    QString getEmojiName() const;
    void setEmojiName(const QString &emoji_name);
    bool is_emoji_name_Set() const;
    bool is_emoji_name_Valid() const;

    QString getReactionType() const;
    void setReactionType(const QString &reaction_type);
    bool is_reaction_type_Set() const;
    bool is_reaction_type_Valid() const;

    qint32 getUserId() const;
    void setUserId(const qint32 &user_id);
    bool is_user_id_Set() const;
    bool is_user_id_Valid() const;

    Q_DECL_DEPRECATED OAIEmojiReactionBase_allOf_user getUser() const;
    Q_DECL_DEPRECATED void setUser(const OAIEmojiReactionBase_allOf_user &user);
    Q_DECL_DEPRECATED bool is_user_Set() const;
    Q_DECL_DEPRECATED bool is_user_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString emoji_code;
    bool m_emoji_code_isSet;
    bool m_emoji_code_isValid;

    QString emoji_name;
    bool m_emoji_name_isSet;
    bool m_emoji_name_isValid;

    QString reaction_type;
    bool m_reaction_type_isSet;
    bool m_reaction_type_isValid;

    qint32 user_id;
    bool m_user_id_isSet;
    bool m_user_id_isValid;

    OAIEmojiReactionBase_allOf_user user;
    bool m_user_isSet;
    bool m_user_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIEmojiReactionBase)

#endif // OAIEmojiReactionBase_H
