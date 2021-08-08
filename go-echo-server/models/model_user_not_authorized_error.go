package models

type UserNotAuthorizedError struct {

	Result *interface{} `json:"result"`

	Msg *interface{} `json:"msg"`

	Code *interface{} `json:"code,omitempty"`
}
