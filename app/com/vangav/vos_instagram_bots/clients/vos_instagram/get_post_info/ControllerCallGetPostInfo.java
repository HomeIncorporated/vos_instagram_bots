/**
 * "First, solve the problem. Then, write the code. -John Johnson"
 * "Or use Vangav M"
 * www.vangav.com
 * */

/**
 * MIT License
 *
 * Copyright (c) 2016 Vangav
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 * */

/**
 * Community
 * Facebook Group: Vangav Open Source - Backend
 *   fb.com/groups/575834775932682/
 * Facebook Page: Vangav
 *   fb.com/vangav.f
 * 
 * Third party communities for Vangav Backend
 *   - play framework
 *   - cassandra
 *   - datastax
 *   
 * Tag your question online (e.g.: stack overflow, etc ...) with
 *   #vangav_backend
 *   to easier find questions/answers online
 * */

package com.vangav.vos_instagram_bots.clients.vos_instagram.get_post_info;

import com.vangav.backend.backend_client_java.ControllerCall;
import com.vangav.vos_instagram_bots.clients.Constants;

/**
 * Generated using ClientsGeneratorInl
 */
/**
 * ControllerCallGetPostInfo is used to make one call
 *   per instance to GetPostInfo controller
 */
public class ControllerCallGetPostInfo extends ControllerCall {

  /**
   * Constructor - ControllerCallGetPostInfo
   * @param requestGetPostInfo
   * @return new ControllerCallGetPostInfo Object
   * @throws Exception
   */
  public ControllerCallGetPostInfo (
    RequestGetPostInfo requestGetPostInfo) throws Exception {

    super(requestGetPostInfo);
  }

  @Override
  protected String getControllerName() {

    return "get_post_info";
  }

  @Override
  protected String getUrl() {

    return
      Constants.kVosInstagramUrl
      + this.getControllerName();
  }

  @Override
  protected ResponseGetPostInfo getRestResponseJson() {

    return new ResponseGetPostInfo();
  }
}
