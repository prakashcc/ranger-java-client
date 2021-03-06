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

import java.io.File;
import io.swagger.client.model.JsonVXAccessAuditList;
import io.swagger.client.model.JsonVXAsset;
import io.swagger.client.model.JsonVXAssetList;
import io.swagger.client.model.JsonVXCredentialStore;
import io.swagger.client.model.JsonVXCredentialStoreList;
import io.swagger.client.model.JsonVXLong;
import io.swagger.client.model.JsonVXPolicy;
import io.swagger.client.model.JsonVXPolicyExportAuditList;
import io.swagger.client.model.JsonVXResource;
import io.swagger.client.model.JsonVXResourceList;
import io.swagger.client.model.JsonVXResponse;
import io.swagger.client.model.JsonVXTrxLogList;
import io.swagger.client.model.JsonVXUgsyncAuditInfoList;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssetRestApi
 */
@Ignore
public class AssetRestApiTest {

    private final AssetRestApi api = new AssetRestApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void configTestTest() throws Exception {
        JsonVXAsset body = null;
        JsonVXResponse response = api.configTest(body);

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
    public void countXAssetsTest() throws Exception {
        JsonVXLong response = api.countXAssets();

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
    public void countXCredentialStoresTest() throws Exception {
        JsonVXLong response = api.countXCredentialStores();

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
    public void countXResourcesTest() throws Exception {
        JsonVXLong response = api.countXResources();

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
    public void createXAssetTest() throws Exception {
        JsonVXAsset body = null;
        JsonVXAsset response = api.createXAsset(body);

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
    public void createXCredentialStoreTest() throws Exception {
        JsonVXCredentialStore body = null;
        JsonVXCredentialStore response = api.createXCredentialStore(body);

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
    public void createXResourceTest() throws Exception {
        JsonVXResource body = null;
        JsonVXResource response = api.createXResource(body);

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
    public void deleteXAssetTest() throws Exception {
        Long id = null;
        api.deleteXAsset(id);

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
    public void deleteXCredentialStoreTest() throws Exception {
        Long id = null;
        api.deleteXCredentialStore(id);

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
    public void deleteXResourceTest() throws Exception {
        Long id = null;
        api.deleteXResource(id);

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
    public void getAccessLogsTest() throws Exception {
        JsonVXAccessAuditList response = api.getAccessLogs();

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
    public void getReportLogsTest() throws Exception {
        JsonVXTrxLogList response = api.getReportLogs();

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
    public void getResourceJSONTest() throws Exception {
        String repository = null;
        String response = api.getResourceJSON(repository);

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
    public void getTransactionReportTest() throws Exception {
        String transactionId = null;
        JsonVXTrxLogList response = api.getTransactionReport(transactionId);

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
    public void getUgsyncAuditsTest() throws Exception {
        JsonVXUgsyncAuditInfoList response = api.getUgsyncAudits();

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
    public void getUgsyncAuditsBySyncSourceTest() throws Exception {
        String syncSource = null;
        JsonVXUgsyncAuditInfoList response = api.getUgsyncAuditsBySyncSource(syncSource);

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
    public void getXAssetTest() throws Exception {
        Long id = null;
        JsonVXAsset response = api.getXAsset(id);

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
    public void getXCredentialStoreTest() throws Exception {
        Long id = null;
        JsonVXCredentialStore response = api.getXCredentialStore(id);

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
    public void getXResourceTest() throws Exception {
        Long id = null;
        JsonVXResource response = api.getXResource(id);

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
    public void getXResourceFileTest() throws Exception {
        Long id = null;
        File response = api.getXResourceFile(id);

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
    public void grantPermissionTest() throws Exception {
        JsonVXPolicy body = null;
        JsonVXPolicy response = api.grantPermission(body);

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
    public void revokePermissionTest() throws Exception {
        JsonVXPolicy body = null;
        JsonVXPolicy response = api.revokePermission(body);

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
    public void searchXAssetsTest() throws Exception {
        JsonVXAssetList response = api.searchXAssets();

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
    public void searchXCredentialStoresTest() throws Exception {
        JsonVXCredentialStoreList response = api.searchXCredentialStores();

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
    public void searchXPolicyExportAuditsTest() throws Exception {
        JsonVXPolicyExportAuditList response = api.searchXPolicyExportAudits();

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
    public void searchXResourcesTest() throws Exception {
        JsonVXResourceList response = api.searchXResources();

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
    public void updateXAssetTest() throws Exception {
        JsonVXAsset body = null;
        JsonVXAsset response = api.updateXAsset(body);

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
    public void updateXCredentialStoreTest() throws Exception {
        JsonVXCredentialStore body = null;
        JsonVXCredentialStore response = api.updateXCredentialStore(body);

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
    public void updateXResourceTest() throws Exception {
        JsonVXResource body = null;
        JsonVXResource response = api.updateXResource(body);

        // TODO: test validations
    }
    
}
