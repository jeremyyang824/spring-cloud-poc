package com.jeremyyang.services;

import com.jeremyyang.config.ServiceConfig;
import com.jeremyyang.model.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseService {

    @Autowired
    ServiceConfig config;

    public License getLicense(String organizationId, String licenseId) {
        License license = new License();
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setComment(config.getExampleProperty());
        return license;
    }

}
