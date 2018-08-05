package com.jeremyyang.services;

import com.jeremyyang.config.ServiceConfig;
import com.jeremyyang.model.License;
import com.jeremyyang.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;

@Service
public class LicenseService {

    @Autowired
    ServiceConfig config;

    @Autowired
    private LoadBalancerClient loadBalancer;

    @Autowired
    private OrganizationService organizationService;

    public License getLicense(String organizationId, String licenseId) {
        //Test ribbon client
        ServiceInstance instance = loadBalancer.choose("organizationservice");
        System.out.println(instance.getUri().toString());

        //Use Feign+Ribbon get data from remote service
        Organization organization = organizationService.getOrganization(organizationId);

        License license = new License();
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setComment(config.getExampleProperty());
        license.setOrganization(organization);
        return license;
    }

}
