# DrawingTool
This project is part of a Coding Challenge from Statflo for VanHack Leap made with Java.
<br/>

The main idea of this project is to create a simple drawing tool. At where the program should read the input.txt file, executes a set of commands from the file, step by step, and produces an output.txt file with the results of each command line. The last result will contain the complete result of all command lines.

At this time, the functionality of the program is quite limited but this might change in the future.

At the moment, the program should support the following set of commands:

## Create Canvas:

Should create a new canvas of width w and height h. The horizontal lines will be drawn using the "-" character and the vertical lines will be drawn using the "|" character.

The Canvas will set the screen area in which the drawings will show.

It is much important that it can only draw if a canvas has been created before.

    C w h

Example:

    C 20 4
    
Result:

    ----------------------
	|                    |
	|                    |
	|                    |
	|                    |
	----------------------


## Create Line:

Should create a new line from (x1,y1) to (x2,y2). Currently only horizontal or vertical lines are supported. Horizontal and vertical lines will be drawn using the "x" character.

    L x1 y1 x2 y2

Example:

    L 1 2 6 2
    L 6 3 6 4
    
Result:

    ----------------------
	|                    |
	|xxxxxx              |
	|     x              |
	|     x              |
	----------------------


## Create Rectangle:

Should create a new rectangle, whose upper left corner is (x1,y1) and lower right corner is (x2,y2). Horizontal and vertical lines will be drawn using the "x" character.

    R x1 y1 x2 y2

Example:

    R 16 1 20 3
    
Result:

    ----------------------
	|               xxxxx|
	|xxxxxx         x   x|
	|     x         xxxxx|
	|     x              |
	----------------------


## Bucket Fill:

Should fill the entire area connected to (x,y) with "colour" c that it is a character. The behaviour of this is the same as that of the "bucket fill" tool in paint programs.

    B x y c

Example:

    B 10 3 o
    
Result:

    ----------------------
	|oooooooooooooooxxxxx|
	|xxxxxxooooooooox   x|
	|     xoooooooooxxxxx|
	|     xoooooooooooooo|
	----------------------


## License
 
Copyright (c) 2018 Luiz Guilherme Cruz (https://github.com/lgfcruz)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 