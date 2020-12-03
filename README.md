# Toastify


Library for creating custom Toast message which offers an adaptive UI support. 
Enjoy!

## Setup
Step 1. Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

Step 2. Add the dependency:
```gradle
dependencies {
      
}
```
## Usage
![](docs/toastify.gif)

###### Custom Toast Message:
Dont' forget to add internet permissions in your manifest for download images from a given url!

```java

 Toastify toastify = new Toastify
                    .Builder(this)
                    .setHeader("Warning!!!!")
                    .setContent("You should be in private mode")
                    .setImageResource(R.drawable.warning)
                    .setGravity(Gravity.BOTTOM, 0,0)
                    .setDuration(Toast.LENGTH_SHORT)
                    .build();

            toastify.show();
```

###### Error Toast Message:
```java

Toastify toastify = new Toastify.Builder(this)
                    .setHeader("Error")
                    .setHeaderTextColor(Color.WHITE)
                    .setContentTextColor(Color.WHITE)
                    .setContent("Something went wrong with your application!")
                    .setBackground(R.drawable.toastify_err_background)
                    .setImageResource(R.drawable.error)
                    .setGravity(Gravity.BOTTOM, 10, 10)
                    .setDuration(Toast.LENGTH_LONG)

                    .build();

            toastify.show();                 
```

## License

    Copyright 2020 Jonathan Karta

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

## Next Updates:
