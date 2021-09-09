package org.keycloak.social.wecom;

import org.keycloak.broker.oidc.OAuth2IdentityProviderConfig;
import org.keycloak.models.IdentityProviderModel;


public class WeComProviderConfig extends OAuth2IdentityProviderConfig {

    public WeComProviderConfig (IdentityProviderModel model) {
        super(model);
    }

    public WeComProviderConfig() {
    }

    public String getAgentId() {
        return getConfig().get("agentId");
    }

    public void setAgentId(String agentId) {
        getConfig().put("agentId", agentId);
    }

    public String getQrcodeAuthorizationUrl() {
        return getConfig().get("qrcodeAuthorizationUrl");
    }

    public void setQrcodeAuthorizationUrl(String qrcodeAuthorizationUrl) {
        getConfig().put("qrcodeAuthorizationUrl", qrcodeAuthorizationUrl);
    }
}
