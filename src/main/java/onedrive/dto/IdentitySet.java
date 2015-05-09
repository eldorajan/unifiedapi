package onedrive.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IdentitySet {
	
	Identity user;
	Identity application;
	Identity device;

}
