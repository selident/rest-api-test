package api.charge.model;

import org.testng.Assert;

/**
 * Charge Authorization Response Source Object
 * The model to store values from JSON API response as a object - deserialize process
 */
public class AuthorizationResponseSource {

    private String id;

    private String object;

    private String address_city;

    private String address_country;

    private String address_line1;

    private String address_line1_check;

    private String address_line2;

    private String address_state;

    private String address_zip;

    private String address_zip_check;

    private String brand;

    private String country;

    private String customer;

    private String cvc_check;

    private String dynamic_last4;

    private int exp_month;

    private int exp_year;

    private String fingerprint;

    private String funding;

    private String last4;

    AuthorizationResponseSourceMetadata metadata;

    private String name;

    private String tokenization_method;

    /**
     * Getters and Setters
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getAddressCity() {
        return address_city;
    }

    public void setAddressCity(String addressCity) {
        this.address_city = addressCity;
    }

    public String getAddressCountry() {
        return address_country;
    }

    public void setAddressCountry(String addressCountry) {
        this.address_country = addressCountry;
    }

    public String getAddressLine1() {
        return address_line1;
    }

    public void setAddressLine1(String addressLine1) {
        this.address_line1 = addressLine1;
    }

    public String getAddressLine1Check() {
        return address_line1_check;
    }

    public void setAddressLine1Check(String addressLine1Check) {
        this.address_line1_check = addressLine1Check;
    }

    public String getAddressLine2() {
        return address_line2;
    }

    public void setAddressLine2(String addressLine2) {
        this.address_line2 = addressLine2;
    }

    public String getAddressState() {
        return address_state;
    }

    public void setAddressState(String addressState) {
        this.address_state = addressState;
    }

    public String getAddressZip() {
        return address_zip;
    }

    public void setAddressZip(String addressZip) {
        this.address_zip = addressZip;
    }

    public String getAddressZipCheck() {
        return address_zip_check;
    }

    public void setAddressZipCheck(String addressZipCheck) {
        this.address_zip_check = addressZipCheck;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCvcCheck() {
        return cvc_check;
    }

    public void setCvcCheck(String cvcCheck) {
        this.cvc_check = cvcCheck;
    }

    public String getDynamicLast4() {
        return dynamic_last4;
    }

    public void setDynamicLast4(String dynamicLast4) {
        this.dynamic_last4 = dynamicLast4;
    }

    public int getExpMonth() {
        return exp_month;
    }

    public void setExpMonth(int expMonth) {
        this.exp_month = expMonth;
    }

    public int getExpYear() {
        return exp_year;
    }

    public void setExpYear(int expYear) {
        this.exp_year = expYear;
    }

    public String getFingerPrint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getFunding() {
        return funding;
    }

    public void setFunding(String funding) {
        this.funding = funding;
    }

    public String getLast4() {
        return last4;
    }

    public void setLast4(String last4) {
        this.last4 = last4;
    }

    public AuthorizationResponseSourceMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(AuthorizationResponseSourceMetadata metadata) {
        this.metadata = metadata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTokenizationMethod() {
        return tokenization_method;
    }

    public void setTokenizationMethod(String tokenizationMethod) {
        this.tokenization_method = tokenizationMethod;
    }

    /**
     * Compare this object with another one, throw exception if any non-matched field
     * @param expectedSource expected source object
     */
    public void assertEquals(AuthorizationResponseSource expectedSource) {

        Assert.assertEquals(this.getId(), expectedSource.getId());
        Assert.assertEquals(this.getObject(), expectedSource.getObject());
        Assert.assertEquals(this.getAddressCity(), expectedSource.getAddressCity());
        Assert.assertEquals(this.getAddressCountry(), expectedSource.getAddressCountry());
        Assert.assertEquals(this.getAddressLine1(), expectedSource.getAddressLine1());
        Assert.assertEquals(this.getAddressLine1Check(), expectedSource.getAddressLine1Check());
        Assert.assertEquals(this.getAddressLine2(), expectedSource.getAddressLine2());
        Assert.assertEquals(this.getAddressState(), expectedSource.getAddressState());
        Assert.assertEquals(this.getAddressZip(), expectedSource.getAddressZip());
        Assert.assertEquals(this.getAddressZipCheck(), expectedSource.getAddressZipCheck());

        Assert.assertEquals(this.getBrand(), expectedSource.getBrand());
        Assert.assertEquals(this.getCountry(), expectedSource.getCountry());
        Assert.assertEquals(this.getCustomer(), expectedSource.getCustomer());
        Assert.assertEquals(this.getCvcCheck(), expectedSource.getCvcCheck());
        Assert.assertEquals(this.getDynamicLast4(), expectedSource.getDynamicLast4());

        Assert.assertEquals(this.getExpMonth(), expectedSource.getExpMonth());
        Assert.assertEquals(this.getExpYear(), expectedSource.getExpYear());
        Assert.assertEquals(this.getFingerPrint(), expectedSource.getFingerPrint());
        Assert.assertEquals(this.getFunding(), expectedSource.getFunding());
        Assert.assertEquals(this.getLast4(), expectedSource.getLast4());

        if (this.getMetadata() != null) {
            Assert.assertNotNull(expectedSource.getMetadata());
        } else {
            Assert.assertNull(expectedSource.getMetadata());
        }

        Assert.assertEquals(this.getName(), expectedSource.getName());
        Assert.assertEquals(this.getTokenizationMethod(), expectedSource.getTokenizationMethod());
    }
}
