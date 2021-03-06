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
 * OAINonExistingStreamError_allOf.h
 *
 * 
 */

#ifndef OAINonExistingStreamError_allOf_H
#define OAINonExistingStreamError_allOf_H

#include <QJsonObject>

#include "OAIAnyType.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAINonExistingStreamError_allOf : public OAIObject {
public:
    OAINonExistingStreamError_allOf();
    OAINonExistingStreamError_allOf(QString json);
    ~OAINonExistingStreamError_allOf() override;

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

    OAIAnyType getCode() const;
    void setCode(const OAIAnyType &code);
    bool is_code_Set() const;
    bool is_code_Valid() const;

    QString getStream() const;
    void setStream(const QString &stream);
    bool is_stream_Set() const;
    bool is_stream_Valid() const;

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

    OAIAnyType code;
    bool m_code_isSet;
    bool m_code_isValid;

    QString stream;
    bool m_stream_isSet;
    bool m_stream_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAINonExistingStreamError_allOf)

#endif // OAINonExistingStreamError_allOf_H
