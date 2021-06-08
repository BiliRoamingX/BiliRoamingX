# SponsorBlock YouTube Vanced Implementation
In order to use this in YouTube/Vanced you must first apply the smali mods applied to vanced (the patching process used for this is currently automated using our closed source tools with no plans to open source it for the time being) (if you mod vanced directly it is not required)
* First make your edits in android studio
* Change the string "replaceMeWithsetMillisecondMethod" on PlayerController.java to the method name of YouTube package
* Compile debug apk
* Decompile this apk using apktool https://github.com/iBotPeaches/Apktool
* Take this decompiled folder and look for a folder labeled pl in one of your dex class folders
* Decompile YouTube/Vanced using apktool (you only need to decompile the base apk files (for vanced you can get these using vanced manager and looking in android/data/com.vanced.manager for black or dark.apk), if you are decompiling stock youtube you must also merge a dpi split into it (todo))
* Copy the pl folder from earlier into the dex class folder (remove any existing one completely first)
* Recompile your modded YouTube/Vanced using apktool and sign it + all splits required for your device using the same key
