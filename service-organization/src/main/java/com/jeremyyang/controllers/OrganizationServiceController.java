package com.jeremyyang.controllers;

import com.jeremyyang.model.Organization;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="v1/organizations")
public class OrganizationServiceController {

    @RequestMapping(value="/{organizationId}",method = RequestMethod.GET)
    public Organization getOrganization(@PathVariable("organizationId") String organizationId) {
        Organization organization = new Organization();
        organization.setId(organizationId);
        organization.setName("Test Organization");
        organization.setContactName("Yang, Jeremy");
        organization.setContactPhone("123456");
        organization.setContactEmail("jeremyyang@ccc.com");
        return organization;
    }
}
