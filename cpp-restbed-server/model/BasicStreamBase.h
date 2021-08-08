/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.2.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * BasicStreamBase.h
 *
 * Object containing basic details about the stream. 
 */

#ifndef BasicStreamBase_H_
#define BasicStreamBase_H_



#include <string>
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Object containing basic details about the stream. 
/// </summary>
class  BasicStreamBase 
{
public:
    BasicStreamBase();
    virtual ~BasicStreamBase();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// BasicStreamBase members

    /// <summary>
    /// The unique ID of the stream. 
    /// </summary>
    int32_t getStreamId() const;
    void setStreamId(int32_t value);

    /// <summary>
    /// The name of the stream. 
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string value);

    /// <summary>
    /// The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
    /// </summary>
    int32_t getDateCreated() const;
    void setDateCreated(int32_t value);

    /// <summary>
    /// Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
    /// </summary>
    bool isInviteOnly() const;
    void setInviteOnly(bool value);

    /// <summary>
    /// The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
    /// </summary>
    std::string getRenderedDescription() const;
    void setRenderedDescription(std::string value);

    /// <summary>
    /// Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
    /// </summary>
    bool isIsWebPublic() const;
    void setIsWebPublic(bool value);

    /// <summary>
    /// Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
    /// </summary>
    int32_t getStreamPostPolicy() const;
    void setStreamPostPolicy(int32_t value);

    /// <summary>
    /// Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
    /// </summary>
    int32_t getMessageRetentionDays() const;
    void setMessageRetentionDays(int32_t value);

    /// <summary>
    /// Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. 
    /// </summary>
    bool isHistoryPublicToSubscribers() const;
    void setHistoryPublicToSubscribers(bool value);

    /// <summary>
    /// The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
    /// </summary>
    int32_t getFirstMessageId() const;
    void setFirstMessageId(int32_t value);

    /// <summary>
    /// Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. 
    /// </summary>
    bool isIsAnnouncementOnly() const;
    void setIsAnnouncementOnly(bool value);
protected:
    int32_t m_Stream_id;
    std::string m_Name;
    std::string m_Description;
    int32_t m_Date_created;
    bool m_Invite_only;
    std::string m_Rendered_description;
    bool m_Is_web_public;
    int32_t m_Stream_post_policy;
    int32_t m_Message_retention_days;
    bool m_History_public_to_subscribers;
    int32_t m_First_message_id;
    bool m_Is_announcement_only;
};

}
}
}
}

#endif /* BasicStreamBase_H_ */