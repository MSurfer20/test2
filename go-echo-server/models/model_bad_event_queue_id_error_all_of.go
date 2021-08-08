package models

type BadEventQueueIdErrorAllOf struct {

	Result *interface{} `json:"result,omitempty"`

	Msg *interface{} `json:"msg,omitempty"`

	Code *interface{} `json:"code,omitempty"`

	// The string that identifies the invalid event queue. 
	QueueId string `json:"queue_id,omitempty"`
}
