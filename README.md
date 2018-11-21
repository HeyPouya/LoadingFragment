# Loading Fragment 


[![](https://jitpack.io/v/SirLordPouya/LoadingFragment.svg)](https://jitpack.io/#SirLordPouya/LoadingFragment)
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16)

A Simple LoadingFragment completely compatible with Kotlin and androidX


<img src="https://github.com/SirLordPouya/LoadingFragment/blob/master/loading_fragment.gif" width="400">

## Releases:

#### Current release: [![](https://jitpack.io/v/SirLordPouya/LoadingFragment.svg)](https://jitpack.io/#SirLordPouya/LoadingFragment)


## Usage:

### To show loading

```
    private fun showLoading() {
        LoadingFragment.getInstance()?.show(supportFragmentManager, "TAG")
        hideLoading()
    }
```
### To hide loading dialog

```
    private fun hideLoading() {
      LoadingFragment.getInstance()?.dismissDialog()
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
