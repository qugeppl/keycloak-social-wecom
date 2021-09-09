package org.keycloak.social.wecom;

import org.keycloak.broker.oidc.mappers.AbstractJsonUserAttributeMapper;
import org.keycloak.broker.provider.BrokeredIdentityContext;
import org.keycloak.models.IdentityProviderMapperModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

/**
 * User attribute mapper.
 *
 */

public class WeComUserAttributeMapper extends AbstractJsonUserAttributeMapper {
    private static final String PROFILE_MOBILE = WeComIdentityProvider.PROFILE_MOBILE;
    private static final String PROFILE_GENDER = WeComIdentityProvider.PROFILE_GENDER;
    private static final String PROFILE_STATUS = WeComIdentityProvider.PROFILE_STATUS;
    private static final String PROFILE_ENABLE = WeComIdentityProvider.PROFILE_ENABLE;
    private static final String[] cp = new String[] { WeComIdentityProviderFactory.PROVIDER_ID };

    @Override
    public String[] getCompatibleProviders() {
        return cp;
    }

    @Override
    public String getId() {
        return "wecom-user-attribute-mapper";
    }

    @Override
    public void updateBrokeredUser(KeycloakSession session, RealmModel realm, UserModel user, IdentityProviderMapperModel mapperModel, BrokeredIdentityContext context) {
        user.setSingleAttribute(PROFILE_MOBILE, context.getUserAttribute(PROFILE_MOBILE));
        user.setSingleAttribute(PROFILE_GENDER, context.getUserAttribute(PROFILE_GENDER));
        user.setSingleAttribute(PROFILE_STATUS, context.getUserAttribute(PROFILE_STATUS));
        user.setSingleAttribute(PROFILE_ENABLE, context.getUserAttribute(PROFILE_ENABLE));
    }
}
