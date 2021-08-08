-module(openapi_user).

-export([encode/1]).

-export_type([openapi_user/0]).

-type openapi_user() ::
    #{ 'email' => openapi_any_type:openapi_any_type(),
       'is_bot' => openapi_any_type:openapi_any_type(),
       'avatar_url' => openapi_any_type:openapi_any_type(),
       'avatar_version' => openapi_any_type:openapi_any_type(),
       'full_name' => openapi_any_type:openapi_any_type(),
       'is_admin' => openapi_any_type:openapi_any_type(),
       'is_owner' => openapi_any_type:openapi_any_type(),
       'is_billing_admin' => openapi_any_type:openapi_any_type(),
       'role' => openapi_any_type:openapi_any_type(),
       'bot_type' => openapi_any_type:openapi_any_type(),
       'user_id' => openapi_any_type:openapi_any_type(),
       'bot_owner_id' => openapi_any_type:openapi_any_type(),
       'is_active' => openapi_any_type:openapi_any_type(),
       'is_guest' => openapi_any_type:openapi_any_type(),
       'timezone' => openapi_any_type:openapi_any_type(),
       'date_joined' => openapi_any_type:openapi_any_type(),
       'delivery_email' => openapi_any_type:openapi_any_type(),
       'profile_data' => openapi_any_type:openapi_any_type()
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
