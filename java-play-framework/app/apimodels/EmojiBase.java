package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * EmojiBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-09T21:33:34.002001Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EmojiBase   {
  @JsonProperty("emoji_code")
  
  private String emojiCode;

  @JsonProperty("emoji_name")
  
  private String emojiName;

  @JsonProperty("reaction_type")
  
  private String reactionType;

  public EmojiBase emojiCode(String emojiCode) {
    this.emojiCode = emojiCode;
    return this;
  }

   /**
   * A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
   * @return emojiCode
  **/
  public String getEmojiCode() {
    return emojiCode;
  }

  public void setEmojiCode(String emojiCode) {
    this.emojiCode = emojiCode;
  }

  public EmojiBase emojiName(String emojiName) {
    this.emojiName = emojiName;
    return this;
  }

   /**
   * Name of the emoji. 
   * @return emojiName
  **/
  public String getEmojiName() {
    return emojiName;
  }

  public void setEmojiName(String emojiName) {
    this.emojiName = emojiName;
  }

  public EmojiBase reactionType(String reactionType) {
    this.reactionType = reactionType;
    return this;
  }

   /**
   * One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
   * @return reactionType
  **/
  public String getReactionType() {
    return reactionType;
  }

  public void setReactionType(String reactionType) {
    this.reactionType = reactionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmojiBase emojiBase = (EmojiBase) o;
    return Objects.equals(emojiCode, emojiBase.emojiCode) &&
        Objects.equals(emojiName, emojiBase.emojiName) &&
        Objects.equals(reactionType, emojiBase.reactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojiCode, emojiName, reactionType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmojiBase {\n");
    
    sb.append("    emojiCode: ").append(toIndentedString(emojiCode)).append("\n");
    sb.append("    emojiName: ").append(toIndentedString(emojiName)).append("\n");
    sb.append("    reactionType: ").append(toIndentedString(reactionType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

