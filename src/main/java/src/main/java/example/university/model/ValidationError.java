package example.university.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * ValidationError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ValidationError   {
  @JsonProperty("validationErrors")
  @Valid
  private List<String> validationErrors = null;

  @JsonProperty("message")
  private String message = null;

  public ValidationError validationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public ValidationError addValidationErrorsItem(String validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Get validationErrors
   * @return validationErrors
  */
  @ApiModelProperty(value = "")


  public List<String> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }

  public ValidationError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationError validationError = (ValidationError) o;
    return Objects.equals(this.validationErrors, validationError.validationErrors) &&
        Objects.equals(this.message, validationError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationErrors, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationError {\n");
    
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

