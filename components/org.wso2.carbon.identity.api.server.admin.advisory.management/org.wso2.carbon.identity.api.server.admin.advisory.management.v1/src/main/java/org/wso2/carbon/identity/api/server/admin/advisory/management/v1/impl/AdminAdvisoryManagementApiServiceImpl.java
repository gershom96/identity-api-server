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

package org.wso2.carbon.identity.api.server.admin.advisory.management.v1.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.wso2.carbon.identity.api.server.admin.advisory.management.v1.AdminAdvisoryManagementApiService;
import org.wso2.carbon.identity.api.server.admin.advisory.management.v1.core.ServerAdminAdvisoryManagementService;

import javax.ws.rs.core.Response;

/**
 * Admin Advisory Management API Service Implementation.
 **/
public class AdminAdvisoryManagementApiServiceImpl implements AdminAdvisoryManagementApiService {

    @Autowired
    private ServerAdminAdvisoryManagementService adminAdvisoryManagementService;

    /**
     * Endpoint to get the admin advisory banner configuration.
     *
     * @return Response instance.
     */
    @Override
    public Response getAdminAdvisoryConfig() {

        return Response.ok().entity(adminAdvisoryManagementService.getAdminAdvisoryConfig()).build();
    }
}
