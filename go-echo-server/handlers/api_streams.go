package handlers
import (
    "github.com/GIT_USER_ID/GIT_REPO_ID/models"
    "github.com/labstack/echo/v4"
    "net/http"
)

// ArchiveStream - Archive a stream
func (c *Container) ArchiveStream(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// CreateBigBlueButtonVideoCall - Create BigBlueButton video call
func (c *Container) CreateBigBlueButtonVideoCall(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetStreamId - Get stream ID
func (c *Container) GetStreamId(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetStreamTopics - Get topics in a stream
func (c *Container) GetStreamTopics(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetStreams - Get all streams
func (c *Container) GetStreams(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetSubscriptionStatus - Get subscription status
func (c *Container) GetSubscriptionStatus(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetSubscriptions - Get subscribed streams
func (c *Container) GetSubscriptions(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// MuteTopic - Topic muting
func (c *Container) MuteTopic(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// Subscribe - Subscribe to a stream
func (c *Container) Subscribe(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// Unsubscribe - Unsubscribe from a stream
func (c *Container) Unsubscribe(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// UpdateStream - Update a stream
func (c *Container) UpdateStream(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// UpdateSubscriptionSettings - Update subscription settings
func (c *Container) UpdateSubscriptionSettings(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// UpdateSubscriptions - Update subscriptions
func (c *Container) UpdateSubscriptions(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}
