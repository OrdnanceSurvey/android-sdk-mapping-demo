Description
---

A demo app using the openspace-android-sdk to display a basic map and show the OSGB gridpoint for a map click.


![ScreenShot](https://github.com/OrdnanceSurvey/android-sdk-mapping-demo/raw/master/screenshot.png "Screenshot of demo app")


Getting started
---

#### Requirements

This project requires the following points are met:

- Android SdkVersion: 18
- Gradle version: 1.8
- Minimum Openspace Android SDK version: **vX.x.x**
- IDE supporting Gradle


#### Registration and Access

In order to access and use the Service via the OpenSpace Android-SDK, you must [apply for an API key.](https://github.com/OrdnanceSurvey/openspace-android-sdk#getting-started)

#### Clone project

Copy the project to your local machine, eg:

```bash
git clone https://github.com/OrdnanceSurvey/android-sdk-mapping-demo.git
```

#### Download openspace-android-sdk

TODO: how do we do this


#### Update local.properties

Update `OSMappingDemo/local.properties` with sdk.dir path if necessary.

```bash
echo 'sdk.dir=/path/to/android-sdk' >> OSMappingDemo/local.properties
```

#### Import into IDE

Import as Gradle project into IDE.


#### Update demo app with your API Key and App Id details

Update API Key in the demo app.

TODO: how to do this in android


```java
//uk.co.ordnancesurvey.android.demos.osmappingdemo.MainActivity.java

private final static String OS_API_KEY = "API_KEY";

private final static boolean OS_IS_PRO = false;

```

#### Build and run

Project can now be built and run on a device or emulator.

Questions and Issues
-------

If you have any questions or issues with the openspace-android-sdk or this demo app then please email osopenspace@ordnancesurvey.co.uk


Licence
-------

TODO

