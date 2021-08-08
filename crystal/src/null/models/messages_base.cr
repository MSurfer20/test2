# #Zulip REST API
#
##Powerful open source group chat 
#
#The version of the OpenAPI document: 1.0.0
#
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 5.2.0
#

require "json"
require "time"

module 
  # Object containing details of the message. 
  class MessagesBase
    include JSON::Serializable

    # The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
    @[JSON::Field(key: avatar_url, type: String, nilable: true, emit_null: true)]
    property avatar_url : String

    # A Zulip \"client\" string, describing what Zulip client sent the message. 
    @[JSON::Field(key: client, type: String)]
    property client : String

    # The content/body of the message. 
    @[JSON::Field(key: content, type: String)]
    property content : String

    # The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
    @[JSON::Field(key: content_type, type: String)]
    property content_type : String

    # Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
    @[JSON::Field(key: display_recipient, type: OneOfstringarray)]
    property display_recipient : OneOfstringarray

    # The unique message ID.  Messages should always be displayed sorted by ID. 
    @[JSON::Field(key: id, type: Int32)]
    property id : Int32

    # Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
    @[JSON::Field(key: is_me_message, type: Bool)]
    property is_me_message : Bool

    # Data on any reactions to the message. 
    @[JSON::Field(key: reactions, type: Array(EmojiReaction))]
    property reactions : Array(EmojiReaction)

    # A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
    @[JSON::Field(key: recipient_id, type: Int32)]
    property recipient_id : Int32

    # The Zulip display email address of the message's sender. 
    @[JSON::Field(key: sender_email, type: String)]
    property sender_email : String

    # The full name of the message's sender. 
    @[JSON::Field(key: sender_full_name, type: String)]
    property sender_full_name : String

    # The user ID of the message's sender. 
    @[JSON::Field(key: sender_id, type: Int32)]
    property sender_id : Int32

    # A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
    @[JSON::Field(key: sender_realm_str, type: String)]
    property sender_realm_str : String

    # Only present for stream messages; the ID of the stream. 
    @[JSON::Field(key: stream_id, type: Int32)]
    property stream_id : Int32

    # The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
    @[JSON::Field(key: subject, type: String)]
    property subject : String

    # Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
    @[JSON::Field(key: topic_links, type: Array(MessagesBaseTopicLinks))]
    property topic_links : Array(MessagesBaseTopicLinks)

    # Data used for certain experimental Zulip integrations. 
    @[JSON::Field(key: submessages, type: Array(String))]
    property submessages : Array(String)

    # The UNIX timestamp for when the message was sent, in UTC seconds. 
    @[JSON::Field(key: timestamp, type: Int32)]
    property timestamp : Int32

    # The type of the message: `stream` or `private`. 
    @[JSON::Field(key: type, type: String)]
    property _type : String

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@avatar_url : String | Nil, @client : String | Nil, @content : String | Nil, @content_type : String | Nil, @display_recipient : OneOfstringarray | Nil, @id : Int32 | Nil, @is_me_message : Bool | Nil, @reactions : Array(EmojiReaction) | Nil, @recipient_id : Int32 | Nil, @sender_email : String | Nil, @sender_full_name : String | Nil, @sender_id : Int32 | Nil, @sender_realm_str : String | Nil, @stream_id : Int32 | Nil, @subject : String | Nil, @topic_links : Array(MessagesBaseTopicLinks) | Nil, @submessages : Array(String) | Nil, @timestamp : Int32 | Nil, @_type : String | Nil)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          avatar_url == o.avatar_url &&
          client == o.client &&
          content == o.content &&
          content_type == o.content_type &&
          display_recipient == o.display_recipient &&
          id == o.id &&
          is_me_message == o.is_me_message &&
          reactions == o.reactions &&
          recipient_id == o.recipient_id &&
          sender_email == o.sender_email &&
          sender_full_name == o.sender_full_name &&
          sender_id == o.sender_id &&
          sender_realm_str == o.sender_realm_str &&
          stream_id == o.stream_id &&
          subject == o.subject &&
          topic_links == o.topic_links &&
          submessages == o.submessages &&
          timestamp == o.timestamp &&
          _type == o._type
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [avatar_url, client, content, content_type, display_recipient, id, is_me_message, reactions, recipient_id, sender_email, sender_full_name, sender_id, sender_realm_str, stream_id, subject, topic_links, submessages, timestamp, _type].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if !attributes[self.class.attribute_map[key]]? && self.class.openapi_nullable.includes?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        ({} of Symbol => String).tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = .const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {} of Symbol => String
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.includes?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        ({} of Symbol => String).tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
