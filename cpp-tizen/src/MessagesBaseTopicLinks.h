/*
 * MessagesBase_topic_links.h
 *
 * 
 */

#ifndef _MessagesBase_topic_links_H_
#define _MessagesBase_topic_links_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MessagesBase_topic_links : public Object {
public:
	/*! \brief Constructor.
	 */
	MessagesBase_topic_links();
	MessagesBase_topic_links(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessagesBase_topic_links();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The original link text present in the topic. 
	 */
	std::string getText();

	/*! \brief Set The original link text present in the topic. 
	 */
	void setText(std::string  text);
	/*! \brief Get The expanded target url which the link points to. 
	 */
	std::string getUrl();

	/*! \brief Set The expanded target url which the link points to. 
	 */
	void setUrl(std::string  url);

private:
	std::string text;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessagesBase_topic_links_H_ */
