
/*
 * MessagesBase_topic_links.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MessagesBase_topic_links_H_
#define TINY_CPP_CLIENT_MessagesBase_topic_links_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MessagesBase_topic_links{
public:

    /*! \brief Constructor.
	 */
    MessagesBase_topic_links();
    MessagesBase_topic_links(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessagesBase_topic_links();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string text{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_MessagesBase_topic_links_H_ */
