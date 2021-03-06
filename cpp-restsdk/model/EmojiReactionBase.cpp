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



#include "EmojiReactionBase.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




EmojiReactionBase::EmojiReactionBase()
{
    m_Emoji_code = utility::conversions::to_string_t("");
    m_Emoji_codeIsSet = false;
    m_Emoji_name = utility::conversions::to_string_t("");
    m_Emoji_nameIsSet = false;
    m_Reaction_type = utility::conversions::to_string_t("");
    m_Reaction_typeIsSet = false;
    m_User_id = 0;
    m_User_idIsSet = false;
    m_UserIsSet = false;
}

EmojiReactionBase::~EmojiReactionBase()
{
}

void EmojiReactionBase::validate()
{
    // TODO: implement validation
}

web::json::value EmojiReactionBase::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Emoji_codeIsSet)
    {
        val[utility::conversions::to_string_t("emoji_code")] = ModelBase::toJson(m_Emoji_code);
    }
    if(m_Emoji_nameIsSet)
    {
        val[utility::conversions::to_string_t("emoji_name")] = ModelBase::toJson(m_Emoji_name);
    }
    if(m_Reaction_typeIsSet)
    {
        val[utility::conversions::to_string_t("reaction_type")] = ModelBase::toJson(m_Reaction_type);
    }
    if(m_User_idIsSet)
    {
        val[utility::conversions::to_string_t("user_id")] = ModelBase::toJson(m_User_id);
    }
    if(m_UserIsSet)
    {
        val[utility::conversions::to_string_t("user")] = ModelBase::toJson(m_User);
    }

    return val;
}

bool EmojiReactionBase::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("emoji_code")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("emoji_code"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_emoji_code;
            ok &= ModelBase::fromJson(fieldValue, refVal_emoji_code);
            setEmojiCode(refVal_emoji_code);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("emoji_name")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("emoji_name"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_emoji_name;
            ok &= ModelBase::fromJson(fieldValue, refVal_emoji_name);
            setEmojiName(refVal_emoji_name);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("reaction_type")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("reaction_type"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_reaction_type;
            ok &= ModelBase::fromJson(fieldValue, refVal_reaction_type);
            setReactionType(refVal_reaction_type);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("user_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("user_id"));
        if(!fieldValue.is_null())
        {
            int32_t refVal_user_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_user_id);
            setUserId(refVal_user_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("user")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("user"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<EmojiReactionBase_allOf_user> refVal_user;
            ok &= ModelBase::fromJson(fieldValue, refVal_user);
            setUser(refVal_user);
        }
    }
    return ok;
}

void EmojiReactionBase::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_Emoji_codeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("emoji_code"), m_Emoji_code));
    }
    if(m_Emoji_nameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("emoji_name"), m_Emoji_name));
    }
    if(m_Reaction_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("reaction_type"), m_Reaction_type));
    }
    if(m_User_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("user_id"), m_User_id));
    }
    if(m_UserIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("user"), m_User));
    }
}

bool EmojiReactionBase::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("emoji_code")))
    {
        utility::string_t refVal_emoji_code;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("emoji_code")), refVal_emoji_code );
        setEmojiCode(refVal_emoji_code);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("emoji_name")))
    {
        utility::string_t refVal_emoji_name;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("emoji_name")), refVal_emoji_name );
        setEmojiName(refVal_emoji_name);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("reaction_type")))
    {
        utility::string_t refVal_reaction_type;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("reaction_type")), refVal_reaction_type );
        setReactionType(refVal_reaction_type);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("user_id")))
    {
        int32_t refVal_user_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("user_id")), refVal_user_id );
        setUserId(refVal_user_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("user")))
    {
        std::shared_ptr<EmojiReactionBase_allOf_user> refVal_user;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("user")), refVal_user );
        setUser(refVal_user);
    }
    return ok;
}

utility::string_t EmojiReactionBase::getEmojiCode() const
{
    return m_Emoji_code;
}

void EmojiReactionBase::setEmojiCode(const utility::string_t& value)
{
    m_Emoji_code = value;
    m_Emoji_codeIsSet = true;
}

bool EmojiReactionBase::emojiCodeIsSet() const
{
    return m_Emoji_codeIsSet;
}

void EmojiReactionBase::unsetEmoji_code()
{
    m_Emoji_codeIsSet = false;
}
utility::string_t EmojiReactionBase::getEmojiName() const
{
    return m_Emoji_name;
}

void EmojiReactionBase::setEmojiName(const utility::string_t& value)
{
    m_Emoji_name = value;
    m_Emoji_nameIsSet = true;
}

bool EmojiReactionBase::emojiNameIsSet() const
{
    return m_Emoji_nameIsSet;
}

void EmojiReactionBase::unsetEmoji_name()
{
    m_Emoji_nameIsSet = false;
}
utility::string_t EmojiReactionBase::getReactionType() const
{
    return m_Reaction_type;
}

void EmojiReactionBase::setReactionType(const utility::string_t& value)
{
    m_Reaction_type = value;
    m_Reaction_typeIsSet = true;
}

bool EmojiReactionBase::reactionTypeIsSet() const
{
    return m_Reaction_typeIsSet;
}

void EmojiReactionBase::unsetReaction_type()
{
    m_Reaction_typeIsSet = false;
}
int32_t EmojiReactionBase::getUserId() const
{
    return m_User_id;
}

void EmojiReactionBase::setUserId(int32_t value)
{
    m_User_id = value;
    m_User_idIsSet = true;
}

bool EmojiReactionBase::userIdIsSet() const
{
    return m_User_idIsSet;
}

void EmojiReactionBase::unsetUser_id()
{
    m_User_idIsSet = false;
}
std::shared_ptr<EmojiReactionBase_allOf_user> EmojiReactionBase::getUser() const
{
    return m_User;
}

void EmojiReactionBase::setUser(const std::shared_ptr<EmojiReactionBase_allOf_user>& value)
{
    m_User = value;
    m_UserIsSet = true;
}

bool EmojiReactionBase::userIsSet() const
{
    return m_UserIsSet;
}

void EmojiReactionBase::unsetUser()
{
    m_UserIsSet = false;
}
}
}
}
}


