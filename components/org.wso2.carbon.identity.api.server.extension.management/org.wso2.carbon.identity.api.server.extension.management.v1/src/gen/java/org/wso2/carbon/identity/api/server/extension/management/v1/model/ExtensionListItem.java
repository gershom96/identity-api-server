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

package org.wso2.carbon.identity.api.server.extension.management.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class ExtensionListItem  {
  
    private String id;
    private String name;
    private String description;
    private String image;
    private Integer displayOrder;
    private List<String> tags = null;

    private String category;
    private String type;
    private String self;

    /**
    **/
    public ExtensionListItem id(String id) {

        this.id = id;
        return this;
    }
    
    @ApiModelProperty(example = "d7c8549f-32af-4f53-9013-f66f1a6c67bf", value = "")
    @JsonProperty("id")
    @Valid
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    /**
    **/
    public ExtensionListItem name(String name) {

        this.name = name;
        return this;
    }
    
    @ApiModelProperty(example = "google-oidc", value = "")
    @JsonProperty("name")
    @Valid
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
    **/
    public ExtensionListItem description(String description) {

        this.description = description;
        return this;
    }
    
    @ApiModelProperty(example = "Google Auth Connection", value = "")
    @JsonProperty("description")
    @Valid
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    **/
    public ExtensionListItem image(String image) {

        this.image = image;
        return this;
    }
    
    @ApiModelProperty(example = "google-oidc.png", value = "")
    @JsonProperty("image")
    @Valid
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    /**
    **/
    public ExtensionListItem displayOrder(Integer displayOrder) {

        this.displayOrder = displayOrder;
        return this;
    }
    
    @ApiModelProperty(example = "3", value = "")
    @JsonProperty("displayOrder")
    @Valid
    public Integer getDisplayOrder() {
        return displayOrder;
    }
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
    **/
    public ExtensionListItem tags(List<String> tags) {

        this.tags = tags;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("tags")
    @Valid
    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ExtensionListItem addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

        /**
    **/
    public ExtensionListItem category(String category) {

        this.category = category;
        return this;
    }
    
    @ApiModelProperty(example = "DEFAULT", value = "")
    @JsonProperty("category")
    @Valid
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    /**
    **/
    public ExtensionListItem type(String type) {

        this.type = type;
        return this;
    }
    
    @ApiModelProperty(example = "connection", value = "")
    @JsonProperty("type")
    @Valid
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    /**
    **/
    public ExtensionListItem self(String self) {

        this.self = self;
        return this;
    }
    
    @ApiModelProperty(example = "https://localhost:9443/api/v1/extensions/connection/d7c8549f-32af-4f53-9013-f66f1a6c67bf", value = "")
    @JsonProperty("self")
    @Valid
    public String getSelf() {
        return self;
    }
    public void setSelf(String self) {
        this.self = self;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtensionListItem extensionListItem = (ExtensionListItem) o;
        return Objects.equals(this.id, extensionListItem.id) &&
            Objects.equals(this.name, extensionListItem.name) &&
            Objects.equals(this.description, extensionListItem.description) &&
            Objects.equals(this.image, extensionListItem.image) &&
            Objects.equals(this.displayOrder, extensionListItem.displayOrder) &&
            Objects.equals(this.tags, extensionListItem.tags) &&
            Objects.equals(this.category, extensionListItem.category) &&
            Objects.equals(this.type, extensionListItem.type) &&
            Objects.equals(this.self, extensionListItem.self);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, image, displayOrder, tags, category, type, self);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionListItem {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

