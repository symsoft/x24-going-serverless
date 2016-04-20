/*
 * Copyright Symsoft AB 1996-2015. All Rights Reserved.
 */
package se.symsoft.x24.goingserverless;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class UserData {

    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("dataCodingScheme")
    @Expose
    private Integer dataCodingScheme;
    @SerializedName("userDataHeader")
    @Expose
    private Boolean userDataHeader;

    /**
     * No args constructor for use in serialization
     *
     */
    public UserData() {
    }

    /**
     *
     * @param dataCodingScheme
     * @param userDataHeader
     * @param data
     */
    public UserData(String data, Integer dataCodingScheme, Boolean userDataHeader) {
        this.data = data;
        this.dataCodingScheme = dataCodingScheme;
        this.userDataHeader = userDataHeader;
    }

    /**
     *
     * @return
     * The data
     */
    public String getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     *
     * @return
     * The dataCodingScheme
     */
    public Integer getDataCodingScheme() {
        return dataCodingScheme;
    }

    /**
     *
     * @param dataCodingScheme
     * The dataCodingScheme
     */
    public void setDataCodingScheme(Integer dataCodingScheme) {
        this.dataCodingScheme = dataCodingScheme;
    }

    /**
     *
     * @return
     * The userDataHeader
     */
    public Boolean getUserDataHeader() {
        return userDataHeader;
    }

    /**
     *
     * @param userDataHeader
     * The userDataHeader
     */
    public void setUserDataHeader(Boolean userDataHeader) {
        this.userDataHeader = userDataHeader;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(data).append(dataCodingScheme).append(userDataHeader).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserData) == false) {
            return false;
        }
        UserData rhs = ((UserData) other);
        return new EqualsBuilder().append(data, rhs.data).append(dataCodingScheme, rhs.dataCodingScheme).append(userDataHeader, rhs.userDataHeader).isEquals();
    }

}
