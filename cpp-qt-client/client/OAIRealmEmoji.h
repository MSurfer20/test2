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
 * OAIRealmEmoji.h
 *
 * &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
 */

#ifndef OAIRealmEmoji_H
#define OAIRealmEmoji_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIRealmEmoji : public OAIObject {
public:
    OAIRealmEmoji();
    OAIRealmEmoji(QString json);
    ~OAIRealmEmoji() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QString getSourceUrl() const;
    void setSourceUrl(const QString &source_url);
    bool is_source_url_Set() const;
    bool is_source_url_Valid() const;

    bool isDeactivated() const;
    void setDeactivated(const bool &deactivated);
    bool is_deactivated_Set() const;
    bool is_deactivated_Valid() const;

    qint32 getAuthorId() const;
    void setAuthorId(const qint32 &author_id);
    bool is_author_id_Set() const;
    bool is_author_id_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString source_url;
    bool m_source_url_isSet;
    bool m_source_url_isValid;

    bool deactivated;
    bool m_deactivated_isSet;
    bool m_deactivated_isValid;

    qint32 author_id;
    bool m_author_id_isSet;
    bool m_author_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIRealmEmoji)

#endif // OAIRealmEmoji_H
