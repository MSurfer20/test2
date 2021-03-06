/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// Dictionary containing details of a file uploaded by a user. 
    /// </summary>
    [DataContract]
    public partial class Attachments : IEquatable<Attachments>
    {
        /// <summary>
        /// The unique ID for the attachment. 
        /// </summary>
        /// <value>The unique ID for the attachment. </value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public int Id { get; set; }

        /// <summary>
        /// Name of the uploaded file. 
        /// </summary>
        /// <value>Name of the uploaded file. </value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// A representation of the path of the file within the repository of user-uploaded files.  If the &#x60;path_id&#x60; of a file is &#x60;{realm_id}/ab/cdef/temp_file.py&#x60;, its URL will be: &#x60;{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py&#x60;. 
        /// </summary>
        /// <value>A representation of the path of the file within the repository of user-uploaded files.  If the &#x60;path_id&#x60; of a file is &#x60;{realm_id}/ab/cdef/temp_file.py&#x60;, its URL will be: &#x60;{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py&#x60;. </value>
        [DataMember(Name="path_id", EmitDefaultValue=false)]
        public string PathId { get; set; }

        /// <summary>
        /// Size of the file in bytes. 
        /// </summary>
        /// <value>Size of the file in bytes. </value>
        [DataMember(Name="size", EmitDefaultValue=false)]
        public int Size { get; set; }

        /// <summary>
        /// Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
        /// </summary>
        /// <value>Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. </value>
        [DataMember(Name="create_time", EmitDefaultValue=false)]
        public int CreateTime { get; set; }

        /// <summary>
        /// Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
        /// </summary>
        /// <value>Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. </value>
        [DataMember(Name="messages", EmitDefaultValue=false)]
        public List<AttachmentsMessages> Messages { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Attachments {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  PathId: ").Append(PathId).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  CreateTime: ").Append(CreateTime).Append("\n");
            sb.Append("  Messages: ").Append(Messages).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((Attachments)obj);
        }

        /// <summary>
        /// Returns true if Attachments instances are equal
        /// </summary>
        /// <param name="other">Instance of Attachments to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Attachments other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    PathId == other.PathId ||
                    PathId != null &&
                    PathId.Equals(other.PathId)
                ) && 
                (
                    Size == other.Size ||
                    
                    Size.Equals(other.Size)
                ) && 
                (
                    CreateTime == other.CreateTime ||
                    
                    CreateTime.Equals(other.CreateTime)
                ) && 
                (
                    Messages == other.Messages ||
                    Messages != null &&
                    other.Messages != null &&
                    Messages.SequenceEqual(other.Messages)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (PathId != null)
                    hashCode = hashCode * 59 + PathId.GetHashCode();
                    
                    hashCode = hashCode * 59 + Size.GetHashCode();
                    
                    hashCode = hashCode * 59 + CreateTime.GetHashCode();
                    if (Messages != null)
                    hashCode = hashCode * 59 + Messages.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Attachments left, Attachments right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Attachments left, Attachments right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
