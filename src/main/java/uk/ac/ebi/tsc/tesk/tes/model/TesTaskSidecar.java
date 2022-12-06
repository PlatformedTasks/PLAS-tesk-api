package uk.ac.ebi.tsc.tesk.tes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TesTaskSidecar describes the platform to be deployed for the task.
 */
@ApiModel(description = "TesTaskSidecar describes the platform to be deployed for the task.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-24T17:10:08.716Z[Europe/London]")
public class TesTaskSidecar {
//  @JsonProperty("type")
//  @Valid
//  private List<TesTask> tasks = new ArrayList<>();

//  @JsonProperty("parameters")
//  private String nextPageToken;

  @JsonProperty("type")
  private String type;

  @JsonProperty("parameters")
  private TesChartParameters parameters = new TesChartParameters();


  public TesTaskSidecar parameters(TesChartParameters parameters) {
    this.parameters = parameters;
    return this;
  }

//  public TesTaskSidecar addChartParameters(TesChartParameters chartParameters) {
//    this.parameters = new TesChartParameters();
//    return this;
//  }

  /**
   * List of tasks. These tasks will be based on the original submitted task document, but with other fields, such as the job state and logging info, added/changed as the job progresses.
   * @return tasks
  */
  @ApiModelProperty(required = false, value = "List of tasks. These tasks will be based on the original submitted task document, but with other fields, such as the job state and logging info, added/changed as the job progresses.")
  @Valid
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  /**
   * Token used to return the next page of results. This value can be used in the `page_token` field of the next ListTasks request.
   * @return nextPageToken
  */
  @ApiModelProperty(value = "Token used to return the next page of results. This value can be used in the `page_token` field of the next ListTasks request.")


  public TesChartParameters getParameters() {
    return parameters;
  }

  public void setParameters(TesChartParameters parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TesTaskSidecar tesTaskSidecar = (TesTaskSidecar) o;
    return Objects.equals(this.type, tesTaskSidecar.type) &&
        Objects.equals(this.parameters, tesTaskSidecar.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TesTasksSidecar {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

