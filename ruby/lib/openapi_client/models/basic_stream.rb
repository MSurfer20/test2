=begin
#Zulip REST API

#Powerful open source group chat 

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.0

=end

require 'date'
require 'time'

module OpenapiClient
  class BasicStream
    attr_accessor :stream_id

    attr_accessor :name

    attr_accessor :description

    attr_accessor :date_created

    attr_accessor :invite_only

    attr_accessor :rendered_description

    attr_accessor :is_web_public

    attr_accessor :stream_post_policy

    attr_accessor :message_retention_days

    attr_accessor :history_public_to_subscribers

    attr_accessor :first_message_id

    attr_accessor :is_announcement_only

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'stream_id' => :'stream_id',
        :'name' => :'name',
        :'description' => :'description',
        :'date_created' => :'date_created',
        :'invite_only' => :'invite_only',
        :'rendered_description' => :'rendered_description',
        :'is_web_public' => :'is_web_public',
        :'stream_post_policy' => :'stream_post_policy',
        :'message_retention_days' => :'message_retention_days',
        :'history_public_to_subscribers' => :'history_public_to_subscribers',
        :'first_message_id' => :'first_message_id',
        :'is_announcement_only' => :'is_announcement_only'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'stream_id' => :'AnyType',
        :'name' => :'AnyType',
        :'description' => :'AnyType',
        :'date_created' => :'AnyType',
        :'invite_only' => :'AnyType',
        :'rendered_description' => :'AnyType',
        :'is_web_public' => :'AnyType',
        :'stream_post_policy' => :'AnyType',
        :'message_retention_days' => :'AnyType',
        :'history_public_to_subscribers' => :'AnyType',
        :'first_message_id' => :'AnyType',
        :'is_announcement_only' => :'AnyType'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
        :'stream_id',
        :'name',
        :'description',
        :'date_created',
        :'invite_only',
        :'rendered_description',
        :'is_web_public',
        :'stream_post_policy',
        :'message_retention_days',
        :'history_public_to_subscribers',
        :'first_message_id',
        :'is_announcement_only'
      ])
    end

    # List of class defined in allOf (OpenAPI v3)
    def self.openapi_all_of
      [
      :'BasicStreamAllOf',
      :'BasicStreamBase'
      ]
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::BasicStream` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::BasicStream`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'stream_id')
        self.stream_id = attributes[:'stream_id']
      end

      if attributes.key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.key?(:'description')
        self.description = attributes[:'description']
      end

      if attributes.key?(:'date_created')
        self.date_created = attributes[:'date_created']
      end

      if attributes.key?(:'invite_only')
        self.invite_only = attributes[:'invite_only']
      end

      if attributes.key?(:'rendered_description')
        self.rendered_description = attributes[:'rendered_description']
      end

      if attributes.key?(:'is_web_public')
        self.is_web_public = attributes[:'is_web_public']
      end

      if attributes.key?(:'stream_post_policy')
        self.stream_post_policy = attributes[:'stream_post_policy']
      end

      if attributes.key?(:'message_retention_days')
        self.message_retention_days = attributes[:'message_retention_days']
      end

      if attributes.key?(:'history_public_to_subscribers')
        self.history_public_to_subscribers = attributes[:'history_public_to_subscribers']
      end

      if attributes.key?(:'first_message_id')
        self.first_message_id = attributes[:'first_message_id']
      end

      if attributes.key?(:'is_announcement_only')
        self.is_announcement_only = attributes[:'is_announcement_only']
      end
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
          stream_id == o.stream_id &&
          name == o.name &&
          description == o.description &&
          date_created == o.date_created &&
          invite_only == o.invite_only &&
          rendered_description == o.rendered_description &&
          is_web_public == o.is_web_public &&
          stream_post_policy == o.stream_post_policy &&
          message_retention_days == o.message_retention_days &&
          history_public_to_subscribers == o.history_public_to_subscribers &&
          first_message_id == o.first_message_id &&
          is_announcement_only == o.is_announcement_only
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [stream_id, name, description, date_created, invite_only, rendered_description, is_web_public, stream_post_policy, message_retention_days, history_public_to_subscribers, first_message_id, is_announcement_only].hash
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
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
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
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OpenapiClient.const_get(type)
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
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
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
        {}.tap do |hash|
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
