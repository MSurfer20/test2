package models

type JsonError struct {

	Result *interface{} `json:"result"`

	Msg *interface{} `json:"msg"`
}
