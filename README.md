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
- Minimum Openspace Android SDK version: **vTODO**
- IDE supporting Gradle projects


#### Registration and Access

In order to access and use the Service via the OpenSpace Android-SDK, you must [apply for an API key.](https://github.com/OrdnanceSurvey/openspace-android-sdk#getting-started)

#### Clone project

Copy the project to your local machine, eg:

```bash
git clone https://github.com/OrdnanceSurvey/android-sdk-mapping-demo.git
```

#### Download openspace-android-sdk

1. Download the latest [openspace-android-sdk package](http://www.ordnancesurvey.co.uk/oswebsite/web-services/os-openspace/android-sdk.html)
2. Unzip the `osmapandroid-*.jar` downloaded into the libs directory in this project
<pre>
 $PROJECT_ROOT/OSMappingDemo/libs
</pre>


#### Update local.properties

Update `OSMappingDemo/local.properties` with sdk.dir path if necessary.

```bash
echo 'sdk.dir=/path/to/android-sdk' > OSMappingDemo/local.properties
```

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

TODO

