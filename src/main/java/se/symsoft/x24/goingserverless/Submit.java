/*
 * Copyright Symsoft AB 1996-2015. All Rights Reserved.
 */
package se.symsoft.x24.goingserverless;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Submit {

    @SerializedName("concat")
    @Expose
    private Boolean concat;
    @SerializedName("concatSmRefNumber")
    @Expose
    private Integer concatSmRefNumber;
    @SerializedName("concatSmTotal")
    @Expose
    private Integer concatSmTotal;
    @SerializedName("destAddrNP")
    @Expose
    private String destAddrNP;
    @SerializedName("destAddrTON")
    @Expose
    private String destAddrTON;
    @SerializedName("destAddrValue")
    @Expose
    private String destAddrValue;
    @SerializedName("destImsi")
    @Expose
    private Object destImsi;
    @SerializedName("destMsc")
    @Expose
    private Object destMsc;
    @SerializedName("destMsisdn")
    @Expose
    private String destMsisdn;
    @SerializedName("dialledDestAddrNP")
    @Expose
    private Object dialledDestAddrNP;
    @SerializedName("dialledDestAddrTON")
    @Expose
    private Object dialledDestAddrTON;
    @SerializedName("dialledDestAddrValue")
    @Expose
    private Object dialledDestAddrValue;
    @SerializedName("earliestAttemptTimeStamp")
    @Expose
    private Integer earliestAttemptTimeStamp;
    @SerializedName("esmeIdentifier")
    @Expose
    private Object esmeIdentifier;
    @SerializedName("esmeMessageId")
    @Expose
    private Object esmeMessageId;
    @SerializedName("mapVersion")
    @Expose
    private Object mapVersion;
    @SerializedName("messageReference")
    @Expose
    private Integer messageReference;
    @SerializedName("messagingMode")
    @Expose
    private String messagingMode;
    @SerializedName("modifiedOrigAddrNP")
    @Expose
    private Object modifiedOrigAddrNP;
    @SerializedName("modifiedOrigAddrTON")
    @Expose
    private Object modifiedOrigAddrTON;
    @SerializedName("modifiedOrigAddrValue")
    @Expose
    private Object modifiedOrigAddrValue;
    @SerializedName("moreMessagesToSend")
    @Expose
    private Boolean moreMessagesToSend;
    @SerializedName("noOfDeliveryAttempts")
    @Expose
    private Integer noOfDeliveryAttempts;
    @SerializedName("origAddrNP")
    @Expose
    private String origAddrNP;
    @SerializedName("origAddrPresentationRestricted")
    @Expose
    private Boolean origAddrPresentationRestricted;
    @SerializedName("origAddrTON")
    @Expose
    private String origAddrTON;
    @SerializedName("origAddrValue")
    @Expose
    private String origAddrValue;
    @SerializedName("origImsi")
    @Expose
    private Object origImsi;
    @SerializedName("origMsc")
    @Expose
    private Object origMsc;
    @SerializedName("originalOrigAddrValue")
    @Expose
    private String originalOrigAddrValue;
    @SerializedName("protocolIdentifier")
    @Expose
    private Integer protocolIdentifier;
    @SerializedName("refId")
    @Expose
    private String refId;
    @SerializedName("routingIndex")
    @Expose
    private Integer routingIndex;
    @SerializedName("sequenceEnforced")
    @Expose
    private Boolean sequenceEnforced;
    @SerializedName("serviceCentreAddress")
    @Expose
    private Object serviceCentreAddress;
    @SerializedName("sourceEsmeType")
    @Expose
    private String sourceEsmeType;
    @SerializedName("sourceName")
    @Expose
    private String sourceName;
    @SerializedName("sourceType")
    @Expose
    private String sourceType;
    @SerializedName("standardType")
    @Expose
    private String standardType;
    @SerializedName("statusReportRequest")
    @Expose
    private Integer statusReportRequest;
    @SerializedName("superRefId")
    @Expose
    private Object superRefId;
    @SerializedName("suppressCdrGeneration")
    @Expose
    private Boolean suppressCdrGeneration;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("unmodifiedOrigAddrNP")
    @Expose
    private String unmodifiedOrigAddrNP;
    @SerializedName("unmodifiedOrigAddrTON")
    @Expose
    private String unmodifiedOrigAddrTON;
    @SerializedName("unmodifiedOrigAddrValue")
    @Expose
    private String unmodifiedOrigAddrValue;
    @SerializedName("userData")
    @Expose
    private UserData userData;
    @SerializedName("userProvidedId")
    @Expose
    private String userProvidedId;
    @SerializedName("validUntil")
    @Expose
    private Integer validUntil;
    @SerializedName("virtualSmscId")
    @Expose
    private Integer virtualSmscId;

    /**
     * No args constructor for use in serialization
     *
     */
    public Submit() {
    }

    /**
     *
     * @param superRefId
     * @param modifiedOrigAddrValue
     * @param validUntil
     * @param type
     * @param destImsi
     * @param origAddrPresentationRestricted
     * @param destAddrNP
     * @param modifiedOrigAddrNP
     * @param routingIndex
     * @param unmodifiedOrigAddrNP
     * @param dialledDestAddrTON
     * @param destMsisdn
     * @param esmeMessageId
     * @param suppressCdrGeneration
     * @param originalOrigAddrValue
     * @param moreMessagesToSend
     * @param origAddrTON
     * @param origAddrValue
     * @param virtualSmscId
     * @param dialledDestAddrNP
     * @param esmeIdentifier
     * @param concatSmRefNumber
     * @param standardType
     * @param serviceCentreAddress
     * @param dialledDestAddrValue
     * @param noOfDeliveryAttempts
     * @param modifiedOrigAddrTON
     * @param origImsi
     * @param messagingMode
     * @param userProvidedId
     * @param mapVersion
     * @param refId
     * @param sourceEsmeType
     * @param userData
     * @param statusReportRequest
     * @param sourceName
     * @param unmodifiedOrigAddrTON
     * @param destAddrValue
     * @param unmodifiedOrigAddrValue
     * @param messageReference
     * @param sourceType
     * @param concatSmTotal
     * @param destMsc
     * @param destAddrTON
     * @param earliestAttemptTimeStamp
     * @param concat
     * @param protocolIdentifier
     * @param sequenceEnforced
     * @param origAddrNP
     * @param origMsc
     */
    public Submit(Boolean concat, Integer concatSmRefNumber, Integer concatSmTotal, String destAddrNP, String destAddrTON, String destAddrValue, Object destImsi, Object destMsc, String destMsisdn, Object dialledDestAddrNP, Object dialledDestAddrTON, Object dialledDestAddrValue, Integer earliestAttemptTimeStamp, Object esmeIdentifier, Object esmeMessageId, Object mapVersion, Integer messageReference, String messagingMode, Object modifiedOrigAddrNP, Object modifiedOrigAddrTON, Object modifiedOrigAddrValue, Boolean moreMessagesToSend, Integer noOfDeliveryAttempts, String origAddrNP, Boolean origAddrPresentationRestricted, String origAddrTON, String origAddrValue, Object origImsi, Object origMsc, String originalOrigAddrValue, Integer protocolIdentifier, String refId, Integer routingIndex, Boolean sequenceEnforced, Object serviceCentreAddress, String sourceEsmeType, String sourceName, String sourceType, String standardType, Integer statusReportRequest, Object superRefId, Boolean suppressCdrGeneration, String type, String unmodifiedOrigAddrNP, String unmodifiedOrigAddrTON, String unmodifiedOrigAddrValue, UserData userData, String userProvidedId, Integer validUntil, Integer virtualSmscId) {
        this.concat = concat;
        this.concatSmRefNumber = concatSmRefNumber;
        this.concatSmTotal = concatSmTotal;
        this.destAddrNP = destAddrNP;
        this.destAddrTON = destAddrTON;
        this.destAddrValue = destAddrValue;
        this.destImsi = destImsi;
        this.destMsc = destMsc;
        this.destMsisdn = destMsisdn;
        this.dialledDestAddrNP = dialledDestAddrNP;
        this.dialledDestAddrTON = dialledDestAddrTON;
        this.dialledDestAddrValue = dialledDestAddrValue;
        this.earliestAttemptTimeStamp = earliestAttemptTimeStamp;
        this.esmeIdentifier = esmeIdentifier;
        this.esmeMessageId = esmeMessageId;
        this.mapVersion = mapVersion;
        this.messageReference = messageReference;
        this.messagingMode = messagingMode;
        this.modifiedOrigAddrNP = modifiedOrigAddrNP;
        this.modifiedOrigAddrTON = modifiedOrigAddrTON;
        this.modifiedOrigAddrValue = modifiedOrigAddrValue;
        this.moreMessagesToSend = moreMessagesToSend;
        this.noOfDeliveryAttempts = noOfDeliveryAttempts;
        this.origAddrNP = origAddrNP;
        this.origAddrPresentationRestricted = origAddrPresentationRestricted;
        this.origAddrTON = origAddrTON;
        this.origAddrValue = origAddrValue;
        this.origImsi = origImsi;
        this.origMsc = origMsc;
        this.originalOrigAddrValue = originalOrigAddrValue;
        this.protocolIdentifier = protocolIdentifier;
        this.refId = refId;
        this.routingIndex = routingIndex;
        this.sequenceEnforced = sequenceEnforced;
        this.serviceCentreAddress = serviceCentreAddress;
        this.sourceEsmeType = sourceEsmeType;
        this.sourceName = sourceName;
        this.sourceType = sourceType;
        this.standardType = standardType;
        this.statusReportRequest = statusReportRequest;
        this.superRefId = superRefId;
        this.suppressCdrGeneration = suppressCdrGeneration;
        this.type = type;
        this.unmodifiedOrigAddrNP = unmodifiedOrigAddrNP;
        this.unmodifiedOrigAddrTON = unmodifiedOrigAddrTON;
        this.unmodifiedOrigAddrValue = unmodifiedOrigAddrValue;
        this.userData = userData;
        this.userProvidedId = userProvidedId;
        this.validUntil = validUntil;
        this.virtualSmscId = virtualSmscId;
    }

    /**
     *
     * @return
     * The concat
     */
    public Boolean getConcat() {
        return concat;
    }

    /**
     *
     * @param concat
     * The concat
     */
    public void setConcat(Boolean concat) {
        this.concat = concat;
    }

    /**
     *
     * @return
     * The concatSmRefNumber
     */
    public Integer getConcatSmRefNumber() {
        return concatSmRefNumber;
    }

    /**
     *
     * @param concatSmRefNumber
     * The concatSmRefNumber
     */
    public void setConcatSmRefNumber(Integer concatSmRefNumber) {
        this.concatSmRefNumber = concatSmRefNumber;
    }

    /**
     *
     * @return
     * The concatSmTotal
     */
    public Integer getConcatSmTotal() {
        return concatSmTotal;
    }

    /**
     *
     * @param concatSmTotal
     * The concatSmTotal
     */
    public void setConcatSmTotal(Integer concatSmTotal) {
        this.concatSmTotal = concatSmTotal;
    }

    /**
     *
     * @return
     * The destAddrNP
     */
    public String getDestAddrNP() {
        return destAddrNP;
    }

    /**
     *
     * @param destAddrNP
     * The destAddrNP
     */
    public void setDestAddrNP(String destAddrNP) {
        this.destAddrNP = destAddrNP;
    }

    /**
     *
     * @return
     * The destAddrTON
     */
    public String getDestAddrTON() {
        return destAddrTON;
    }

    /**
     *
     * @param destAddrTON
     * The destAddrTON
     */
    public void setDestAddrTON(String destAddrTON) {
        this.destAddrTON = destAddrTON;
    }

    /**
     *
     * @return
     * The destAddrValue
     */
    public String getDestAddrValue() {
        return destAddrValue;
    }

    /**
     *
     * @param destAddrValue
     * The destAddrValue
     */
    public void setDestAddrValue(String destAddrValue) {
        this.destAddrValue = destAddrValue;
    }

    /**
     *
     * @return
     * The destImsi
     */
    public Object getDestImsi() {
        return destImsi;
    }

    /**
     *
     * @param destImsi
     * The destImsi
     */
    public void setDestImsi(Object destImsi) {
        this.destImsi = destImsi;
    }

    /**
     *
     * @return
     * The destMsc
     */
    public Object getDestMsc() {
        return destMsc;
    }

    /**
     *
     * @param destMsc
     * The destMsc
     */
    public void setDestMsc(Object destMsc) {
        this.destMsc = destMsc;
    }

    /**
     *
     * @return
     * The destMsisdn
     */
    public String getDestMsisdn() {
        return destMsisdn;
    }

    /**
     *
     * @param destMsisdn
     * The destMsisdn
     */
    public void setDestMsisdn(String destMsisdn) {
        this.destMsisdn = destMsisdn;
    }

    /**
     *
     * @return
     * The dialledDestAddrNP
     */
    public Object getDialledDestAddrNP() {
        return dialledDestAddrNP;
    }

    /**
     *
     * @param dialledDestAddrNP
     * The dialledDestAddrNP
     */
    public void setDialledDestAddrNP(Object dialledDestAddrNP) {
        this.dialledDestAddrNP = dialledDestAddrNP;
    }

    /**
     *
     * @return
     * The dialledDestAddrTON
     */
    public Object getDialledDestAddrTON() {
        return dialledDestAddrTON;
    }

    /**
     *
     * @param dialledDestAddrTON
     * The dialledDestAddrTON
     */
    public void setDialledDestAddrTON(Object dialledDestAddrTON) {
        this.dialledDestAddrTON = dialledDestAddrTON;
    }

    /**
     *
     * @return
     * The dialledDestAddrValue
     */
    public Object getDialledDestAddrValue() {
        return dialledDestAddrValue;
    }

    /**
     *
     * @param dialledDestAddrValue
     * The dialledDestAddrValue
     */
    public void setDialledDestAddrValue(Object dialledDestAddrValue) {
        this.dialledDestAddrValue = dialledDestAddrValue;
    }

    /**
     *
     * @return
     * The earliestAttemptTimeStamp
     */
    public Integer getEarliestAttemptTimeStamp() {
        return earliestAttemptTimeStamp;
    }

    /**
     *
     * @param earliestAttemptTimeStamp
     * The earliestAttemptTimeStamp
     */
    public void setEarliestAttemptTimeStamp(Integer earliestAttemptTimeStamp) {
        this.earliestAttemptTimeStamp = earliestAttemptTimeStamp;
    }

    /**
     *
     * @return
     * The esmeIdentifier
     */
    public Object getEsmeIdentifier() {
        return esmeIdentifier;
    }

    /**
     *
     * @param esmeIdentifier
     * The esmeIdentifier
     */
    public void setEsmeIdentifier(Object esmeIdentifier) {
        this.esmeIdentifier = esmeIdentifier;
    }

    /**
     *
     * @return
     * The esmeMessageId
     */
    public Object getEsmeMessageId() {
        return esmeMessageId;
    }

    /**
     *
     * @param esmeMessageId
     * The esmeMessageId
     */
    public void setEsmeMessageId(Object esmeMessageId) {
        this.esmeMessageId = esmeMessageId;
    }

    /**
     *
     * @return
     * The mapVersion
     */
    public Object getMapVersion() {
        return mapVersion;
    }

    /**
     *
     * @param mapVersion
     * The mapVersion
     */
    public void setMapVersion(Object mapVersion) {
        this.mapVersion = mapVersion;
    }

    /**
     *
     * @return
     * The messageReference
     */
    public Integer getMessageReference() {
        return messageReference;
    }

    /**
     *
     * @param messageReference
     * The messageReference
     */
    public void setMessageReference(Integer messageReference) {
        this.messageReference = messageReference;
    }

    /**
     *
     * @return
     * The messagingMode
     */
    public String getMessagingMode() {
        return messagingMode;
    }

    /**
     *
     * @param messagingMode
     * The messagingMode
     */
    public void setMessagingMode(String messagingMode) {
        this.messagingMode = messagingMode;
    }

    /**
     *
     * @return
     * The modifiedOrigAddrNP
     */
    public Object getModifiedOrigAddrNP() {
        return modifiedOrigAddrNP;
    }

    /**
     *
     * @param modifiedOrigAddrNP
     * The modifiedOrigAddrNP
     */
    public void setModifiedOrigAddrNP(Object modifiedOrigAddrNP) {
        this.modifiedOrigAddrNP = modifiedOrigAddrNP;
    }

    /**
     *
     * @return
     * The modifiedOrigAddrTON
     */
    public Object getModifiedOrigAddrTON() {
        return modifiedOrigAddrTON;
    }

    /**
     *
     * @param modifiedOrigAddrTON
     * The modifiedOrigAddrTON
     */
    public void setModifiedOrigAddrTON(Object modifiedOrigAddrTON) {
        this.modifiedOrigAddrTON = modifiedOrigAddrTON;
    }

    /**
     *
     * @return
     * The modifiedOrigAddrValue
     */
    public Object getModifiedOrigAddrValue() {
        return modifiedOrigAddrValue;
    }

    /**
     *
     * @param modifiedOrigAddrValue
     * The modifiedOrigAddrValue
     */
    public void setModifiedOrigAddrValue(Object modifiedOrigAddrValue) {
        this.modifiedOrigAddrValue = modifiedOrigAddrValue;
    }

    /**
     *
     * @return
     * The moreMessagesToSend
     */
    public Boolean getMoreMessagesToSend() {
        return moreMessagesToSend;
    }

    /**
     *
     * @param moreMessagesToSend
     * The moreMessagesToSend
     */
    public void setMoreMessagesToSend(Boolean moreMessagesToSend) {
        this.moreMessagesToSend = moreMessagesToSend;
    }

    /**
     *
     * @return
     * The noOfDeliveryAttempts
     */
    public Integer getNoOfDeliveryAttempts() {
        return noOfDeliveryAttempts;
    }

    /**
     *
     * @param noOfDeliveryAttempts
     * The noOfDeliveryAttempts
     */
    public void setNoOfDeliveryAttempts(Integer noOfDeliveryAttempts) {
        this.noOfDeliveryAttempts = noOfDeliveryAttempts;
    }

    /**
     *
     * @return
     * The origAddrNP
     */
    public String getOrigAddrNP() {
        return origAddrNP;
    }

    /**
     *
     * @param origAddrNP
     * The origAddrNP
     */
    public void setOrigAddrNP(String origAddrNP) {
        this.origAddrNP = origAddrNP;
    }

    /**
     *
     * @return
     * The origAddrPresentationRestricted
     */
    public Boolean getOrigAddrPresentationRestricted() {
        return origAddrPresentationRestricted;
    }

    /**
     *
     * @param origAddrPresentationRestricted
     * The origAddrPresentationRestricted
     */
    public void setOrigAddrPresentationRestricted(Boolean origAddrPresentationRestricted) {
        this.origAddrPresentationRestricted = origAddrPresentationRestricted;
    }

    /**
     *
     * @return
     * The origAddrTON
     */
    public String getOrigAddrTON() {
        return origAddrTON;
    }

    /**
     *
     * @param origAddrTON
     * The origAddrTON
     */
    public void setOrigAddrTON(String origAddrTON) {
        this.origAddrTON = origAddrTON;
    }

    /**
     *
     * @return
     * The origAddrValue
     */
    public String getOrigAddrValue() {
        return origAddrValue;
    }

    /**
     *
     * @param origAddrValue
     * The origAddrValue
     */
    public void setOrigAddrValue(String origAddrValue) {
        this.origAddrValue = origAddrValue;
    }

    /**
     *
     * @return
     * The origImsi
     */
    public Object getOrigImsi() {
        return origImsi;
    }

    /**
     *
     * @param origImsi
     * The origImsi
     */
    public void setOrigImsi(Object origImsi) {
        this.origImsi = origImsi;
    }

    /**
     *
     * @return
     * The origMsc
     */
    public Object getOrigMsc() {
        return origMsc;
    }

    /**
     *
     * @param origMsc
     * The origMsc
     */
    public void setOrigMsc(Object origMsc) {
        this.origMsc = origMsc;
    }

    /**
     *
     * @return
     * The originalOrigAddrValue
     */
    public String getOriginalOrigAddrValue() {
        return originalOrigAddrValue;
    }

    /**
     *
     * @param originalOrigAddrValue
     * The originalOrigAddrValue
     */
    public void setOriginalOrigAddrValue(String originalOrigAddrValue) {
        this.originalOrigAddrValue = originalOrigAddrValue;
    }

    /**
     *
     * @return
     * The protocolIdentifier
     */
    public Integer getProtocolIdentifier() {
        return protocolIdentifier;
    }

    /**
     *
     * @param protocolIdentifier
     * The protocolIdentifier
     */
    public void setProtocolIdentifier(Integer protocolIdentifier) {
        this.protocolIdentifier = protocolIdentifier;
    }

    /**
     *
     * @return
     * The refId
     */
    public String getRefId() {
        return refId;
    }

    /**
     *
     * @param refId
     * The refId
     */
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     *
     * @return
     * The routingIndex
     */
    public Integer getRoutingIndex() {
        return routingIndex;
    }

    /**
     *
     * @param routingIndex
     * The routingIndex
     */
    public void setRoutingIndex(Integer routingIndex) {
        this.routingIndex = routingIndex;
    }

    /**
     *
     * @return
     * The sequenceEnforced
     */
    public Boolean getSequenceEnforced() {
        return sequenceEnforced;
    }

    /**
     *
     * @param sequenceEnforced
     * The sequenceEnforced
     */
    public void setSequenceEnforced(Boolean sequenceEnforced) {
        this.sequenceEnforced = sequenceEnforced;
    }

    /**
     *
     * @return
     * The serviceCentreAddress
     */
    public Object getServiceCentreAddress() {
        return serviceCentreAddress;
    }

    /**
     *
     * @param serviceCentreAddress
     * The serviceCentreAddress
     */
    public void setServiceCentreAddress(Object serviceCentreAddress) {
        this.serviceCentreAddress = serviceCentreAddress;
    }

    /**
     *
     * @return
     * The sourceEsmeType
     */
    public String getSourceEsmeType() {
        return sourceEsmeType;
    }

    /**
     *
     * @param sourceEsmeType
     * The sourceEsmeType
     */
    public void setSourceEsmeType(String sourceEsmeType) {
        this.sourceEsmeType = sourceEsmeType;
    }

    /**
     *
     * @return
     * The sourceName
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     *
     * @param sourceName
     * The sourceName
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     *
     * @return
     * The sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     *
     * @param sourceType
     * The sourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     *
     * @return
     * The standardType
     */
    public String getStandardType() {
        return standardType;
    }

    /**
     *
     * @param standardType
     * The standardType
     */
    public void setStandardType(String standardType) {
        this.standardType = standardType;
    }

    /**
     *
     * @return
     * The statusReportRequest
     */
    public Integer getStatusReportRequest() {
        return statusReportRequest;
    }

    /**
     *
     * @param statusReportRequest
     * The statusReportRequest
     */
    public void setStatusReportRequest(Integer statusReportRequest) {
        this.statusReportRequest = statusReportRequest;
    }

    /**
     *
     * @return
     * The superRefId
     */
    public Object getSuperRefId() {
        return superRefId;
    }

    /**
     *
     * @param superRefId
     * The superRefId
     */
    public void setSuperRefId(Object superRefId) {
        this.superRefId = superRefId;
    }

    /**
     *
     * @return
     * The suppressCdrGeneration
     */
    public Boolean getSuppressCdrGeneration() {
        return suppressCdrGeneration;
    }

    /**
     *
     * @param suppressCdrGeneration
     * The suppressCdrGeneration
     */
    public void setSuppressCdrGeneration(Boolean suppressCdrGeneration) {
        this.suppressCdrGeneration = suppressCdrGeneration;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The unmodifiedOrigAddrNP
     */
    public String getUnmodifiedOrigAddrNP() {
        return unmodifiedOrigAddrNP;
    }

    /**
     *
     * @param unmodifiedOrigAddrNP
     * The unmodifiedOrigAddrNP
     */
    public void setUnmodifiedOrigAddrNP(String unmodifiedOrigAddrNP) {
        this.unmodifiedOrigAddrNP = unmodifiedOrigAddrNP;
    }

    /**
     *
     * @return
     * The unmodifiedOrigAddrTON
     */
    public String getUnmodifiedOrigAddrTON() {
        return unmodifiedOrigAddrTON;
    }

    /**
     *
     * @param unmodifiedOrigAddrTON
     * The unmodifiedOrigAddrTON
     */
    public void setUnmodifiedOrigAddrTON(String unmodifiedOrigAddrTON) {
        this.unmodifiedOrigAddrTON = unmodifiedOrigAddrTON;
    }

    /**
     *
     * @return
     * The unmodifiedOrigAddrValue
     */
    public String getUnmodifiedOrigAddrValue() {
        return unmodifiedOrigAddrValue;
    }

    /**
     *
     * @param unmodifiedOrigAddrValue
     * The unmodifiedOrigAddrValue
     */
    public void setUnmodifiedOrigAddrValue(String unmodifiedOrigAddrValue) {
        this.unmodifiedOrigAddrValue = unmodifiedOrigAddrValue;
    }

    /**
     *
     * @return
     * The userData
     */
    public UserData getUserData() {
        return userData;
    }

    /**
     *
     * @param userData
     * The userData
     */
    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    /**
     *
     * @return
     * The userProvidedId
     */
    public String getUserProvidedId() {
        return userProvidedId;
    }

    /**
     *
     * @param userProvidedId
     * The userProvidedId
     */
    public void setUserProvidedId(String userProvidedId) {
        this.userProvidedId = userProvidedId;
    }

    /**
     *
     * @return
     * The validUntil
     */
    public Integer getValidUntil() {
        return validUntil;
    }

    /**
     *
     * @param validUntil
     * The validUntil
     */
    public void setValidUntil(Integer validUntil) {
        this.validUntil = validUntil;
    }

    /**
     *
     * @return
     * The virtualSmscId
     */
    public Integer getVirtualSmscId() {
        return virtualSmscId;
    }

    /**
     *
     * @param virtualSmscId
     * The virtualSmscId
     */
    public void setVirtualSmscId(Integer virtualSmscId) {
        this.virtualSmscId = virtualSmscId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(concat).append(concatSmRefNumber).append(concatSmTotal).append(destAddrNP).append(destAddrTON).append(destAddrValue).append(destImsi).append(destMsc).append(destMsisdn).append(dialledDestAddrNP).append(dialledDestAddrTON).append(dialledDestAddrValue).append(earliestAttemptTimeStamp).append(esmeIdentifier).append(esmeMessageId).append(mapVersion).append(messageReference).append(messagingMode).append(modifiedOrigAddrNP).append(modifiedOrigAddrTON).append(modifiedOrigAddrValue).append(moreMessagesToSend).append(noOfDeliveryAttempts).append(origAddrNP).append(origAddrPresentationRestricted).append(origAddrTON).append(origAddrValue).append(origImsi).append(origMsc).append(originalOrigAddrValue).append(protocolIdentifier).append(refId).append(routingIndex).append(sequenceEnforced).append(serviceCentreAddress).append(sourceEsmeType).append(sourceName).append(sourceType).append(standardType).append(statusReportRequest).append(superRefId).append(suppressCdrGeneration).append(type).append(unmodifiedOrigAddrNP).append(unmodifiedOrigAddrTON).append(unmodifiedOrigAddrValue).append(userData).append(userProvidedId).append(validUntil).append(virtualSmscId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Submit) == false) {
            return false;
        }
        Submit rhs = ((Submit) other);
        return new EqualsBuilder().append(concat, rhs.concat).append(concatSmRefNumber, rhs.concatSmRefNumber).append(concatSmTotal, rhs.concatSmTotal).append(destAddrNP, rhs.destAddrNP).append(destAddrTON, rhs.destAddrTON).append(destAddrValue, rhs.destAddrValue).append(destImsi, rhs.destImsi).append(destMsc, rhs.destMsc).append(destMsisdn, rhs.destMsisdn).append(dialledDestAddrNP, rhs.dialledDestAddrNP).append(dialledDestAddrTON, rhs.dialledDestAddrTON).append(dialledDestAddrValue, rhs.dialledDestAddrValue).append(earliestAttemptTimeStamp, rhs.earliestAttemptTimeStamp).append(esmeIdentifier, rhs.esmeIdentifier).append(esmeMessageId, rhs.esmeMessageId).append(mapVersion, rhs.mapVersion).append(messageReference, rhs.messageReference).append(messagingMode, rhs.messagingMode).append(modifiedOrigAddrNP, rhs.modifiedOrigAddrNP).append(modifiedOrigAddrTON, rhs.modifiedOrigAddrTON).append(modifiedOrigAddrValue, rhs.modifiedOrigAddrValue).append(moreMessagesToSend, rhs.moreMessagesToSend).append(noOfDeliveryAttempts, rhs.noOfDeliveryAttempts).append(origAddrNP, rhs.origAddrNP).append(origAddrPresentationRestricted, rhs.origAddrPresentationRestricted).append(origAddrTON, rhs.origAddrTON).append(origAddrValue, rhs.origAddrValue).append(origImsi, rhs.origImsi).append(origMsc, rhs.origMsc).append(originalOrigAddrValue, rhs.originalOrigAddrValue).append(protocolIdentifier, rhs.protocolIdentifier).append(refId, rhs.refId).append(routingIndex, rhs.routingIndex).append(sequenceEnforced, rhs.sequenceEnforced).append(serviceCentreAddress, rhs.serviceCentreAddress).append(sourceEsmeType, rhs.sourceEsmeType).append(sourceName, rhs.sourceName).append(sourceType, rhs.sourceType).append(standardType, rhs.standardType).append(statusReportRequest, rhs.statusReportRequest).append(superRefId, rhs.superRefId).append(suppressCdrGeneration, rhs.suppressCdrGeneration).append(type, rhs.type).append(unmodifiedOrigAddrNP, rhs.unmodifiedOrigAddrNP).append(unmodifiedOrigAddrTON, rhs.unmodifiedOrigAddrTON).append(unmodifiedOrigAddrValue, rhs.unmodifiedOrigAddrValue).append(userData, rhs.userData).append(userProvidedId, rhs.userProvidedId).append(validUntil, rhs.validUntil).append(virtualSmscId, rhs.virtualSmscId).isEquals();
    }

}