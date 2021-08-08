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
 * OAIJsonSuccessBase_allOf.h
 *
 * 
 */

#ifndef OAIJsonSuccessBase_allOf_H
#define OAIJsonSuccessBase_allOf_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIJsonSuccessBase_allOf : public OAIObject {
public:
    OAIJsonSuccessBase_allOf();
    OAIJsonSuccessBase_allOf(QString json);
    ~OAIJsonSuccessBase_allOf() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getResult() const;
    void setResult(const QString &result);
    bool is_result_Set() const;
    bool is_result_Valid() const;

    QString getMsg() const;
    void setMsg(const QString &msg);
    bool is_msg_Set() const;
    bool is_msg_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString result;
    bool m_result_isSet;
    bool m_result_isValid;

    QString msg;
    bool m_msg_isSet;
    bool m_msg_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIJsonSuccessBase_allOf)

#endif // OAIJsonSuccessBase_allOf_H