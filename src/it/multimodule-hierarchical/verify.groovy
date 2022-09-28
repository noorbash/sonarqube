/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
File buildLog = new File( basedir, 'build.log' )
assert buildLog.text.contains( '[INFO] Resolved distributionManagement site URL for org.apache.maven.shared.project.utils.it.multimodule-hierarchical:multimodule:pom:0.0.1-SNAPSHOT: http://localhost/multimodule')
assert buildLog.text.contains( '[INFO] Resolved distributionManagement site URL for org.apache.maven.shared.project.utils.it.multimodule-hierarchical:module:pom:0.0.1-SNAPSHOT: http://localhost/multimodule/module' )
assert buildLog.text.contains( '[INFO] Resolved distributionManagement site URL for org.apache.maven.shared.project.utils.it.multimodule-hierarchical:submodule:pom:0.0.1-SNAPSHOT: http://localhost/multimodule/module/submodule' )

assert buildLog.text.contains( '[INFO] Resolved scm connection for org.apache.maven.shared.project.utils.it.multimodule-hierarchical:multimodule:pom:0.0.1-SNAPSHOT: scm:local:/project' )
assert buildLog.text.contains( '[INFO] Resolved scm developer connection for org.apache.maven.shared.project.utils.it.multimodule-hierarchical:multimodule:pom:0.0.1-SNAPSHOT: scm:local:/sproject' )

assert buildLog.text.contains( '[INFO] Resolved scm connection for org.apache.maven.shared.project.utils.it.multimodule-hierarchical:module:pom:0.0.1-SNAPSHOT: scm:local:/project/module' )
assert buildLog.text.contains( '[INFO] Resolved scm developer connection for org.apache.maven.shared.project.utils.it.multimodule-hierarchical:module:pom:0.0.1-SNAPSHOT: scm:local:/sproject/module' )

assert buildLog.text.contains( '[INFO] Resolved scm connection for org.apache.maven.shared.project.utils.it.multimodule-hierarchical:submodule:pom:0.0.1-SNAPSHOT: scm:local:/project/module/submodule' )
assert buildLog.text.contains( '[INFO] Resolved scm developer connection for org.apache.maven.shared.project.utils.it.multimodule-hierarchical:submodule:pom:0.0.1-SNAPSHOT: scm:local:/sproject/module/submodule' )
