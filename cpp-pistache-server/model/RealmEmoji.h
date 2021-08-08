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
/*
 * RealmEmoji.h
 *
 * &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
 */

#ifndef RealmEmoji_H_
#define RealmEmoji_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
/// </summary>
class  RealmEmoji
{
public:
    RealmEmoji();
    virtual ~RealmEmoji() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const RealmEmoji& rhs) const;
    bool operator!=(const RealmEmoji& rhs) const;

    /////////////////////////////////////////////
    /// RealmEmoji members

    /// <summary>
    /// The ID for this emoji, same as the object&#39;s key. 
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;). 
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// The path relative to the organization&#39;s URL where the emoji&#39;s image can be found. 
    /// </summary>
    std::string getSourceUrl() const;
    void setSourceUrl(std::string const& value);
    bool sourceUrlIsSet() const;
    void unsetSource_url();
    /// <summary>
    /// Whether the emoji has been deactivated or not. 
    /// </summary>
    bool isDeactivated() const;
    void setDeactivated(bool const value);
    bool deactivatedIsSet() const;
    void unsetDeactivated();
    /// <summary>
    /// The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field. 
    /// </summary>
    int32_t getAuthorId() const;
    void setAuthorId(int32_t const value);
    bool authorIdIsSet() const;
    void unsetAuthor_id();

    friend void to_json(nlohmann::json& j, const RealmEmoji& o);
    friend void from_json(const nlohmann::json& j, RealmEmoji& o);
protected:
    std::string m_Id;
    bool m_IdIsSet;
    std::string m_Name;
    bool m_NameIsSet;
    std::string m_Source_url;
    bool m_Source_urlIsSet;
    bool m_Deactivated;
    bool m_DeactivatedIsSet;
    int32_t m_Author_id;
    bool m_Author_idIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* RealmEmoji_H_ */
