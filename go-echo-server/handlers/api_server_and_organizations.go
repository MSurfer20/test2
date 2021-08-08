package handlers
import (
    "github.com/GIT_USER_ID/GIT_REPO_ID/models"
    "github.com/labstack/echo/v4"
    "net/http"
)

// AddCodePlayground - Add a code playground
func (c *Container) AddCodePlayground(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// AddLinkifier - Add a linkifier
func (c *Container) AddLinkifier(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// CreateCustomProfileField - Create a custom profile field
func (c *Container) CreateCustomProfileField(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetCustomEmoji - Get all custom emoji
func (c *Container) GetCustomEmoji(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetCustomProfileFields - Get all custom profile fields
func (c *Container) GetCustomProfileFields(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetLinkifiers - Get linkifiers
func (c *Container) GetLinkifiers(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetServerSettings - Get server settings
func (c *Container) GetServerSettings(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// RemoveCodePlayground - Remove a code playground
func (c *Container) RemoveCodePlayground(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// RemoveLinkifier - Remove a linkifier
func (c *Container) RemoveLinkifier(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// ReorderCustomProfileFields - Reorder custom profile fields
func (c *Container) ReorderCustomProfileFields(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// UpdateLinkifier - Update a linkifier
func (c *Container) UpdateLinkifier(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// UploadCustomEmoji - Upload custom emoji
func (c *Container) UploadCustomEmoji(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}
