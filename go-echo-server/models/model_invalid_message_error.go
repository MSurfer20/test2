package models

type InvalidMessageError struct {

	Result *interface{} `json:"result"`

	Msg *interface{} `json:"msg"`

	// The raw content of the message. 
	RawContent string `json:"raw_content,omitempty"`
}
