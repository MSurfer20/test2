
/*
 * Draft.h
 *
 * A dictionary for representing a message draft. 
 */

#ifndef TINY_CPP_CLIENT_Draft_H_
#define TINY_CPP_CLIENT_Draft_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief A dictionary for representing a message draft. 
 *
 *  \ingroup Models
 *
 */

class Draft{
public:

    /*! \brief Constructor.
	 */
    Draft();
    Draft(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Draft();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
	 */
	int getId();

	/*! \brief Set The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
	 */
	void setId(int  id);
	/*! \brief Get The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
	 */
	std::string getType();

	/*! \brief Set The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
	 */
	void setType(std::string  type);
	/*! \brief Get An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
	 */
	std::list<int> getTo();

	/*! \brief Set An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
	 */
	void setTo(std::list <int> to);
	/*! \brief Get For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
	 */
	std::string getTopic();

	/*! \brief Set For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
	 */
	void setTopic(std::string  topic);
	/*! \brief Get The body of the draft. Should not contain null bytes. 
	 */
	std::string getContent();

	/*! \brief Set The body of the draft. Should not contain null bytes. 
	 */
	void setContent(std::string  content);
	/*! \brief Get A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
	 */
	long getTimestamp();

	/*! \brief Set A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
	 */
	void setTimestamp(long  timestamp);


    private:
    int id{};
    std::string type{};
    std::list<int> to;
    std::string topic{};
    std::string content{};
    long timestamp{};
};
}

#endif /* TINY_CPP_CLIENT_Draft_H_ */
