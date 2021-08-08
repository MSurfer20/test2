-module(openapi_user_base).

-export([encode/1]).

-export_type([openapi_user_base/0]).

-type openapi_user_base() ::
    #{ 'email' => binary(),
       'is_bot' => boolean(),
       'avatar_url' => binary(),
       'avatar_version' => integer(),
       'full_name' => binary(),
       'is_admin' => boolean(),
       'is_owner' => boolean(),
       'is_billing_admin' => boolean(),
       'role' => integer(),
       'bot_type' => integer(),
       'user_id' => integer(),
       'bot_owner_id' => integer(),
       'is_active' => boolean(),
       'is_guest' => boolean(),
       'timezone' => binary(),
       'date_joined' => binary(),
       'delivery_email' => binary(),
       'profile_data' => maps:map()
     }.

encode(#{ 'email' := Email,
          'is_bot' := IsBot,
          'avatar_url' := AvatarUrl,
          'avatar_version' := AvatarVersion,
          'full_name' := FullName,
          'is_admin' := IsAdmin,
          'is_owner' := IsOwner,
          'is_billing_admin' := IsBillingAdmin,
          'role' := Role,
          'bot_type' := BotType,
          'user_id' := UserId,
          'bot_owner_id' := BotOwnerId,
          'is_active' := IsActive,
          'is_guest' := IsGuest,
          'timezone' := Timezone,
          'date_joined' := DateJoined,
          'delivery_email' := DeliveryEmail,
          'profile_data' := ProfileData
        }) ->
    #{ 'email' => Email,
       'is_bot' => IsBot,
       'avatar_url' => AvatarUrl,
       'avatar_version' => AvatarVersion,
       'full_name' => FullName,
       'is_admin' => IsAdmin,
       'is_owner' => IsOwner,
       'is_billing_admin' => IsBillingAdmin,
       'role' => Role,
       'bot_type' => BotType,
       'user_id' => UserId,
       'bot_owner_id' => BotOwnerId,
       'is_active' => IsActive,
       'is_guest' => IsGuest,
       'timezone' => Timezone,
       'date_joined' => DateJoined,
       'delivery_email' => DeliveryEmail,
       'profile_data' => ProfileData
     }.
