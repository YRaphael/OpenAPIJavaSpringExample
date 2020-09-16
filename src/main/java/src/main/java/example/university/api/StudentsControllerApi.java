/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0-beta).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package example.university.api;

import java.util.List;
import example.university.model.StandardError;
import example.university.model.Student;
import example.university.model.ValidationError;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "StudentsController", description = "the StudentsController API")
public interface StudentsControllerApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/students : Create or update students from query
     *
     * @param student requestBody (required)
     * @return Students created (status code 201)
     *         or Validation error (status code 400)
     *         or Unexpected error (status code 500)
     */
    @ApiOperation(value = "Create or update students from query", nickname = "createStudentsUsingPOST", notes = "", response = Student.class, tags={ "students-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Students created", response = Student.class),
        @ApiResponse(code = 400, message = "Validation error", response = ValidationError.class),
        @ApiResponse(code = 500, message = "Unexpected error", response = StandardError.class) })
    @RequestMapping(value = "/api/students",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Student> createStudentsUsingPOST(@ApiParam(value = "requestBody" ,required=true )  @Valid @RequestBody List<Student> student) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"surname\" : { \"value\" : \"Johnson\" }, \"internalDatabaseId\" : \"\", \"name\" : { \"value\" : \"Alex\" }, \"id\" : \"\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/students : Get all students
     *
     * @param groupNumber  (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Get all students", nickname = "getAllStudentsUsingGET", notes = "", response = Student.class, responseContainer = "List", tags={ "students-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Student.class, responseContainer = "List") })
    @RequestMapping(value = "/api/students",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Student>> getAllStudentsUsingGET(@NotNull @ApiParam(value = "", required = true, defaultValue = "null") @Valid @RequestParam(value = "group_number", required = true, defaultValue="null") String groupNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"surname\" : { \"value\" : \"Johnson\" }, \"internalDatabaseId\" : \"\", \"name\" : { \"value\" : \"Alex\" }, \"id\" : \"\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
