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

import io.swagger.client.model.JsonVXKmsKey;
import io.swagger.client.model.JsonVXKmsKeyList;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for XKeyRestApi
 */
@Ignore
public class XKeyRestApiTest {

    private final XKeyRestApi api = new XKeyRestApi();

    
    /**
     * Implements the create key functionality.
     *
     * Implements the create key functionality
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createKeyTest() throws Exception {
        String provider = null;
        JsonVXKmsKey body = null;
        JsonVXKmsKey response = api.createKey(provider, body);

        // TODO: test validations
    }
    
    /**
     * Implements the delete key functionality.
     *
     * Implements the delete key functionality
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteKeyTest() throws Exception {
        String alias = null;
        String provider = null;
        api.deleteKey(alias, provider);

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
    public void getKeyTest() throws Exception {
        String alias = null;
        String provider = null;
        JsonVXKmsKey response = api.getKey(alias, provider);

        // TODO: test validations
    }
    
    /**
     * Implements the Rollover key functionality.
     *
     * Implements the Rollover key functionality
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rolloverKeyTest() throws Exception {
        String provider = null;
        JsonVXKmsKey body = null;
        JsonVXKmsKey response = api.rolloverKey(provider, body);

        // TODO: test validations
    }
    
    /**
     * Implements the traditional search functionalities for Keys.
     *
     * Implements the traditional search functionalities for Keys
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchKeysTest() throws Exception {
        String provider = null;
        JsonVXKmsKeyList response = api.searchKeys(provider);

        // TODO: test validations
    }
    
}