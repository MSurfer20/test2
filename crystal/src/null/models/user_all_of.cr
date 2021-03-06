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
  class UserAllOf
    include JSON::Serializable

    @[JSON::Field(key: email, type: AnyType, nilable: true, emit_null: true)]
    property email : AnyType

    @[JSON::Field(key: is_bot, type: AnyType, nilable: true, emit_null: true)]
    property is_bot : AnyType

    @[JSON::Field(key: avatar_url, type: AnyType, nilable: true, emit_null: true)]
    property avatar_url : AnyType

    @[JSON::Field(key: avatar_version, type: AnyType, nilable: true, emit_null: true)]
    property avatar_version : AnyType

    @[JSON::Field(key: full_name, type: AnyType, nilable: true, emit_null: true)]
    property full_name : AnyType

    @[JSON::Field(key: is_admin, type: AnyType, nilable: true, emit_null: true)]
    property is_admin : AnyType

    @[JSON::Field(key: is_owner, type: AnyType, nilable: true, emit_null: true)]
    property is_owner : AnyType

    @[JSON::Field(key: is_billing_admin, type: AnyType, nilable: true, emit_null: true)]
    property is_billing_admin : AnyType

    @[JSON::Field(key: role, type: AnyType, nilable: true, emit_null: true)]
    property role : AnyType

    @[JSON::Field(key: bot_type, type: AnyType, nilable: true, emit_null: true)]
    property bot_type : AnyType

    @[JSON::Field(key: user_id, type: AnyType, nilable: true, emit_null: true)]
    property user_id : AnyType

    @[JSON::Field(key: bot_owner_id, type: AnyType, nilable: true, emit_null: true)]
    property bot_owner_id : AnyType

    @[JSON::Field(key: is_active, type: AnyType, nilable: true, emit_null: true)]
    property is_active : AnyType

    @[JSON::Field(key: is_guest, type: AnyType, nilable: true, emit_null: true)]
    property is_guest : AnyType

    @[JSON::Field(key: timezone, type: AnyType, nilable: true, emit_null: true)]
    property timezone : AnyType

    @[JSON::Field(key: date_joined, type: AnyType, nilable: true, emit_null: true)]
    property date_joined : AnyType

    @[JSON::Field(key: delivery_email, type: AnyType, nilable: true, emit_null: true)]
    property delivery_email : AnyType

    @[JSON::Field(key: profile_data, type: AnyType, nilable: true, emit_null: true)]
    property profile_data : AnyType

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@email : AnyType | Nil, @is_bot : AnyType | Nil, @avatar_url : AnyType | Nil, @avatar_version : AnyType | Nil, @full_name : AnyType | Nil, @is_admin : AnyType | Nil, @is_owner : AnyType | Nil, @is_billing_admin : AnyType | Nil, @role : AnyType | Nil, @bot_type : AnyType | Nil, @user_id : AnyType | Nil, @bot_owner_id : AnyType | Nil, @is_active : AnyType | Nil, @is_guest : AnyType | Nil, @timezone : AnyType | Nil, @date_joined : AnyType | Nil, @delivery_email : AnyType | Nil, @profile_data : AnyType | Nil)
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
          email == o.email &&
          is_bot == o.is_bot &&
          avatar_url == o.avatar_url &&
          avatar_version == o.avatar_version &&
          full_name == o.full_name &&
          is_admin == o.is_admin &&
          is_owner == o.is_owner &&
          is_billing_admin == o.is_billing_admin &&
          role == o.role &&
          bot_type == o.bot_type &&
          user_id == o.user_id &&
          bot_owner_id == o.bot_owner_id &&
          is_active == o.is_active &&
          is_guest == o.is_guest &&
          timezone == o.timezone &&
          date_joined == o.date_joined &&
          delivery_email == o.delivery_email &&
          profile_data == o.profile_data
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [email, is_bot, avatar_url, avatar_version, full_name, is_admin, is_owner, is_billing_admin, role, bot_type, user_id, bot_owner_id, is_active, is_guest, timezone, date_joined, delivery_email, profile_data].hash
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
