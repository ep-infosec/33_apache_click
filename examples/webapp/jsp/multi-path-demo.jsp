<!doctype html>

<!--
   Licensed to the Apache Software Foundation (ASF) under one
   or more contributor license agreements.  See the NOTICE file
   distributed with this work for additional information
   regarding copyright ownership.  The ASF licenses this file
   to you under the Apache License, Version 2.0 (the
   "License"); you may not use this file except in compliance
   with the License.  You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing,
   software distributed under the License is distributed on an
   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
   KIND, either express or implied.  See the License for the
   specific language governing permissions and limitations
   under the License.
-->

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<title>Click Examples</title>
<link rel="stylesheet" type="text/css" href="${context}/assets/css/style.css" title="Style"/>
</head>
<body>
This demo shows how to dynamically change the path of a jsp page.
<p>
    Click <a href=${changePath.href}>here</a> to navigate to the jsp file
    <span class='st'>'/jsp/dummy.jsp'</span>.    
    <pre class="javaCode">
        public void changePath() {
            setPath(<span class='st'>"/jsp/dummy.jsp"</span>);
            return true;
        }
    </pre>
</p>
<p>
    <strong>Note:</strong> the path <span class='st'>'/jsp/dummy.jsp'</span>
    is not mapped by Click, and there is no corresponding Page class for this
    path.
</p>

</body>
</html>  

