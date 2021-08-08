package models

type InvalidApiKeyError struct {

	Result *interface{} `json:"result"`

	Msg *interface{} `json:"msg"`
}
