
/*
 * RealmExport.h
 *
 * Object containing details about a realm export. 
 */

#ifndef TINY_CPP_CLIENT_RealmExport_H_
#define TINY_CPP_CLIENT_RealmExport_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Object containing details about a realm export. 
 *
 *  \ingroup Models
 *
 */

class RealmExport{
public:

    /*! \brief Constructor.
	 */
    RealmExport();
    RealmExport(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealmExport();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	long getExportTime();

	/*! \brief Set The UNIX timestamp of when the export was made. 
	 */
	void setExportTime(long  export_time);
	/*! \brief Get The timestamp of when the export was deleted. Null if it wasn't. 
	 */
	long getDeletedTimestamp();

	/*! \brief Set The timestamp of when the export was deleted. Null if it wasn't. 
	 */
	void setDeletedTimestamp(long  deleted_timestamp);
	/*! \brief Get The timestamp of when the export failed. Null if it didn't. 
	 */
	long getFailedTimestamp();

	/*! \brief Set The timestamp of when the export failed. Null if it didn't. 
	 */
	void setFailedTimestamp(long  failed_timestamp);
	/*! \brief Get The URL of the export. `null` if there's no URL. 
	 */
	std::string getExportUrl();

	/*! \brief Set The URL of the export. `null` if there's no URL. 
	 */
	void setExportUrl(std::string  export_url);
	/*! \brief Get Whether the export is pending or not. 
	 */
	bool isPending();

	/*! \brief Set Whether the export is pending or not. 
	 */
	void setPending(bool  pending);


    private:
    int id{};
    int acting_user_id{};
    long export_time{};
    long deleted_timestamp{};
    long failed_timestamp{};
    std::string export_url{};
    bool pending{};
};
}

#endif /* TINY_CPP_CLIENT_RealmExport_H_ */
