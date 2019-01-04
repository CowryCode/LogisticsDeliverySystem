FROM airhacks/glassfish
COPY ./target/deliverysystem.war ${DEPLOYMENT_DIR}
