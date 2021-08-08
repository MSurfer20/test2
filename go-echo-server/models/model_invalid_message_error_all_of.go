package models

type InvalidMessageErrorAllOf struct {

	Result *interface{} `json:"result,omitempty"`

	Msg *interface{} `json:"msg,omitempty"`

	// The raw content of the message. 
	RawContent string `json:"raw_content,omitempty"`
}
