package models

type ApiKeyResponse struct {

	Result *interface{} `json:"result"`

	Msg *interface{} `json:"msg"`

	// The API key that can be used to authenticate as the requested user. 
	ApiKey string `json:"api_key"`

	// The email address of the user who owns the API key 
	Email string `json:"email"`
}
