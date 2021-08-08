using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Dictionary containing details of a file uploaded by a user. 
    /// </summary>
    public sealed class Attachments:  IEquatable<Attachments>
    { 
        /// <summary>
        /// The unique ID for the attachment. 
        /// </summary>
        public int? Id { get; private set; }

        /// <summary>
        /// Name of the uploaded file. 
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// A representation of the path of the file within the repository of user-uploaded files.  If the &#x60;path_id&#x60; of a file is &#x60;{realm_id}/ab/cdef/temp_file.py&#x60;, its URL will be: &#x60;{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py&#x60;. 
        /// </summary>
        public string PathId { get; private set; }

        /// <summary>
        /// Size of the file in bytes. 
        /// </summary>
        public int? Size { get; private set; }

        /// <summary>
        /// Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
        /// </summary>
        public int? CreateTime { get; private set; }

        /// <summary>
        /// Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
        /// </summary>
        public List<AttachmentsMessages> Messages { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Attachments.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Attachments()
        {
        }

        private Attachments(int? Id, string Name, string PathId, int? Size, int? CreateTime, List<AttachmentsMessages> Messages)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.PathId = PathId;
            
            this.Size = Size;
            
            this.CreateTime = CreateTime;
            
            this.Messages = Messages;
            
        }

        /// <summary>
        /// Returns builder of Attachments.
        /// </summary>
        /// <returns>AttachmentsBuilder</returns>
        public static AttachmentsBuilder Builder()
        {
            return new AttachmentsBuilder();
        }

        /// <summary>
        /// Returns AttachmentsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AttachmentsBuilder</returns>
        public AttachmentsBuilder With()
        {
            return Builder()
                .Id(Id)
                .Name(Name)
                .PathId(PathId)
                .Size(Size)
                .CreateTime(CreateTime)
                .Messages(Messages);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Attachments other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Attachments.
        /// </summary>
        /// <param name="left">Compared (Attachments</param>
        /// <param name="right">Compared (Attachments</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Attachments left, Attachments right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Attachments.
        /// </summary>
        /// <param name="left">Compared (Attachments</param>
        /// <param name="right">Compared (Attachments</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Attachments left, Attachments right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Attachments.
        /// </summary>
        public sealed class AttachmentsBuilder
        {
            private int? _Id;
            private string _Name;
            private string _PathId;
            private int? _Size;
            private int? _CreateTime;
            private List<AttachmentsMessages> _Messages;

            internal AttachmentsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Attachments.Id property.
            /// </summary>
            /// <param name="value">The unique ID for the attachment. </param>
            public AttachmentsBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Attachments.Name property.
            /// </summary>
            /// <param name="value">Name of the uploaded file. </param>
            public AttachmentsBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Attachments.PathId property.
            /// </summary>
            /// <param name="value">A representation of the path of the file within the repository of user-uploaded files.  If the &#x60;path_id&#x60; of a file is &#x60;{realm_id}/ab/cdef/temp_file.py&#x60;, its URL will be: &#x60;{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py&#x60;. </param>
            public AttachmentsBuilder PathId(string value)
            {
                _PathId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Attachments.Size property.
            /// </summary>
            /// <param name="value">Size of the file in bytes. </param>
            public AttachmentsBuilder Size(int? value)
            {
                _Size = value;
                return this;
            }

            /// <summary>
            /// Sets value for Attachments.CreateTime property.
            /// </summary>
            /// <param name="value">Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. </param>
            public AttachmentsBuilder CreateTime(int? value)
            {
                _CreateTime = value;
                return this;
            }

            /// <summary>
            /// Sets value for Attachments.Messages property.
            /// </summary>
            /// <param name="value">Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. </param>
            public AttachmentsBuilder Messages(List<AttachmentsMessages> value)
            {
                _Messages = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Attachments.
            /// </summary>
            /// <returns>Attachments</returns>
            public Attachments Build()
            {
                Validate();
                return new Attachments(
                    Id: _Id,
                    Name: _Name,
                    PathId: _PathId,
                    Size: _Size,
                    CreateTime: _CreateTime,
                    Messages: _Messages
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
