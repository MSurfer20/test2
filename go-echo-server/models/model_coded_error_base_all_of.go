package models

type CodedErrorBaseAllOf struct {

	Result *interface{} `json:"result,omitempty"`

	Msg *interface{} `json:"msg,omitempty"`

	// A string that identifies the error. 
	Code string `json:"code,omitempty"`
}
