/*
 * Copyright Symsoft AB 1996-2015. All Rights Reserved.
 */
package se.symsoft.x24.goingserverless;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ReleaseResponse {

    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("errorCode")
    @Expose
    private Integer errorCode;

    /**
     * No args constructor for use in serialization
     *
     */
    public ReleaseResponse() {
    }

    /**
     *
     * @param _class
     * @param errorCode
     */
    public ReleaseResponse(String _class, Integer errorCode) {
        this._class = _class;
        this.errorCode = errorCode;
    }

    /**
     *
     * @return
     * The _class
     */
    public String getClass_() {
        return _class;
    }

    /**
     *
     * @param _class
     * The class
     */
    public void setClass_(String _class) {
        this._class = _class;
    }

    /**
     *
     * @return
     * The errorCode
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     *
     * @param errorCode
     * The errorCode
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_class).append(errorCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReleaseResponse) == false) {
            return false;
        }
        ReleaseResponse rhs = ((ReleaseResponse) other);
        return new EqualsBuilder().append(_class, rhs._class).append(errorCode, rhs.errorCode).isEquals();
    }

}