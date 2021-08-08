/*
 * CustomProfileField.h
 *
 * Dictionary containing the details of a custom profile field configured for this organization. 
 */

#ifndef _CustomProfileField_H_
#define _CustomProfileField_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Dictionary containing the details of a custom profile field configured for this organization. 
 *
 *  \ingroup Models
 *
 */

class CustomProfileField : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomProfileField();
	CustomProfileField(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomProfileField();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
	 */
	int getId();

	/*! \brief Set The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
	 */
	void setId(int  id);
	/*! \brief Get An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
	 */
	int getType();

	/*! \brief Set An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
	 */
	void setType(int  type);
	/*! \brief Get Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. 
	 */
	int getOrder();

	/*! \brief Set Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. 
	 */
	void setOrder(int  order);
	/*! \brief Get The name of the custom profile field. 
	 */
	std::string getName();

	/*! \brief Set The name of the custom profile field. 
	 */
	void setName(std::string  name);
	/*! \brief Get The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
	 */
	std::string getHint();

	/*! \brief Set The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
	 */
	void setHint(std::string  hint);
	/*! \brief Get Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
	 */
	std::string getFieldData();

	/*! \brief Set Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
	 */
	void setFieldData(std::string  field_data);

private:
	int id;
	int type;
	int order;
	std::string name;
	std::string hint;
	std::string field_data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomProfileField_H_ */
