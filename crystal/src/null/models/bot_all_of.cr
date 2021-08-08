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
  # Object containing details of a bot. 
  class BotAllOf
    include JSON::Serializable

    @[JSON::Field(key: user_id, type: AnyType, nilable: true, emit_null: true)]
    property user_id : AnyType

    @[JSON::Field(key: full_name, type: AnyType, nilable: true, emit_null: true)]
    property full_name : AnyType

    @[JSON::Field(key: api_key, type: AnyType, nilable: true, emit_null: true)]
    property api_key : AnyType

    @[JSON::Field(key: default_sending_stream, type: AnyType, nilable: true, emit_null: true)]
    property default_sending_stream : AnyType

    @[JSON::Field(key: default_events_register_stream, type: AnyType, nilable: true, emit_null: true)]
    property default_events_register_stream : AnyType

    @[JSON::Field(key: default_all_public_streams, type: AnyType, nilable: true, emit_null: true)]
    property default_all_public_streams : AnyType

    @[JSON::Field(key: avatar_url, type: AnyType, nilable: true, emit_null: true)]
    property avatar_url : AnyType

    @[JSON::Field(key: owner_id, type: AnyType, nilable: true, emit_null: true)]
    property owner_id : AnyType

    @[JSON::Field(key: services, type: AnyType, nilable: true, emit_null: true)]
    property services : AnyType

    # The email of the bot. 
    @[JSON::Field(key: email, type: String)]
    property email : String

    # An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
    @[JSON::Field(key: bot_type, type: Int32, nilable: true, emit_null: true)]
    property bot_type : Int32

    # A boolean describing whether the user account has been deactivated. 
    @[JSON::Field(key: is_active, type: Bool)]
    property is_active : Bool

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@user_id : AnyType | Nil, @full_name : AnyType | Nil, @api_key : AnyType | Nil, @default_sending_stream : AnyType | Nil, @default_events_register_stream : AnyType | Nil, @default_all_public_streams : AnyType | Nil, @avatar_url : AnyType | Nil, @owner_id : AnyType | Nil, @services : AnyType | Nil, @email : String | Nil, @bot_type : Int32 | Nil, @is_active : Bool | Nil)
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
          user_id == o.user_id &&
          full_name == o.full_name &&
          api_key == o.api_key &&
          default_sending_stream == o.default_sending_stream &&
          default_events_register_stream == o.default_events_register_stream &&
          default_all_public_streams == o.default_all_public_streams &&
          avatar_url == o.avatar_url &&
          owner_id == o.owner_id &&
          services == o.services &&
          email == o.email &&
          bot_type == o.bot_type &&
          is_active == o.is_active
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [user_id, full_name, api_key, default_sending_stream, default_events_register_stream, default_all_public_streams, avatar_url, owner_id, services, email, bot_type, is_active].hash
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
