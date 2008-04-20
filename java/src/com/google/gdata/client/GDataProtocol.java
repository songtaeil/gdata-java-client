/* Copyright (c) 2006 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.google.gdata.client;

/**
 * The GDataProtocol interface defines various constant values used within the
 * Google Data API.
 */
public interface GDataProtocol {

  /**
   * The Header interface defines various header names used within the GData
   * protocol.
   */
  public interface Header {

    /**
     * The VERSION header is used to request a specific service version. The
     * value of the parameter will be in the format {@code <major>.<minor>} and
     * will be interpreted relative to the version model of the target service.
     */
    public static final String VERSION = "GData-Version";

    /**
     * The METHOD_OVERRIDE parameter overrides the normal HTTP method. The value
     * is the HTTP method that should be used to process the request. This is
     * used to allow clients that are unable to issue PUT or DELETE methods to
     * emulate such methods. The client would issue a POST method with this
     * header value set to "PUT" or "DELETE", and the service translates the
     * invocation to the corresponding request type.
     */
    public static final String METHOD_OVERRIDE = "X-HTTP-Method-Override";
  }

  /**
   * The Parameters interface defines basic query parameter names used within
   * the Data protocol.
   */
  public interface Parameter {

    /**
     * The ALT parameter is used to request an alternate output representation.
     */
    public static final String ALT = "alt";

    /**
     * The VERSION parameter used to request a specific version.  The value of
     * the parameter will be in the format {@code <major>.<minor>} and will be
     * interpreted relative to the version model of the target service.   The
     * {@link Header#VERSION} header (if present on the same request) will have
     * precedence.
     */
    public static final String VERSION = "v";
  }

  /**
   * The Query interface extends the basic set of parameter names with the
   * common set that are used for GData feed queries.
   */
  public interface Query extends Parameter {

    /**
     * The FULL_TEXT query parameter used to request a full text query.
     */
    public static final String FULL_TEXT = "q";

    /**
     * The AUTHOR query parameter is used to request an author query.
     */
    public static final String AUTHOR = "author";

    /**
     * The UPDATED_MIN query parameter is used to request that all entries have
     * an updated value greater than or equal to the parameter value.
     */
    public static final String UPDATED_MIN = "updated-min";

    /**
     * The UPDATED_MAX query parameter is used to request that all entries have
     * an updated value less than the parameter value.
     */
    public static final String UPDATED_MAX = "updated-max";

    /**
     * The PUBLISHED_MIN query parameter is used to request that all entries
     * have a published value greater than or equal to the parameter value.
     */
    public static final String PUBLISHED_MIN = "published-min";

    /**
     * The PUBLISHED_MAX query parameter is used to request that all entries
     * have a published value less than the parameter value.
     */
    public static final String PUBLISHED_MAX = "published-max";

    /**
     * The START_INDEX query parameter is used to request that the returned
     * entries start at the specified index. The parameter value is 1-based.
     */
    public static final String START_INDEX = "start-index";

    /**
     * The MAX_RESULTS query parameter is used to specify the maximum number of
     * matches that should be returned from a query request.
     */
    public static final String MAX_RESULTS = "max-results";
  }
}