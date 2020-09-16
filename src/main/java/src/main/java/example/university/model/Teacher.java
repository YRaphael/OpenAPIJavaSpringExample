package example.university.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import example.university.model.Gender;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * Teacher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Teacher   {
  @JsonProperty("internalDatabaseId")
  private String internalDatabaseId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("gender")
  private Gender gender;

  @JsonProperty("id")
  private String id = null;

  public Teacher internalDatabaseId(String internalDatabaseId) {
    this.internalDatabaseId = internalDatabaseId;
    return this;
  }

  /**
   * Get internalDatabaseId
   * @return internalDatabaseId
  */
  @ApiModelProperty(value = "")


  public String getInternalDatabaseId() {
    return internalDatabaseId;
  }

  public void setInternalDatabaseId(String internalDatabaseId) {
    this.internalDatabaseId = internalDatabaseId;
  }

  public Teacher name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "{\"value\":\"Alex\"}", required = true, value = "")
  @NotNull

@Size(max=255) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Teacher surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  */
  @ApiModelProperty(example = "{\"value\":\"Johnson\"}", required = true, value = "")
  @NotNull

@Size(max=255) 
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Teacher gender(Gender gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public Teacher id(String id) {
    this.id = id;
    return this;
  }

  /**
   * This field is read only.
   * @return id
  */
  @ApiModelProperty(required = true, readOnly = true, value = "This field is read only.")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Teacher teacher = (Teacher) o;
    return Objects.equals(this.internalDatabaseId, teacher.internalDatabaseId) &&
        Objects.equals(this.name, teacher.name) &&
        Objects.equals(this.surname, teacher.surname) &&
        Objects.equals(this.gender, teacher.gender) &&
        Objects.equals(this.id, teacher.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalDatabaseId, name, surname, gender, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Teacher {\n");
    
    sb.append("    internalDatabaseId: ").append(toIndentedString(internalDatabaseId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

