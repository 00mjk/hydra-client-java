/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.hydra.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import sh.ory.hydra.model.OAuth2Client;
import sh.ory.hydra.model.OpenIDConnectContext;

/**
 * LoginRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-23T16:14:41.404500Z[GMT]")
public class LoginRequest {
  public static final String SERIALIZED_NAME_CHALLENGE = "challenge";
  @SerializedName(SERIALIZED_NAME_CHALLENGE)
  private String challenge;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private OAuth2Client client;

  public static final String SERIALIZED_NAME_OIDC_CONTEXT = "oidc_context";
  @SerializedName(SERIALIZED_NAME_OIDC_CONTEXT)
  private OpenIDConnectContext oidcContext;

  public static final String SERIALIZED_NAME_REQUEST_URL = "request_url";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;

  public static final String SERIALIZED_NAME_REQUESTED_ACCESS_TOKEN_AUDIENCE = "requested_access_token_audience";
  @SerializedName(SERIALIZED_NAME_REQUESTED_ACCESS_TOKEN_AUDIENCE)
  private List<String> requestedAccessTokenAudience = null;

  public static final String SERIALIZED_NAME_REQUESTED_SCOPE = "requested_scope";
  @SerializedName(SERIALIZED_NAME_REQUESTED_SCOPE)
  private List<String> requestedScope = null;

  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private Boolean skip;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;


  public LoginRequest challenge(String challenge) {
    
    this.challenge = challenge;
    return this;
  }

   /**
   * Challenge is the identifier (\&quot;login challenge\&quot;) of the login request. It is used to identify the session.
   * @return challenge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Challenge is the identifier (\"login challenge\") of the login request. It is used to identify the session.")

  public String getChallenge() {
    return challenge;
  }


  public void setChallenge(String challenge) {
    this.challenge = challenge;
  }


  public LoginRequest client(OAuth2Client client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OAuth2Client getClient() {
    return client;
  }


  public void setClient(OAuth2Client client) {
    this.client = client;
  }


  public LoginRequest oidcContext(OpenIDConnectContext oidcContext) {
    
    this.oidcContext = oidcContext;
    return this;
  }

   /**
   * Get oidcContext
   * @return oidcContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpenIDConnectContext getOidcContext() {
    return oidcContext;
  }


  public void setOidcContext(OpenIDConnectContext oidcContext) {
    this.oidcContext = oidcContext;
  }


  public LoginRequest requestUrl(String requestUrl) {
    
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.
   * @return requestUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.")

  public String getRequestUrl() {
    return requestUrl;
  }


  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public LoginRequest requestedAccessTokenAudience(List<String> requestedAccessTokenAudience) {
    
    this.requestedAccessTokenAudience = requestedAccessTokenAudience;
    return this;
  }

  public LoginRequest addRequestedAccessTokenAudienceItem(String requestedAccessTokenAudienceItem) {
    if (this.requestedAccessTokenAudience == null) {
      this.requestedAccessTokenAudience = new ArrayList<String>();
    }
    this.requestedAccessTokenAudience.add(requestedAccessTokenAudienceItem);
    return this;
  }

   /**
   * Get requestedAccessTokenAudience
   * @return requestedAccessTokenAudience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRequestedAccessTokenAudience() {
    return requestedAccessTokenAudience;
  }


  public void setRequestedAccessTokenAudience(List<String> requestedAccessTokenAudience) {
    this.requestedAccessTokenAudience = requestedAccessTokenAudience;
  }


  public LoginRequest requestedScope(List<String> requestedScope) {
    
    this.requestedScope = requestedScope;
    return this;
  }

  public LoginRequest addRequestedScopeItem(String requestedScopeItem) {
    if (this.requestedScope == null) {
      this.requestedScope = new ArrayList<String>();
    }
    this.requestedScope.add(requestedScopeItem);
    return this;
  }

   /**
   * Get requestedScope
   * @return requestedScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRequestedScope() {
    return requestedScope;
  }


  public void setRequestedScope(List<String> requestedScope) {
    this.requestedScope = requestedScope;
  }


  public LoginRequest sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * SessionID is the login session ID. If the user-agent reuses a login session (via cookie / remember flag) this ID will remain the same. If the user-agent did not have an existing authentication session (e.g. remember is false) this will be a new random value. This value is used as the \&quot;sid\&quot; parameter in the ID Token and in OIDC Front-/Back- channel logout. It&#39;s value can generally be used to associate consecutive login requests by a certain user.
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SessionID is the login session ID. If the user-agent reuses a login session (via cookie / remember flag) this ID will remain the same. If the user-agent did not have an existing authentication session (e.g. remember is false) this will be a new random value. This value is used as the \"sid\" parameter in the ID Token and in OIDC Front-/Back- channel logout. It's value can generally be used to associate consecutive login requests by a certain user.")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public LoginRequest skip(Boolean skip) {
    
    this.skip = skip;
    return this;
  }

   /**
   * Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you can skip asking the user to grant the requested scopes, and simply forward the user to the redirect URL.  This feature allows you to update / set session information.
   * @return skip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you can skip asking the user to grant the requested scopes, and simply forward the user to the redirect URL.  This feature allows you to update / set session information.")

  public Boolean getSkip() {
    return skip;
  }


  public void setSkip(Boolean skip) {
    this.skip = skip;
  }


  public LoginRequest subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client. If this value is set and &#x60;skip&#x60; is true, you MUST include this subject type when accepting the login request, or the request will fail.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client. If this value is set and `skip` is true, you MUST include this subject type when accepting the login request, or the request will fail.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginRequest loginRequest = (LoginRequest) o;
    return Objects.equals(this.challenge, loginRequest.challenge) &&
        Objects.equals(this.client, loginRequest.client) &&
        Objects.equals(this.oidcContext, loginRequest.oidcContext) &&
        Objects.equals(this.requestUrl, loginRequest.requestUrl) &&
        Objects.equals(this.requestedAccessTokenAudience, loginRequest.requestedAccessTokenAudience) &&
        Objects.equals(this.requestedScope, loginRequest.requestedScope) &&
        Objects.equals(this.sessionId, loginRequest.sessionId) &&
        Objects.equals(this.skip, loginRequest.skip) &&
        Objects.equals(this.subject, loginRequest.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challenge, client, oidcContext, requestUrl, requestedAccessTokenAudience, requestedScope, sessionId, skip, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginRequest {\n");
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    oidcContext: ").append(toIndentedString(oidcContext)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    requestedAccessTokenAudience: ").append(toIndentedString(requestedAccessTokenAudience)).append("\n");
    sb.append("    requestedScope: ").append(toIndentedString(requestedScope)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

