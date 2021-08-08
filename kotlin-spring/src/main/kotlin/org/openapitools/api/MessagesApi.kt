package org.openapitools.api

import org.openapitools.model.AnyType
import org.openapitools.model.CodedError
import org.openapitools.model.InvalidMessageError
import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase
import org.openapitools.model.OneOfLessThanObjectCommaObjectGreaterThan
import org.openapitools.model.OneOfLessThanStringCommaIntegerGreaterThan
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/api/v1}")
class MessagesApiController() {


    @PostMapping(
        value = ["/messages/{message_id}/reactions"],
        produces = ["application/json"]
    )
    fun addReaction( @PathVariable("message_id") messageId: kotlin.Int
,@NotNull  @RequestParam(value = "emoji_name", required = true) emojiName: kotlin.String
, @RequestParam(value = "emoji_code", required = false) emojiCode: kotlin.String?
, @RequestParam(value = "reaction_type", required = false) reactionType: kotlin.String?
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/messages/matches_narrow"],
        produces = ["application/json"]
    )
    fun checkMessagesMatchNarrow(@NotNull  @RequestParam(value = "msg_ids", required = true) msgIds: kotlin.collections.List<kotlin.Int>
,@NotNull  @RequestParam(value = "narrow", required = true) narrow: kotlin.collections.List<kotlin.Any>
): ResponseEntity<AnyType> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @DeleteMapping(
        value = ["/messages/{message_id}"],
        produces = ["application/json"]
    )
    fun deleteMessage( @PathVariable("message_id") messageId: kotlin.Int
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/messages/{message_id}/history"],
        produces = ["application/json"]
    )
    fun getMessageHistory( @PathVariable("message_id") messageId: kotlin.Int
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/messages"],
        produces = ["application/json"]
    )
    fun getMessages(@NotNull @Min(0) @RequestParam(value = "num_before", required = true) numBefore: kotlin.Int
,@NotNull @Min(0) @RequestParam(value = "num_after", required = true) numAfter: kotlin.Int
, @RequestParam(value = "anchor", required = false) anchor: OneOfLessThanStringCommaIntegerGreaterThan?
, @RequestParam(value = "narrow", required = false) narrow: kotlin.collections.List<kotlin.Any>?
, @RequestParam(value = "client_gravatar", required = false, defaultValue="false") clientGravatar: kotlin.Boolean
, @RequestParam(value = "apply_markdown", required = false, defaultValue="true") applyMarkdown: kotlin.Boolean
, @RequestParam(value = "use_first_unread_anchor", required = false, defaultValue="false") useFirstUnreadAnchor: kotlin.Boolean
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/messages/{message_id}"],
        produces = ["application/json"]
    )
    fun getRawMessage( @PathVariable("message_id") messageId: kotlin.Int
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @DeleteMapping(
        value = ["/messages/{message_id}/reactions"],
        produces = ["application/json"]
    )
    fun removeReaction( @PathVariable("message_id") messageId: kotlin.Int
, @RequestParam(value = "emoji_name", required = false) emojiName: kotlin.String?
, @RequestParam(value = "emoji_code", required = false) emojiCode: kotlin.String?
, @RequestParam(value = "reaction_type", required = false) reactionType: kotlin.String?
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PostMapping(
        value = ["/messages/render"],
        produces = ["application/json"]
    )
    fun renderMessage(@NotNull  @RequestParam(value = "content", required = true) content: kotlin.String
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PostMapping(
        value = ["/messages"],
        produces = ["application/json"]
    )
    fun sendMessage(@NotNull  @RequestParam(value = "type", required = true) type: kotlin.String
,@NotNull  @RequestParam(value = "to", required = true) to: kotlin.collections.List<kotlin.Int>
,@NotNull  @RequestParam(value = "content", required = true) content: kotlin.String
, @RequestParam(value = "topic", required = false) topic: kotlin.String?
, @RequestParam(value = "queue_id", required = false) queueId: kotlin.String?
, @RequestParam(value = "local_id", required = false) localId: kotlin.String?
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PatchMapping(
        value = ["/messages/{message_id}"],
        produces = ["application/json"]
    )
    fun updateMessage( @PathVariable("message_id") messageId: kotlin.Int
, @RequestParam(value = "topic", required = false) topic: kotlin.String?
, @RequestParam(value = "propagate_mode", required = false, defaultValue="change_one") propagateMode: kotlin.String
, @RequestParam(value = "send_notification_to_old_thread", required = false, defaultValue="true") sendNotificationToOldThread: kotlin.Boolean
, @RequestParam(value = "send_notification_to_new_thread", required = false, defaultValue="true") sendNotificationToNewThread: kotlin.Boolean
, @RequestParam(value = "content", required = false) content: kotlin.String?
, @RequestParam(value = "stream_id", required = false) streamId: kotlin.Int?
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PostMapping(
        value = ["/messages/flags"],
        produces = ["application/json"]
    )
    fun updateMessageFlags(@NotNull  @RequestParam(value = "messages", required = true) messages: kotlin.collections.List<kotlin.Int>
,@NotNull  @RequestParam(value = "op", required = true) op: kotlin.String
,@NotNull  @RequestParam(value = "flag", required = true) flag: kotlin.String
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
