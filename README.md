Description
---

A demo app using the openspace-android-sdk to display a basic map and show the OSGB gridpoint for a map click.


![ScreenShot](https://github.com/OrdnanceSurvey/android-sdk-mapping-demo/raw/master/screenshot.png "Screenshot of demo app")


Getting started
---

#### Requirements

This project requires the following points are met:

- Android SdkVersion: 18
- Minimum API Level: 16
- Gradle version: 1.8
- IDE supporting Gradle projects


#### Registration and Access

In order to access and use the Service via the OpenSpace Android-SDK, you must [apply for an API key.](https://github.com/OrdnanceSurvey/openspace-android-sdk#getting-started)

#### Clone project

Copy the project to your local machine, eg:

```bash
git clone https://github.com/OrdnanceSurvey/android-sdk-mapping-demo.git
```

#### Download openspace-android-sdk

1. Download the latest [openspace-android-sdk package](https://www.ordnancesurvey.co.uk/business-and-government/products/os-openspace/android-sdk.html)
2. Unzip the `osmapandroid-*.jar` downloaded into the libs directory in this project
<pre>
 $PROJECT_ROOT/OSMappingDemo/libs
</pre>


#### Import into IDE

Import application as Gradle project into IDE.


#### Check API Key and App Id details

The API Key in the demo app in the `MainActivity.java` class is specific for this project, if you want to use another API key then you will need to change the package name to that which was registered.

```java

// MainActivity.java

private final static String OS_API_KEY = "API_KEY_HERE";

private final static boolean OS_IS_PRO = false;

```

#### Build and run

Project can now be built and run on a device or emulator.


Questions and Issues
-------

If you have any questions or issues with the openspace-android-sdk or this demo app then please email osopenspace@ordnancesurvey.co.uk


Licence
-------

OpenSpace Android SDK Licence Terms

The OpenSpace Android SDK is protected by © Crown copyright – Ordnance Survey 2013.[https://github.com/OrdnanceSurvey]

All rights reserved (subject to the BSD licence terms as follows):.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
Neither the name of Ordnance Survey nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE

The OS OpenSpace Android SDK includes DiskLruCache.java under the Android OpenSource Project.


Copyright (c) 2011 The Android Open Source Project 

Licensed under the Apache License, Version 2.0 (the "License")
You may not use this file except in compliance with the License
You may obtain a copy of the License at:
[http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and limitations under the License.


