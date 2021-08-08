package handlers
import (
    "github.com/GIT_USER_ID/GIT_REPO_ID/models"
    "github.com/labstack/echo/v4"
    "net/http"
)

// AddReaction - Add an emoji reaction
func (c *Container) AddReaction(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// CheckMessagesMatchNarrow - Check if messages match a narrow
func (c *Container) CheckMessagesMatchNarrow(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// DeleteMessage - Delete a message
func (c *Container) DeleteMessage(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetFileTemporaryUrl - Get public temporary URL
func (c *Container) GetFileTemporaryUrl(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetMessageHistory - Get a message's edit history
func (c *Container) GetMessageHistory(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetMessages - Get messages
func (c *Container) GetMessages(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetRawMessage - Get a message's raw Markdown
func (c *Container) GetRawMessage(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// MarkAllAsRead - Mark all messages as read
func (c *Container) MarkAllAsRead(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// MarkStreamAsRead - Mark messages in a stream as read
func (c *Container) MarkStreamAsRead(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// MarkTopicAsRead - Mark messages in a topic as read
func (c *Container) MarkTopicAsRead(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// RemoveReaction - Remove an emoji reaction
func (c *Container) RemoveReaction(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// RenderMessage - Render message
func (c *Container) RenderMessage(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// SendMessage - Send a message
func (c *Container) SendMessage(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// UpdateMessage - Edit a message
func (c *Container) UpdateMessage(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// UpdateMessageFlags - Update personal message flags
func (c *Container) UpdateMessageFlags(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// UploadFile - Upload a file
func (c *Container) UploadFile(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}
