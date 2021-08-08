package models

type MissingArgumentError struct {

	Result *interface{} `json:"result"`

	Msg *interface{} `json:"msg"`

	Code *interface{} `json:"code,omitempty"`

	// It contains the information about the missing parameter. 
	VarName string `json:"var_name,omitempty"`
}
