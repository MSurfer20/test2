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
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * Dictionary containing details of a single hotspot. 
 * @param delay The delay after which the user should be shown the hotspot. 
 * @param name The name of the hotspot. 
 * @param title The title of the hotspot, as will be displayed to the user. 
 * @param description The description of the hotspot, as will be displayed to the user. 
 */
object Hotspots : BaseTable<Hotspot>("Hotspot") {
    val delay = decimal("delay") /* null */ /* The delay after which the user should be shown the hotspot.  */
    val name = text("name") /* null */ /* The name of the hotspot.  */
    val title = text("title") /* null */ /* The title of the hotspot, as will be displayed to the user.  */
    val description = text("description") /* null */ /* The description of the hotspot, as will be displayed to the user.  */

    /**
     * Create an entity of type Hotspot from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Hotspot(
        delay = row[delay]  /* java.math.BigDecimal? */ /* The delay after which the user should be shown the hotspot.  */,
        name = row[name]  /* kotlin.String? */ /* The name of the hotspot.  */,
        title = row[title]  /* kotlin.String? */ /* The title of the hotspot, as will be displayed to the user.  */,
        description = row[description]  /* kotlin.String? */ /* The description of the hotspot, as will be displayed to the user.  */
    )

    /**
    * Assign all the columns from the entity of type Hotspot to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Hotspot()
    * database.update(Hotspots, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Hotspot) {
        this.apply {
            set(Hotspots.delay, entity.delay)
            set(Hotspots.name, entity.name)
            set(Hotspots.title, entity.title)
            set(Hotspots.description, entity.description)
        }
    }

}


