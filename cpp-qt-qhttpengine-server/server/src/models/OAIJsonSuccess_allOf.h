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
 * OAIJsonSuccess_allOf.h
 *
 * 
 */

#ifndef OAIJsonSuccess_allOf_H
#define OAIJsonSuccess_allOf_H

#include <QJsonObject>

#include "OAIAnyType.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIJsonSuccess_allOf : public OAIObject {
public:
    OAIJsonSuccess_allOf();
    OAIJsonSuccess_allOf(QString json);
    ~OAIJsonSuccess_allOf() override;

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
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIJsonSuccess_allOf)

#endif // OAIJsonSuccess_allOf_H
