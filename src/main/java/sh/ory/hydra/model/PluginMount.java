/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.7.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.hydra.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PluginMount plugin mount
 */
@ApiModel(description = "PluginMount plugin mount")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-31T14:13:31.382907Z[GMT]")
public class PluginMount {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DESTINATION = "Destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<String> options = new ArrayList<String>();

  public static final String SERIALIZED_NAME_SETTABLE = "Settable";
  @SerializedName(SERIALIZED_NAME_SETTABLE)
  private List<String> settable = new ArrayList<String>();

  public static final String SERIALIZED_NAME_SOURCE = "Source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public PluginMount description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PluginMount destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * destination
   * @return destination
  **/
  @ApiModelProperty(required = true, value = "destination")

  public String getDestination() {
    return destination;
  }


  public void setDestination(String destination) {
    this.destination = destination;
  }


  public PluginMount name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PluginMount options(List<String> options) {
    
    this.options = options;
    return this;
  }

  public PluginMount addOptionsItem(String optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

   /**
   * options
   * @return options
  **/
  @ApiModelProperty(required = true, value = "options")

  public List<String> getOptions() {
    return options;
  }


  public void setOptions(List<String> options) {
    this.options = options;
  }


  public PluginMount settable(List<String> settable) {
    
    this.settable = settable;
    return this;
  }

  public PluginMount addSettableItem(String settableItem) {
    this.settable.add(settableItem);
    return this;
  }

   /**
   * settable
   * @return settable
  **/
  @ApiModelProperty(required = true, value = "settable")

  public List<String> getSettable() {
    return settable;
  }


  public void setSettable(List<String> settable) {
    this.settable = settable;
  }


  public PluginMount source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * source
   * @return source
  **/
  @ApiModelProperty(required = true, value = "source")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public PluginMount type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginMount pluginMount = (PluginMount) o;
    return Objects.equals(this.description, pluginMount.description) &&
        Objects.equals(this.destination, pluginMount.destination) &&
        Objects.equals(this.name, pluginMount.name) &&
        Objects.equals(this.options, pluginMount.options) &&
        Objects.equals(this.settable, pluginMount.settable) &&
        Objects.equals(this.source, pluginMount.source) &&
        Objects.equals(this.type, pluginMount.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, destination, name, options, settable, source, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginMount {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    settable: ").append(toIndentedString(settable)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

