package models

type AddSubscriptionsResponse struct {

	Result *interface{} `json:"result"`

	Msg *interface{} `json:"msg"`

	// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
	Subscribed map[string][]string `json:"subscribed,omitempty"`

	// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
	AlreadySubscribed map[string][]string `json:"already_subscribed,omitempty"`

	// A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
	Unauthorized []string `json:"unauthorized,omitempty"`
}
