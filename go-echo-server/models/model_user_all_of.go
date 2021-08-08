package models

type UserAllOf struct {

	Email *interface{} `json:"email,omitempty"`

	IsBot *interface{} `json:"is_bot,omitempty"`

	AvatarUrl *interface{} `json:"avatar_url,omitempty"`

	AvatarVersion *interface{} `json:"avatar_version,omitempty"`

	FullName *interface{} `json:"full_name,omitempty"`

	IsAdmin *interface{} `json:"is_admin,omitempty"`

	IsOwner *interface{} `json:"is_owner,omitempty"`

	IsBillingAdmin *interface{} `json:"is_billing_admin,omitempty"`

	Role *interface{} `json:"role,omitempty"`

	BotType *interface{} `json:"bot_type,omitempty"`

	UserId *interface{} `json:"user_id,omitempty"`

	BotOwnerId *interface{} `json:"bot_owner_id,omitempty"`

	IsActive *interface{} `json:"is_active,omitempty"`

	IsGuest *interface{} `json:"is_guest,omitempty"`

	Timezone *interface{} `json:"timezone,omitempty"`

	DateJoined *interface{} `json:"date_joined,omitempty"`

	DeliveryEmail *interface{} `json:"delivery_email,omitempty"`

	ProfileData *interface{} `json:"profile_data,omitempty"`
}
