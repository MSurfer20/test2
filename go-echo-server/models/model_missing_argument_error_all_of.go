package models

// MissingArgumentErrorAllOf - ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
type MissingArgumentErrorAllOf struct {

	Result *interface{} `json:"result,omitempty"`

	Msg *interface{} `json:"msg,omitempty"`

	Code *interface{} `json:"code,omitempty"`

	// It contains the information about the missing parameter. 
	VarName string `json:"var_name,omitempty"`
}
