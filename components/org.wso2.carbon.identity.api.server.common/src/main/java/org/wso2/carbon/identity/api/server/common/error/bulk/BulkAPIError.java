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

package org.wso2.carbon.identity.api.server.common.error.bulk;

import org.wso2.carbon.identity.api.server.common.error.APIError;

import javax.ws.rs.core.Response;

/**
 * Common Bulk Exception for all the server bulk API related errors.
 */
public class BulkAPIError extends APIError {

    private static final long serialVersionUID = 7252846578071254026L;
    private final BulkErrorDTO responseEntity;

    public BulkAPIError(Response.Status status, BulkErrorDTO errorResponse) {

        super(status, errorResponse);
        this.responseEntity = errorResponse;
    }

    @Override
    public BulkErrorDTO getResponseEntity() {

        return responseEntity;
    }
}
