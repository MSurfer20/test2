package models

type NonExistingStreamErrorAllOf struct {

	Result *interface{} `json:"result,omitempty"`

	Msg *interface{} `json:"msg,omitempty"`

	Code *interface{} `json:"code,omitempty"`

	// The name of the stream that could not be found. 
	Stream string `json:"stream,omitempty"`
}
