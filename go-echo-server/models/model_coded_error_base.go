package models

type CodedErrorBase struct {

	Result *interface{} `json:"result"`

	Msg *interface{} `json:"msg"`

	// A string that identifies the error. 
	Code string `json:"code,omitempty"`
}
