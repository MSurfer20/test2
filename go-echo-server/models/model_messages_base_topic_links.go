package models

type MessagesBaseTopicLinks struct {

	// The original link text present in the topic. 
	Text string `json:"text,omitempty"`

	// The expanded target url which the link points to. 
	Url string `json:"url,omitempty"`
}
