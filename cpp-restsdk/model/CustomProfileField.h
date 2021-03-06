/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.2.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CustomProfileField.h
 *
 * Dictionary containing the details of a custom profile field configured for this organization. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CustomProfileField_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CustomProfileField_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// Dictionary containing the details of a custom profile field configured for this organization. 
/// </summary>
class  CustomProfileField
    : public ModelBase
{
public:
    CustomProfileField();
    virtual ~CustomProfileField();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CustomProfileField members

    /// <summary>
    /// The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
    /// </summary>
    int32_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(int32_t value);

    /// <summary>
    /// An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
    /// </summary>
    int32_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(int32_t value);

    /// <summary>
    /// Custom profile fields are displayed in both settings UI and UI showing users&#39; profiles in increasing &#x60;order&#x60;. 
    /// </summary>
    int32_t getOrder() const;
    bool orderIsSet() const;
    void unsetOrder();

    void setOrder(int32_t value);

    /// <summary>
    /// The name of the custom profile field. 
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);

    /// <summary>
    /// The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
    /// </summary>
    utility::string_t getHint() const;
    bool hintIsSet() const;
    void unsetHint();

    void setHint(const utility::string_t& value);

    /// <summary>
    /// Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
    /// </summary>
    utility::string_t getFieldData() const;
    bool fieldDataIsSet() const;
    void unsetField_data();

    void setFieldData(const utility::string_t& value);


protected:
    int32_t m_Id;
    bool m_IdIsSet;
    int32_t m_Type;
    bool m_TypeIsSet;
    int32_t m_Order;
    bool m_OrderIsSet;
    utility::string_t m_Name;
    bool m_NameIsSet;
    utility::string_t m_Hint;
    bool m_HintIsSet;
    utility::string_t m_Field_data;
    bool m_Field_dataIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CustomProfileField_H_ */
