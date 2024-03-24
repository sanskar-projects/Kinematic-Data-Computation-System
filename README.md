Kinematic Data Computation System

A Java program to utilise initial data and compute the values of basic kinematic quantities for a moving body at regular intervals of time.<br>
The data is backed up to a file named data.txt which is created(If not exists) automatically upon termination.<br>
Initial data is obtained from the user which consists of following quantities in International System of Units,<br>
acceleration : metres/second^2<br>
speed or velocity : metres/second<br>
distance : metres (covered already)<br>
fuel consumption rate : litres/metre<br>
available fuel : litres <br>
time interval : seconds<br>
maximum speed limit : metres/second<br>
<br>NOTE,<br>
Initial time =0 s.<br>
Acceleration is constant.<br>
If speed is constant then acceleration has to be 0.<br>
After acheiving it's maximum value speed becomes constant.<br>
Low fuel warning is activated when fuel is less than 10 litres<br>
Computation ceases when fuel is equal to or less than 0 L.<br>
<p>
Case 1 : zero acceleration -> constant velocity
</p>
<hr>
<img src="output/zero1.png">
<hr>
<img src="output/zero2.png">
<hr>
<img src="output/zero3.png">
<hr>
<p>
case 2 : non zero acceleration -> velocity changes with respect to time
</p>
<hr>
<img src="output/non1.png">
<hr>
<img src="output/non2.png">
<hr>
<p>
data has been backed up to data.txt file
</p>
<hr>
<img src="output/vBYt.png">
