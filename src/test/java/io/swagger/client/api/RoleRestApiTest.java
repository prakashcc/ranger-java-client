/*
 * Ranger REST API
 * Apache Ranger is a framework to enable, monitor and manage comprehensive data security across the Hadoop platform. Apache Ranger currently provides a centralized security adminstration, fine grain access control and detailed auditing for user access within Apache Hadoop, Apache Hive, Apache HBase and other Apache components
 *
 * OpenAPI spec version: 2.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.JsonGrantRevokeRoleRequest;
import io.swagger.client.model.JsonRESTResponse;
import io.swagger.client.model.JsonRangerRole;
import io.swagger.client.model.JsonRangerRoleList;
import io.swagger.client.model.JsonRangerRoles;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoleRestApi
 */
@Ignore
public class RoleRestApiTest {

    private final RoleRestApi api = new RoleRestApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addUsersAndGroups2Test() throws Exception {
        Boolean body = null;
        JsonRangerRole response = api.addUsersAndGroups2(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createRole2Test() throws Exception {
        Boolean createNonExistUserGroup = null;
        String serviceName = null;
        JsonRangerRole body = null;
        JsonRangerRole response = api.createRole2(createNonExistUserGroup, serviceName, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteRole2Test() throws Exception {
        String name = null;
        String execUser = null;
        String serviceName = null;
        api.deleteRole2(name, execUser, serviceName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteRole2_0Test() throws Exception {
        Long id = null;
        api.deleteRole2_0(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllRoleNames2Test() throws Exception {
        String execUser = null;
        String serviceName = null;
        List<String> response = api.getAllRoleNames2(execUser, serviceName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllRoles2Test() throws Exception {
        JsonRangerRoleList response = api.getAllRoles2();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllRolesForUserTest() throws Exception {
        JsonRangerRoleList response = api.getAllRolesForUser();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRangerRolesIfUpdatedTest() throws Exception {
        String serviceName = null;
        String clusterName = null;
        Long lastActivationTime = null;
        Long lastKnownRoleVersion = null;
        String pluginCapabilities = null;
        String pluginId = null;
        JsonRangerRoles response = api.getRangerRolesIfUpdated(serviceName, clusterName, lastActivationTime, lastKnownRoleVersion, pluginCapabilities, pluginId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRole2Test() throws Exception {
        String name = null;
        String execUser = null;
        String serviceName = null;
        JsonRangerRole response = api.getRole2(name, execUser, serviceName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRole2_0Test() throws Exception {
        Long id = null;
        JsonRangerRole response = api.getRole2_0(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSecureRangerRolesIfUpdatedTest() throws Exception {
        String serviceName = null;
        String clusterName = null;
        Long lastActivationTime = null;
        Long lastKnownRoleVersion = null;
        String pluginCapabilities = null;
        String pluginId = null;
        JsonRangerRoles response = api.getSecureRangerRolesIfUpdated(serviceName, clusterName, lastActivationTime, lastKnownRoleVersion, pluginCapabilities, pluginId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserRoles2Test() throws Exception {
        String user = null;
        List<String> response = api.getUserRoles2(user);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void grantRole2Test() throws Exception {
        String serviceName = null;
        JsonGrantRevokeRoleRequest body = null;
        JsonRESTResponse response = api.grantRole2(serviceName, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeAdminFromUsersAndGroups2Test() throws Exception {
        List<String> body = null;
        JsonRangerRole response = api.removeAdminFromUsersAndGroups2(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeUsersAndGroups2Test() throws Exception {
        List<String> body = null;
        JsonRangerRole response = api.removeUsersAndGroups2(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void revokeRoleTest() throws Exception {
        String serviceName = null;
        JsonGrantRevokeRoleRequest body = null;
        JsonRESTResponse response = api.revokeRole(serviceName, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateRole2Test() throws Exception {
        Long id = null;
        Boolean createNonExistUserGroup = null;
        JsonRangerRole body = null;
        JsonRangerRole response = api.updateRole2(id, createNonExistUserGroup, body);

        // TODO: test validations
    }
    
}
