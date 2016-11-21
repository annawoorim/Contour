# Line-Animation-DSL
A DSL used for animated line drawings.

In order to start a new line animation, create a new text file in the "resources" folder.

The contents of the text file should look something like this:

```
Start(50,50)	// Defines the starting point of the animation
Right(10)	// Extend line 10 pixels right
Down(10)	// Extend line 10 pixels down
Left(10)	// Extend line 10 pixels left
Up(10)		// Extend line 10 pixels up
```

Note: the animation screen is 500 by 500 pixels. 

In order to run the animation, open the computer's command line.
Navigate to the "LineAnimate" directory, then enter the following:
```
sbt "run-main lineAnimate.LineAnimation resources/filename.txt"
```
filename.txt should be replaced with the name of the new text file you created.
