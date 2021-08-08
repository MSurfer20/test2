package models

type CodedErrorAllOf struct {

	Result *interface{} `json:"result,omitempty"`

	Msg *interface{} `json:"msg,omitempty"`

	Code *interface{} `json:"code,omitempty"`
}
