/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.server.configs.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class JWTKeyValidatorPatch  {
  

@XmlType(name="OperationEnum")
@XmlEnum(String.class)
public enum OperationEnum {

    @XmlEnumValue("ADD") ADD(String.valueOf("ADD")), @XmlEnumValue("REMOVE") REMOVE(String.valueOf("REMOVE")), @XmlEnumValue("REPLACE") REPLACE(String.valueOf("REPLACE"));


    private String value;

    OperationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
        for (OperationEnum b : OperationEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

    private OperationEnum operation;
    private String path;
    private Boolean value;

    /**
    * The operation to be performed.
    **/
    public JWTKeyValidatorPatch operation(OperationEnum operation) {

        this.operation = operation;
        return this;
    }
    
    @ApiModelProperty(example = "ADD", required = true, value = "The operation to be performed.")
    @JsonProperty("operation")
    @Valid
    @NotNull(message = "Property operation cannot be null.")

    public OperationEnum getOperation() {
        return operation;
    }
    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    /**
    * A JSON-Pointer
    **/
    public JWTKeyValidatorPatch path(String path) {

        this.path = path;
        return this;
    }
    
    @ApiModelProperty(example = "/enableTokenReuse", required = true, value = "A JSON-Pointer")
    @JsonProperty("path")
    @Valid
    @NotNull(message = "Property path cannot be null.")

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    /**
    * The value to be used within the operations.
    **/
    public JWTKeyValidatorPatch value(Boolean value) {

        this.value = value;
        return this;
    }
    
    @ApiModelProperty(example = "false", required = true, value = "The value to be used within the operations.")
    @JsonProperty("value")
    @Valid
    @NotNull(message = "Property value cannot be null.")

    public Boolean getValue() {
        return value;
    }
    public void setValue(Boolean value) {
        this.value = value;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JWTKeyValidatorPatch jwTKeyValidatorPatch = (JWTKeyValidatorPatch) o;
        return Objects.equals(this.operation, jwTKeyValidatorPatch.operation) &&
            Objects.equals(this.path, jwTKeyValidatorPatch.path) &&
            Objects.equals(this.value, jwTKeyValidatorPatch.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, path, value);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class JWTKeyValidatorPatch {\n");
        
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
        return o.toString().replace("\n", "\n");
    }
}

