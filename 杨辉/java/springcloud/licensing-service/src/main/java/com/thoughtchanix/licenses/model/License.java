package com.thoughtchanix.licenses.model;

//许可证类
public class License{
  private String id;
  private String organizationId;
  private String productName;
  private String licenseType;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getLicenseType() {
    return licenseType;
  }

  public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
  }
  //通过传入ID得到License
  public License withId(String id){
    this.setId( id );
    return this;
  }
  //通过传入OrganizationId得到License
  public License withOrganizationId(String organizationId){
    this.setOrganizationId(organizationId);
    return this;
  }
  //通过传入ProductName得到License
  public License withProductName(String productName){
    this.setProductName(productName);
    return this;
  }
  //通过传入LicenseType得到License
  public License withLicenseType(String licenseType){
    this.setLicenseType(licenseType);
    return this;
  }



}
