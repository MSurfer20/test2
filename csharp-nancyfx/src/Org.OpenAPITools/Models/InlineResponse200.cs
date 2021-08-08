using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// This is an example of the JSON payload that the Zulip server will &#x60;POST&#x60; to your server 
    /// </summary>
    public sealed class InlineResponse200:  IEquatable<InlineResponse200>
    { 
        /// <summary>
        /// Email of the bot user. 
        /// </summary>
        public string BotEmail { get; private set; }

        /// <summary>
        /// The full name of the bot user. 
        /// </summary>
        public string BotFullName { get; private set; }

        /// <summary>
        /// The message content, in raw Markdown format (not rendered to HTML). 
        /// </summary>
        public string Data { get; private set; }

        /// <summary>
        /// What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;. 
        /// </summary>
        public string Trigger { get; private set; }

        /// <summary>
        /// A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot. 
        /// </summary>
        public string Token { get; private set; }

        /// <summary>
        /// A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages). 
        /// </summary>
        public MessagesBase Message { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineResponse200.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineResponse200()
        {
        }

        private InlineResponse200(string BotEmail, string BotFullName, string Data, string Trigger, string Token, MessagesBase Message)
        {
            
            this.BotEmail = BotEmail;
            
            this.BotFullName = BotFullName;
            
            this.Data = Data;
            
            this.Trigger = Trigger;
            
            this.Token = Token;
            
            this.Message = Message;
            
        }

        /// <summary>
        /// Returns builder of InlineResponse200.
        /// </summary>
        /// <returns>InlineResponse200Builder</returns>
        public static InlineResponse200Builder Builder()
        {
            return new InlineResponse200Builder();
        }

        /// <summary>
        /// Returns InlineResponse200Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineResponse200Builder</returns>
        public InlineResponse200Builder With()
        {
            return Builder()
                .BotEmail(BotEmail)
                .BotFullName(BotFullName)
                .Data(Data)
                .Trigger(Trigger)
                .Token(Token)
                .Message(Message);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineResponse200 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineResponse200.
        /// </summary>
        /// <param name="left">Compared (InlineResponse200</param>
        /// <param name="right">Compared (InlineResponse200</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineResponse200 left, InlineResponse200 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineResponse200.
        /// </summary>
        /// <param name="left">Compared (InlineResponse200</param>
        /// <param name="right">Compared (InlineResponse200</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineResponse200 left, InlineResponse200 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineResponse200.
        /// </summary>
        public sealed class InlineResponse200Builder
        {
            private string _BotEmail;
            private string _BotFullName;
            private string _Data;
            private string _Trigger;
            private string _Token;
            private MessagesBase _Message;

            internal InlineResponse200Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineResponse200.BotEmail property.
            /// </summary>
            /// <param name="value">Email of the bot user. </param>
            public InlineResponse200Builder BotEmail(string value)
            {
                _BotEmail = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse200.BotFullName property.
            /// </summary>
            /// <param name="value">The full name of the bot user. </param>
            public InlineResponse200Builder BotFullName(string value)
            {
                _BotFullName = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse200.Data property.
            /// </summary>
            /// <param name="value">The message content, in raw Markdown format (not rendered to HTML). </param>
            public InlineResponse200Builder Data(string value)
            {
                _Data = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse200.Trigger property.
            /// </summary>
            /// <param name="value">What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;. </param>
            public InlineResponse200Builder Trigger(string value)
            {
                _Trigger = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse200.Token property.
            /// </summary>
            /// <param name="value">A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot. </param>
            public InlineResponse200Builder Token(string value)
            {
                _Token = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse200.Message property.
            /// </summary>
            /// <param name="value">A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages). </param>
            public InlineResponse200Builder Message(MessagesBase value)
            {
                _Message = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineResponse200.
            /// </summary>
            /// <returns>InlineResponse200</returns>
            public InlineResponse200 Build()
            {
                Validate();
                return new InlineResponse200(
                    BotEmail: _BotEmail,
                    BotFullName: _BotFullName,
                    Data: _Data,
                    Trigger: _Trigger,
                    Token: _Token,
                    Message: _Message
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
