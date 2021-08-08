/*
 * RealmExport.h
 *
 * Object containing details about a realm export. 
 */

#ifndef _RealmExport_H_
#define _RealmExport_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object containing details about a realm export. 
 *
 *  \ingroup Models
 *
 */

class RealmExport : public Object {
public:
	/*! \brief Constructor.
	 */
	RealmExport();
	RealmExport(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealmExport();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The id of the export. 
	 */
	int getId();

	/*! \brief Set The id of the export. 
	 */
	void setId(int  id);
	/*! \brief Get The id of the user who did the export. 
	 */
	int getActingUserId();

	/*! \brief Set The id of the user who did the export. 
	 */
	void setActingUserId(int  acting_user_id);
	/*! \brief Get The UNIX timestamp of when the export was made. 
	 */
	long long getExportTime();

	/*! \brief Set The UNIX timestamp of when the export was made. 
	 */
	void setExportTime(long long  export_time);
	/*! \brief Get The timestamp of when the export was deleted. Null if it wasn't. 
	 */
	long long getDeletedTimestamp();

	/*! \brief Set The timestamp of when the export was deleted. Null if it wasn't. 
	 */
	void setDeletedTimestamp(long long  deleted_timestamp);
	/*! \brief Get The timestamp of when the export failed. Null if it didn't. 
	 */
	long long getFailedTimestamp();

	/*! \brief Set The timestamp of when the export failed. Null if it didn't. 
	 */
	void setFailedTimestamp(long long  failed_timestamp);
	/*! \brief Get The URL of the export. `null` if there's no URL. 
	 */
	std::string getExportUrl();

	/*! \brief Set The URL of the export. `null` if there's no URL. 
	 */
	void setExportUrl(std::string  export_url);
	/*! \brief Get Whether the export is pending or not. 
	 */
	bool getPending();

	/*! \brief Set Whether the export is pending or not. 
	 */
	void setPending(bool  pending);

private:
	int id;
	int acting_user_id;
	long long export_time;
	long long deleted_timestamp;
	long long failed_timestamp;
	std::string export_url;
	bool pending;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealmExport_H_ */
