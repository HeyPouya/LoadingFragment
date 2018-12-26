# Loading Fragment 

[![](https://jitpack.io/v/SirLordPouya/LoadingFragment.svg)](https://jitpack.io/#SirLordPouya/LoadingFragment)
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16)
[![Build Status](https://travis-ci.org/SirLordPouya/LoadingFragment.svg?branch=master)](https://travis-ci.org/SirLordPouya/LoadingFragment)

<p align="center">
<img src="https://raw.githubusercontent.com/SirLordPouya/LoadingFragment/master/loading.png" width="250">
</p>



A Simple LoadingFragment completely compatible with Kotlin and androidX


<img src="https://github.com/SirLordPouya/LoadingFragment/blob/master/loading_fragment.gif" width="400">

## Releases:

#### Current release: [![](https://jitpack.io/v/SirLordPouya/LoadingFragment.svg)](https://jitpack.io/#SirLordPouya/LoadingFragment)


## Usage:

### To show loading

```
    private fun showLoading() {
        LoadingFragment.getInstance()?.show(supportFragmentManager, "TAG")
    }
```
### To hide loading dialog

```
    private fun hideLoading() {
      LoadingFragment.getInstance()?.dismissDialog()
    }
```

### To change the animation

LoadingFragment uses [lottie](https://github.com/airbnb/lottie-android) to show beatiful animations.
to change the default animation:

1- put your json file in assets folder

2- follow this code :
```
    private fun showLoading() {
        LoadingFragment.getInstance(fileName = "your_file_name.json")?.show(supportFragmentManager, "TAG")
    }
```
### To change cancelable

```
    private fun showLoading() {
        LoadingFragment.getInstance(isCancelable = true)?.show(supportFragmentManager, "TAG")
    }
```


## Note : to use this library with java

```
    private void showLoading() {
        LoadingFragment.Companion.getInstance("loading.json",false).show(getSupportFragmentManager(),"TAG");
    }
```

```
    private void hideLoading() {
        LoadingFragment.Companion.getInstance("loading.json",false).dismissDialog();
    }
```



## Download

#### Adding the depencency

Add this to your root *build.gradle* file:

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Now add the dependency to your app build.gradle file:

```groovy
   implementation 'com.github.SirLordPouya:LoadingFragment:1.0.0'
```

## License

```
LoadingFragment is released under the Apache License 2.0. See LICENSE for details.

Copyright (c) 2018 Pouya Heydari

```

<div>Icon is made by <a href="https://www.flaticon.com/authors/bqlqn" title="bqlqn">bqlqn</a> from <a href="https://www.flaticon.com/"title="Flaticon">www.flaticon.com</a> is licensed by <a href="http://creativecommons.org/licenses/by/3.0/"title="Creative Commons BY 3.0" target="_blank">CC 3.0 BY</a></div>
