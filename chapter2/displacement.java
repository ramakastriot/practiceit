/* In physics, a common useful equation for finding the position s of a body 
 * in linear motion at a given time t, based on its initial position s0, 
 * initial velocity v0, and rate of acceleration a, is the following:
 *
 * s = s0 + v0 t + ½ at2
 *
 * Write code to declare variables for s0 with a value of 12.0, v0 with a 
 * value of 3.5, a with a value of 9.8, and t with a value of 10, and then 
 * write the code to compute s on the basis of these values. At the end of 
 * your code, print the value of your variable s to the console.
 */
double s0 = 12.0;
double v0 = 3.5;
double a = 9.8;
double t = 10.0;

double s = s0 + v0 * t + 0.5 * a * t * t;
System.out.println(s);
