/*
 * Copyright Symsoft AB 1996-2015. All Rights Reserved.
 */
package se.symsoft.x24.goingserverless;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Request {

    @SerializedName("allowOnTimeout")
    @Expose
    private Boolean allowOnTimeout;
    @SerializedName("detectionPoint")
    @Expose
    private String detectionPoint;
    @SerializedName("serviceKey")
    @Expose
    private Integer serviceKey;
    @SerializedName("submit")
    @Expose
    private Submit submit;
    @SerializedName("timeout")
    @Expose
    private Integer timeout;
    @SerializedName("trafficCase")
    @Expose
    private Object trafficCase;

    /**
     * No args constructor for use in serialization
     *
     */
    public Request() {
    }

    /**
     *
     * @param serviceKey
     * @param submit
     * @param detectionPoint
     * @param allowOnTimeout
     * @param trafficCase
     * @param timeout
     */
    public Request(Boolean allowOnTimeout, String detectionPoint, Integer serviceKey, Submit submit, Integer timeout, Object trafficCase) {
        this.allowOnTimeout = allowOnTimeout;
        this.detectionPoint = detectionPoint;
        this.serviceKey = serviceKey;
        this.submit = submit;
        this.timeout = timeout;
        this.trafficCase = trafficCase;
    }

    /**
     *
     * @return
     * The allowOnTimeout
     */
    public Boolean getAllowOnTimeout() {
        return allowOnTimeout;
    }

    /**
     *
     * @param allowOnTimeout
     * The allowOnTimeout
     */
    public void setAllowOnTimeout(Boolean allowOnTimeout) {
        this.allowOnTimeout = allowOnTimeout;
    }

    /**
     *
     * @return
     * The detectionPoint
     */
    public String getDetectionPoint() {
        return detectionPoint;
    }

    /**
     *
     * @param detectionPoint
     * The detectionPoint
     */
    public void setDetectionPoint(String detectionPoint) {
        this.detectionPoint = detectionPoint;
    }

    /**
     *
     * @return
     * The serviceKey
     */
    public Integer getServiceKey() {
        return serviceKey;
    }

    /**
     *
     * @param serviceKey
     * The serviceKey
     */
    public void setServiceKey(Integer serviceKey) {
        this.serviceKey = serviceKey;
    }

    /**
     *
     * @return
     * The submit
     */
    public Submit getSubmit() {
        return submit;
    }

    /**
     *
     * @param submit
     * The submit
     */
    public void setSubmit(Submit submit) {
        this.submit = submit;
    }

    /**
     *
     * @return
     * The timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     *
     * @param timeout
     * The timeout
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     *
     * @return
     * The trafficCase
     */
    public Object getTrafficCase() {
        return trafficCase;
    }

    /**
     *
     * @param trafficCase
     * The trafficCase
     */
    public void setTrafficCase(Object trafficCase) {
        this.trafficCase = trafficCase;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(allowOnTimeout).append(detectionPoint).append(serviceKey).append(submit).append(timeout).append(trafficCase).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Request) == false) {
            return false;
        }
        Request rhs = ((Request) other);
        return new EqualsBuilder().append(allowOnTimeout, rhs.allowOnTimeout).append(detectionPoint, rhs.detectionPoint).append(serviceKey, rhs.serviceKey).append(submit, rhs.submit).append(timeout, rhs.timeout).append(trafficCase, rhs.trafficCase).isEquals();
    }

}