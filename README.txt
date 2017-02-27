STEPS (UBUNTU):
=======

1. sudo apt-get install imagemagick
2. apt-get install jmagick
3. sudo ln -s /usr/lib/jni/libJMagick.so /usr/lib/libJMagick.so

STEPS (WINDOWS)
==========

1. Go to http://downloads.jmagick.org/6.3.9/ (or any other version of your choice)
2. Download ImageMagick-6.3.9-0-Q8-windows-dll.exe and jmagick-win-6.3.9-Q8.zip.
3. Install the exe file. This will install ImageMagick which is a prerequisite for JMagick to work.
4. Now extract the zip file. This will give jmagick.dll and jmagick.jar.
5. Copy the jmagick.jar to you lib folder and include it in the classpath. (skip step 5, If you are using Maven)
6. Copy the jmagick.dll to the root installation directory (e.g:C:\Program Files (x86)\ImageMagick-6.3.9-Q16\jmagick.dll) of ImageMagic and add it as an entry to the PATH environment variable.
7. Restart system.

Ref :
=====
http://stackoverflow.com/questions/5150503/image-magick-java