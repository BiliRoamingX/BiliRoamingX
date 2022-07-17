# ReVanced Integrations 

# How to use debugging:
- Include the enable-debugging patch
- Set ```DEBUG_BOOLEAN("revanced_debug_enabled", false),``` to ```true```
- Usage on Windows: ```adb logcat | findstr "ReVanced" > log.txt```
- Usage on Linux: ```adb logcat | grep --line-buffered "ReVanced" > log.txt```
  
This will write the log to a file called log.txt which you can view then.
 
