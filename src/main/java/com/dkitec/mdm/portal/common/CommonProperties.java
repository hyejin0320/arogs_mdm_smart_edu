package com.dkitec.mdm.portal.common;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class CommonProperties extends Properties {

    private static final long serialVersionUID = 1L;

    private static final Logger LOG = LoggerFactory.getLogger(CommonProperties.class);

    /**
     * Creates an empty property list with no default values.
     */
    public CommonProperties() {
        super();
        try(InputStream inputStream = new FileInputStream(ResourceUtils.getFile("classpath:properties/common.properties"))) {
            load(inputStream);
            Set<String> propNames = this.stringPropertyNames();

            propNames.forEach(name -> {
                String replacedAndUpper = StringUtils.replace(name, ".", "_").toUpperCase();
                LOG.debug("searching for '{}' or '{}'...", name, replacedAndUpper);

                String sysValue = !StringUtils.isEmpty(System.getenv(name)) ? System.getenv(name) : System.getenv(replacedAndUpper);

                if(sysValue != null) {
                    setProperty(name, sysValue);
                }
                LOG.debug("property '{}' set to '{}'", name, getProperty(name));
            });
        }
        catch(Exception e) {
            LOG.error(e.getMessage(), e);
        }
    }
}
