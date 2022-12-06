package uk.ac.ebi.tsc.tesk.tes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OutputFileLog describes a single output file. This describes file details after the task has completed successfully, for logging purposes.
 */
@ApiModel(description = "OutputFileLog describes a single output file. This describes file details after the task has completed successfully, for logging purposes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-24T17:10:08.716Z[Europe/London]")
public class TesChartParameters {
  @JsonProperty("chartrepo")
  private String chartrepo;

  @JsonProperty("chartversion")
  private String chartversion;

  @JsonProperty("chartname")
  private String chartname;


  /**
   * URL of the file in storage, e.g. s3://bucket/file.txt
   * @return url
  */
  @ApiModelProperty(required = false, value = "URL of the file in storage, e.g. s3://bucket/file.txt")
  @NotNull


  public String getChartrepo(){
    return chartrepo;
  }

  public void setChartrepo(String chartrepo) {
    this.chartrepo = chartrepo;
  }


  /**
   * Path of the file inside the container. Must be an absolute path.
   * @return path
  */


  public String getChartname() {
    return chartname;
  }

  public void setChartname(String chartname) {
    this.chartname = chartname;
  }

  /**
   * Size of the file in bytes. Note, this is currently coded as a string because official JSON doesn't support int64 numbers.
   * @return sizeBytes
  */
  @ApiModelProperty(example = "[\"1024\"]", required = true, value = "Size of the file in bytes. Note, this is currently coded as a string because official JSON doesn't support int64 numbers.")
  @NotNull


  public String getChartversion() {
    return chartversion;
  }

  public void setChartversion(String chartversion) {
    this.chartversion = chartversion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TesChartParameters TesChartParameters = (TesChartParameters) o;
    return Objects.equals(this.chartrepo, TesChartParameters.chartrepo) &&
        Objects.equals(this.chartname, TesChartParameters.chartname) &&
        Objects.equals(this.chartversion, TesChartParameters.chartversion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartrepo, chartname, chartversion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TesOutputFileLog {\n");
    
    sb.append("    chartrepo: ").append(toIndentedString(chartrepo)).append("\n");
    sb.append("    chartname: ").append(toIndentedString(chartname)).append("\n");
    sb.append("    chartversion: ").append(toIndentedString(chartversion)).append("\n");
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

