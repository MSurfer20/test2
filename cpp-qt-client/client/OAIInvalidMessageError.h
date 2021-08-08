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
 * OAIInvalidMessageError.h
 *
 * 
 */

#ifndef OAIInvalidMessageError_H
#define OAIInvalidMessageError_H

#include <QJsonObject>

#include "OAIAnyType.h"
#include "OAIInvalidMessageError_allOf.h"
#include "OAIJsonSuccessBase.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIInvalidMessageError : public OAIObject {
public:
    OAIInvalidMessageError();
    OAIInvalidMessageError(QString json);
    ~OAIInvalidMessageError() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIAnyType getResult() const;
    void setResult(const OAIAnyType &result);
    bool is_result_Set() const;
    bool is_result_Valid() const;

    OAIAnyType getMsg() const;
    void setMsg(const OAIAnyType &msg);
    bool is_msg_Set() const;
    bool is_msg_Valid() const;

    QString getRawContent() const;
    void setRawContent(const QString &raw_content);
    bool is_raw_content_Set() const;
    bool is_raw_content_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIAnyType result;
    bool m_result_isSet;
    bool m_result_isValid;

    OAIAnyType msg;
    bool m_msg_isSet;
    bool m_msg_isValid;

    QString raw_content;
    bool m_raw_content_isSet;
    bool m_raw_content_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIInvalidMessageError)

#endif // OAIInvalidMessageError_H