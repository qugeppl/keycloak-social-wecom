From quay.io/keycloak/keycloak:12.0.4

RUN mkdir /opt/jboss/keycloak/providers
#RUN mkdir -p /usr/local/services/ \
#    && mkdir /lib64 \
#   && ln -s /lib/libc.musl-x86_64.so.1 /lib64/ld-linux-x86-64.so.2
COPY target/keycloak-social-wecom-12.0.4.jar /opt/jboss/keycloak/providers/
COPY themes /opt/jboss/keycloak/themes
COPY --chown=jboss:root module.xml /opt/jboss/keycloak/modules/system/layers/keycloak/org/keycloak/keycloak-services/main/