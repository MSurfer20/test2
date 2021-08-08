package models

type BadEventQueueIdError struct {

	Result *interface{} `json:"result"`

	Msg *interface{} `json:"msg"`

	Code *interface{} `json:"code,omitempty"`

	// The string that identifies the invalid event queue. 
	QueueId string `json:"queue_id,omitempty"`
}
