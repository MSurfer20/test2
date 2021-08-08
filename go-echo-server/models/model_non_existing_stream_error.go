package models

type NonExistingStreamError struct {

	Result *interface{} `json:"result"`

	Msg *interface{} `json:"msg"`

	Code *interface{} `json:"code,omitempty"`

	// The name of the stream that could not be found. 
	Stream string `json:"stream,omitempty"`
}
